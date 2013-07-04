package mods.fossil.blocks;

import java.util.Random;

import mods.fossil.Fossil;
import mods.fossil.client.LocalizationStrings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockVolcanicAsh extends Block
{
    public BlockVolcanicAsh(int i)
    {
        super(i, Material.cloth);
        this.blockParticleGravity = -0.15F;
        this.setHardness(0.2F);
        this.setStepSound(Block.soundGrassFootstep);
        this.setUnlocalizedName(LocalizationStrings.VOLCANICASH_NAME);
        this.setCreativeTab(Fossil.tabFBlocks);
    }

    public int idDropped(int i, Random random, int j)
    {
        return Fossil.volcanicAsh.blockID;
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon("fossil:Volcanic_Ash");
    }
    
}