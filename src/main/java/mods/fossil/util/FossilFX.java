package mods.fossil.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.world.World;

public class FossilFX
{
    private static Minecraft mc = Minecraft.getMinecraft();
    private static World theWorld = mc.theWorld;
    private static TextureManager renderEngine = mc.renderEngine;

    public static EntityFX spawnParticle(String particleName, double x, double y, double z, double par8, double par10, double par12)
    {
        if (mc != null && mc.renderViewEntity != null && mc.effectRenderer != null)
        {
            int var14 = mc.gameSettings.particleSetting;

            if (var14 == 1 && theWorld.rand.nextInt(3) == 0)
            {
                var14 = 2;
            }

            double var15 = mc.renderViewEntity.posX - x;
            double var17 = mc.renderViewEntity.posY - y;
            double var19 = mc.renderViewEntity.posZ - z;
            EntityFX var21 = null;
            double var22 = 16.0D;

            if (var15 * var15 + var17 * var17 + var19 * var19 > var22 * var22)
            {
                return null;
            }
            else if (var14 > 1)
            {
                return null;
            }
            else if (particleName.equals("flies"))//if the name of the particle to be spawned equals test spawn our particle note the name here is the name that you use when you call spawn particle
            {
                var21 = new FliesFX(theWorld, x, y, z, (float)par8, (float)par10, (float)par12);
            }
            else if (particleName.equals("tarBubble"))//if the name of the particle to be spawned equals test spawn our particle note the name here is the name that you use when you call spawn particle
            {
                var21 = new TarBubblesFX(theWorld, x, y, z);
            }

            mc.effectRenderer.addEffect((EntityFX)var21);
            return (EntityFX)var21;
        }

        return null;
    }
}