package mods.fossil.config;

import java.lang.reflect.Field;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FossilBlocks {
	
	// Block ID's
	
	public static int fossilID;
    public static int skullID;
    public static int skullLanternID;
    public static int timeMachineID;
    public static int fernsID;
    public static int drumID;
    public static int permafrostID;
    public static int icedStoneID;
    public static int volcanicAshID;
    public static int volcanicRockID;
    public static int tarID;
    public static int palmLogID;
    public static int palmLeavesID;
    public static int palmSapID;
    public static int palaePlanksID;
    public static int palaeSingleSlabID;
    public static int palaeDoubleSlabID;
    public static int palaeStairsID;
    public static int sarracinaID;
    public static int volcanicBrickID;
    public static int amberOreID;
    public static int ancientStoneID;
    public static int ancientStonebrickID;
    public static int ancientWoodID;
    public static int ancientWoodPillarID;
    public static int ancientGlassID;
    public static int ancientWoodPlateID;
    public static int ancientWoodStairsID;
    public static int ancientWoodSingleSlabID;
    public static int ancientWoodDoubleSlabID;
    public static int ancientStoneStairsID;
    public static int ancientStoneSingleSlabID;
    public static int ancientStoneDoubleSlabID;
	public static int analyzerActiveID;
	public static int analyzerIdleID;
	public static int cultivateActiveID;
	public static int cultivateIdleID;
	public static int worktableActiveID;
	public static int worktableIdleID;
	public static int feederActiveID;
	public static int feederIdleID;
	
	// Declare Blocks
    
	@Mod.Block(name = "Fossil")
	public static Block fossil;
	
	@Mod.Block(name = "Skull")
	public static Block skull;
	
	@Mod.Block(name = "Skull Lantern")
	public static Block skullLantern;
	
	@Mod.Block(name = "Time Machine")
	public static Block timeMachine;
	
	@Mod.Block(name = "Ferns")
	public static Block ferns;

	@Mod.Block(name = "Order Drum")
	public static Block drum;
	
	@Mod.Block(name = "Permafrost")
	public static Block permaFrost;
	
	@Mod.Block(name = "Iced Stone")
	public static Block icedStone;
	
	@Mod.Block(name = "Volcanic Ash")
	public static Block volcanicAsh;
	
	@Mod.Block(name = "Volcanic Rock")
	public static Block volcanicRock;
	
	@Mod.Block(name = "Tar")
	public static Block tar;
	
	@Mod.Block(name = "Palaeoraphe Log")
	public static Block palmLog;
	
	@Mod.Block(name = "Palaeoraphe Leaves")
	public static Block palmLeaves;
	
	@Mod.Block(name = "Palaeoraphe Sapling")
	public static Block palmSap;
	
	@Mod.Block(name = "Palaeoraphe Planks")
	public static Block palaePlanks;
	
	@Mod.Block(name = "Palaeoraphe Slab")
	public static BlockHalfSlab palaeSingleSlab;
    public static BlockHalfSlab palaeDoubleSlab;
    
    @Mod.Block(name = "Palaeoraphe Stairs")
    public static Block palaeStairs;
    
    @Mod.Block(name = "Palaeoraphe Stairs")
    public static Block sarracina;
    
    @Mod.Block(name = "Volcanic Brick")
    public static Block volcanicBrick;
    
    @Mod.Block(name = "Amber Ore")
    public static Block amberOre;
    
    @Mod.Block(name = "Ancient Stone")
    public static Block ancientStone;
    
    @Mod.Block(name = "Ancient Stone Brick")
    public static Block ancientStoneBrick;
    
    @Mod.Block(name = "Ancient Wood")
    public static Block ancientWood;
    
    @Mod.Block(name = "Ancient Wood Pillar")
    public static Block ancientWoodPillar;
    
    @Mod.Block(name = "Ancient Glass")
    public static Block ancientGlass;
    
    @Mod.Block(name = "Ancient Wood Plate")
    public static Block ancientWoodPlate;
    
    @Mod.Block(name = "Ancient Wood Stairs")
    public static Block ancientWoodStairs;
    
    @Mod.Block(name = "Ancient Wood Slab")
    public static BlockHalfSlab ancientWoodSingleSlab;
    public static BlockHalfSlab ancientWoodDoubleSlab;
    
    @Mod.Block(name = "Ancient Stone Stairs")
    public static Block ancientStoneStairs;
    
    @Mod.Block(name = "Ancient Stone Slab")
    public static BlockHalfSlab ancientStoneSingleSlab;
    public static BlockHalfSlab ancientStoneDoubleSlab;
    
    @Mod.Block(name = "Analyzer")
	public static Block analyzerActive;
	public static Block analyzerIdle;
	
	@Mod.Block(name = "Culture Vat")
	public static Block cultivateActive;
	public static Block cultivateIdle;

	@Mod.Block(name = "Archeology Workbench")
	public static Block worktableActive;
	public static Block worktableIdle;

	@Mod.Block(name = "Feeder")
	public static Block feederActive;
	public static Block feederIdle;

	public static void load(Configuration configuration) {
		fossilID = configuration.getBlock("fossil", 300).getInt(300);
		skullID = configuration.getBlock("skull", 301).getInt(301);
		skullLanternID = configuration.getBlock("skullLantern", 302).getInt(302);
		timeMachineID = configuration.getBlock("timeMachine", 303).getInt(303);
		fernsID = configuration.getBlock("ferns", 304).getInt(304);
		drumID = configuration.getBlock("drum", 305).getInt(305);
		permafrostID = configuration.getBlock("permafrost", 306).getInt(306);
		icedStoneID = configuration.getBlock("icedStone", 307).getInt(307);
		volcanicAshID = configuration.getBlock("volcanicAsh", 308).getInt(308);
		volcanicRockID = configuration.getBlock("volcanicRock", 309).getInt(309);
		tarID = configuration.getBlock("tar", 310).getInt(310);
		palmLogID = configuration.getBlock("palmLog", 311).getInt(311);
		palmLeavesID = configuration.getBlock("palmLeaves", 312).getInt(312);
		palmSapID = configuration.getBlock("palmSap", 313).getInt(313);
		palaePlanksID = configuration.getBlock("palaePlanks", 314).getInt(314);
		palaeSingleSlabID = configuration.getBlock("palaeSingleSlab", 315).getInt(315);
		palaeDoubleSlabID = configuration.getBlock("palaeDoubleSlab", 316).getInt(316);
		palaeStairsID = configuration.getBlock("palaeStairs", 317).getInt(317);
		sarracinaID = configuration.getBlock("sarracina", 318).getInt(318);
		volcanicBrickID = configuration.getBlock("volcanicBrick", 319).getInt(319);
		amberOreID = configuration.getBlock("amberOre", 320).getInt(320);
		ancientStoneID = configuration.getBlock("ancientStone", 321).getInt(321);
		ancientStonebrickID = configuration.getBlock("ancientStonebrick", 322).getInt(322);
		ancientWoodID = configuration.getBlock("ancientWood", 323).getInt(323);
		ancientWoodPillarID = configuration.getBlock("ancientWoodPillar", 324).getInt(324);
		ancientGlassID = configuration.getBlock("ancientGlass", 325).getInt(325);
		ancientWoodPlateID = configuration.getBlock("ancientWoodPlate", 326).getInt(326);
		ancientWoodStairsID = configuration.getBlock("ancientWoodStairs", 327).getInt(327);
		ancientWoodSingleSlabID = configuration.getBlock("ancientWoodSingleSlab", 328).getInt(328);
		ancientWoodDoubleSlabID = configuration.getBlock("ancientWoodDoubleSlab", 329).getInt(329);
		ancientStoneStairsID = configuration.getBlock("ancientStoneStairs", 330).getInt(330);
		ancientStoneSingleSlabID = configuration.getBlock("ancientStoneSingleSlab", 331).getInt(331);
		ancientStoneDoubleSlabID = configuration.getBlock("ancientStoneDoubleSlab", 332).getInt(332);
		analyzerActiveID = configuration.getBlock("analyzerActive", 333).getInt(333);
		analyzerIdleID = configuration.getBlock("analyzerIdle", 334).getInt(334);
		cultivateActiveID = configuration.getBlock("cultivateActive", 335).getInt(335);
		cultivateIdleID = configuration.getBlock("cultivateIdle", 336).getInt(336);
		worktableActiveID = configuration.getBlock("worktableActive", 337).getInt(337);
		worktableIdleID = configuration.getBlock("worktableIdle", 338).getInt(338);
		feederActiveID = configuration.getBlock("feederActive", 339).getInt(339);
		feederIdleID = configuration.getBlock("feederIdle", 332).getInt(332);
		
		
		fossil = new  BlockFossil(fossilID);
		skull = new BlockFossilSkull(skullID);
		skullLantern = new BlockFossilSkull(skullLanternID);
		timeMachine = new BlockTimeMachine(timeMachineID);
		ferns = new BlockFerns(fernsID);
		drum = new BlockDrum(drumID);
		permaFrost = new BlockPermafrost(permafrostID);
		icedStone = new BlockIcedStone(icedStoneID);
		volcanicAsh = new BlockVolcanicAsh(volcanicAshID);
		volcanicRock = new BlockVolcanicRock(volcanicRockID);
		tar = new BlockTar(tarID);
		palmLog = new BlockPalmLog(palmLogID);
		palmLeaves = new BlockPalmLeaves(palmLeavesID);
		palmSap = new BlockPalmSap(palmSapID);
		palaePlanks = new BlockPalaePlanks(palaePlanksID);
		palaeDoubleSlab = (BlockHalfSlab)(new BlockPalaeSlab(palaeDoubleSlabID, true));
        palaeSingleSlab = (BlockHalfSlab)(new BlockPalaeSlab(palaeSingleSlabID, false));
		palaeStairs = new BlockPalaeStairs(palaeStairsID);
		sarracina = new BlockSarracina(sarracinaID);
		volcanicBrick = new BlockVolcanicBrick(volcanicBrickID);
		amberOre = new BlockAmberOre(amberOreID);
		ancientStone = new BlockAncientStone(ancientStoneID);
		ancientStoneBrick = new BlockAncientStonebrick(ancientStonebrickID);
		ancientWood = new BlockAncientWood(ancientWoodID);
		ancientWoodPillar = new BlockAncientWoodPillar(ancientWoodPillarID);
		ancientGlass = new BlockAncientGlass(ancientGlassID);
		ancientWoodPlate = new BlockAncientWoodPlate(ancientWoodPlateID);
		ancientWoodStairs = new BlockAncientWoodStairs(ancientWoodStairsID);
		ancientWoodDoubleSlab = (BlockHalfSlab)(new BlockAncientWoodSlab(ancientWoodDoubleSlabID, true));
        ancientWoodSingleSlab = (BlockHalfSlab)(new BlockAncientWoodSlab(ancientWoodSingleSlabID, false));
		ancientStoneStairs = new BlockAncientStoneStairs(ancientStoneStairsID);
		ancientStoneDoubleSlab = (BlockHalfSlab)(new BlockAncientStoneSlab(ancientStoneDoubleSlabID, true));
        ancientStoneSingleSlab = (BlockHalfSlab)(new BlockAncientStoneSlab(ancientStoneSingleSlabID, false));
        analyzerActive = new BlockAnalzyer(analyzerActiveID);
        analyzerIdle = new BlockAnalzyer(analyzerIdleID);
        cultivateActive = new BlockCultivate(cultivateActiveID);
        cultivateIdle = new BlockCultivate(cultivateIdleID);
        worktableActive = new BlockWorktable(worktableActiveID);
        worktableIdle = new BlockWorktable(worktableIdleID);
        feederActive = new BlockFeeder(feederActiveID);
        feederIdle = new BlockFeeder(feederIdleID);
	}

	public static void registerBlocks() {
		GameRegistry.registerBlock(fossil, "fossil");
		GameRegistry.registerBlock(skull, "skull");
		GameRegistry.registerBlock(skullLantern, "skullLantern");
		GameRegistry.registerBlock(timeMachine, "timeMachine");
		GameRegistry.registerBlock(ferns, "ferns");
		GameRegistry.registerBlock(drum, "drum");
		GameRegistry.registerBlock(permaFrost, "permaFrost");
		GameRegistry.registerBlock(icedStone, "icedStone");
		GameRegistry.registerBlock(volcanicAsh, "volcanicAsh");
		GameRegistry.registerBlock(volcanicRock, "volcanicRock");
		GameRegistry.registerBlock(tar, "tar");
		GameRegistry.registerBlock(palmLog, "palmLog");
		GameRegistry.registerBlock(palmLeaves, "palmLeaves");
		GameRegistry.registerBlock(palmSap, "palmSap");
		GameRegistry.registerBlock(palaePlanks, "palaePlanks");
		GameRegistry.registerBlock(palaeSingleSlab, "palaeSingleSlab");
		GameRegistry.registerBlock(palaeDoubleSlab, "palaeDoubleSlab");
		GameRegistry.registerBlock(palaeStairs, "palaeStairs");
		GameRegistry.registerBlock(sarracina, "sarracina");
		GameRegistry.registerBlock(volcanicBrick, "volcanicBrick");
		GameRegistry.registerBlock(amberOre, "amberOre");
		GameRegistry.registerBlock(ancientStone, "ancientStone");
		GameRegistry.registerBlock(ancientStoneBrick, "ancientStoneBrick");
		GameRegistry.registerBlock(ancientWood, "ancientWood");
		GameRegistry.registerBlock(ancientWoodPillar, "ancientWoodPillar");
		GameRegistry.registerBlock(ancientGlass, "ancientGlass");
		GameRegistry.registerBlock(ancientWoodPlate, "ancientWoodPlate");
		GameRegistry.registerBlock(ancientWoodStairs, "ancientWoodStairs");
		GameRegistry.registerBlock(ancientWoodSingleSlab, "ancientWoodSingleSlab");
		GameRegistry.registerBlock(ancientWoodDoubleSlab, "ancientWoodDoubleSlab");
		GameRegistry.registerBlock(ancientStoneStairs, "ancientStoneStairs");
		GameRegistry.registerBlock(ancientStoneSingleSlab, "ancientStoneSingleSlab");
		GameRegistry.registerBlock(ancientStoneDoubleSlab, "ancientStoneDoubleSlab");
		GameRegistry.registerBlock(analyzerActive, "analyzerActive");
		GameRegistry.registerBlock(analyzerIdle, "analyzerIdle");
		GameRegistry.registerBlock(cultivateActive, "cultivateActive");
		GameRegistry.registerBlock(cultivateIdle, "cultivateIdle");
		GameRegistry.registerBlock(worktableActive, "worktableActive");
		GameRegistry.registerBlock(worktableIdle, "worktableIdle");
		GameRegistry.registerBlock(feederActive, "feederActive");
		GameRegistry.registerBlock(feederIdle, "feederIdle");	
	}

	public static void addNames() {
		try {
			for (Field field : FossilBlocks.class.getFields()) {
				if (field.isAnnotationPresent(Mod.Block.class)) {
					Block block = (Block) field.get(null);
					LanguageRegistry.addName(block, field.getAnnotation(Mod.Block.class).name());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}