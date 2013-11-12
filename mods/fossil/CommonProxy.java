package mods.fossil;

import info.ata4.minecraft.dragon.server.network.RemoteKeyPacketHandler;
import mods.fossil.handler.FossilPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy 
{

	public void registerRenderThings() 
	{
		
	}
	
	public void registerTileEntitySpecialRenderer() {}
	
	public void registerSounds()
	{
	
	}
	
    private void registerChannels() {
        NetworkRegistry.instance().registerChannel(RemoteKeyPacketHandler.getInstance(), FossilPacketHandler.CHANNEL, Side.SERVER);
    }
	
}
