package zombiemod.blocks;

import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBarrier extends BlockZM {
	
	public BlockBarrier() {
		super(Material.rock, "barrierblock");
		this.setBlockUnbreakable();
	}
	
	@Override
	public int quantityDropped(Random random) {
		return 0;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.CUTOUT;
	}
	
	@Override
	public boolean isFullCube() {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
}