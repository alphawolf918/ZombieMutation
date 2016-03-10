/**
 * Zombie Mutation Mod 
 * Author: Zollern Wolf
 * Created: February 14th, 2016
 * GNU Public License
 * Do not re-use or claim as your own.
 */

package zombiemod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabsHelper extends CreativeTabs
{
    private ItemStack itemStack;

    public CreativeTabsHelper(String name, ItemStack itemStack)
    {
        super(CreativeTabs.getNextID(), name);
        this.itemStack = itemStack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack()
    {
        return this.itemStack;
    }

    @Override
    public Item getTabIconItem()
    {
        return null;
    }
}