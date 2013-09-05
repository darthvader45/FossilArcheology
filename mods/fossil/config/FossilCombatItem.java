package mods.fossil.config;

import java.lang.reflect.Field;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FossilCombatItem {
	
	public static int ancientSwordID;
	public static int scarabSwordID;
	public static int woodJavelinID;
	public static int stoneJavelinID;
	public static int ironJavelinID;
	public static int goldJavelinID;
	public static int diamondJavelinID;
	public static int ancientJavelinID;

	@Mod.Item(name = "Ancient Sword", typeClass = "mods.fossil.items.ItemAncientTools")
	public static Item ancientSword;
	
	@Mod.Item(name = "Scarab Sword", typeClass = "mods.fossil.items.ItemScarabTools")
	public static Item scarabSword;
	
	@Mod.Item(name = "Wooden Javelin", typeClass = "mods.fossil.items.ItemWoodJavelin")
	public static Item woodJavelin;
	@Mod.Item(name = "Stone Javelin", typeClass = "mods.fossil.items.ItemStoneJavelin")
	public static Item stoneJavelin;
	@Mod.Item(name = "Iron Javelin", typeClass = "mods.fossil.items.ItemIronJavelin")
	public static Item ironJavelin;
	@Mod.Item(name = "Gold Javelin", typeClass = "mods.fossil.items.ItemGoldJavelin")
	public static Item goldJavelin;
	@Mod.Item(name = "Diamond Javelin", typeClass = "mods.fossil.items.ItemDiamondJavelin")
	public static Item diamondJavelin;
	@Mod.Item(name = "Ancient Javelin", typeClass = "mods.fossil.items.ItemAncientJavelin")
	public static Item ancientJavelin;
	
	public static void load(Configuration cfg) {
		ancientSwordID = cfg.get("item", "AncientSword", 10300).getInt();
		scarabSwordID = cfg.get("item", "ScarabSword", 10301).getInt();
		woodJavelinID = cfg.get("item", "WoodJavelin", 10302).getInt();
		stoneJavelinID = cfg.get("item", "StoneJavelin", 10303).getInt();
		ironJavelinID = cfg.get("item", "IronJavelin", 10304).getInt();
		goldJavelinID = cfg.get("item", "GoldJavelin", 10305).getInt();
		diamondJavelinID = cfg.get("item", "DiamondJavelin", 10306).getInt();
		ancientJavelinID = cfg.get("item", "AncientJavelin", 10307).getInt();
		
		ancientSword = new ItemAncientTools(ancientSwordID);
		scarabSword = new ItemScarabTools(scarabSwordID);
		woodJavelin = new ItemWoodJavelin(woodJavelinID);
		stoneJavelin = new ItemStoneJavelin(stoneJavelinID);
		ironJavelin = new ItemIronJavelin(ironJavelinID);
		goldJavelin = new ItemGoldJavelin(goldJavelinID);
		diamondJavelin = new ItemDiamondJavelin(diamondJavelinID);
		ancientJavelin = new ItemAncientJavelin(ancientJavelinID);
	}

	public static void addNames() {
		try {
			for (Field field : FossilCombatItem.class.getFields()) {
				if (field.isAnnotationPresent(Mod.Item.class)) {
					Item item = (Item) field.get(null);
					LanguageRegistry.addName(item, field.getAnnotation(Mod.Item.class).name());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}