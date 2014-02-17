package mods.fossil.guiBlocks;

import mods.fossil.Fossil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;

public class ContainerSifter extends Container
{
    private TileEntitySifter sifter;
    private int cookTime = 0;
    private int burnTime = 0;
    private int itemBurnTime = 0;

    public ContainerSifter(InventoryPlayer var1, TileEntity var2)
    {
        this.sifter = (TileEntitySifter)var2;
        int var3;
        int var4;

        //Sifter input
        this.addSlotToContainer(new Slot(this.sifter, 0, 80, 20));

        //Sifter output
        for (var3 = 0; var3 < 5; ++var3)
        {
            this.addSlotToContainer(new SlotFurnace(var1.player, this.sifter, 1 + var3, 44 + 18 * var3, 54));

        }

        //player inventory
        for (var3 = 0; var3 < 3; ++var3)
        {
            for (var4 = 0; var4 < 9; ++var4)
            {
                this.addSlotToContainer(new Slot(var1, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
            }
        }

        //player hotbar
        for (var3 = 0; var3 < 9; ++var3)
        {
            this.addSlotToContainer(new Slot(var1, var3, 8 + var3 * 18, 142));
        }
    }

    public void addCraftingToCrafters(ICrafting var1)
    {
        super.addCraftingToCrafters(var1);
        var1.sendProgressBarUpdate(this, 0, this.sifter.sifterCookTime);
        var1.sendProgressBarUpdate(this, 1, this.sifter.sifterBurnTime);
        var1.sendProgressBarUpdate(this, 2, this.sifter.currentItemBurnTime);
    }

    /**
     * Updates crafting matrix; called from onCraftMatrixChanged. Args: none
     */
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int var1 = 0; var1 < this.crafters.size(); ++var1)
        {
            ICrafting var2 = (ICrafting)this.crafters.get(var1);

            if (this.cookTime != this.sifter.sifterCookTime)
            {
                var2.sendProgressBarUpdate(this, 0, this.sifter.sifterCookTime);
            }

            if (this.burnTime != this.sifter.sifterBurnTime)
            {
                var2.sendProgressBarUpdate(this, 1, this.sifter.sifterBurnTime);
            }

            if (this.itemBurnTime != this.sifter.currentItemBurnTime)
            {
                var2.sendProgressBarUpdate(this, 2, this.sifter.currentItemBurnTime);
            }
        }

        this.cookTime = this.sifter.sifterCookTime;
        this.burnTime = this.sifter.sifterBurnTime;
        this.itemBurnTime = this.sifter.currentItemBurnTime;
    }

    public void updateProgressBar(int var1, int var2)
    {
        if (var1 == 0)
        {
            this.sifter.sifterCookTime = var2;
        }

        if (var1 == 1)
        {
            this.sifter.sifterBurnTime = var2;
        }

        if (var1 == 2)
        {
            this.sifter.currentItemBurnTime = var2;
        }
    }

    public boolean canInteractWith(EntityPlayer var1)
    {
        return this.sifter.isUseableByPlayer(var1);
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     */
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 == 0 || (par2 > 0 && par2 < 6))
            {
                if (!this.mergeItemStack(itemstack1, 1, 42, true))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, 9, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }
}
