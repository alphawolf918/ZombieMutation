package zombiemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zombiemod.ZombieMutationMod;
import zombiemod.utils.ModInfo;

public class ItemZM extends Item {
	
	public ItemZM(String itemName) {
		this.setUnlocalizedName(ModInfo.MODID + "_" + itemName);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public CreativeTabs getCreativeTab() {
		return ZombieMutationMod.getInstance().getCreativeTab();
	}
}