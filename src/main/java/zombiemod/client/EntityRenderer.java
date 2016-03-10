/**
 * Zombie Mutation Mod Author: Zollern Wolf Created: February 14th, 2016 GNU
 * Public License Do not re-use or claim as your own.
 */

package zombiemod.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import zombiemod.entities.entities.EntityOverlord;
import zombiemod.entities.entities.EntitySeeker;
import zombiemod.entities.entities.EntityVolatile;
import zombiemod.entities.renderers.RenderOverlord;
import zombiemod.entities.renderers.RenderSeeker;
import zombiemod.entities.renderers.RenderVolatile;

public class EntityRenderer {
	
	public static void init() {
		EntityRenderer.registerEntityRenderers();
	}
	
	private static void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityVolatile.class,
				new IRenderFactory() {
					@Override
					public Render createRenderFor(RenderManager manager) {
						return new RenderVolatile(manager);
					}
				});
		RenderingRegistry.registerEntityRenderingHandler(EntityOverlord.class,
				new IRenderFactory() {
					@Override
					public Render createRenderFor(RenderManager manager) {
						return new RenderOverlord(manager);
					}
				});
		RenderingRegistry.registerEntityRenderingHandler(EntitySeeker.class,
				new IRenderFactory() {
					@Override
					public Render createRenderFor(RenderManager manager) {
						return new RenderSeeker(manager);
					}
				});
	}
}