package zombiemod.worldgen;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import zombiemod.utils.ErrorType;
import zombiemod.utils.ZombieUtils;

public class WorldGenZombieHive extends WorldGenerator {
	
	private static final Logger field_175918_a = LogManager.getLogger();
	IBlockState sandStoneState = Blocks.sandstone.getDefaultState();
	
	public WorldGenZombieHive() {
		
	}
	
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		ZombieUtils.Log("Generating pyramid: " + position.getX() + " "
				+ position.getY() + " " + position.getZ());
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(0, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(1, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(2, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(3, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(4, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(5, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(6, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(7, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(8, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(9, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(10, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(11, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(12, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 13, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 13, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 13, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 13, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 13, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 13, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 13, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 13, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 13, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 13, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(13, 13, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 13, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 13, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 14, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 14, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 14, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 14, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 14, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 14, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 14, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 14, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(14, 14, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 13, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 13, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 14, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 14, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 15, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 15, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 15, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 15, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 15, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 15, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(15, 15, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 13, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 13, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 14, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 14, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 15, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 15, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 16, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 16, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 16, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 16, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(16, 16, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 13, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 13, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 14, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 14, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 15, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 15, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 16, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 16, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 17, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 17, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(17, 17, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 0, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 13, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 13, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 14, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 14, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 15, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 15, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 16, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 16, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 17, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 17, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(18, 17, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 0, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 0, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 0, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 0, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 1, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 1, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 2, 2),
				sandStoneState);
		
		// Spawner TODO
		BlockPos mobSpawnerPosAdd = position.add(19, 6, 19);
		worldIn.setBlockState(mobSpawnerPosAdd,
				Blocks.mob_spawner.getDefaultState(), 2);
		TileEntity mobSpawnerEntity = worldIn.getTileEntity(mobSpawnerPosAdd);
		if (mobSpawnerEntity instanceof TileEntityMobSpawner) {
			((TileEntityMobSpawner) mobSpawnerEntity).getSpawnerBaseLogic()
					.setEntityName("Zombie");
			ZombieUtils.Log("Successfully fetched mob spawner entity at ("
					+ mobSpawnerPosAdd.getX() + ", " + mobSpawnerPosAdd.getY()
					+ ", " + mobSpawnerPosAdd.getZ() + ")");
		} else {
			ZombieUtils.Log("Failed to fetch mob spawner entity at ("
					+ mobSpawnerPosAdd.getX() + ", " + mobSpawnerPosAdd.getY()
					+ ", " + mobSpawnerPosAdd.getZ() + ")", ErrorType.ERROR);
		}
		
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 13, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 13, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 14, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 14, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 15, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 15, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 16, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 16, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 17, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 17, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(19, 17, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 0, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 0, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 1, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 13, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 13, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 14, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 14, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 15, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 15, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 16, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 16, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 16, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 16, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(20, 16, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 13, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 13, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 14, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 14, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 15, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 15, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 15, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 15, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 15, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 15, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(21, 15, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 13, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 13, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 14, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 14, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 14, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 14, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 14, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 14, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 14, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 14, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(22, 14, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 13, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 13, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 13, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 13, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 13, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 13, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 13, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 13, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 13, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 13, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(23, 13, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(24, 12, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(25, 11, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(26, 10, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(27, 9, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(28, 8, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(29, 7, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(30, 6, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(31, 5, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(32, 4, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(33, 3, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(34, 2, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 0, 36),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(35, 1, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 0),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 1),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 2),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 3),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 4),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 5),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 6),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 7),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 8),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 9),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 10),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 11),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 12),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 13),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 14),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 15),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 16),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 17),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 18),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 19),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 20),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 21),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 22),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 23),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 24),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 25),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 26),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 27),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 28),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 29),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 30),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 31),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 32),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 33),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 34),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 35),
				sandStoneState);
		this.setBlockAndNotifyAdequately(worldIn, position.add(36, 0, 36),
				sandStoneState);
		return true;
	}
}