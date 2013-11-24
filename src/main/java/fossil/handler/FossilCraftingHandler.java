package mods.fossil.handler;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

import java.util.List;

import mods.fossil.Fossil;
import mods.fossil.fossilEnums.EnumDinoType;
import mods.fossil.items.ItemAncientEgg;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class FossilCraftingHandler implements ICraftingHandler {

	HashSet<Integer> eggsFound = new HashSet<Integer>();
	Integer[] subeggsTotal = new Integer[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13};
	HashSet<Integer> eggsTotal = new HashSet<Integer>(Arrays.asList(subeggsTotal));
	
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		

		
		for(int i=0;i<EnumDinoType.values().length;i++)
		{
			if (item.itemID == EnumDinoType.values()[i].EggItem.itemID)
			{
				player.addStat(FossilAchievementHandler.FirstEgg, 1);
					if (!eggsFound.contains(i))
						this.eggsFound.add(i);
			}
		}
		
		Fossil.Console("eggsTotal: "+ this.eggsTotal);
		Fossil.Console("eggsFound: "+ this.eggsFound);
		Fossil.Console("" + eggsFound.containsAll(eggsTotal));
		
		if (eggsFound.containsAll(eggsTotal))
		{
			player.addStat(FossilAchievementHandler.AllEggs, 1);
		}
	}

	

}
