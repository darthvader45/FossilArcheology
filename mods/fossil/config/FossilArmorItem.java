package mods.fossil.config;

import java.lang.reflect.Field;

import mods.fossil.Fossil;
import mods.fossil.items.ItemAncientArmor;
import mods.fossil.items.ItemFeet;
import mods.fossil.items.ItemRibCage;
import mods.fossil.items.ItemShinGuards;
import mods.fossil.items.ItemSkullHelmet;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FossilArmorItem {
	
	public static int ancientHelmetID;
	public static int skullHelmetID;
	public static int ribCageID;
	public static int shinGuardsID;
	public static int feetID;

	@Mod.Item(name = "Ancient Helmet", typeClass = "mods.fossil.items.ItemAncientArmor")
	public static Item ancientHelmet;
	
	@Mod.Item(name = "Skull Helmet", typeClass = "mods.fossil.items.ItemSkullHelmet")
	public static Item skullHelmet;
	@Mod.Item(name = "Rib Cage", typeClass = "mods.fossil.items.ItemRibCage")
	public static Item ribCage;
	@Mod.Item(name = "Shin Guards", typeClass = "mods.fossil.items.ItemShinGuards")
	public static Item shinGuards;
	@Mod.Item(name = "Feet", typeClass = "mods.fossil.items.ItemFeet")
	public static Item feet;
	
	public static void load(Configuration cfg) {
		ancientHelmetID = cfg.get("item", "AncientHelmet", 10200).getInt();
		skullHelmetID = cfg.get("item", "SkullHelmet", 10201).getInt();
		ribCageID = cfg.get("item", "RibCage", 10202).getInt();
		shinGuardsID = cfg.get("item", "ShinGuards", 10203).getInt();
		feetID = cfg.get("item", "Feet", 10200).getInt();
		
		ancientHelmet = new ItemAncientArmor(ancientHelmetID, EnumArmorMaterial.IRON, 3, 0);
		skullHelmet = new ItemSkullHelmet(skullHelmetID, Fossil.BONE, 3, 0);
		ribCage = new ItemRibCage(ribCageID, Fossil.BONE, 3, 1);
		shinGuards = new ItemShinGuards(shinGuardsID, Fossil.BONE, 3, 2);
		feet = new ItemFeet(feetID, Fossil.BONE, 3, 3);
	}

	public static void addNames() {
		try {
			for (Field field : FossilArmorItem.class.getFields()) {
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