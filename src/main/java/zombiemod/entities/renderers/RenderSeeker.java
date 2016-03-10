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
import zombiemod.entities.entities.EntitySeeker;
import zombiemod.entities.models.ModelSeeker;

@SideOnly(Side.CLIENT)
public class RenderSeeker extends RenderLiving<EntitySeeker> {
	
	private ResourceLocation seekerTextures = new ResourceLocation(
			"ZombieMutation:textures/entity/seeker.png");
	
	public RenderSeeker(RenderManager render) {
		super(render, new ModelSeeker(), 1.35F);
	}
	
	@Override
	public void doRender(EntitySeeker entity, double x, double y, double z,
			float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}
	
	@Override
	protected void preRenderCallback(EntitySeeker entity, float partialTickTime) {
		float f1 = 0.8F;// entity.getMutantScale();
		GlStateManager.scale(f1, f1, f1);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitySeeker entity) {
		return this.seekerTextures;
	}
}