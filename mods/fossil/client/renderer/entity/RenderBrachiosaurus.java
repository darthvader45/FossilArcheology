package mods.fossil.client.renderer.entity;

import mods.fossil.client.model.ModelBrachiosaurus;
import mods.fossil.entity.mob.EntityBrachiosaurus;
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
    private static final ResourceLocation loc = new ResourceLocation("fossil:textures/mob/Brachiosaurus.png");
    
    public RenderBrachiosaurus(float var1)
    {

        super(new ModelBrachiosaurus(), var1);
        

    }
    
    protected ResourceLocation func_110919_a(EntityBrachiosaurus par1Entity)
    {
        return loc;
    }
    
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110919_a((EntityBrachiosaurus)par1Entity);
    }
}
