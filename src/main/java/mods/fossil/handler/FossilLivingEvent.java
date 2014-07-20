package mods.fossil.handler;

import mods.fossil.entity.mob.EntityTRex;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class FossilLivingEvent {

	@ForgeSubscribe
	public void onEntityLivingDeath(LivingDeathEvent event)
	{
		if (event.source.getEntity() instanceof EntityPlayerMP) 
		{
			  if (event.source.getEntity() instanceof EntityTRex)
			  { 
				  EntityTRex entity = (EntityTRex) event.entityLiving;
				  
				  entity.openMouth(true);
			
			  }
		 }   
	}
}
