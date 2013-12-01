package mods.fossil.blocks;

import java.util.Random;

import mods.fossil.Fossil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockVolcanicBrick extends Block
{
    public BlockVolcanicBrick(int i)
    {
        super(i, Material.rock);
    }

    public int idDropped(int i, Random random, int j)
    {
        return Fossil.volcanicBrick.blockID;
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("fossil:Volcanic_Brick");
    }
}