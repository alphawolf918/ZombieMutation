package zombiemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zombiemod.ZombieMutationMod;
import zombiemod.utils.ModInfo;

public class BlockZM extends Block {
	
	public BlockZM(Material par1, String unlocalizedName) {
		super(par1);
		this.setUnlocalizedName(ModInfo.MODID + "_" + unlocalizedName);
		this.setHardness(2.0F);
		this.setResistance(4.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public CreativeTabs getCreativeTabToDisplayOn() {
		return ZombieMutationMod.getInstance().getCreativeTab();
	}
	
}