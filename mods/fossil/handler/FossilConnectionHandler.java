package mods.fossil.handler;

import mods.fossil.Fossil;
import net.minecraft.client.Minecraft;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;

public class FossilConnectionHandler implements IConnectionHandler
{
	private boolean hasSeenMessage = false;
private final Minecraft mc = Minecraft.getMinecraft();

@Override
public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager){}

@Override
public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager){return null;}

@Override
public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager){}

@Override
public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager){}

@Override
public void connectionClosed(INetworkManager manager) {}
@Override
public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login)
{
	switch (Fossil.modState)
    {
    case 0:
    	mc.thePlayer.addChatMessage("You are running Fossils and Archaeology Revival " + Fossil.modversion + ".");
    	mc.thePlayer.addChatMessage("This mod is currently in a DEVELOPMENT state and guaranteed to have serious issues.");
    	mc.thePlayer.addChatMessage("Do NOT redistribute this build.");
    	return;
    case 1:
    	mc.thePlayer.addChatMessage("You are running Fossils and Archaeology Revival " + Fossil.modversion + ".");
    	mc.thePlayer.addChatMessage("This mod is currently in an ALPHA/BETA state and may contain serious issues.");
    	mc.thePlayer.addChatMessage("Report issues to https://github.com/4f6f3b/FossilArcheology/issues");
    	return;
    case 2:
    	if(hasSeenMessage == false) {
        	mc.thePlayer.addChatMessage("You are running Fossils and Archaeology Revival " + Fossil.modversion + ".");
        	mc.thePlayer.addChatMessage("Official forum and support: http://www.minecraftforum.net/topic/1708636-");
        	return;
    	}
    		hasSeenMessage = true;
    default:
		hasSeenMessage = true;
		return;
    }

}


}