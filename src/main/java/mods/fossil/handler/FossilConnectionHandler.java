package mods.fossil.handler;

import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;
import mods.fossil.Fossil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;

public class FossilConnectionHandler implements IConnectionHandler
{
    private boolean hasSeenMessage = false;

    @Override
    public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager)
    {
        EntityPlayer p = (EntityPlayer) player;

        switch (Fossil.modState)
        {
            case 0:
                if (Fossil.FossilOptions.LoginMessage)
                {
                    p.addChatMessage("You are running Fossils and Archaeology Revival " + Fossil.modversion + ".");
                    p.addChatMessage("Beware Fossils is not finished and features may be broken/incomplete.");
                    p.addChatMessage("Forum and support: http://www.minecraftforum.net/topic/1708636-");
                    p.addChatMessage("Github: https://github.com/FossilsArcheologyRevival/FossilArcheology");
                    Fossil.instance.config.load();
                    Fossil.instance.config.get("option", "Display_Login_Message", false).set(false);
                    Fossil.instance.config.save();
                }
            return;

            case 1:
                if (Fossil.FossilOptions.LoginMessage)
                {
                p.addChatMessage("You are running Fossils and Archaeology Revival " + Fossil.modversion + ".");
                p.addChatMessage("This mod is currently in an ALPHA/BETA state and may contain serious issues.");
                p.addChatMessage("Forum and support: http://www.minecraftforum.net/topic/1708636-");
                p.addChatMessage("Github: https://github.com/FossilsArcheologyRevival/FossilArcheology");
                }
                return;

            case 2:
                if (Fossil.FossilOptions.LoginMessage)
                {
                    p.addChatMessage("You are running Fossils and Archaeology Revival " + Fossil.modversion + ".");
                    p.addChatMessage("Forum and support: http://www.minecraftforum.net/topic/1708636-");
                    p.addChatMessage("Github: https://github.com/FossilsArcheologyRevival/FossilArcheology");
                    Fossil.instance.config.load();
                    Fossil.instance.config.get("option", "Display_Login_Message", false).set(false);
                    Fossil.instance.config.save();
                }
                return;

            default:
                return;
        }
    }

    @Override
    public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager)
    {
        return null;
    }

    @Override
    public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager) {}

    @Override
    public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager) {}

    @Override
    public void connectionClosed(INetworkManager manager) {}
    @Override
    public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login) {}
}