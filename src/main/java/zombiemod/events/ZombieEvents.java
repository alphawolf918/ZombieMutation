/**
 * Zombie Mutation Mod Author: Zollern Wolf Created: February 14th, 2016 GNU
 * Public License Do not re-use or claim as your own.
 */

package zombiemod.events;

import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import zombiemod.entities.entities.EntityOverlord;
import zombiemod.entities.entities.EntitySeeker;
import zombiemod.entities.entities.EntityVolatile;
import zombiemod.entities.entities.base.EntityMutantZombie;
import zombiemod.utils.ZombieUtils;

public class ZombieEvents {
	
	@SubscribeEvent
	public void onPlayerDeath(LivingDeathEvent event) {
		Entity entity = event.entity;
		World world = entity.worldObj;
		if (!world.isRemote) {
			if (entity instanceof EntityPlayer) {
				DamageSource damageSource = event.source;
				Entity damageSourceEntity = damageSource.getEntity();
				EntityPlayer player = (EntityPlayer) entity;
				if (damageSourceEntity instanceof EntityZombie) {
					ZombieUtils.convertToZombie(player, world,
							EntityZombie.class, "Zombie");
				} else if (damageSourceEntity instanceof EntityMutantZombie) {
					String strMutantName = ((EntityMutantZombie) damageSourceEntity)
							.getMutantName();
					strMutantName = (strMutantName == "" || strMutantName == null) ? "Mutant"
							: strMutantName;
					ZombieUtils
							.convertToZombie(
									player,
									world,
									(Class<? extends EntityMutantZombie>) damageSourceEntity
											.getClass(), strMutantName);
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onLiving(LivingEvent event) {
		EntityLivingBase entity = event.entityLiving;
		World world = entity.worldObj;
		Random rand = new Random();
		if (!world.isRemote) {
			if (entity instanceof EntityZombie) {
				EntityZombie zombie = (EntityZombie) entity;
				// Volatile
				if (rand.nextInt(500) == 0 && rand.nextInt(50) == 0) {
					double x = entity.posX;
					double y = entity.posY;
					double z = entity.posZ;
					zombie.setDead();
					EntityVolatile vzombie = new EntityVolatile(world);
					vzombie.copyLocationAndAnglesFrom(zombie);
					if (zombie.hasCustomName()) {
						String zombieName = zombie.getCustomNameTag();
						String vZombieName = zombieName.replace("Zombie",
								"Volatile");
						vzombie.setCustomNameTag(vZombieName);
					}
					world.spawnEntityInWorld(vzombie);
					ZombieUtils.playMutateSound(vzombie.posX, vzombie.posY,
							vzombie.posZ, world, rand);
					// Overlord
				} else if (rand.nextInt(800) == 0 && rand.nextInt(568) == 0) {
					double x = entity.posX;
					double y = entity.posY;
					double z = entity.posZ;
					zombie.setDead();
					EntityOverlord overlord = new EntityOverlord(world);
					overlord.setLocationAndAngles(x, y, z, entity.rotationYaw,
							entity.rotationPitch);
					if (zombie.hasCustomName()) {
						String zombieName = zombie.getCustomNameTag();
						String overlordName = zombieName.replace("Zombie",
								"Overlord");
					}
					world.spawnEntityInWorld(overlord);
					ZombieUtils.playMutateSound(overlord.posX, overlord.posY,
							overlord.posZ, world, rand);
					// Seeker
				} else if (rand.nextInt(250) == 0 && rand.nextInt(2) == 1) {
					if (entity.isChild()) {
						double x = entity.posX;
						double y = entity.posY;
						double z = entity.posZ;
						zombie.setDead();
						EntitySeeker seeker = new EntitySeeker(world);
						seeker.setLocationAndAngles(x, y, z,
								entity.rotationYaw, entity.rotationPitch);
						if (zombie.hasCustomName()) {
							String zombieName = zombie.getCustomNameTag();
							String seekerName = zombieName.replace("Zombie",
									"Seeker");
						}
						world.spawnEntityInWorld(seeker);
						ZombieUtils.playMutateSound(seeker.posX, seeker.posY,
								seeker.posZ, world, rand);
					}
				}
				// Volatile
			} else if (entity instanceof EntityVolatile) {
				EntityVolatile zombie = (EntityVolatile) entity;
				double x = entity.posX;
				double y = entity.posY;
				double z = entity.posZ;
				if (rand.nextInt(500) == 0 && rand.nextInt(200) == 0) {
					zombie.setDead();
					EntityOverlord overlord = new EntityOverlord(world);
					overlord.copyLocationAndAnglesFrom(zombie);
					if (zombie.hasCustomName()) {
						String zombieName = zombie.getCustomNameTag();
						String overlordName = zombieName.replace("Volatile",
								"Overlord");
						overlordName = overlordName.replace("Zombie",
								"Overlord");
					}
					world.spawnEntityInWorld(overlord);
					ZombieUtils.playMutateSound(overlord.posX, overlord.posY,
							overlord.posZ, world, rand);
				}
			}
		}
	}
}