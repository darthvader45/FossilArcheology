package mods.fossil.client.renderer.entity;

import mods.fossil.client.model.ModelBrachiosaurus;
import mods.fossil.entity.mob.EntityBrachiosaurus;
import mods.fossil.entity.mob.EntityPterosaur;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBrachiosaurus extends RenderLiving
{
//    private static final ResourceLocation loc = new ResourceLocation("fossil:textures/mob/Brachiosaurus.png");
    
    public RenderBrachiosaurus(float var1)
    {

        super(new ModelBrachiosaurus(), var1);
        

    }
    
    /**
     * Applies the scale to the transform matrix
     * 
     * Use this to grow the dinonsaur with age.
     */
    protected void preRenderScale(EntityPterosaur entitydinosaur, float par2)
    {
        GL11.glScalef(entitydinosaur.getDinoWidth(), entitydinosaur.getDinoHeight(), entitydinosaur.getDinoLength());
    }
    
    protected ResourceLocation func_110919_a(EntityBrachiosaurus par1Entity)
    {
        return new ResourceLocation(par1Entity.getTexture());
    }
    
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110919_a((EntityBrachiosaurus)par1Entity);
    }
}
