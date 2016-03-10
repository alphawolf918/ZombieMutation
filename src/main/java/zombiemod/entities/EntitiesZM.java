/**
 * Zombie Mutation Mod Author: Zollern Wolf Created: February 14th, 2016 GNU
 * Public License Do not re-use or claim as your own.
 */

package zombiemod.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLiving.SpawnPlacementType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import zombiemod.ZombieMutationMod;
import zombiemod.common.CommonRegisterHelper;
import zombiemod.entities.entities.EntityOverlord;
import zombiemod.entities.entities.EntitySeeker;
import zombiemod.entities.entities.EntityVolatile;

public class EntitiesZM {
	
	public static void init() {
		EntitiesZM.registerEntities();
	}
	
	private static void registerEntities() {
		EntitiesZM.registerEntity(EntityVolatile.class, "volatile", 0xeeeeee,
				0xf00000, null);
		EntitiesZM.registerEntity(EntityOverlord.class, "overlord", 0x008b00,
				0x009f00, null);
		EntitiesZM.registerEntity(EntitySeeker.class, "seeker", 0x009900,
				0x00008b, null);
		
	}
	
	public void addGlobalSpawn(Class<? extends EntityLiving> entityLiving,
			int spawnRate, int minSpawn, int maxSpawn,
			EnumCreatureType creatureType) {
		EntityRegistry.addSpawn(entityLiving, spawnRate, minSpawn, maxSpawn,
				creatureType, BiomeGenBase.beach, BiomeGenBase.birchForest,
				BiomeGenBase.birchForestHills, BiomeGenBase.coldBeach,
				BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills,
				BiomeGenBase.desert, BiomeGenBase.desertHills,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest,
				BiomeGenBase.forestHills, BiomeGenBase.iceMountains,
				BiomeGenBase.icePlains, BiomeGenBase.jungle,
				BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills,
				BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills,
				BiomeGenBase.plains, BiomeGenBase.roofedForest,
				BiomeGenBase.savanna, BiomeGenBase.savannaPlateau,
				BiomeGenBase.swampland, BiomeGenBase.stoneBeach,
				BiomeGenBase.taiga, BiomeGenBase.taigaHills);
	}
	
	private static void registerEntity(Class<? extends Entity> entity,
			String name, int backgroundColor, int foregroundColor,
			SpawnPlacementType type) {
		CommonRegisterHelper.registerNonMobEntity(entity, name,
				ZombieMutationMod.getInstance(), true);
		EntityRegistry.registerEgg(entity, backgroundColor, foregroundColor);
		if (type != null) {
			EntitySpawnPlacementRegistry.setPlacementType(entity, type);
		}
	}
}