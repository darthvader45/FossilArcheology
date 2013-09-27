package mods.fossil.guiBlocks;

import java.util.List;
import java.util.Random;

import mods.fossil.Fossil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityFigurine extends BlockContainer {

    public TileEntityFigurine(int par1, Material material) 
    {
        super(par1, material);
        this.setBlockBoundsForItemRender();
    }
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        icons = new Icon[16];

        for (int i = 0; i < icons.length; i++) {
            icons[i] = register.registerIcon(Fossil.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int par1, int par2) {
        return icons[par2];
    }
    

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int j = 0; j < 16; ++j)
        {
            par3List.add(new ItemStack(par1, 1, j));
        }
    }
    
	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}
    
    
    /**
     * Sets the block's bounds for rendering it as an item
     */
    public void setBlockBoundsForItemRender()
    {
        float f = 0.5F;
        this.setBlockBounds(0.3F, 0.0F, 0.3F, 0.7F, f, 0.7F);
    }
    
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3) {
        return Fossil.blockfigurine.blockID;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World par1World, int par2, int par3, int par4) {
        super.onBlockAdded(par1World, par2, par3, par4);
        this.setDefaultDirection(par1World, par2, par3, par4);
    }

    /**
     * set a blocks direction
     */
    private void setDefaultDirection(World par1World, int par2, int par3, int par4) {
        if (!par1World.isRemote) {
            int l = par1World.getBlockId(par2, par3, par4 - 1);
            int i1 = par1World.getBlockId(par2, par3, par4 + 1);
            int j1 = par1World.getBlockId(par2 - 1, par3, par4);
            int k1 = par1World.getBlockId(par2 + 1, par3, par4);
            byte b0 = 3;

            if (Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[i1]) {
                b0 = 3;
            }

            if (Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[l]) {
                b0 = 2;
            }

            if (Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[k1]) {
                b0 = 5;
            }

            if (Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[j1]) {
                b0 = 4;
            }

            par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
        }
    }

    
    
    /**
     * Returns a new instance of a block's tile entity class. Called on placing
     * the block.
     */
    public TileEntity createNewTileEntity(World par1World) {
        return new TileEntityFigurineEntity();
    }

    /**
     * If this returns true, then comparators facing away from this block will
     * use the value from getComparatorInputOverride instead of the actual
     * redstone signal strength.
     */
    public boolean hasComparatorInputOverride() {
        return true;
    }

    /**
     * If hasComparatorInputOverride returns true, the return value from this is
     * used instead of the redstone signal strength when this block inputs to a
     * comparator.
     */
    public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5) {
        return Container.calcRedstoneFromInventory((IInventory) par1World.getBlockTileEntity(par2, par3, par4));
    }

    @SideOnly(Side.CLIENT)
    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4) {
        return Fossil.blockfigurine.blockID;
    }

    // rotates block when you place it
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack itemstack) {
        int dir = MathHelper.floor_double((double) ((player.rotationYaw * 4F) / 360F) + 0.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, dir, 0);
    }

    // gets render type ( make sure -1 otherwise will not work)
    @Override
    public int getRenderType() {
        return -1;
    }

    // is the block an opaque cube (make sure false)
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    // renders as normal block (make sure it is false, otherwise will not work)
    public boolean renderAsNormalBlock() {
        return false;
    }

}