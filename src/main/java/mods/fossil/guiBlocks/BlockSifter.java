package mods.fossil.guiBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.client.LocalizationStrings;
import mods.fossil.entity.mob.EntityFailuresaurus;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockSifter extends BlockContainer
{
    //private final String VAT = "Vat.";
    //private final String ERR_OUTBREAK = "Err.OutBreak";
    private Random furnaceRand = new Random();
    private final boolean isActive;
    private static boolean keepFurnaceInventory = false;
    @SideOnly(Side.CLIENT)
    private Icon Top;
    @SideOnly(Side.CLIENT)
    private Icon Bottom;

    public BlockSifter(int var1, boolean var2)
    {
        super(var1, Material.wood);
        this.isActive = var2;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int var1, Random var2, int var3)
    {
        return Fossil.blockSifterIdle.blockID;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        super.onBlockAdded(var1, var2, var3, var4);
        this.setDefaultDirection(var1, var2, var3, var4);
    }
    
    private void setDefaultDirection(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {
            int l = par1World.getBlockId(par2, par3, par4 - 1);
            int i1 = par1World.getBlockId(par2, par3, par4 + 1);
            int j1 = par1World.getBlockId(par2 - 1, par3, par4);
            int k1 = par1World.getBlockId(par2 + 1, par3, par4);
            byte b0 = 3;

            if (Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[i1])
            {
                b0 = 3;
            }

            if (Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[l])
            {
                b0 = 2;
            }

            if (Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[k1])
            {
                b0 = 5;
            }

            if (Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[j1])
            {
                b0 = 4;
            }

            par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
        }
    }
    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("fossil:SifterSides");
        this.Bottom = par1IconRegister.registerIcon("fossil:SifterBottom");
        this.Top = this.isActive ? par1IconRegister.registerIcon("fossil:SifterTopActive") : par1IconRegister.registerIcon("fossil:SifterTop");
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
    	return par1 == 1 ? this.Top : (par1 != 0 ? this.blockIcon : this.Bottom);   
    }
    

    @SideOnly(Side.CLIENT)
    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5) {}

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    /*public int getBlockTextureFromSide(int var1)
    {
        return var1 == 1 ? 36 : (var1 == 0 ? 36 : (var1 == 3 ? 20 : 20));
    }*/

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
    {
        if (var1.isRemote)
        {
            return true;
        }
        else
        {
            var5.openGui(Fossil.instance, 7, var1, var2, var3, var4);
            return true;
        }
    }

    public static void updateFurnaceBlockState(boolean var0, World var1, int var2, int var3, int var4)
    {
        int var5 = var1.getBlockMetadata(var2, var3, var4);
        TileEntity var6 = var1.getBlockTileEntity(var2, var3, var4);
        keepFurnaceInventory = true;


        if (var0)
        {
            var1.setBlock(var2, var3, var4, Fossil.blockSifterActive.blockID);
            
        }
        else
        {
            var1.setBlock(var2, var3, var4, Fossil.blockSifterIdle.blockID);
        }

        keepFurnaceInventory = false;
        var1.setBlockMetadataWithNotify(var2, var3, var4, var5, 2);
        var6.validate();
        var1.setBlockTileEntity(var2, var3, var4, var6);
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntitySifter();
    }

    /**
     * Called when the block is placed in the world.
     */
    /*public void onBlockPlacedBy(World var1, int var2, int var3, int var4, EntityLiving var5)
    {This Block doesnt care for directions!
    	super.onBlockPlacedBy(par1World, par2, par3, par4, par5EntityLiving, par6ItemStack)
        int var6 = MathHelper.floor_double((double)(var5.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (var6 == 0)var1.setBlockMetadataWithNotify(var2, var3, var4, 2,2);

        if (var6 == 1)var1.setBlockMetadataWithNotify(var2, var3, var4, 5,2);

        if (var6 == 2)var1.setBlockMetadataWithNotify(var2, var3, var4, 3,2);

        if (var6 == 3)var1.setBlockMetadataWithNotify(var2, var3, var4, 4,2);
    }*/

    private void ReturnIron(World var1, int var2, int var3, int var4)
    {
        ItemStack var5 = new ItemStack(Item.ingotIron, 3);
        float var6 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
        float var7 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
        float var8 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;

        while (var5.stackSize > 0)
        {
            int var9 = this.furnaceRand.nextInt(21) + 10;

            if (var9 > var5.stackSize)
            {
                var9 = var5.stackSize;
            }

            var5.stackSize -= var9;
            EntityItem var10 = new EntityItem(var1, (double)((float)var2 + var6), (double)((float)var3 + var7), (double)((float)var4 + var8), new ItemStack(var5.itemID, var9, var5.getItemDamage()));
            float var11 = 0.05F;
            var10.motionX = (double)((float)this.furnaceRand.nextGaussian() * var11);
            var10.motionY = (double)((float)this.furnaceRand.nextGaussian() * var11 + 0.2F);
            var10.motionZ = (double)((float)this.furnaceRand.nextGaussian() * var11);
            var1.spawnEntityInWorld(var10);
        }
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World var1, int var2, int var3, int var4, int var5, int var6)
    {
        if (!keepFurnaceInventory)
        {
            TileEntitySifter var7 = (TileEntitySifter)var1.getBlockTileEntity(var2, var3, var4);

            if (var7 instanceof TileEntitySifter)
            {
                for (int var8 = 0; var8 < var7.getSizeInventory(); ++var8)
                {
                    ItemStack var9 = var7.getStackInSlot(var8);

                    if (var9 != null)
                    {
                        float var10 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
                        float var11 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;
                        float var12 = this.furnaceRand.nextFloat() * 0.8F + 0.1F;

                        while (var9.stackSize > 0)
                        {
                            int var13 = this.furnaceRand.nextInt(21) + 10;

                            if (var13 > var9.stackSize)
                            {
                                var13 = var9.stackSize;
                            }

                            var9.stackSize -= var13;
                            EntityItem var14 = new EntityItem(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new ItemStack(var9.itemID, var13, var9.getItemDamage()));
                            float var15 = 0.05F;
                            var14.motionX = (double)((float)this.furnaceRand.nextGaussian() * var15);
                            var14.motionY = (double)((float)this.furnaceRand.nextGaussian() * var15 + 0.2F);
                            var14.motionZ = (double)((float)this.furnaceRand.nextGaussian() * var15);
                            var1.spawnEntityInWorld(var14);
                        }
                    }
                }
            }
        }

        super.breakBlock(var1, var2, var3, var4, var5, var6);
    }

    /**
     * If this returns true, then comparators facing away from this block will use the value from
     * getComparatorInputOverride instead of the actual redstone signal strength.
     */
    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    /**
     * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
     * strength when this block inputs to a comparator.
     */
    public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5)
    {
        return Container.calcRedstoneFromInventory((IInventory)par1World.getBlockTileEntity(par2, par3, par4));
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return Fossil.blockSifterIdle.blockID;
    }
}
