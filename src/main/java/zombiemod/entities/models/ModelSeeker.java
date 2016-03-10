package zombiemod.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSeeker extends ModelBase {
	
	ModelRenderer bipedHead;
	ModelRenderer bipedHead2;
	ModelRenderer bipedBody;
	ModelRenderer bipedRightArm;
	ModelRenderer bipedLeftArm;
	ModelRenderer bipedRightLeg;
	ModelRenderer bipedLeftLeg;
	
	public ModelSeeker() {
		textureWidth = 64;
		textureHeight = 64;
		
		bipedHead = new ModelRenderer(this, 0, 0);
		bipedHead.addBox(-4F, -8F, -4F, 8, 8, 8);
		bipedHead.setRotationPoint(-4F, 0F, 0F);
		bipedHead.setTextureSize(64, 64);
		bipedHead.mirror = true;
		setRotation(bipedHead, 0F, 0F, 0F);
		bipedBody = new ModelRenderer(this, 16, 16);
		bipedBody.addBox(-4F, 0F, -2F, 8, 12, 4);
		bipedBody.setRotationPoint(0F, 0F, 0F);
		bipedBody.setTextureSize(64, 64);
		bipedBody.mirror = true;
		setRotation(bipedBody, 0F, 0F, 0F);
		bipedRightArm = new ModelRenderer(this, 40, 16);
		bipedRightArm.addBox(-3F, -2F, -2F, 4, 12, 4);
		bipedRightArm.setRotationPoint(-5F, 2F, 0F);
		bipedRightArm.setTextureSize(64, 64);
		bipedRightArm.mirror = true;
		setRotation(bipedRightArm, -1.570796F, 0F, 0.0698132F);
		bipedLeftArm = new ModelRenderer(this, 40, 16);
		bipedLeftArm.addBox(-1F, -2F, -2F, 4, 12, 4);
		bipedLeftArm.setRotationPoint(5F, 2F, 0F);
		bipedLeftArm.setTextureSize(64, 64);
		bipedLeftArm.mirror = true;
		setRotation(bipedLeftArm, -1.570796F, 0F, -0.0698132F);
		bipedRightLeg = new ModelRenderer(this, 0, 16);
		bipedRightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
		bipedRightLeg.setRotationPoint(-2F, 12F, 0F);
		bipedRightLeg.setTextureSize(64, 64);
		bipedRightLeg.mirror = true;
		setRotation(bipedRightLeg, 0F, 0F, 0F);
		bipedLeftLeg = new ModelRenderer(this, 0, 16);
		bipedLeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
		bipedLeftLeg.setRotationPoint(2F, 12F, 0F);
		bipedLeftLeg.setTextureSize(64, 64);
		bipedLeftLeg.mirror = true;
		setRotation(bipedLeftLeg, 0F, 0F, 0F);
		bipedHead2 = new ModelRenderer(this, 0, 0);
		bipedHead2.addBox(0F, 0F, 0F, 8, 8, 8);
		bipedHead2.setRotationPoint(0F, -8F, -4F);
		bipedHead2.setTextureSize(64, 64);
		bipedHead2.mirror = true;
		setRotation(bipedHead2, 0F, 0F, 0F);
	}
	
	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4,
			float par5, float par6, float par7) {
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		GlStateManager.pushMatrix();
		if (this.isChild) {
			float f = 2.0F;
			GlStateManager.scale(1.5F / f, 1.5F / f, 1.5F / f);
			GlStateManager.translate(0.0F, 16.0F * par7, 0.0F);
			this.bipedHead.render(par7);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.scale(1.0F / f, 1.0F / f, 1.0F / f);
			GlStateManager.translate(0.0F, 24.0F * par7, 0.0F);
			this.bipedBody.render(par7);
			this.bipedRightArm.render(par7);
			this.bipedLeftArm.render(par7);
			this.bipedRightLeg.render(par7);
			this.bipedLeftLeg.render(par7);
			this.bipedHead2.render(par7);
		} else {
			this.bipedHead.render(par7);
			this.bipedBody.render(par7);
			this.bipedRightArm.render(par7);
			this.bipedLeftArm.render(par7);
			this.bipedRightLeg.render(par7);
			this.bipedLeftLeg.render(par7);
			this.bipedHead2.render(par7);
		}
		GlStateManager.popMatrix();
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float p_78087_1_, float p_78087_2_,
			float p_78087_3_, float p_78087_4_, float p_78087_5_,
			float p_78087_6_, Entity entityIn) {
		super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_,
				p_78087_5_, p_78087_6_, entityIn);
		float f = MathHelper.sin(this.swingProgress * (float) Math.PI);
		float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress)
				* (1.0F - this.swingProgress))
				* (float) Math.PI);
		this.bipedHead.rotateAngleY = p_78087_4_ / (180F / (float) Math.PI);
		this.bipedHead.rotateAngleX = p_78087_5_ / (180F / (float) Math.PI);
		this.bipedHead2.rotateAngleY = p_78087_4_ / (180F / (float) Math.PI);
		this.bipedHead2.rotateAngleX = p_78087_5_ / (180F / (float) Math.PI);
		this.bipedRightArm.rotateAngleZ = 0.0F;
		this.bipedLeftArm.rotateAngleZ = 0.0F;
		this.bipedRightArm.rotateAngleY = -(0.1F - f * 0.6F);
		this.bipedLeftArm.rotateAngleY = 0.1F - f * 0.6F;
		this.bipedRightArm.rotateAngleX = -((float) Math.PI / 2F);
		this.bipedLeftArm.rotateAngleX = -((float) Math.PI / 2F);
		this.bipedRightArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
		this.bipedLeftArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
		this.bipedRightArm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
		this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
		this.bipedRightArm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
		this.bipedLeftArm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
		this.bipedRightLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F)
				* 1.4F * p_78087_2_;
		this.bipedLeftLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F
				+ (float) Math.PI)
				* 1.4F * p_78087_2_;
		this.bipedRightLeg.rotateAngleY = 0.0F;
		this.bipedLeftLeg.rotateAngleY = 0.0F;
	}
}