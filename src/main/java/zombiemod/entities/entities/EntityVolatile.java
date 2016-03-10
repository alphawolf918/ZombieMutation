/**
 * Zombie Mutation Mod Author: Zollern Wolf Created: February 14th, 2016 GNU
 * Public License Do not re-use or claim as your own.
 */

package zombiemod.entities.entities;

import java.util.Calendar;
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
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
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

public class EntityVolatile extends EntityMutantZombie {
	
	public EntityVolatile(World worldIn) {
		super(worldIn);
		this.setMutantMultiplyChance(8);
		this.setMutantName("Volatile");
		this.setMutantFireTime(20);
		this.setMutantScale(1.2F);
		this.applyEntityAI();
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange)
				.setBaseValue(65.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.10100000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage)
				.setBaseValue(4.5D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(65.0D);
		this.getAttributeMap().registerAttribute(reinforcementChance)
				.setBaseValue(ForgeModContainer.zombieSummonBaseChance);
	}
	
	protected void applyEntityAI() {
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this,
				EntityVillager.class, 4.5D, true));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this,
				EntityIronGolem.class, 4.5D, true));
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
	
	@Override
	public float getEyeHeight() {
		float f = 1.0F;
		
		if (this.isChild()) {
			f = (float) (f - 0.81D);
		}
		
		return f;
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
	}
	
	@Override
	protected void entityInit() {
		super.entityInit();
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
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
		super.setEquipmentBasedOnDifficulty(difficulty);
		
		if (this.rand.nextFloat() < (this.worldObj.getDifficulty() == EnumDifficulty.HARD ? 0.05F
				: 0.01F)) {
			int i = this.rand.nextInt(3);
			
			if (i == 0) {
				this.setCurrentItemOrArmor(0,
						new ItemStack(Items.diamond_sword));
			} else {
				this.setCurrentItemOrArmor(0, new ItemStack(Items.iron_sword));
			}
		}
	}
	
	@Override
	protected boolean func_175448_a(ItemStack stack) {
		return stack.getItem() == Items.egg && this.isChild()
				&& this.isRiding() ? false : super.func_175448_a(stack);
	}
	
	@Override
	public double getYOffset() {
		return this.isChild() ? 0.0D : -0.35D;
	}
	
	@Override
	public void onDeath(DamageSource cause) {
		super.onDeath(cause);
		
		if (cause.getEntity() instanceof EntityCreeper
				&& ((EntityCreeper) cause.getEntity()).getPowered()
				&& ((EntityCreeper) cause.getEntity()).isAIEnabled()) {
			((EntityCreeper) cause.getEntity()).func_175493_co();
			this.entityDropItem(new ItemStack(Items.skull, 1, 2), 0.0F);
		}
	}
	
	@Override
	protected void addRandomDrop() {
		switch (this.rand.nextInt(3)) {
			case 0:
				this.dropItem(Items.diamond, 1);
			break;
			case 1:
				this.dropItem(Items.iron_ingot, 1);
			break;
			case 2:
				this.dropItem(Items.gold_ingot, 1);
			case 3:
				this.dropItem(Items.emerald, 1);
		}
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entityIn) {
		boolean flag = super.attackEntityAsMob(entityIn);
		
		if (flag) {
			int i = this.worldObj.getDifficulty().getDifficultyId();
			
			if (this.getHeldItem() == null && this.isBurning()
					&& this.rand.nextFloat() < i * 0.3F) {
				entityIn.setFire(4 * i);
			}
		}
		
		return flag;
	}
	
	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		if (this.isChild()) {
			this.experienceValue = (int) (this.experienceValue * 6.5F);
		}
		
		return super.getExperiencePoints(player);
	}
	
	@Override
	protected String getLivingSound() {
		return "ZombieMutation:mob.volatile.say";
	}
	
	@Override
	protected String getHurtSound() {
		return "ZombieMutation:mob.volatile.hurt";
	}
	
	@Override
	protected String getDeathSound() {
		return "ZombieMutation:mob.volatile.die";
	}
	
	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound("mob.zombie.step", 1.30F, 0.1F);
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
			EntityVolatile entitymutant = new EntityVolatile(this.worldObj);
			entitymutant.copyLocationAndAnglesFrom(entityLivingIn);
			this.worldObj.removeEntity(entityLivingIn);
			entitymutant.onInitialSpawn(this.worldObj
					.getDifficultyForLocation(new BlockPos(entitymutant)),
					(IEntityLivingData) null);
			
			entitymutant.setNoAI(entityliving.isAIDisabled());
			
			if (entityliving.hasCustomName()) {
				entitymutant.setCustomNameTag(entityliving.getCustomNameTag());
				entitymutant.setAlwaysRenderNameTag(entityliving
						.getAlwaysRenderNameTag());
			}
			
			this.worldObj.spawnEntityInWorld(entitymutant);
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
			livingdata = new EntityVolatile.GroupData(false, false);
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