package mods.fossil;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
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
    
    public void registerEvents()
    {
    	
    }
    
    public void registerChestItems() {
    	Random rand = new Random();
        ChestGenHooks chestGenAcademyHooks = ChestGenHooks.getInfo("Academy");
        chestGenAcademyHooks.addItem(new WeightedRandomChestContent(new ItemStack(Item.paper), rand.nextInt(22), 10, 70));
        chestGenAcademyHooks.addItem(new WeightedRandomChestContent(new ItemStack(Block.dragonEgg), 1, 1, 70));
        chestGenAcademyHooks.addItem(new WeightedRandomChestContent(new ItemStack(Block.dragonEgg), 1, 1, 70));
        chestGenAcademyHooks.addItem(new WeightedRandomChestContent(new ItemStack(Block.dragonEgg), 1, 1, 70));
        chestGenAcademyHooks.addItem(new WeightedRandomChestContent(new ItemStack(Block.dragonEgg), 1, 1, 70));
        chestGenAcademyHooks.addItem(new WeightedRandomChestContent(new ItemStack(Block.dragonEgg), 1, 1, 70));
        // chance < saddle (1/16, ca. 6%, in max 8 slots -> 40% at least 1 egg, 0.48 eggs per chest): I think that's okay
    }
	
}
