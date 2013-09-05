package mods.fossil.config;

import java.lang.reflect.Field;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FossilFoodItem {
	
	public static int cookedChickenSoupID;
	public static int rawChickenSoupID;
	public static int essenceOfChickenID;
	public static int sioChiuLeID;
	public static int tricMeatID;
	public static int veloMeatID;
	public static int trexMeatID;
	public static int pterMeatID;
	public static int nautMeatID;
	public static int plesMeatID;
	public static int mosaMeatID;
	public static int stegMeatID;
	public static int diloMeatID;
	public static int brachMeatID;
	public static int spinoMeatID;
	public static int compyMeatID;
	public static int ankyMeatID;
	public static int pachMeatID;
	public static int rawDodoWingID;
	public static int cookedDodoWingID;
	public static int dinoSteakID;
	
	@Mod.Item(name = "Cooked Chicken Soup", typeClass = "mods.fossil.items.ItemChickenSoup")
	public static Item cookedChickenSoup;
	@Mod.Item(name = "Raw Chicken Soup", typeClass = "mods.fossil.items.ItemChickenSoup")
	public static Item rawChickenSoup;
	@Mod.Item(name = "Essence of Chicken", typeClass = "mods.fossil.items.ItemEssenceOfChicken")
	public static Item essenceOfChicken;
	
	@Mod.Item(name = "Sio-Chiu-Le", typeClass = "mods.fossil.items.ItemSioChiuLe")
	public static Item sioChiuLe;
	
	@Mod.Item(name = "Triceratops Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item tricMeat;
	@Mod.Item(name = "Velociraptor Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item veloMeat;
	@Mod.Item(name = "T-Rex Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item trexMeat;
	@Mod.Item(name = "Pterosaur Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item pterMeat;
	@Mod.Item(name = "Nautilus Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item nautMeat;
	@Mod.Item(name = "Plesiosaur Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item plesMeat;
	@Mod.Item(name = "Mosasaurus Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item mosaMeat;
	@Mod.Item(name = "Stegosaurus Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item stegMeat;
	@Mod.Item(name = "Dilophosaurus Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item diloMeat;
	@Mod.Item(name = "Brachiosaurus Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item brachMeat;
	@Mod.Item(name = "Spinosaurus Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item spinoMeat;
	@Mod.Item(name = "Compsognathus Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item compyMeat;
	@Mod.Item(name = "Anklyosaurus Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item ankyMeat;
	@Mod.Item(name = "Pachycephalosaurus Meat", typeClass = "mods.fossil.items.ItemDinoMeat")
	public static Item pachMeat;
	
	@Mod.Item(name = "Raw Dodo Wing", typeClass = "mods.fossil.items.ItemDodoWing")
	public static Item rawDodoWing;
	@Mod.Item(name = "Cooked Dodo Wing", typeClass = "mods.fossil.items.ItemDodoWing")
	public static Item cookedDodoWing;
	
	@Mod.Item(name = "Dino Steak", typeClass = "mods.fossil.items.ItemDinoSteak")
	public static Item dinoSteak;
	
	public static void load(Configuration cfg) {
		cookedChickenSoupID = cfg.get("item", "CookedChickenSoup", 10400).getInt();
		rawChickenSoupID = cfg.get("item", "RawChickenSoup", 10401).getInt();
		essenceOfChickenID = cfg.get("item", "EssenceOfChicken", 10402).getInt();
		sioChiuLeID = cfg.get("item", "SioChiuLe", 10403).getInt();
		tricMeatID = cfg.get("item", "TriceratopsMeat", 10404).getInt();
		veloMeatID = cfg.get("item", "VelociraptorMeat", 10405).getInt();
		pterMeatID = cfg.get("item", "PterosaurMeat", 10406).getInt();
		nautMeatID = cfg.get("item", "NautilusMeat", 10407).getInt();
		plesMeatID = cfg.get("item", "PlesiosaurMeat", 10408).getInt();
		mosaMeatID = cfg.get("item", "MosasaurusMeat", 10409).getInt();
		stegMeatID = cfg.get("item", "StegosaurusMeat", 10410).getInt();
		diloMeatID = cfg.get("item", "DilophosaurusMeat", 10411).getInt();
		brachMeatID = cfg.get("item", "BrachiosaurusMeat", 10412).getInt();
		spinoMeatID = cfg.get("item", "SpinosaurusMeat", 10413).getInt();
		compyMeatID = cfg.get("item", "CompsognathusMeat", 10414).getInt();
		ankyMeatID = cfg.get("item", "AnklyosaurusMeat", 10415).getInt();
		pachMeatID = cfg.get("item", "PachycephalosaurusMeat", 10416).getInt();
		rawDodoWingID = cfg.get("item", "RawDodoWing", 10417).getInt();
		cookedDodoWingID = cfg.get("item", "CookedDodoWing", 10418).getInt();
		dinoSteakID = cfg.get("item", "DinoSteak", 10419).getInt();
		
		cookedChickenSoupID = new ItemChickenSoup(cookedChickenSoupID);
		rawChickenSoupID = new ItemChickenSoup(rawChickenSoupID);
		essenceOfChicken = new ItemEssenceOfChicken(essenceOfChickenID);
		sioChiuLe = new ItemSioChiuLe(sioChiuLeID);
		tricMeat = new ItemDinoMeat(tricMeatID);
		veloMeat = new ItemDinoMeat(veloMeatID);
		pterMeat = new ItemDinoMeat(pterMeatID);
		nautMeat = new ItemDinoMeat(nautMeatID);
		plesMeat = new ItemDinoMeat(plesMeatID);
		mosaMeat = new ItemDinoMeat(mosaMeatID);
		stegMeat = new ItemDinoMeat(stegMeatID);
		diloMeat = new ItemDinoMeat(diloMeatID);
		brachMeat = new ItemDinoMeat(brachMeatID);
		spinoMeat = new ItemDinoMeat(spinoMeatID);
		compyMeat = new ItemDinoMeat(compyMeatID);
		ankyMeat = new ItemDinoMeat(ankyMeatID);
		pachMeat = new ItemDinoMeat(pachMeatID);
		rawDodoWing = new ItemDodoWing(rawDodoWingID);
		cookedDodoWing = new ItemDodoWing(cookedDodoWingID);
		dinoSteak = new ItemDinoSteak(dinoSteakID);
	}

	public static void addNames() {
		try {
			for (Field field : FossilFoodItem.class.getFields()) {
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