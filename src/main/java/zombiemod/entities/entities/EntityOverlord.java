/**
 * Zombie Mutation Mod Author: Zollern Wolf Created: February 14th, 2016 GNU
 * Public License Do not re-use or claim as your own.
 */

package zombiemod.entities.entities;

import java.util.Calendar;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
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
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;
import zombiemod.entities.entities.base.EntityMutantZombie;

public class EntityOverlord extends EntityMutantZombie {
	
	public EntityOverlord(World worldIn) {
		super(worldIn);
		this.setMutantMultiplyChance(10);
		this.setMutantName("Overlord");
		this.setMutantFireTime(2);
		this.setMutantScale(2.0F);
		this.applyEntityAI();
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange)
				.setBaseValue(70.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.10000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage)
				.setBaseValue(2.5D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(65.0D);
		this.getAttributeMap().registerAttribute(reinforcementChance)
				.setBaseValue(ForgeModContainer.zombieSummonBaseChance);
	}
	
	protected void applyEntityAI() {
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this,
				EntityVillager.class, 2.5D, true));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this,
				EntityIronGolem.class, 2.5D, true));
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
	public void onLivingUpdate() {
		if (this.worldObj.isDaytime() && !this.worldObj.isRemote
				&& !this.isChild()) {
			float f = this.getBrightness(1.0F);
			BlockPos blockpos = new BlockPos(this.posX, Math.round(this.posY),
					this.posZ);
			
			if (f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F
					&& this.worldObj.canSeeSky(blockpos)) {
				boolean flag = true;
				ItemStack itemstack = this.getEquipmentInSlot(4);
				
				if (itemstack != null) {
					if (itemstack.isItemStackDamageable()) {
						itemstack.setItemDamage(itemstack.getItemDamage()
								+ this.rand.nextInt(2));
						
						if (itemstack.getItemDamage() >= itemstack
								.getMaxDamage()) {
							this.renderBrokenItemStack(itemstack);
							this.setCurrentItemOrArmor(4, (ItemStack) null);
						}
					}
					
					flag = false;
				}
				
				if (flag) {
					this.setFire(this.getMutantFireTime());
				}
			}
		}
		
		if (this.isRiding() && this.getAttackTarget() != null
				&& this.ridingEntity instanceof EntityChicken) {
			((EntityLiving) this.ridingEntity).getNavigator().setPath(
					this.getNavigator().getPath(), 1.5D);
		}
		
		super.onLivingUpdate();
	}
	
	@Override
	public int getTotalArmorValue() {
		int i = super.getTotalArmorValue() + 2;
		
		if (i > 20) {
			i = 20;
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
		this.playSound("mob.spider.step", 1.30F, 0.2F);
	}
	
	@Override
	protected Item getDropItem() {
		return Items.string;
	}
	
	@Override
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		super.dropFewItems(p_70628_1_, p_70628_2_);
		
		if (p_70628_1_
				&& (this.rand.nextInt(3) == 0 || this.rand
						.nextInt(1 + p_70628_2_) > 0)) {
			this.dropItem(Items.spider_eye, 1);
		}
	}
	
	@Override
	public void setInWeb() {
	}
	
	@Override
	public boolean isPotionApplicable(PotionEffect potioneffectIn) {
		return potioneffectIn.getPotionID() == Potion.poison.id ? false : super
				.isPotionApplicable(potioneffectIn);
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
			EntityOverlord entityoverlord = new EntityOverlord(this.worldObj);
			entityoverlord.copyLocationAndAnglesFrom(entityLivingIn);
			this.worldObj.removeEntity(entityLivingIn);
			entityoverlord.onInitialSpawn(this.worldObj
					.getDifficultyForLocation(new BlockPos(entityoverlord)),
					(IEntityLivingData) null);
			
			entityoverlord.setNoAI(entityliving.isAIDisabled());
			
			if (entityliving.hasCustomName()) {
				entityoverlord
						.setCustomNameTag(entityliving.getCustomNameTag());
				entityoverlord.setAlwaysRenderNameTag(entityliving
						.getAlwaysRenderNameTag());
			}
			
			this.worldObj.spawnEntityInWorld(entityoverlord);
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
			livingdata = new EntitySpider.GroupData();
			
			if (this.worldObj.getDifficulty() == EnumDifficulty.HARD
					&& this.worldObj.rand.nextFloat() < 0.1F * difficulty
							.getClampedAdditionalDifficulty()) {
				((EntityOverlord.GroupData) livingdata)
						.func_111104_a(this.worldObj.rand);
			}
		}
		
		if (livingdata instanceof EntityOverlord.GroupData) {
			int i = ((EntityOverlord.GroupData) livingdata).potionEffectId;
			
			if (i > 0 && Potion.potionTypes[i] != null) {
				this.addPotionEffect(new PotionEffect(i, Integer.MAX_VALUE));
			}
		}
		
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
									this.rand.nextDouble() * 2.0D, 2));
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
		
		public int potionEffectId;
		
		public void func_111104_a(Random rand) {
			int i = rand.nextInt(5);
			
			if (i <= 1) {
				this.potionEffectId = Potion.moveSpeed.id;
			} else if (i <= 2) {
				this.potionEffectId = Potion.damageBoost.id;
			} else if (i <= 3) {
				this.potionEffectId = Potion.regeneration.id;
			} else if (i <= 4) {
				this.potionEffectId = Potion.invisibility.id;
			}
		}
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
			
			EntityZombie entitymutant;
			entitymutant = new EntityZombie(this.worldObj);
			
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
					entitymutant.setPosition(i1, j1, k1);
					
					if (!this.worldObj.isAnyPlayerWithinRangeAt(i1, j1, k1,
							7.0D)
							&& this.worldObj.checkNoEntityCollision(
									entitymutant.getEntityBoundingBox(),
									entitymutant)
							&& this.worldObj.getCollidingBoundingBoxes(
									entitymutant,
									entitymutant.getEntityBoundingBox())
									.isEmpty()
							&& !this.worldObj.isAnyLiquid(entitymutant
									.getEntityBoundingBox())
							&& this.rand
									.nextInt(this.getMutantMultiplyChance()) == 0) {
						this.worldObj.spawnEntityInWorld(entitymutant);
						if (entitylivingbase != null)
							entitymutant.setAttackTarget(entitylivingbase);
						entitymutant.onInitialSpawn(this.worldObj
								.getDifficultyForLocation(new BlockPos(
										entitymutant)),
								(IEntityLivingData) null);
						break;
					}
				}
			}
		}
		return true;
	}
	
	static class AISpiderAttack extends EntityAIAttackOnCollide {
		public AISpiderAttack(EntitySpider p_i45819_1_,
				Class<? extends Entity> targetClass) {
			super(p_i45819_1_, targetClass, 1.0D, true);
		}
		
		@Override
		public boolean continueExecuting() {
			float f = this.attacker.getBrightness(1.0F);
			
			if (f >= 0.5F && this.attacker.getRNG().nextInt(100) == 0) {
				this.attacker.setAttackTarget((EntityLivingBase) null);
				return false;
			} else {
				return super.continueExecuting();
			}
		}
		
		@Override
		protected double func_179512_a(EntityLivingBase attackTarget) {
			return 4.0F + attackTarget.width;
		}
	}
	
	static class AISpiderTarget<T extends EntityLivingBase> extends
			EntityAINearestAttackableTarget {
		public AISpiderTarget(EntitySpider p_i45818_1_, Class<T> classTarget) {
			super(p_i45818_1_, classTarget, true);
		}
		
		@Override
		public boolean shouldExecute() {
			float f = this.taskOwner.getBrightness(1.0F);
			return f >= 0.5F ? false : super.shouldExecute();
		}
	}
}