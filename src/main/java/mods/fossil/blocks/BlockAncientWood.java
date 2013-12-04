package mods.fossil.blocks;

import mods.fossil.Fossil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockAncientWood extends Block
{
    public BlockAncientWood(int par1, Material var2Material)
    {
        super(par1, Material.wood);
        this.setCreativeTab(Fossil.tabFBlocks);
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("fossil:Ancient_Wood"); //adding in a texture, 1.5.1 style!
    }
}
