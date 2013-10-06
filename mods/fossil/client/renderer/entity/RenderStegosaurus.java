package mods.fossil.client.renderer.entity;

import mods.fossil.entity.mob.EntityStegosaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class RenderStegosaurus extends RenderLiving
{
    private static final ResourceLocation loc = new ResourceLocation("fossil:textures/mob/Stegosaurus_Adult.png");
    
    public RenderStegosaurus(ModelBase var1, float var2)
    {
        super(var1, var2);
        this.setRenderPassModel(var1);
    }
    
    public RenderStegosaurus(ModelBase var1, ModelBase var2, float var3)
    {
        super(var1, var3);
        this.setRenderPassModel(var2);
    }
    
    /**
     * Applies the scale to the transform matrix
     * 
     * Use this to grow the dinonsaur with age.
     */
    protected void preRenderScale(EntityStegosaurus entitystegosaurus, float par2)
    {
        GL11.glScalef(entitystegosaurus.getDinoWidth(), entitystegosaurus.getDinoHeight(), entitystegosaurus.getDinoLength());
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderScale((EntityStegosaurus)par1EntityLivingBase, par2);
    }
    
    protected ResourceLocation func_110919_a(EntityStegosaurus par1Entity)
    {
        return new ResourceLocation(par1Entity.getTexture());
    }
    
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110919_a((EntityStegosaurus)par1Entity);
    }
}

