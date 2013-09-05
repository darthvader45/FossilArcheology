package mods.fossil.config;

import java.lang.reflect.Field;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FossilToolItem {
	
	public static int scarabAxeID;
	public static int scarabPickaxeID;
	public static int scarabHoeID;
	public static int scarabShovelID;
	public static int magicConchID;
	public static int whipID;
	
	@Mod.Item(name = "Scarab Axe", typeClass = "mods.fossil.items.ItemScarabTools")
	public static Item scarabAxe;
	@Mod.Item(name = "Scarab Pickaxe", typeClass = "mods.fossil.items.ItemScarabTools")
	public static Item scarabPickaxe;
	@Mod.Item(name = "Scarab Hoe", typeClass = "mods.fossil.items.ItemScarabTools")
	public static Item scarabHoe;
	@Mod.Item(name = "Scarab Shovel", typeClass = "mods.fossil.items.ItemScarabTools")
	public static Item scarabShovel;
	
	@Mod.Item(name = "Magic Conch", typeClass = "mods.fossil.items.ItemMagicConch")
	public static Item magicConch;
	
	@Mod.Item(name = "Whip", typeClass = "mods.fossil.items.ItemWhip")
	public static Item whip;
	
	public static void load(Configuration cfg) {
		scarabAxeID = cfg.get("item", "ScarabAxe", 10700).getInt();
		scarabPickaxeID = cfg.get("item", "ScarabPickaxe", 10701).getInt();
		scarabHoeID = cfg.get("item", "ScarabHoe", 10702).getInt();
		scarabShovelID = cfg.get("item", "ScarabShovel", 10703).getInt();
		magicConchID = cfg.get("item", "MagicConch", 10704).getInt();
		whipID = cfg.get("item", "Whip", 10705).getInt();
		
		scarabAxe = new ItemScarabTools(scarabAxeID);
		scarabPickaxe = new ItemScarabTools(scarabPickaxeID);
		scarabHoe = new ItemScarabTools(scarabHoeID);
		scarabShovel = new ItemScarabTools(scarabShovelID);
		magicConch = new ItemMagicConch(magicConchID);
		whip = new ItemWhip(whipID);
	}

	public static void addNames() {
		try {
			for (Field field : FossilToolItem.class.getFields()) {
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