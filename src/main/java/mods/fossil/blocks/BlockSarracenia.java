package mods.fossil.blocks;

import java.util.Random;

import cpw.mods.fml.common.FMLCommonHandler;
import mods.fossil.Fossil;
import mods.fossil.util.FossilFX;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockSarracenia extends BlockFlower
{

    public BlockSarracenia(int var1)
    {
        super(var1, Material.grass);
        this.setTickRandomly(true);
    }

    public void randomDisplayTick(World world, int i, int j, int k, Random random)
	{
		FossilFX.spawnParticle("flies", i+0.5, j+1.0, k+0.5, 0.0D, 1.5D, 0.0D);
		FossilFX.spawnParticle("flies", i+0.5, j+0.5, k, 0.0D, 1.5D, 0.0D);
		FossilFX.spawnParticle("flies", i, j+0.5, k+0.5, 0.0D, 1.5D, 0.0D);
	}

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return 0;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 1;
    }
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon("fossil:Sarracenia");
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c)
    {

	ItemStack itemstack = player.inventory.getCurrentItem();
	
	if (FMLCommonHandler.instance().getSide().isClient() && itemstack.itemID == Fossil.archNotebook.itemID)
    {
	    player.openGui(Fossil.instance, 6, world, x, y, z);
        return true;
    }

    return true;
    }

}