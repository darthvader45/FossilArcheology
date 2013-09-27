package mods.fossil.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemFigurine extends ItemBlock
{
	private final static String[] subNames = {
		"Steve", "orange",  "magenta", "lightfghdBlue", "yellow", "lightGreen",
		"pink", "darkGrey", "lightGrey", "cyadssssn", "purffple", "blue", "brown",
		"green", "red", "black"
	};
	
    public ItemFigurine(int par1)
    {
        super(par1);
        setHasSubtypes(true);
        setTextureName("Figurine");
    }

 
    /**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int damagevalue)
    {
        return damagevalue;
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return getUnlocalizedName() + "." + subNames[itemstack.getItemDamage()];
	}
}
