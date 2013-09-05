package mods.fossil.config;

import java.lang.reflect.Field;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FossilMaterialItem {
	
	public static int brokenAncientSwordID;
	public static int brokenAncientHelmetID;
	public static int plantFossilID;
	public static int tricDNAID;
	public static int veloDNAID;
	public static int trexDNAID;
	public static int pterDNAID;
	public static int nautDNAID;
	public static int plesDNAID;
	public static int mosaDNAID;
	public static int stegDNAID;
	public static int diloDNAID;
	public static int brachDNAID;
	public static int spinoDNAID;
	public static int compyDNAID;
	public static int ankyDNAID;
	public static int pachyDNAID;
	public static int pigDNAID;
	public static int sheepDNAID;
	public static int cowDNAID;
	public static int chickenDNAID;
	public static int smilodonDNAID;
	public static int mammothDNAID;
	public static int tricEggID;
	public static int veloEggID;
	public static int trexEggID;
	public static int pterEggID;
	public static int livingNautilusID;
	public static int plesEggID;
	public static int mosaEggID;
	public static int stegEggID;
	public static int diloEggID;
	public static int brachEggID;
	public static int spinoEggID;
	public static int compyEggID;
	public static int ankyEggID;
	public static int pachyEggID;
	
	@Mod.Item(name = "Broken Ancient Sword", typeClass = "mods.fossil.items.ItemBrokenAncientSword")
	public static Item brokenAncientSword;
	@Mod.Item(name = "Broken Ancient Helmet", typeClass = "mods.fossil.items.ItemBrokenAncientHelmet")
	public static Item brokenAncientHelmet;
	
	@Mod.Item(name = "Plant Fossil", typeClass = "mods.fossil.items.ItemPlantFossil")
	public static Item plantFossil;
	
	@Mod.Item(name = "Triceratops DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item tricDNA;
	@Mod.Item(name = "Velociraptor DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item veloDNA;
	@Mod.Item(name = "T-Rex DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item trexDNA;
	@Mod.Item(name = "Pterosaur DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item pterDNA;
	@Mod.Item(name = "Nautilus DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item nautDNA;
	@Mod.Item(name = "Plesiosaur DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item plesDNA;
	@Mod.Item(name = "Mosasaurus DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item mosaDNA;
	@Mod.Item(name = "Stegosaurus DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item stegDNA;
	@Mod.Item(name = "Dilophosaurus DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item diloDNA;
	@Mod.Item(name = "Brachiosaurus DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item brachDNA;
	@Mod.Item(name = "Spinosaurus DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item spinoDNA;
	@Mod.Item(name = "Compsognathus DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item compyDNA;
	@Mod.Item(name = "Anklyosaurus DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item ankyDNA;
	@Mod.Item(name = "Pachycephalosaurus DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item pachyDNA;
	
	@Mod.Item(name = "Pig DNA", typeClass = "mods.fossil.items.ItemAnimalDNA")
	public static Item pigDNA;
	@Mod.Item(name = "Sheep DNA", typeClass = "mods.fossil.items.ItemAnimalDNA")
	public static Item sheepDNA;
	@Mod.Item(name = "Cow DNA", typeClass = "mods.fossil.items.ItemAnimalDNA")
	public static Item cowDNA;
	@Mod.Item(name = "Chicken DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item chickenDNA;
	
	@Mod.Item(name = "Smilodon DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item smilodonDNA;
	@Mod.Item(name = "Mammoth DNA", typeClass = "mods.fossil.items.ItemDinoDNA")
	public static Item mammothDNA;
	
	@Mod.Item(name = "Triceratops Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item tricEgg;
	@Mod.Item(name = "Velociraptor Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item veloEgg;
	@Mod.Item(name = "T-Rex Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item trexEgg;
	@Mod.Item(name = "Pterosaur Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item pterEgg;
	@Mod.Item(name = "Living Nautilus", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item livingNautilus;
	@Mod.Item(name = "Plesiosaur Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item plesEgg;
	@Mod.Item(name = "Mosasaurus Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item mosaEgg;
	@Mod.Item(name = "Stegosaurus Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item stegEgg;
	@Mod.Item(name = "Dilophosaurus Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item diloEgg;
	@Mod.Item(name = "Brachiosaurus Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item brachEgg;
	@Mod.Item(name = "Spinosaurus Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item spinoEgg;
	@Mod.Item(name = "Compsognathus Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item compyEgg;
	@Mod.Item(name = "Anklyosaurus Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item ankyEgg;
	@Mod.Item(name = "Pachycephalosaurus Egg", typeClass = "mods.fossil.items.ItemDinoEgg")
	public static Item pachyEgg;
	
	public static void load(Configuration cfg) {
		brokenAncientSwordID = cfg.get("item", "BrokenAncientSword", 10600).getInt();
		brokenAncientHelmetID = cfg.get("item", "BrokenAncientHelmet", 10601).getInt();
		plantFossilID = cfg.get("item", "PlantFossil", 10602).getInt();
		tricDNAID = cfg.get("item", "TriceratopsDNA", 10603).getInt();
		veloDNAID = cfg.get("item", "VelociraptorDNA", 10604).getInt();
		trexDNAID = cfg.get("item", "TRexDNA", 10605).getInt();
		pterDNAID = cfg.get("item", "PterosaurDNA", 10606).getInt();
		nautDNAID = cfg.get("item", "NautilusDNA", 10607).getInt();
		plesDNAID = cfg.get("item", "PlesiosaurDNA", 10608).getInt();
		mosaDNAID = cfg.get("item", "MosasaurusDNA", 10609).getInt();
		stegDNAID = cfg.get("item", "StegosaurusDNA", 10610).getInt();
		diloDNAID = cfg.get("item", "DilophosaurusDNA", 10611).getInt();
		brachDNAID = cfg.get("item", "BrachiosaurusDNA", 10612).getInt();
		spinoDNAID = cfg.get("item", "SpinosaurusDNA", 10613).getInt();
		compyDNAID = cfg.get("item", "CompsognathusDNA", 10614).getInt();
		ankyDNAID = cfg.get("item", "AnklyosaurusDNA", 10615).getInt();
		pachyDNAID = cfg.get("item", "PachycephalosaurusDNA", 10616).getInt();
		pigDNAID = cfg.get("item", "PigDNA", 10617).getInt();
		sheepDNAID = cfg.get("item", "SheepDNA", 10618).getInt();
		cowDNAID = cfg.get("item", "CowDNA", 10619).getInt();
		chickenDNAID = cfg.get("item", "ChickenDNA", 10620).getInt();
		smilodonDNAID = cfg.get("item", "SmilodonDNA", 10621).getInt();
		mammothDNAID = cfg.get("item", "MammothDNA", 10622).getInt();
		tricEggID = cfg.get("item", "TriceratopsEgg", 10623).getInt();
		veloEggID = cfg.get("item", "VelociraptorEgg", 10624).getInt();
		trexEggID = cfg.get("item", "TRexEgg", 10625).getInt();
		pterEggID = cfg.get("item", "PterosaurEgg", 10626).getInt();
		livingNautilusID = cfg.get("item", "LivingNautilus", 10627).getInt();
		plesEggID = cfg.get("item", "PlesiosaurEgg", 10628).getInt();
		mosaEggID = cfg.get("item", "MosasaurusEgg", 10629).getInt();
		stegEggID = cfg.get("item", "StegosaurusEgg", 10630).getInt();
		diloEggID = cfg.get("item", "DilophosaurusEgg", 10631).getInt();
		brachEggID = cfg.get("item", "BrachiosaurusEgg", 10632).getInt();
		spinoEggID = cfg.get("item", "SpinosaurusEgg", 10633).getInt();
		compyEggID = cfg.get("item", "CompsognathusEgg", 10634).getInt();
		ankyEggID = cfg.get("item", "AnklyosaurusEgg", 10635).getInt();
		pachyEggID = cfg.get("item", "PachycephalosaurusEgg", 10636).getInt();
		
		
		brokenAncientSword = new ItemBrokenAncientSword(brokenAncientSwordID);
		brokenAncientHelmet = new ItemBrokenAncientHelmet(brokenAncientHelmetID);
		plantFossil = new ItemPlantFossil(plantFossilID);
		tricDNA = new ItemDinoDNA(tricDNAID);
		veloDNA = new ItemDinoDNA(veloDNAID);
		trexDNA = new ItemDinoDNA(trexDNAID);
		pterDNA = new ItemDinoDNA(pterDNAID);
		nautDNA = new ItemDinoDNA(nautDNAID);
		plesDNA = new ItemDinoDNA(plesDNAID);
		mosaDNA = new ItemDinoDNA(mosaDNAID);
		stegDNA = new ItemDinoDNA(stegDNAID);
		diloDNA = new ItemDinoDNA(diloDNAID);
		brachDNA = new ItemDinoDNA(brachDNAID);
		spinoDNA = new ItemDinoDNA(spinoDNAID);
		compyDNA = new ItemDinoDNA(compyDNAID);
		ankyDNA = new ItemDinoDNA(ankyDNAID);
		pachyDNA = new ItemDinoDNA(pachyDNAID);
		pigDNA = new ItemAnimalDNA(pigDNAID);
		sheepDNA = new ItemAnimalDNA(sheepDNAID);
		cowDNA = new ItemAnimalDNA(cowDNAID);
		chickenDNA = new ItemAnimalDNA(chickenDNAID);
		smilodonDNA = new ItemDinoDNA(smilodonDNAID);
		mammothDNA = new ItemDinoDNA(mammothDNAID);
		tricEgg = new ItemDinoEgg(tricEggID);
		veloEgg = new ItemDinoEgg(veloEggID);
		trexEgg = new ItemDinoEgg(trexEggID);
		pterEgg = new ItemDinoEgg(pterEggID);
		livingNautilus = new ItemDinoEgg(livingNautilusID);
		plesEgg = new ItemDinoEgg(plesEggID);
		mosaEgg = new ItemDinoEgg(mosaEggID);
		stegEgg = new ItemDinoEgg(stegEggID);
		diloEgg = new ItemDinoEgg(diloEggID);
		brachEgg = new ItemDinoEgg(brachEggID);
		spinoEgg = new ItemDinoEgg(spinoEggID);
		compyEgg = new ItemDinoEgg(compyEggID);
		ankyEgg = new ItemDinoEgg(ankyEggID);
		pachyEgg = new ItemDinoEgg(pachyEggID);		
	}

	public static void addNames() {
		try {
			for (Field field : FossilMaterialItem.class.getFields()) {
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