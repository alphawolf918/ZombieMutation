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
import zombiemod.entities.entities.EntityOverlord;
import zombiemod.entities.models.ModelOverlord;

@SideOnly(Side.CLIENT)
public class RenderOverlord extends RenderLiving<EntityOverlord> {
	
	private ResourceLocation overlordTextures = new ResourceLocation(
			"ZombieMutation:textures/entity/overlord.png");
	
	public RenderOverlord(RenderManager render) {
		super(render, new ModelOverlord(), 1.35F);
	}
	
	@Override
	public void doRender(EntityOverlord entity, double x, double y, double z,
			float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}
	
	@Override
	protected void preRenderCallback(EntityOverlord entity,
			float partialTickTime) {
		float f1 = 2.0F;// entity.getMutantScale();
		GlStateManager.scale(f1, f1, f1);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityOverlord entity) {
		return this.overlordTextures;
	}
}