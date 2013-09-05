package mods.fossil.config;

import java.lang.reflect.Field;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.LanguageRegistry;

//import pixelmon.items.heldItems.ItemEverstone;

public class FossilItem {
	public static int itemID = 10000;
	
	public static int bioFossilID;
	public static int relicScrapID;
	public static int stoneTabletID;
	public static int fernSeedsID;
	public static int skullStickID;
	public static int scarabGemID;
	public static int dinoPediaID;
	public static int emptyShellID;
	public static int frozenMeatID;
	public static int legBoneID;
	public static int clawID;
	public static int footID;
	public static int skullID;
	public static int amberID;
	public static int dodoEggID;
	public static int cultivatedDodoEggID;
	public static int pigEmbryoID;
	public static int sheepEmbryoID;
	public static int cowEmbryoID;
	public static int chickenEmbryoID;
	public static int smilodonEmbryoID;
	public static int mammothEmbryoID;
	
	@Mod.Item(name = "Bio-Fossil", typeClass = "mods.fossil.items.ItemBioFossil")
	public static Item bioFossil;
	
	@Mod.Item(name = "Relic Scrap", typeClass = "mods.fossil.items.ItemRelicScrap")
	public static Item relicScrap;
	@Mod.Item(name = "Stone Tablet", typeClass = "mods.fossil.items.ItemStoneTablet")
	public static Item stoneTablet;
	
	@Mod.Item(name = "Fern Seeds", typeClass = "mods.fossil.items.ItemFernSeeds")
	public static Item fernSeeds;
	@Mod.Item(name = "Skull Stick", typeClass = "mods.fossil.items.ItemSkullStick")
	public static Item skullStick;
	@Mod.Item(name = "Scarab Gem", typeClass = "mods.fossil.items.ItemScarabGem")
	public static Item scarabGem;
	
	@Mod.Item(name = "DinoPedia", typeClass = "mods.fossil.items.ItemDinoPedia")
	public static Item dinoPedia;
	
	@Mod.Item(name = "Empty Shell", typeClass = "mods.fossil.items.ItemEmptyShell")
	public static Item emptyShell;
	@Mod.Item(name = "Frozen Meat", typeClass = "mods.fossil.items.ItemFrozenMeat")
	public static Item frozenMeat;
	
	@Mod.Item(name = "Leg Bone", typeClass = "mods.fossil.items.ItemLegBone")
	public static Item legBone;
	@Mod.Item(name = "Claw", typeClass = "mods.fossil.items.ItemClaw")
	public static Item claw;
	@Mod.Item(name = "Foot", typeClass = "mods.fossil.items.ItemFoot")
	public static Item foot;
	@Mod.Item(name = "Skull", typeClass = "mods.fossil.items.ItemSkull")
	public static Item skull;
	
	@Mod.Item(name = "Amber", typeClass = "mods.fossil.items.ItemAmber")
	public static Item amber;
	
	@Mod.Item(name = "Dodo Egg", typeClass = "mods.fossil.items.ItemDodoEgg")
	public static Item dodoEgg;
	@Mod.Item(name = "Cultivated Dodo Egg", typeClass = "mods.fossil.items.ItemCultivatedDodoEgg")
	public static Item cultivatedDodoEgg;
	
	@Mod.Item(name = "Pig Embryo", typeClass = "mods.fossil.items.ItemPigEmbryo")
	public static Item pigEmbryo;
	@Mod.Item(name = "Sheep Embryo", typeClass = "mods.fossil.items.ItemSheepEmbryo")
	public static Item sheepEmbryo;
	@Mod.Item(name = "Cow Embryo", typeClass = "mods.fossil.items.ItemCowEmbryo")
	public static Item cowEmbryo;
	@Mod.Item(name = "Chicken Embryo", typeClass = "mods.fossil.items.ItemChickenEmbryo")
	public static Item chickenEmbryo;
	@Mod.Item(name = "Smilodon Embryo", typeClass = "mods.fossil.items.ItemSmilodonEmbryo")
	public static Item smilodonEmbryo;
	@Mod.Item(name = "Mammoth Embryo", typeClass = "mods.fossil.items.ItemMammothEmbryo")
	public static Item mammothEmbryo;

	public static void load(Configuration cfg) {
		FossilArmorItem.load(cfg);
		FossilCombatItem.load(cfg);
		FossilFoodItem.load(cfg);
		FossilMaterialItem.load(cfg);
		FossilToolItem.load(cfg);

		bioFossilID = cfg.get("item", "BioFossil", 10027).getInt();
		relicScrapID = cfg.get("item", "RelicScrap", 10028).getInt();
		stoneTabletID = cfg.get("item", "StoneTablet", 10029).getInt();
		fernSeedsID = cfg.get("item", "FernSeeds", 10030).getInt();
		skullStickID = cfg.get("item", "SkullStick", 10031).getInt();
		scarabGemID = cfg.get("item", "ScarabGem", 10032).getInt();
		dinoPediaID = cfg.get("item", "DinoPedia", 10033).getInt();
		emptyShellID = cfg.get("item", "EmptyShell", 10034).getInt();
		frozenMeatID = cfg.get("item", "FrozenMeat", 10035).getInt();
		legBoneID = cfg.get("item", "LegBone", 10036).getInt();
		clawID = cfg.get("item", "Claw", 10037).getInt();
		footID = cfg.get("item", "Foot", 10038).getInt();
		skullID = cfg.get("item", "Skull", 10039).getInt();
		amberID = cfg.get("item", "Amber", 10040).getInt();
		dodoEggID = cfg.get("item", "DodoEgg", 10041).getInt();
		cultivatedDodoEggID = cfg.get("item", "CultivatedDodoEgg", 10042).getInt();
		pigEmbryoID = cfg.get("item", "PigEmbryo", 10043).getInt();
		sheepEmbryoID = cfg.get("item", "SheepEmbryo", 10044).getInt();
		cowEmbryoID = cfg.get("item", "CowEmbryo", 10045).getInt();
		chickenEmbryoID = cfg.get("item", "ChickenEmbryo", 10046).getInt();
		smilodonEmbryoID = cfg.get("item", "SmilodonEmbryo", 10047).getInt();
		mammothEmbryoID = cfg.get("item", "MammothEmbryo", 10048).getInt();
		
		bioFossil = new ItemBioFossil(bioFossilID);
		relicScrap = new ItemRelicScrap(relicScrapID);
		stoneTablet = new ItemStoneTablet(stoneTabletID);
		fernSeeds = new ItemFernSeeds(fernSeedsID);
		skullStick = new ItemSkullStick(skullStickID);
		scarabGem = new ItemScarabGem(scarabGemID);
		dinoPedia = new ItemDinoPedia(dinoPediaID);
		emptyShell = new ItemEmptyShell(emptyShellID);
		frozenMeat = new ItemFrozenMeat(frozenMeatID);
		legBone = new ItemLegBone(legBoneID);
		claw = new ItemClaw(clawID);
		foot = new ItemFoot(footID);
		skull = new ItemSkull(skullID);
		amber = new ItemAmber(amberID);
		dodoEgg = new ItemDodoEgg(dodoEggID);
		cultivatedDodoEgg = new ItemCultivatedDodoEgg(cultivatedDodoEggID);
		pigEmbryo = new ItemPigEmbryo(pigEmbryoID);
		sheepEmbryo = new ItemSheepEmbryo(sheepEmbryoID);
		cowEmbryo = new ItemCowEmbryo(cowEmbryoID);
		chickenEmbryo = new ItemChickenEmbryo(chickenEmbryoID);
		smilodonEmbryo = new ItemSmilodonEmbryo(smilodonEmbryoID);
		mammothEmbryo = new ItemBioFossil(mammothEmbryoID);
	}

	public static void addNames() {
		FossilArmorItem.addNames();
		FossilCombatItem.addNames();
		FossilFoodItem.addNames();
		FossilMaterialItem.addNames();
		FossilToolItem.addNames();
		try {
			for (Field field : FossilItem.class.getFields()) {
				if (field.isAnnotationPresent(Mod.Item.class)) {
					Item item = (Item) field.get(null);
					LanguageRegistry.addName(item, field.getAnnotation(Mod.Item.class).name());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	public static Item getItem(int id) {
		try {
			for (Field field : FossilItem.class.getFields()) {
				if (field.isAnnotationPresent(Mod.Item.class)) {
					Item item = (Item) field.get(null);
					if (item.itemID == id)
						return item;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}