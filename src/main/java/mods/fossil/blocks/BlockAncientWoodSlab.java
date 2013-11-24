package mods.fossil.blocks;

import java.util.List;
import java.util.Random;

import mods.fossil.Fossil;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockAncientWoodSlab extends BlockHalfSlab
{
	public static final String[] woodType = { "ancientWood" };
	
	public BlockAncientWoodSlab(int par1, boolean par2)
	{
		super(par1, par2, Material.wood);
		setLightOpacity(0);
		useNeighborBrightness[this.blockID] = true;
	}
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
	     this.blockIcon = par1IconRegister.registerIcon("fossil:Ancient_Wood");
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return Fossil.ancientWoodSingleSlab.blockID;
	}

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
	{
		if(par1World.getBlockId(par2, par3 - 1, par4) == Fossil.ancientWoodSingleSlab.blockID)
		{
			par1World.setBlock(par2, par3, par4, 0);
			par1World.setBlock(par2, par3 - 1, par4, Fossil.ancientWoodDoubleSlab.blockID);
		}
		if(par1World.getBlockId(par2, par3 + 1, par4) == Fossil.ancientWoodSingleSlab.blockID)
		{
			par1World.setBlock(par2, par3, par4, 0);
			par1World.setBlock(par2, par3 + 1, par4, Fossil.ancientWoodDoubleSlab.blockID);
		}
	}

	protected ItemStack createStackedBlock(int par1)
	{
		return new ItemStack(Fossil.ancientWoodSingleSlab.blockID, 2, par1 & 7);
	}

	public String getFullSlabName(int par1)
	  {
	    if ((par1 < 0) || (par1 >= woodType.length))
	    {
	      par1 = 0;
	    }

	    return super.getUnlocalizedName() + "." + woodType[par1];
	  }

	  public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
	  {
	    if (par1 != Fossil.ancientWoodDoubleSlab.blockID)
	    {
	      par3List.add(new ItemStack(par1, 1, 0));
	    }
	  }

}
