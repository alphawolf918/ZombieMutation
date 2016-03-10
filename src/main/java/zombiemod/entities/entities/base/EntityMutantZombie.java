package zombiemod.entities.entities.base;

import java.util.UUID;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateClimber;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityMutantZombie extends EntityMob {
	
	private static String mutantName;
	private static int mutantMultiplyChance;
	private static int mutantFireTime;
	private static float mutantScale;
	
	protected static final IAttribute reinforcementChance = (new RangedAttribute(
			(IAttribute) null, "zombie.spawnReinforcements", 0.0D, 0.0D, 0.5D))
			.setDescription("Spawn Reinforcements Chance");
	private static final UUID babySpeedBoostUUID = UUID
			.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
	private static final AttributeModifier babySpeedBoostModifier = new AttributeModifier(
			babySpeedBoostUUID, "Baby speed boost", 1.0D, 1);
	private final EntityAIBreakDoor breakDoor = new EntityAIBreakDoor(this);
	
	private int conversionTime;
	private boolean isBreakDoorsTaskSet = false;
	
	public EntityMutantZombie(World worldIn) {
		super(worldIn);
		((PathNavigateGround) this.getNavigator()).setBreakDoors(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this,
				EntityPlayer.class, 0.5D, false));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.2D));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(8, new EntityAIWatchClosest(this,
				EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.setMutantName("Mutant");
		this.setMutantMultiplyChance(20);
		this.setMutantFireTime(10);
		this.setSize(this.width * this.getMutantScale(),
				this.height * this.getMutantScale());
		this.setCanPickUpLoot(true);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean getAlwaysRenderNameTagForRender() {
		return true;
	}
	
	@Override
	public float getRenderSizeModifier() {
		return this.getMutantScale();
	}
	
	@Override
	protected String getSwimSound() {
		return "game.neutral.swim";
	}
	
	@Override
	protected String getSplashSound() {
		return "game.neutral.swim.splash";
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
	
	public void setMutantScale(float scale) {
		this.mutantScale = scale;
	}
	
	public float getMutantScale() {
		return this.mutantScale;
	}
	
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}
	
	@Override
	public double getMountedYOffset() {
		return this.height * 0.5F;
	}
	
	@Override
	protected PathNavigate getNewNavigator(World worldIn) {
		return new PathNavigateClimber(this, worldIn);
	}
	
	public boolean isBreakDoorsTaskSet() {
		return this.isBreakDoorsTaskSet;
	}
	
	public void setBreakDoorsAItask(boolean par1) {
		if (this.isBreakDoorsTaskSet != par1) {
			this.isBreakDoorsTaskSet = par1;
			
			if (par1) {
				this.tasks.addTask(1, this.breakDoor);
			} else {
				this.tasks.removeTask(this.breakDoor);
			}
		}
	}
	
	/**
	 * Sets the entity name of this mutant. Used for custom name tags.
	 * 
	 * @param strMutantName
	 */
	public void setMutantName(String strMutantName) {
		this.mutantName = strMutantName;
	}
	
	/**
	 * Gets the entity name of this mutant. Used for custom name tags.
	 * 
	 * @return The name of this mutant.
	 */
	public String getMutantName() {
		return this.mutantName;
	}
	
	/**
	 * Sets the chance for this mutant to multiply when attacked. Lower numbers
	 * mean higher chances (1 in N chance).
	 * 
	 * @param chance
	 *            The chance of this creature to create more of itself or other
	 *            zombies (changeable in the config).
	 */
	public void setMutantMultiplyChance(int chance) {
		this.mutantMultiplyChance = chance;
	}
	
	/**
	 * Gets the chance of this mutant to multiply.
	 * 
	 * @return The chance of this creature to create more of itself or other
	 *         zombies (changeable in the config).
	 */
	public int getMutantMultiplyChance() {
		return this.mutantMultiplyChance;
	}
	
	public void setMutantFireTime(int fireTime) {
		if (fireTime <= 0) {
			this.isImmuneToFire = true;
		}
		this.mutantFireTime = fireTime;
	}
	
	public int getMutantFireTime() {
		return this.mutantFireTime;
	}
	
	@Override
	public float getBlockPathWeight(BlockPos pos) {
		return this.worldObj.getLightBrightness(pos) - 0.5F;
	}
}