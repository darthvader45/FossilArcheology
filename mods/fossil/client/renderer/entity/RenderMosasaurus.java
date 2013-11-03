package mods.fossil.client.renderer.entity;

import com.google.common.collect.Maps;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Map;

import mods.fossil.entity.mob.EntityMosasaurus;
import mods.fossil.entity.mob.EntityPterosaur;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderMosasaurus extends RenderLiving
{
    private static final ResourceLocation loc = new ResourceLocation("fossil:textures/mob/Mosasaurus.png");

    public RenderMosasaurus(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    /**
     * Applies the scale to the transform matrix
     * 
     * Use this to grow the dinonsaur with age.
     */
    protected void preRenderScale(EntityMosasaurus entitydinosaur, float par2)
    {
       // GL11.glScalef(entitydinosaur.getDinoWidth(), entitydinosaur.getDinoHeight(), entitydinosaur.getDinoLength());
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderScale((EntityMosasaurus)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation func_110919_a(EntityMosasaurus par1Entity)
    {
       // return new ResourceLocation(par1Entity.getTexture());
    	return loc;
    }
  
    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110919_a((EntityMosasaurus)par1Entity);
    }
    

}
