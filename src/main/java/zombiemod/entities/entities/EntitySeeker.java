/**
 * Zombie Mutation Mod Author: Zollern Wolf Created: February 14th, 2016 GNU
 * Public License Do not re-use or claim as your own.
 */

package zombiemod.entities.entities;

import java.util.Calendar;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;
import zombiemod.entities.entities.base.EntityMutantZombie;

public class EntitySeeker extends EntityMutantZombie {
	
	public EntitySeeker(World worldIn) {
		super(worldIn);
		this.setMutantMultiplyChance(5);
		this.setMutantName("Seeker");
		this.setMutantFireTime(0);
		this.setMutantScale(0.8F);
		this.applyEntityAI();
		this.isImmuneToFire = true;
	}
	
	@Override
	public float getSoundPitch() {
		return (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.5F;
	}
	
	@Override
	protected float getSoundVolume() {
		return 1.5F;
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange)
				.setBaseValue(80.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.18611110417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage)
				.setBaseValue(1.4D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(10.0D);
		this.getAttributeMap().registerAttribute(reinforcementChance)
				.setBaseValue(ForgeModContainer.zombieSummonBaseChance);
	}
	
	protected void applyEntityAI() {
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this,
				EntityVillager.class, 1.5D, true));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this,
				EntityIronGolem.class, 1.5D, true));
		this.tasks
				.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true,
				new Class[] { EntityPigZombie.class }));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this,
				EntityPlayer.class, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this,
				EntityVillager.class, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this,
				EntityIronGolem.class, true));
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (super.attackEntityFrom(source, amount)) {
			EntityLivingBase entitylivingbase = this.getAttackTarget();
			
			if (entitylivingbase == null
					&& source.getEntity() instanceof EntityLivingBase) {
				entitylivingbase = (EntityLivingBase) source.getEntity();
			}
			
			int i = MathHelper.floor_double(this.posX);
			int j = MathHelper.floor_double(this.posY);
			int k = MathHelper.floor_double(this.posZ);
			
			EntitySeeker entityseeker;
			entityseeker = new EntitySeeker(this.worldObj);
			
			for (int l = 0; l < 50; ++l) {
				int i1 = i
						+ MathHelper.getRandomIntegerInRange(this.rand, 7, 40)
						* MathHelper.getRandomIntegerInRange(this.rand, -1, 1);
				int j1 = j
						+ MathHelper.getRandomIntegerInRange(this.rand, 7, 40)
						* MathHelper.getRandomIntegerInRange(this.rand, -1, 1);
				int k1 = k
						+ MathHelper.getRandomIntegerInRange(this.rand, 7, 40)
						* MathHelper.getRandomIntegerInRange(this.rand, -1, 1);
				
				if (World.doesBlockHaveSolidTopSurface(this.worldObj,
						new BlockPos(i1, j1 - 1, k1))
						&& this.worldObj.getLightFromNeighbors(new BlockPos(i1,
								j1, k1)) < 10) {
					entityseeker.setPosition(i1, j1, k1);
					
					if (!this.worldObj.isAnyPlayerWithinRangeAt(i1, j1, k1,
							7.0D)
							&& this.worldObj.checkNoEntityCollision(
									entityseeker.getEntityBoundingBox(),
									entityseeker)
							&& this.worldObj.getCollidingBoundingBoxes(
									entityseeker,
									entityseeker.getEntityBoundingBox())
									.isEmpty()
							&& !this.worldObj.isAnyLiquid(entityseeker
									.getEntityBoundingBox())
							&& this.rand
									.nextInt(this.getMutantMultiplyChance()) == 0) {
						this.worldObj.spawnEntityInWorld(entityseeker);
						if (entitylivingbase != null)
							entityseeker.setAttackTarget(entitylivingbase);
						entityseeker.onInitialSpawn(this.worldObj
								.getDifficultyForLocation(new BlockPos(
										entityseeker)),
								(IEntityLivingData) null);
						break;
					}
				}
			}
		}
		return true;
	}
	
	@Override
	public int getTotalArmorValue() {
		int i = super.getTotalArmorValue() + 2;
		
		if (i > 10) {
			i = 10;
		}
		
		return i;
	}
	
	@Override
	protected String getLivingSound() {
		return "mob.zombie.say";
	}
	
	@Override
	protected String getHurtSound() {
		return "mob.zombie.hurt";
	}
	
	@Override
	protected String getDeathSound() {
		return "mob.zombie.death";
	}
	
	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound("mob.zombie.step", 1.30F, 4.4F);
	}
	
	@Override
	protected Item getDropItem() {
		return Items.rotten_flesh;
	}
	
	@Override
	public void onKillEntity(EntityLivingBase entityLivingIn) {
		super.onKillEntity(entityLivingIn);
		
		if ((this.worldObj.getDifficulty() == EnumDifficulty.NORMAL || this.worldObj
				.getDifficulty() == EnumDifficulty.HARD)
				&& entityLivingIn instanceof EntityVillager) {
			if (this.worldObj.getDifficulty() != EnumDifficulty.HARD
					&& this.rand.nextBoolean()) {
				return;
			}
			
			EntityLiving entityliving = (EntityLiving) entityLivingIn;
			EntitySeeker entityseeker = new EntitySeeker(this.worldObj);
			entityseeker.copyLocationAndAnglesFrom(entityLivingIn);
			this.worldObj.removeEntity(entityLivingIn);
			entityseeker.onInitialSpawn(this.worldObj
					.getDifficultyForLocation(new BlockPos(entityseeker)),
					(IEntityLivingData) null);
			
			entityseeker.setNoAI(entityliving.isAIDisabled());
			
			if (entityliving.hasCustomName()) {
				entityseeker.setCustomNameTag(entityliving.getCustomNameTag());
				entityseeker.setAlwaysRenderNameTag(entityliving
						.getAlwaysRenderNameTag());
			}
			
			this.worldObj.spawnEntityInWorld(entityseeker);
			this.worldObj.playAuxSFXAtEntity((EntityPlayer) null, 1016,
					new BlockPos((int) this.posX, (int) this.posY,
							(int) this.posZ), 0);
		}
	}
	
	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty,
			IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		float f = difficulty.getClampedAdditionalDifficulty();
		this.setCanPickUpLoot(this.rand.nextFloat() < 0.55F * f);
		
		if (livingdata == null) {
			livingdata = new EntitySeeker.GroupData(false, false);
		}
		
		this.setBreakDoorsAItask(this.rand.nextFloat() < f * 0.1F);
		
		if (this.getEquipmentInSlot(4) == null) {
			Calendar calendar = this.worldObj.getCurrentDate();
			
			if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31
					&& this.rand.nextFloat() < 0.25F) {
				this.setCurrentItemOrArmor(
						4,
						new ItemStack(
								this.rand.nextFloat() < 0.1F ? Blocks.lit_pumpkin
										: Blocks.pumpkin));
				this.equipmentDropChances[4] = 0.0F;
			}
		}
		
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance)
				.applyModifier(
						new AttributeModifier("Random spawn bonus", this.rand
								.nextDouble() * 0.05000000074505806D, 0));
		double d0 = this.rand.nextDouble() * 3.0D * f;
		
		if (d0 > 1.0D) {
			this.getEntityAttribute(SharedMonsterAttributes.followRange)
					.applyModifier(
							new AttributeModifier("Random zombie-spawn bonus",
									d0, 2));
		}
		
		if (this.rand.nextFloat() < f * 0.05F) {
			this.getEntityAttribute(reinforcementChance).applyModifier(
					new AttributeModifier("Leader zombie bonus", this.rand
							.nextDouble() * 0.25D + 0.5D - 0.5D, 0));
			this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
					.applyModifier(
							new AttributeModifier("Leader zombie bonus",
									this.rand.nextDouble() * 3.0D + 1.0D, 2));
			this.setBreakDoorsAItask(true);
		}
		
		return livingdata;
	}
	
	class GroupData implements IEntityLivingData {
		public boolean isChild;
		public boolean isVillager;
		
		private GroupData(boolean isBaby, boolean isVillagerZombie) {
			this.isChild = false;
			this.isVillager = false;
			this.isChild = isBaby;
			this.isVillager = isVillagerZombie;
		}
	}
}