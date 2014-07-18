package mods.fossil.blocks;

import mods.fossil.Fossil;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class BlockVaseAmphoraItem extends ItemBlockWithMetadata
{
    private Block itemBlock;

	public BlockVaseAmphoraItem(int id, Block block)
    {
        super(id, block);
        
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        return getUnlocalizedName() + "." + BlockVaseAmphora.shortname[itemstack.getItemDamage()];

    }
}
