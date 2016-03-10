package zombiemod.blocks;

import net.minecraft.block.Block;
import zombiemod.common.CommonRegisterHelper;

public class BlockList {
	
	public static final Block blockBarrier = new BlockBarrier();
	
	public static void init() {
		registerBlock(blockBarrier);
	}
	
	public static void registerBlock(Block block) {
		CommonRegisterHelper.registerBlock(block);
	}
	
}