package mods.fossil.handler;

import mods.fossil.Fossil;
import net.minecraft.entity.player.EntityPlayer;
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

@Override
public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager){
	
    EntityPlayer p = (EntityPlayer) player;
	switch (Fossil.modState)
    {
    case 0:
    	p.addChatMessage("You are running Fossils and Archaeology Revival " + Fossil.modversion + ".");
    	p.addChatMessage("This mod is currently in a DEVELOPMENT state and guaranteed to have serious issues.");
    	p.addChatMessage("Do NOT redistribute this build.");
    	return;
    case 1:
    	p.addChatMessage("You are running Fossils and Archaeology Revival " + Fossil.modversion + ".");
    	p.addChatMessage("This mod is currently in an ALPHA/BETA state and may contain serious issues.");
    	p.addChatMessage("Report issues to https://github.com/4f6f3b/FossilArcheology/issues");
    	return;
    case 2:
    	
    	if(Fossil.FossilOptions.LoginMessage) {
        	p.addChatMessage("You are running Fossils and Archaeology Revival " + Fossil.modversion + ".");
        	p.addChatMessage("Official forum and support: http://www.minecraftforum.net/topic/1708636-");
        	Fossil.instance.config.load();
        	Fossil.instance.config.get("option", "Display_Login_Message", false).set(false);
        	Fossil.instance.config.save();
        	return;
    	}
    default:
		return;
    }
	
}

@Override
public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager){return null;}

@Override
public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager){}

@Override
public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager){}

@Override
public void connectionClosed(INetworkManager manager) {}
@Override
public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login){}


}