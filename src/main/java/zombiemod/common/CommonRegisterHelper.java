/**
 * Zombie Mutation Mod Author: Zollern Wolf Created: February 14th, 2016 GNU
 * Public License Do not re-use or claim as your own.
 */

package zombiemod.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonRegisterHelper {
	
	public static int entityIDs = 0;
	
	public static void registerBlock(Block block,
			Class<? extends ItemBlock> itemBlock) {
		GameRegistry.registerBlock(block, itemBlock, block.getUnlocalizedName()
				.substring(5));
	}
	
	public static void registerBlock(Block block,
			Class<? extends ItemBlock> itemBlock, Object... objectFromItemBlock) {
		GameRegistry.registerBlock(block, itemBlock, block.getUnlocalizedName()
				.substring(5), objectFromItemBlock);
	}
	
	public static void registerBlock(Block block) {
		GameRegistry.registerBlock(block,
				block.getUnlocalizedName().substring(5));
	}
	
	public static void registerItem(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static void registerFluid(Fluid fluid) {
		FluidRegistry.registerFluid(fluid);
	}
	
	public static void registerNonMobEntity(Class<? extends Entity> entity,
			String name, Object mod, boolean sendVelocityUpdate) {
		EntityRegistry.registerModEntity(entity, name, entityIDs++, mod, 80, 3,
				sendVelocityUpdate);
	}
	
	public static void registerFluidContainer(Fluid fluid,
			ItemStack filledContainer, ItemStack emptyContainer) {
		FluidContainerRegistry.registerFluidContainer(new FluidContainerData(
				new FluidStack(fluid, FluidContainerRegistry.BUCKET_VOLUME),
				filledContainer, emptyContainer));
	}
	
	public static void setFireBurn(Block block, int encouragement,
			int flammibility) {
		Blocks.fire.setFireInfo(block, encouragement, flammibility);
	}
	
	public static void registerFuelHandler(IFuelHandler handler) {
		GameRegistry.registerFuelHandler(handler);
	}
	
	public static void registerGUIHandler(Object mod, IGuiHandler handler) {
		NetworkRegistry.INSTANCE.registerGuiHandler(mod, handler);
	}
	
	public static void setBlockHarvestLevel(Block block, String tool, int level) {
		block.setHarvestLevel(tool, level);
	}
	
	public static void setBlockHarvestLevel(Block block, String tool,
			int level, int meta) {
		block.setHarvestLevel(tool, level, block.getStateFromMeta(meta));
	}
	
	public static void setToolHarvestLevel(Item item, String tool, int level) {
		item.setHarvestLevel(tool, level);
	}
	
	public static void registerForgeEvent(Object event) {
		MinecraftForge.EVENT_BUS.register(event);
	}
	
	public static CreativeTabs createCreativeTabs(String name,
			ItemStack itemStack) {
		return new CreativeTabsHelper(name, itemStack);
	}
}