package zombiemod.worldgen;

import java.util.Random;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenManager implements IWorldGenerator {
	
	public static BiomeGenBase currentBiome;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimensionId() == 0) {
			this.generateEarth(world, random, chunkX, chunkZ);
		}
	}
	
	private void generateEarth(World world, Random random, int x, int z) {
		double y = ((world.getHeight() / 4.0D) - random.nextInt(6));
		if (random.nextInt(10) == 0) {
			BiomeGenBase currentBiome = world
					.getBiomeGenForCoords(new BlockPos(x, y, z));
			if (currentBiome.equals(BiomeGenBase.desert)) {
				this.spawnStructure(0, 200, world, random, x, (int) y, z,
						(new WorldGenZombieHive()));
			}
		}
	}
	
	/**
	 * Spawns a structure in the world
	 *
	 * @author Zollern Wolf
	 * @param minChance
	 *            The minimum chance that the structure has to spawn.
	 * @param maxChance
	 *            The maximum chance that the structure has to spawn.
	 * @param world
	 *            The world for the structure to spawn in.
	 * @param random
	 *            Needed for randomization and comparison.
	 * @param x
	 *            The X coordinate to spawn in at.
	 * @param y
	 *            The Y coordinate to spawn in at.
	 * @param z
	 * @param wg
	 *            The structure.
	 */
	public static void spawnStructure(int minChance, int maxChance,
			World world, Random random, int x, int y, int z, WorldGenerator wg) {
		if (random.nextInt(maxChance) == minChance) {
			wg.generate(world, random, new BlockPos(x, y, z));
		}
	}
	
}