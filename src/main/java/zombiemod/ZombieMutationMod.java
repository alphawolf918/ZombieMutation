/**
 * Zombie Mutation Mod Author: Zollern Wolf Created: February 14th, 2016 GNU
 * Public License Do not re-use or claim as your own.
 */

package zombiemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zombiemod.blocks.BlockList;
import zombiemod.common.CommonRegisterHelper;
import zombiemod.entities.EntitiesZM;
import zombiemod.events.ZombieEvents;
import zombiemod.items.ItemList;
import zombiemod.proxy.CommonProxy;
import zombiemod.utils.ModInfo;
import zombiemod.utils.RecipeManager;
import zombiemod.worldgen.WorldGenManager;

@Mod(modid = ModInfo.MODID, version = ModInfo.VERSION, name = ModInfo.NAME)
public class ZombieMutationMod {
	
	@SidedProxy(clientSide = "zombiemod.proxy.ClientProxy",
			serverSide = "zombiemod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(ModInfo.MODID)
	public static ZombieMutationMod INSTANCE;
	
	public static CreativeTabs zombieMutationTab;
	
	public static ZombieMutationMod getInstance() {
		return INSTANCE;
	}
	
	public CreativeTabs getCreativeTab() {
		return this.zombieMutationTab;
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		this.zombieMutationTab = CommonRegisterHelper.createCreativeTabs(
				"ZombieMutationTab", new ItemStack(ItemList.itemMedkit));
		ItemList.init();
		BlockList.init();
		EntitiesZM.init();
		RecipeManager.init();
		CommonRegisterHelper.registerForgeEvent(new ZombieEvents());
		GameRegistry.registerWorldGenerator(new WorldGenManager(), 25);
		ZombieMutationMod.proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		ZombieMutationMod.proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		ZombieMutationMod.proxy.postInit(event);
	}
}