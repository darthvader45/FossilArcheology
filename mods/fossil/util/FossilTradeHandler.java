package mods.fossil.util;

import java.util.Random;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import mods.fossil.Fossil;

public class FossilTradeHandler implements IVillageTradeHandler 
{

	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) 
	{
		recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 3), new ItemStack(Fossil.relic, 1, 0)));
	    recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 12), new ItemStack(Fossil.stonejavelin, 2, 0)));
	    recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 10), new ItemStack(Fossil.chickenEss, 24, 0)));
	}
	
}