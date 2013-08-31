package mods.fossil.entity.mob;

import com.google.common.collect.Maps;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderAnkylosaurus extends RenderLiving
{
    private static final Map field_110852_a = Maps.newHashMap();
    private static final ResourceLocation texture_location = new ResourceLocation("fossil:textures/mob/Ankylosaurus.png");

    public RenderAnkylosaurus(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected void func_110847_a(EntityAnkylosaurus par1EntityAnkylosaurus, float par2)
    {
        float f1 = 1.0F;
        GL11.glScalef(f1, f1, f1);
        super.preRenderCallback(par1EntityAnkylosaurus, par2);
    }

    protected void func_110846_a(EntityAnkylosaurus par1EntityAnkylosaurus, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        if (par1EntityAnkylosaurus.isInvisible())
        {
            this.mainModel.setRotationAngles(par2, par3, par4, par5, par6, par7, par1EntityAnkylosaurus);
        }
        else
        {
            this.func_110777_b(par1EntityAnkylosaurus);
            this.mainModel.render(par1EntityAnkylosaurus, par2, par3, par4, par5, par6, par7);
        }
    }

    protected ResourceLocation func_110849_a(EntityAnkylosaurus par1EntityAnkylosaurus)
    {
                    return texture_location;
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.func_110847_a((EntityAnkylosaurus)par1EntityLivingBase, par2);
    }

    /**
     * Renders the model in RenderLiving
     */
    protected void renderModel(EntityLivingBase par1EntityLivingBase, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.func_110846_a((EntityAnkylosaurus)par1EntityLivingBase, par2, par3, par4, par5, par6, par7);
    }

    protected ResourceLocation func_110775_a(Entity par1Entity)
    {
        return this.func_110849_a((EntityAnkylosaurus)par1Entity);
    }
}
