/**
 * Zombie Mutation Mod Author: Zollern Wolf Created: February 14th, 2016 GNU
 * Public License Do not re-use or claim as your own.
 */

package zombiemod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zombiemod.client.BlockRenderer;
import zombiemod.client.EntityRenderer;
import zombiemod.client.ItemRenderer;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		EntityRenderer.init();
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		ItemRenderer.init();
		BlockRenderer.init();
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}