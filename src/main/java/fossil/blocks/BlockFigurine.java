package mods.fossil.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mods.fossil.Fossil;
import mods.fossil.guiBlocks.TileEntityFigurine;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFigurine extends BlockContainer
{
    public static final String[] figurineTypes =
    {
        "Pristine Steve Figurine",
        "Pristine Skeleton Figurine",
        "Pristine Zombie Figurine",
        "Pristine Enderman Figurine",
        "Pristine Zombie Pigman Figurine",
        "Damaged Steve Figurine",
        "Damaged Skeleton Figurine",
        "Damaged Zombie Figurine",
        "Damaged Enderman Figurine",
        "Damaged Zombie Pigman Figurine",
        "Broken Steve Figurine",
        "Broken Skeleton Figurine",
        "Broken Zombie Figurine",
        "Broken Enderman Figurine",
        "Broken Zombie Pigman Figurine",
        "Mysterious Figurine"
    };
    public static final String[] shortname =
    {
        "figurine_0",
        "figurine_1",
        "figurine_2",
        "figurine_3",
        "figurine_4",
        "figurine_5",
        "figurine_6",
        "figurine_7",
        "figurine_8",
        "figurine_9",
        "figurine_10",
        "figurine_11",
        "figurine_12",
        "figurine_13",
        "figurine_14",
        "figurine_15",
        "figurine_16",
    };

    private Icon[] icons;

    public BlockFigurine(int par1)
    {
        super(par1, Material.wood);
        this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
        this.setCreativeTab(Fossil.tabFTest);
    }

    @SideOnly(Side.CLIENT)
    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubBlocks(int par1, CreativeTabs creativetabs, List list)
    {
        for (int j = 0; j < figurineTypes.length; ++j)
        {
            list.add(new ItemStack(par1, 1, j));
        }
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return -1;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        this.setBlockBounds(0.3F, 0.0F, 0.3F, 0.7F, 0.5F, 0.7F);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
        return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4);
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
        TileEntity tileentity = par1World.getBlockTileEntity(par2, par3, par4);
        ((TileEntityFigurine)tileentity).setFigurineType(par6ItemStack.getItemDamage());
        ((TileEntityFigurine)tileentity).setFigurineRotation(1);
    }

    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int par1)
    {
        return par1;
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntityFigurine();
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return Fossil.figurineBlock.blockID;
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World par1World, int par2, int par3, int par4)
    {
        TileEntity tileentity = par1World.getBlockTileEntity(par2, par3, par4);
        return tileentity != null && tileentity instanceof TileEntityFigurine ? ((TileEntityFigurine)tileentity).getFigurineType() : super.getDamageValue(par1World, par2, par3, par4);
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1;
    }

    /**
     * Called on server worlds only when the block has been replaced by a different block ID, or the same block with a
     * different metadata value, but before the new metadata value is set. Args: World, x, y, z, old block ID, old
     * metadata
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }

    @Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

        if ((metadata & 8) == 0)
        {
            ItemStack itemstack = new ItemStack(Fossil.figurineItem.itemID, 1, this.getDamageValue(world, x, y, z));
            TileEntityFigurine tileentityfigurine = (TileEntityFigurine)world.getBlockTileEntity(x, y, z);

            if (tileentityfigurine == null)
            {
                return drops;
            }

            drops.add(itemstack);
        }

        return drops;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Fossil.figurineItem.itemID;
    }

    private boolean func_82528_d(World par1World, int par2, int par3, int par4, int par5)
    {
        if (par1World.getBlockId(par2, par3, par4) != this.blockID)
        {
            return false;
        }
        else
        {
            TileEntity tileentity = par1World.getBlockTileEntity(par2, par3, par4);
            return tileentity != null && tileentity instanceof TileEntityFigurine ? ((TileEntityFigurine)tileentity).getFigurineType() == par5 : false;
        }
    }

    @SideOnly(Side.CLIENT)
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int side, int meta)
    {
        return icons[meta];
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconregister)
    {
        this.icons = new Icon[shortname.length];

        for (int i = 0; i < shortname.length; ++i)
        {
            this.icons[i] = iconregister.registerIcon(Fossil.modid + ":figurines/" + shortname[i]);
        }
    }
}
