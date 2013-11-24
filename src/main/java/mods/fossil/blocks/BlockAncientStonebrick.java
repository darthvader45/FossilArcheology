package mods.fossil.blocks;

import java.util.Random;

import mods.fossil.Fossil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockAncientStonebrick extends Block
{
    public BlockAncientStonebrick(int var1)
    {
        super(var1, Material.rock);
        this.setCreativeTab(Fossil.tabFBlocks);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return Fossil.ancientStonebrick.blockID;
    }

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("fossil:Ancient_Stonebricks");
    }
}

