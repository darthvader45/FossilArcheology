package mods.fossil;

import java.io.File;

import mods.fossil.config.FossilBlocks;
import mods.fossil.config.FossilConfig;
import mods.fossil.fossilTab.*;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.StringTranslate;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "fossil", name = "Fossil/Archeology", version = "1.5.2 Build 5.3")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Fossil {

	@Instance("fossil")
	public static Fossil instance;
	
	@SidedProxy(clientSide = "mods.fossil.ClientProxy", serverSide = "mods.fossil.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs tabFBlocks = new TabFBlocks(CreativeTabs.getNextID(), "FossilBlocks");
    public static CreativeTabs tabFItems = new TabFItems(CreativeTabs.getNextID(), "FossilItems");
    public static CreativeTabs tabFFood = new TabFFood(CreativeTabs.getNextID(), "FossilFood");
    public static CreativeTabs tabFCombat = new TabFCombat(CreativeTabs.getNextID(), "FossilCombat");
    public static CreativeTabs tabFArmor = new TabFArmor(CreativeTabs.getNextID(), "FossilArmor");
    public static CreativeTabs tabFTools = new TabFTools(CreativeTabs.getNextID(), "FossilTools");
    public static CreativeTabs tabFMaterial = new TabFMaterial(CreativeTabs.getNextID(), "FossilMaterial");
	
	Configuration config;

	public static EnumArmorMaterial BONE = EnumHelper.addArmorMaterial("Bone", 35, new int[]{4,9,7,6}, 15);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		instance = this;
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		FossilConfig.loadConfig(config);
			}

}