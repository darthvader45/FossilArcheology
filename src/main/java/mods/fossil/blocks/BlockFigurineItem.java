package mods.fossil.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockFigurineItem extends ItemBlock 
{

	public BlockFigurineItem(int id)
	{
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
	return BlockFigurine.figurineTypes[itemstack.getItemDamage()];
	}
	
	@Override
	public int getMetadata(int damage) {
	return damage;
	}
	
}
