package mods.fossil.handler;

import cpw.mods.fml.common.ICraftingHandler;
import mods.fossil.Fossil;
import mods.fossil.fossilEnums.EnumDinoType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.HashSet;

public class FossilCraftingHandler implements ICraftingHandler
{
    HashSet<Integer> eggsFound = new HashSet<Integer>();
    Integer[] subeggsTotal = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    HashSet<Integer> eggsTotal = new HashSet<Integer>(Arrays.asList(subeggsTotal));

    @Override
    public void onCrafting(EntityPlayer player, ItemStack item,
                           IInventory craftMatrix)
    {
        if (item.itemID == Fossil.blockworktableIdleID)
        {
                player.addStat(FossilAchievementHandler.ArchWorkbench, 1);
        }
        
        if (item.itemID == Fossil.blockanalyzerIdleID)
        {
                player.addStat(FossilAchievementHandler.Analyzer, 1);
        }
        
        if (item.itemID == Fossil.blockcultivateIdleID)
        {
                player.addStat(FossilAchievementHandler.CultVat, 1);
        }
        
        if (item.itemID == Fossil.blockSifterIdleID)
        {
                player.addStat(FossilAchievementHandler.Sifter, 1);
        }
        
        if (item.itemID == Fossil.dinoPediaID)
        {
                player.addStat(FossilAchievementHandler.Dinopedia, 1);
        }
    }

    @Override
    public void onSmelting(EntityPlayer player, ItemStack item)
    {
        for (int i = 0; i < EnumDinoType.values().length; i++)
        {
            if (item.itemID == EnumDinoType.values()[i].EggItem.itemID)
            {
                player.addStat(FossilAchievementHandler.FirstEgg, 1);

                if (!eggsFound.contains(i))
                {
                    this.eggsFound.add(i);
                }
            }
        }

        if (Fossil.DebugMode()){
        Fossil.Console("eggsTotal: " + this.eggsTotal);
        Fossil.Console("eggsFound: " + this.eggsFound);
        Fossil.Console("" + eggsFound.containsAll(eggsTotal));
        }

        if (eggsFound.containsAll(eggsTotal))
        {
            player.addStat(FossilAchievementHandler.AllEggs, 1);
        }
    }
}
