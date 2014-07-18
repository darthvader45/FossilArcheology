package mods.fossil.blocks;

import mods.fossil.Fossil;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class BlockVaseKylixItem extends ItemBlockWithMetadata
{
    private Block itemBlock;

	public BlockVaseKylixItem(int id, Block block)
    {
        super(id, block);
        
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        return getUnlocalizedName() + "." + BlockVaseKylix.shortname[itemstack.getItemDamage()];

    }
}
