
package mods.fossil.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDodo extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Neck;
    ModelRenderer Tail_Poof;
    ModelRenderer Beak;
    ModelRenderer Bottom;
    ModelRenderer LeftLeg;
    ModelRenderer RightLeg;
    ModelRenderer WingLeft;
    ModelRenderer WingRight;
    ModelRenderer Head;
  
  public ModelDodo()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 7, 7, 9);
      Body.setRotationPoint(-3F, 11F, -6F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 0, 16);
      Neck.addBox(0F, 0F, 0F, 4, 8, 3);
      Neck.setRotationPoint(-1.5F, 6F, -7F);
      Neck.setTextureSize(64, 32);
      Neck.mirror = true;
      setRotation(Neck, -0.2230717F, 0F, 0F);
      Tail_Poof = new ModelRenderer(this, 14, 16);
      Tail_Poof.addBox(0F, 0F, 0F, 4, 4, 4);
      Tail_Poof.setRotationPoint(-1.5F, 10F, 1F);
      Tail_Poof.setTextureSize(64, 32);
      Tail_Poof.mirror = true;
      setRotation(Tail_Poof, -0.1858931F, 0F, 0F);
      Beak = new ModelRenderer(this, 23, 1);
      Beak.addBox(0F, 0F, 0F, 3, 3, 5);
      Beak.setRotationPoint(-1F, 6F, -14F);
      Beak.setTextureSize(64, 32);
      Beak.mirror = true;
      setRotation(Beak, 0F, 0F, 0F);
      Bottom = new ModelRenderer(this, 0, 27);
      Bottom.addBox(0F, 0F, 0F, 7, 1, 4);
      Bottom.setRotationPoint(-3F, 18F, -3F);
      Bottom.setTextureSize(64, 32);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 22, 24);
      LeftLeg.addBox(0F, 0F, 0F, 3, 3, 3);
      LeftLeg.setRotationPoint(1F, 19F, -3F);
      LeftLeg.setTextureSize(64, 32);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      RightLeg = new ModelRenderer(this, 22, 24);
      RightLeg.addBox(0F, 0F, 0F, 3, 3, 3);
      RightLeg.setRotationPoint(-3F, 19F, -3F);
      RightLeg.setTextureSize(64, 32);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      WingLeft = new ModelRenderer(this, 34, 25);
      WingLeft.addBox(0F, 0F, 0F, 1, 3, 4);
      WingLeft.setRotationPoint(4F, 13F, -5F);
      WingLeft.setTextureSize(64, 32);
      WingLeft.mirror = true;
      setRotation(WingLeft, 0F, 0F, 0F);
      WingRight = new ModelRenderer(this, 34, 25);
      WingRight.addBox(0F, 0F, 0F, 1, 3, 4);
      WingRight.setRotationPoint(-4F, 13F, -5F);
      WingRight.setTextureSize(64, 32);
      WingRight.mirror = true;
      setRotation(WingRight, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 35, 5);
      Head.addBox(0F, 0F, 0F, 5, 4, 4);
      Head.setRotationPoint(-2F, 5F, -9F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
  }
  
  public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
  {
      super.render(var1, var2, var3, var4, var5, var6, var7);
      this.setRotationAngles(var2, var3, var4, var5, var6, var7);
      
      if (this.isChild)
      {
          float f6 = 2.0F;
          GL11.glPushMatrix();
          GL11.glTranslatef(0.0F, 8.0F * var7, 4.0F * var7);
          this.Head.render(var7);
          GL11.glPopMatrix();
          GL11.glPushMatrix();
          GL11.glScalef(1.0F / 1.5F, 1.0F / 1.5F, 1.0F / 1.5F);
          GL11.glTranslatef(0.0F, 16.0F * var7, 0.2F);
          this.Beak.render(var7);
          GL11.glPopMatrix();
          GL11.glPushMatrix();
          GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
          GL11.glTranslatef(0.0F, 24.0F * var7, 0.0F);
          this.Neck.render(var7);
          this.Body.render(var7);
          this.Tail_Poof.render(var7);
          this.RightLeg.render(var7);
          this.LeftLeg.render(var7);
          this.WingRight.render(var7);
          this.WingLeft.render(var7);
          this.Bottom.render(var7);
          GL11.glPopMatrix();
      }
      else
      {
          this.Body.render(var7);
          this.Neck.render(var7);
          this.Tail_Poof.render(var7);
          this.Beak.render(var7);
          this.Bottom.render(var7);
          this.LeftLeg.render(var7);
          this.RightLeg.render(var7);
          this.WingLeft.render(var7);
          this.WingRight.render(var7);
          this.Head.render(var7);
      }
  }
  
  private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
  {
      var1.rotateAngleX = var2;
      var1.rotateAngleY = var3;
      var1.rotateAngleZ = var4;
  }
  
  public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
  {
      this.RightLeg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
      this.LeftLeg.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.WingRight.rotateAngleZ = var3;
      this.WingLeft.rotateAngleZ = -var3;
  }

}
