package mods.fossil.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class BlockFigurineItem extends ItemBlockWithMetadata
{
    public BlockFigurineItem(int id, Block block)
    {
        super(id, block);
        
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        return getUnlocalizedName() + "." + BlockFigurine.shortname[itemstack.getItemDamage()];
    }
}
