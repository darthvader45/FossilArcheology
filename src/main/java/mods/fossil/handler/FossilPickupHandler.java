package mods.fossil.handler;

import mods.fossil.Fossil;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.AchievementList;
import cpw.mods.fml.common.IPickupNotifier;

public class FossilPickupHandler implements IPickupNotifier
{
@Override
public void notifyPickup(EntityItem item, EntityPlayer player)
{

if(item.getEntityItem().itemID == Fossil.palmLog.blockID)
{
	player.triggerAchievement(AchievementList.mineWood);
}

if(item.getEntityItem().itemID == Fossil.biofossil.itemID)
{
 player.addStat(FossilAchievementHandler.FoundFossils, 1);
}




}
}