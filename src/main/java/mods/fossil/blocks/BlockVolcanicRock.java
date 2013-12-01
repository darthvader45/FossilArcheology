package mods.fossil.blocks;

import java.util.Random;

import mods.fossil.Fossil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class BlockVolcanicRock extends Block
{
    public BlockVolcanicRock(int i)
    {
        super(i, Material.rock);
    }

    public int idDropped(int i, Random random, int j)
    {
        return Fossil.volcanicRock.blockID;
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon("fossil:Volcanic_Rock");
    }
    
    public void updateTick(World var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8)
    {
    	  if (var1.getBlockId(var2 + var6, var3 + var7, var4 + var8) == Block.stone.blockID)
          {
              var1.setBlock(var2 + var6, var3 + var7, var4 + var8, Fossil.volcanicAsh.blockID);
          }
    }
    
}