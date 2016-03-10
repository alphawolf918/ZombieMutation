/**
 * Zombie Mutation Mod Author: Zollern Wolf Created: February 14th, 2016 GNU
 * Public License Do not re-use or claim as your own.
 */

package zombiemod.entities.renderers;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zombiemod.entities.entities.EntityVolatile;
import zombiemod.entities.models.ModelVolatile;

@SideOnly(Side.CLIENT)
public class RenderVolatile extends RenderLiving<EntityVolatile> {
	
	private ResourceLocation volatileTextures = new ResourceLocation(
			"ZombieMutation:textures/entity/volatile.png");
	
	public RenderVolatile(RenderManager render) {
		super(render, new ModelVolatile(), 1.05F);
	}
	
	@Override
	public void doRender(EntityVolatile entity, double x, double y, double z,
			float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}
	
	@Override
	protected void preRenderCallback(EntityVolatile entity,
			float partialTickTime) {
		float f1 = 1.2F;// entity.getMutantScale();
		GlStateManager.scale(f1, f1, f1);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityVolatile entity) {
		return this.volatileTextures;
	}
}