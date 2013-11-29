package mods.fossil.client.renderer.item;

import mods.fossil.client.model.ModelFigurine;
import mods.fossil.guiBlocks.TileEntityFigurine;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class ItemFigurineRenderer implements IItemRenderer
{
    private ModelFigurine modelfigurine;

    public ItemFigurineRenderer()
    {
        modelfigurine = new ModelFigurine();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        TileEntityRenderer.instance.renderTileEntityAt(new TileEntityFigurine(), 0.0D, 1.0D, 0.0D, 0.0F);
    }
}