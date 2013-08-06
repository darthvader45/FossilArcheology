package mods.fossil;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;












//import fossil.fossilEnums.EnumAnimalType;
/*import fossil.gens.WorldGenBigShip;
import fossil.gens.WorldGenCheheWreck;
import fossil.gens.WorldGenDukeWreck;
import fossil.gens.WorldGenGalleonWreck;*/
/*import fossil.gens.WorldGenShipWreck180;
import fossil.gens.WorldGenShipWreck270;
import fossil.gens.WorldGenShipWreck90;
import fossil.gens.WorldGenShortRangeWreck;
import fossil.gens.WorldGenVikingWreck;*/
import mods.fossil.util.RenderHUD;
import mods.fossil.blocks.BlockAmberOre;
import mods.fossil.blocks.BlockAncientGlass;
import mods.fossil.blocks.BlockAncientStone;
import mods.fossil.blocks.BlockAncientStoneSlab;
import mods.fossil.blocks.BlockAncientStoneStairs;
import mods.fossil.blocks.BlockAncientStonebrick;
import mods.fossil.blocks.BlockAncientWood;
import mods.fossil.blocks.BlockAncientWoodPillar;
import mods.fossil.blocks.BlockAncientWoodPlate;
import mods.fossil.blocks.BlockAncientWoodSlab;
import mods.fossil.blocks.BlockAncientWoodStairs;
import mods.fossil.blocks.BlockFern;
import mods.fossil.blocks.BlockFossil;
import mods.fossil.blocks.BlockFossilSkull;
import mods.fossil.blocks.BlockIcedStone;
import mods.fossil.blocks.BlockPalaePlanks;
import mods.fossil.blocks.BlockPalaeSlab;
import mods.fossil.blocks.BlockPalaeStairs;
import mods.fossil.blocks.BlockPalmLeaves;
import mods.fossil.blocks.BlockPalmLog;
import mods.fossil.blocks.BlockPalmSapling;
import mods.fossil.blocks.BlockPermafrost;
import mods.fossil.blocks.BlockSarracenia;
import mods.fossil.blocks.BlockTar;
import mods.fossil.blocks.BlockVolcanicAsh;
import mods.fossil.blocks.BlockVolcanicRock;
import mods.fossil.blocks.BlockVolcanicBrick;
import mods.fossil.client.FossilGuiHandler;
import mods.fossil.client.FossilMessageHandler;
import mods.fossil.client.FossilOptions;
import mods.fossil.client.Localizations;
import mods.fossil.entity.BehaviorJavelinDispense;
import mods.fossil.entity.EntityAncientJavelin;
import mods.fossil.entity.EntityCultivatedDodoEgg;
import mods.fossil.entity.EntityDinoEgg;
import mods.fossil.entity.EntityDodoEgg;
import mods.fossil.entity.EntityJavelin;
import mods.fossil.entity.EntityMLighting;
import mods.fossil.entity.EntityStoneboard;
import mods.fossil.entity.mob.EntityBones;
import mods.fossil.entity.mob.EntityDinosaur;
import mods.fossil.entity.mob.EntityDodo;
import mods.fossil.entity.mob.EntityFailuresaurus;
import mods.fossil.entity.mob.EntityFriendlyPigZombie;
import mods.fossil.entity.mob.EntityMammoth;
import mods.fossil.entity.mob.EntityNautilus;
import mods.fossil.entity.mob.EntityPigBoss;
import mods.fossil.entity.mob.EntityPregnantCow;
import mods.fossil.entity.mob.EntityPregnantPig;
import mods.fossil.entity.mob.EntityPregnantSheep;
import mods.fossil.entity.mob.EntityPterosaur;
import mods.fossil.entity.mob.EntitySmilodon;
import mods.fossil.fossilEnums.EnumDinoFoodMob;
import mods.fossil.fossilEnums.EnumDinoType;
import mods.fossil.gens.FossilGenerator;
import mods.fossil.gens.TarGenerator;
import mods.fossil.gens.WorldGenAcademy;
import mods.fossil.gens.WorldGenShips;
import mods.fossil.gens.WorldGenWeaponShop;
import mods.fossil.gens.WorldGeneratorPalaeoraphe;
import mods.fossil.gens.WorldGeneratorVolcanicRock;
import mods.fossil.guiBlocks.BlockAnalyzer;
import mods.fossil.guiBlocks.BlockCultivate;
import mods.fossil.guiBlocks.BlockDrum;
import mods.fossil.guiBlocks.BlockFeeder;
import mods.fossil.guiBlocks.BlockTimeMachine;
import mods.fossil.guiBlocks.BlockWorktable;
import mods.fossil.guiBlocks.RenderFeeder;
import mods.fossil.guiBlocks.TileEntityAnalyzer;
import mods.fossil.guiBlocks.TileEntityCultivate;
import mods.fossil.guiBlocks.TileEntityDrum;
import mods.fossil.guiBlocks.TileEntityFeeder;
import mods.fossil.guiBlocks.TileEntityTimeMachine;
import mods.fossil.guiBlocks.TileEntityWorktable;
import mods.fossil.items.*;
import mods.fossil.items.forge.*;
import mods.fossil.tabs.TabFArmor;
import mods.fossil.tabs.TabFBlocks;
import mods.fossil.tabs.TabFCombat;
import mods.fossil.tabs.TabFFood;
import mods.fossil.tabs.TabFItems;
import mods.fossil.tabs.TabFMaterial;
import mods.fossil.tabs.TabFTools;
import mods.fossil.client.LocalizationStrings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.potion.Potion;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.Achievement;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IChatListener;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import mods.fossil.util.FossilBonemealEvent;
import mods.fossil.util.FossilTradeHandler;

@Mod(modid = Fossil.modid, name = "Fossil/Archeology", version = "1.6.2 Build 6.0 DEV")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Fossil implements IPacketHandler
{
	public static final String modid = "fossil";
	
	@SidedProxy(clientSide = "mods.fossil.client.ClientProxy", serverSide = "mods.fossil.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance("fossil")
	public static Fossil instance;
	
	public static FossilGuiHandler GH = new FossilGuiHandler();
	public static FossilOptions FossilOptions;
	public static Properties LangProps = new Properties();
	public static Object ToPedia;
	
	//private static final File Langdir = new File("/lang");
    //public static String LastLangSetting = "en_US";
	//private static File Langfile = new File(Langdir, LastLangSetting + ".lang");
	public static IChatListener messagerHandler = new FossilMessageHandler();
	
	/*
	 * If DebugMode = true
	 * Dinosaur/Syringe times are accelerated.
	 */
	public static boolean DebugMode = true;
	public static final double MESSAGE_DISTANCE = 25.0D;
	
    //private static int[] blockIDs = new int[] {1137, 1138, 1139, 1140, 1141, 1142, 1143, 1144, 1145, 1146, 1147, 1148, 1149, 1151, 1152, 1153};
    //private static String[] BlockName = new String[] {"block Fossil", "block Skull", "block SkullLantern", "block analyzerIdle", "block analyzerActive", "block cultivateIdle", "block cultivateActive", "block worktableIdle", "block worktableActive", "block fern", "block fernUpper", "block Drum", "block FeederIdle", "block FeederActive", "Block Permafrost", "Block IcedStone"};
    //private static int[] ItemIDs = new int[] {600, 601, 602, 603, 604, 605, 606, 607, 608, 609, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 625, 626, 627, 628, 629, 630, 631, 632, 633, 634, 635, 636};
    //private static String[] ItemName = new String[] {"Item biofossil", "Item relic", "Item stoneboard", "Item DNA", "Item Ancientegg", "Item AncientSword", "Item BrokenSword", "Item FernSeed", "Item AncientHelmet", "Item BrokenHelmet", "Item SkullStick", "Item Gen", "Item GenAxe", "Item GenPickaxe", "Item GenSword", "Item GenHoe", "Item GenShovel", "Item DinoPedia", "Item TRexTooth", "Item ToothDagger", "Item RawChickenSoup", "Item ChickenEss", "Item EmptyShell", "Item Magic conch", "Item SJL", "Item RawDinoMeat", "Item CookedDinoMeat", "Item EmbyoSyringe", "Item AnimalDNA", "Item IcedMeat", "Item WoodJavelin", "Item StonrJavelin", "Item IronJavelin", "Item GoldJavelin", "Item DiamondJavelin", "Item AncientJavelin", "Item Whip"};
    //public static int[] fernPics = new int[] {38, 39, 40, 41, 42, 43, 26, 27, 71, 72, 73, 74, 58};
    //public static final int MultiCount = EnumDinoType.values().length * 3 + EnumAnimalType.values().length * 2 - 1 + 2;
    //public static ItemStack[] SingleTotalList;
    //public static ItemStack[] MultiTotalList = new ItemStack[MultiCount];
    
    public static CreativeTabs tabFBlocks = new TabFBlocks(CreativeTabs.getNextID(), "Fossil Blocks");
	public static CreativeTabs tabFItems = new TabFItems(CreativeTabs.getNextID(), "Fossil Items");
	public static CreativeTabs tabFFood = new TabFFood(CreativeTabs.getNextID(), "Fossil Food");
	public static CreativeTabs tabFCombat = new TabFCombat(CreativeTabs.getNextID(), "Fossil Combat");
	public static CreativeTabs tabFArmor = new TabFArmor(CreativeTabs.getNextID(), "Fossil Armor");
	public static CreativeTabs tabFTools = new TabFTools(CreativeTabs.getNextID(), "Fossil Deco");
	public static CreativeTabs tabFMaterial = new TabFMaterial(CreativeTabs.getNextID(), "Fossil Material");
	
	//public static WorldType fossil = new WorldTypeFossil(3, "Dino Test");
	
    public static Achievement pigbossOnEarth = (new Achievement(18000, "PigbossOnEarth", 0, 0, new ItemStack(Item.dyePowder, 1, 4), (Achievement)null)).registerAchievement();
    public static AchievementPage selfArcPage = new AchievementPage("FOSSIL / ARCHEOLOGY", new Achievement[] {pigbossOnEarth});
    
	//Blocks
	public static Block blockFossil;
	public static Block blockSkull;
	public static Block skullLantern;
	public static Block blockanalyzerIdle;
	public static Block blockanalyzerActive;
	public static Block blockcultivateIdle;
	public static Block blockcultivateActive;
	public static Block blockworktableIdle;
	public static Block blockworktableActive;
	public static Block blockTimeMachine;
	public static Block ferns;
	//public static Block fernUpper;
	public static Block drum;
	public static Block feederIdle;
	public static Block feederActive;
	public static Block blockPermafrost;
	public static Block blockIcedStone;
	public static Block volcanicAsh;
	public static Block volcanicRock;
	public static Block volcanicRockHot;
	public static Block tar;
	public static Block palmLog;
	public static Block palmLeaves;
	public static Block palmSap;
	public static Block palaePlanks;
	public static BlockHalfSlab palaeSingleSlab;
	public static BlockHalfSlab palaeDoubleSlab;
	public static Block palaeStairs;
	public static Block sarracina;
	public static Block volcanicBrick;
    public static Block amberOre;
    public static Block ancientStone;
    public static Block ancientStonebrick;
    public static Block ancientWood;
    public static Block ancientWoodPillar;
    public static Block ancientGlass;
    public static Block ancientWoodPlate;
    public static Block ancientWoodStairs;
    public static BlockHalfSlab ancientWoodSingleSlab;
    public static BlockHalfSlab ancientWoodDoubleSlab;
    public static Block ancientStoneStairs;
    public static BlockHalfSlab ancientStoneSingleSlab;
    public static BlockHalfSlab ancientStoneDoubleSlab;
	
    //Items
    public static Item biofossil;
    public static Item relic;
    public static Item stoneboard;
    public static Item ancientSword;
    public static Item brokenSword;
    public static Item fernSeed;
    public static Item ancienthelmet;
    public static Item brokenhelmet;
    public static Item skullStick;
    public static Item gem;
    public static Item gemAxe;
    public static Item gemPickaxe;
    public static Item gemSword;
    public static Item gemHoe;
    public static Item gemShovel;
    public static Item dinoPedia;
    public static Item emptyShell;
    public static Item magicConch;
    public static Item icedMeat;
    public static Item woodjavelin;
    public static Item stonejavelin;
    public static Item ironjavelin;
    public static Item goldjavelin;
    public static Item diamondjavelin;
    public static Item ancientJavelin;
    public static Item whip;
    public static Item legBone;
	public static Item claw;
	public static Item foot;
	public static Item skull;
	public static Item brokenSapling;
    public static Item amber;
    public static Item ancientVase;
    public static Item ancientVaseBroken;
    public static Item boneArrow;
    public static Item boneBow;
    public static Item boneGlue;
    public static Item boneRod;
    public static Item boneSword;
    public static Item powderyString;
    public static Item animalCoin;
    public static Item dinoCoin;
	public static Item dodoEgg;
	public static Item cultivatedDodoEgg;
	public static Item dodoWing;
	public static Item dodoWingCooked;
	
    //Armor
    public static Item skullHelmet;
	public static Item ribCage;
	public static Item femurs;
	public static Item feet;
	//public static Item newArmor;
	//public static Item newArmor;
	//public static Item newArmor;
	//public static Item newArmor;
	//public static Item newArmor;
	//public static Item newArmor;
	//public static Item newArmor;
	//public static Item newArmor;
	
	//DNA
	//public static Item dna;
	/*public static Item dnaTriceratops;
	public static Item dnaVelociraptor;
	public static Item dnaTRex;
	public static Item dnaPterosaur;
	public static Item dnaNautilus;
	public static Item dnaPlesiosaur;
	public static Item dnaMosasaurus;
	public static Item dnaStegosaurus;
	public static Item dnaDilophosaurus;
	public static Item dnaBrachiosaurus;
	public static Item dnaSpinosaurus;*/
	//public static Item[] DNAItems= new Item[EnumDinoType.values().length];
	
	//public static Item newDinoDNA;
	//public static Item newDinoDNA;
	//public static Item newDinoDNA;
	//public static Item newDinoDNA;
	//public static Item newDinoDNA;

	//Animal Dna
	//public static Item animalDNA;
	public static Item dnaPig;
	public static Item dnaSheep;
	public static Item dnaCow;
	public static Item dnaChicken;
	public static Item dnaSmilodon;
	public static Item dnaMammoth;
	public static Item dnaDodo;
	
	//Mob DNA
	//public static Item mobDNA;
	//public static Item dnaPigZombie;
	//public static Item dnaZombie;
	//public static Item dnaGhast;
	//public static Item dnaWither;
	//public static Item dnaSpider;
	//public static Item dnaSkeleton;
	
	//Ancient Egg
	//public static Item ancientegg;
	/*public static Item eggTriceratops;
	public static Item eggVelociraptor;
	public static Item eggTRex;
	public static Item eggPterosaur;
	public static Item shellNautilus;
	public static Item eggPlesiosaur;
	public static Item eggMosasaurus;
	public static Item eggStegosaurus;
	public static Item eggDilophosaurus;
	public static Item eggBrachiosaurus;
	public static Item eggSpinosaurus;*/
	//public static Item[] EGGItems= new Item[EnumDinoType.values().length];
	//public static Item eggNew;
	//public static Item eggNew;
	//public static Item eggNew;
	//public static Item eggNew;
	//public static Item eggNew;
	
	//Embryos
	//public static Item embyoSyringe;
	public static Item embryoPig;
	public static Item embryoSheep;
	public static Item embryoCow;
	public static Item embryoChicken;
	public static Item embryoSmilodon;
	public static Item embryoMammoth;
//    public static Item embryoDodo;
	//public static Item embryoPigZombie;
	//public static Item embryoZombie;
	//public static Item embryoGhast;
	//public static Item embryoWither;
	//public static Item embryoSkeleton;
	//public static Item embryoSpider;
	
	//Item Food
	public static Item cookedChickenSoup;
	public static Item rawChickenSoup;
    public static Item chickenEss;
	public static Item sjl;
	//public static Item rawDinoMeat;
	/*public static Item rawTriceratops;
	public static Item rawVelociraptor;
	public static Item rawTRex;
	public static Item rawPterosaur;
	public static Item rawNautilus;
	public static Item rawPlesiosaur;
	public static Item rawMosasaurus;
	public static Item rawStegosaurus;
	public static Item rawDilophosaurus;
	public static Item rawBrachiosaurus;
	public static Item rawSpinosaurus;*/
	//public static Item[] RAWItems= new Item[EnumDinoType.values().length];
	public static Item cookedDinoMeat;
	
	//Config ID INTs
	//Blocks
	public static int blockFossilID;
	public static int blockSkullID;
	public static int skullLanternID;
	public static int blockanalyzerIdleID;
	public static int blockanalyzerActiveID;
	public static int blockcultivateIdleID;
	public static int blockcultivateActiveID;
	public static int blockworktableIdleID;
	public static int blockworktableActiveID;
	public static int blockTimeMachineID;
	public static int fernsID;
	//public static int fernUpperID;
	public static int drumID;
	public static int feederIdleID;
	public static int feederActiveID;
	public static int blockPermafrostID;
	public static int blockIcedStoneID;
	public static int volcanicAshID;
	public static int volcanicRockID;
	public static int volcanicRockHotID;
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
	
    //Items
    public static int biofossilID;
    public static int relicID;
    public static int stoneboardID;
    public static int ancientSwordID;
    public static int brokenSwordID;
    public static int fernSeedID;
    public static int ancienthelmetID;
    public static int brokenhelmetID;
    public static int skullStickID;
    public static int gemID;
    public static int gemAxeID;
    public static int gemPickaxeID;
    public static int gemSwordID;
    public static int gemHoeID;
    public static int gemShovelID;
    public static int dinoPediaID;
    public static int emptyShellID;
    public static int magicConchID;
    public static int icedMeatID;
    public static int woodjavelinID;
    public static int stonejavelinID;
    public static int ironjavelinID;
    public static int goldjavelinID;
    public static int diamondjavelinID;
    public static int ancientJavelinID;
    public static int whipID;
	public static int legBoneID;
	public static int clawID;
	public static int footID;
	public static int skullID;
	public static int brokenSaplingID;
    public static int amberID;
    public static int ancientVaseID;
    public static int ancientVaseBrokenID;
    public static int boneArrowID;
    public static int boneBowID;
    public static int boneGlueID;
    public static int boneRodID;
    public static int boneSwordID;
    public static int powderyStringID;
    public static int animalCoinID;
    public static int dinoCoinID;
	public static int dodoEggID;
	public static int cultivatedDodoEggID;
	public static int dodoWingID;
    public static int dodoWingCookedID;
    
	//Armor
	public static int skullHelmetID;
	public static int ribCageID;
	public static int femursID;
	public static int feetID;
	//public static int newArmorID;
	//public static int newArmorID;
	//public static int newArmorID;
	//public static int newArmorID;
	//public static int newArmorID;
	//public static int newArmorID;
	//public static int newArmorID;
	//public static int newArmorID;
	
	//DNA
	//public static int dnaID;
	/*public static int dnaTriceratopsID;
	public static int dnaVelociraptorID;
	public static int dnaTRexID;
	public static int dnaPterosaurID;
	public static int dnaNautilusID;
	public static int dnaPlesiosaurID;
	public static int dnaMosasaurusID;
	public static int dnaStegosaurusID;
	public static int dnaDilophosaurusID;
	public static int dnaBrachiosaurusID;
	public static int dnaSpinosaurusID;*/
	public static int[] DNAIds= new int[EnumDinoType.values().length];
	//public static int newDinoDNAID;
	//public static int newDinoDNAID;
	//public static int newDinoDNAID;
	//public static int newDinoDNAID;
	//public static int newDinoDNAID;

	//Animal DNA
	//public static int animalDNAID;
	public static int dnaPigID;
	public static int dnaSheepID;
	public static int dnaCowID;
	public static int dnaChickenID;
	public static int dnaSmilodonID;
	public static int dnaMammothID;
    public static int dnaDodoID;
	
	//Mob DNA
	//public static int mobDNAID;
	//public static int dnaPigZombieID;
	//public static int dnaZombieID;
	//public static int dnaGhastID;
	//public static int dnaWitherID;
	//public static int dnaSpiderID;
	//public static int dnaSkeletonID;
	
	//Ancient Egg
	//public static int ancienteggID;
	/*public static int eggTriceratopsID;
	public static int eggVelociraptorID;
	public static int eggTRexID;
	public static int eggPterosaurID;
	public static int shellNautilusID;
	public static int eggPlesiosaurID;
	public static int eggMosasaurusID;
	public static int eggStegosaurusID;
	public static int eggDilophosaurusID;
	public static int eggBrachiosaurusID;
	public static int eggSpinosaurusID;*/
	public static int[] EGGIds= new int[EnumDinoType.values().length];
	//public static int eggNewID;
	//public static int eggNewID;
	//public static int eggNewID;
	//public static int eggNewID;
	//public static int eggNewID;
	
	//Embryos
	//public static int embyoSyringeID;
	public static int embryoPigID;
	public static int embryoSheepID;
	public static int embryoCowID;
	public static int embryoChickenID;
	public static int embryoSmilodonID;
	public static int embryoMammothID;
 //   public static int embryoDodoID;
    //public static int embryoPigZombieID;
	//public static int embryoZombieID;
	//public static int embryoGhastID;
	//public static int embryoWitherID;
	//public static int embryoSkeletonID;
	//public static int embryoSpiderID;
	
	//Food
	public static int cookedChickenSoupID;
	public static int rawChickenSoupID;
    public static int chickenEssID;
	public static int sjlID;
	//public static int rawDinoMeatID;
	/*public static int rawTriceratopsID;
	public static int rawVelociraptorID;
	public static int rawTRexID;
	public static int rawPterosaurID;
	public static int rawNautilusID;
	public static int rawPlesiosaurID;
	public static int rawMosasaurusID;
	public static int rawStegosaurusID;
	public static int rawDilophosaurusID;
	public static int rawBrachiosaurusID;
	public static int rawSpinosaurusID;*/
	public static int[] RAWIds= new int[EnumDinoType.values().length];
	public static int cookedDinoMeatID;
	
	/*public static boolean Option_Gen_Palaeoraphe;
	public static boolean Option_Gen_Academy;
	public static boolean Option_Gen_Ships;
	public static String Option_Lang_Server;
	public static boolean Option_Heal_Dinos;*/
	
	static EnumArmorMaterial bone = EnumHelper.addArmorMaterial("Bone", 35, new int[]{4,9,7,6}, 15);
	@Mod.EventHandler
	public void PreInit(FMLPreInitializationEvent event)
	{
        Localizations.loadLanguages();
    	MinecraftForge.EVENT_BUS.register(new FossilBonemealEvent());
    	
    	
    	VillagerRegistry.instance().registerVillageTradeHandler(10, new FossilTradeHandler());
    	
    	VillagerRegistry.instance().registerVillagerId(10); 
    	VillagerRegistry.instance().registerVillagerSkin(10, new ResourceLocation("fossil:mob/Archaeologist.png"));
        
    	
		Configuration var2 = new Configuration(event.getSuggestedConfigurationFile());
		try
		{
			var2.load();
		
		//Blocks
		blockFossilID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.BLOCKFOSSIL_NAME, 3000).getInt(3000);
		blockSkullID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.BLOCKSKULL_NAME, 3001).getInt(3001);
		skullLanternID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.SKULLLANTERN_NAME, 3002).getInt(3002);
        blockanalyzerIdleID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.BLOCKANALYZERIDLE_NAME, 3003).getInt(3003);
        blockanalyzerActiveID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.BLOCKANALYZERACTIVE_NAME, 3004).getInt(3004);
        blockcultivateIdleID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.BLOCKCULTIVATEIDLE_NAME, 3005).getInt(3005);
        blockcultivateActiveID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.BLOCKCULTIVATEACTIVE_NAME, 3006).getInt(3006);
        blockworktableIdleID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.BLOCKWORKTABLEIDLE_NAME, 3007).getInt(3007);
        blockworktableActiveID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.BLOCKWORKTABLEACTIVE_NAME, 3008).getInt(3008);
        blockTimeMachineID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.BLOCKTIMEMACHINE_NAME, 3009).getInt(3009);
        fernsID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.FERNBLOCK_NAME, 3010).getInt(3010);
        drumID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.DRUM_NAME, 3012).getInt(3012);
        feederIdleID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.FEEDERIDLE_NAME, 3013).getInt(3013);
        feederActiveID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.FEEDERACTIVE_NAME, 3014).getInt(3014);
        blockPermafrostID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.BLOCKPERMAFROST_NAME, 3015).getInt(3015);
        blockIcedStoneID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.BLOCKICEDSTONE_NAME, 3016).getInt(3016);
        volcanicAshID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.VOLCANICASH_NAME, 3017).getInt(3017);
        volcanicRockID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.VOLCANICROCK_NAME, 3018).getInt(3018);
        volcanicRockHotID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.VOLCANICROCKHOT_NAME, 3019).getInt(3019);
        tarID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.TAR_NAME, 3020).getInt(3020);
        palmLogID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.PALMLOG_NAME, 3021).getInt(3021);
        palmLeavesID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.PALMLEAVES_NAME, 3022).getInt(3022);
        palmSapID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.PALMSAP_NAME, 3023).getInt(3023);
        palaePlanksID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.PALAEPLANKS_NAME, 3024).getInt(3024);
        palaeSingleSlabID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.PALAESINGLESLAB_NAME, 3024).getInt(3024);
        palaeDoubleSlabID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.PALAEDOUBLESLAB_NAME, 3025).getInt(3025);
        palaeStairsID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.PALAESTAIRS_NAME, 3026).getInt(3026);
        sarracinaID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.SARRACINA_NAME, 3027).getInt(3027);
		volcanicBrickID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.VOLCANICBRICK_NAME, 3028).getInt(3028);
		amberOreID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.AMBERORE_NAME, 3029).getInt(3029);
		ancientStoneID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTSTONE_NAME, 3030).getInt(3030);
		ancientStonebrickID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTSTONEBRICK_NAME, 3031).getInt(3031);
		ancientWoodID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTWOOD_NAME, 3032).getInt(3032);
        ancientWoodPillarID= var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTWOODPILLAR_NAME, 3033).getInt(3033);
        ancientGlassID= var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTGLASS_NAME, 3034).getInt(3034);
        ancientWoodPlateID= var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTWOODPLATE_NAME, 3035).getInt(3035);
        ancientWoodStairsID= var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTWOODSTAIRS_NAME, 3036).getInt(3036);
        ancientWoodSingleSlabID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTWOOD_SINGLESLAB_NAME, 3037).getInt(3037);
        ancientWoodDoubleSlabID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTWOOD_DOUBLESLAB_NAME, 3038).getInt(3038);
        ancientStoneStairsID= var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTSTONESTAIRS_NAME, 3039).getInt(3039);
        ancientStoneSingleSlabID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTSTONE_SINGLESLAB_NAME, 3040).getInt(3040);
        ancientStoneDoubleSlabID = var2.getBlock(Configuration.CATEGORY_BLOCK, LocalizationStrings.ANCIENTSTONE_DOUBLESLAB_NAME, 3041).getInt(3041);
        
		//Items
        biofossilID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.BIO_FOSSIL_NAME, 10000).getInt(10000);
        relicID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RELIC_NAME, 10001).getInt(10001);
        stoneboardID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.TABLET_NAME, 10002).getInt(10002);
        ancientSwordID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.ANCIENT_SWORD_NAME, 10003).getInt(10003);
        brokenSwordID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.BROKEN_SWORD_NAME, 10004).getInt(10004);
        fernSeedID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.FERNSEED_NAME, 10005).getInt(10005);
        ancienthelmetID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.ANCIENT_HELMET_NAME, 10006).getInt(10006);
        brokenhelmetID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.BROKEN_HELMET_NAME, 10007).getInt(10007);
        skullStickID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.SKULL_STICK_NAME, 10008).getInt(10008);
        gemID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.GEM_NAME, 10009).getInt(10009);
        gemAxeID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.SCARAB_AXE_NAME, 10010).getInt(10010);
        gemPickaxeID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.SCARAB_PICKAXE_NAME, 10011).getInt(10011);
        gemSwordID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.SCARAB_SWORD_NAME, 10012).getInt(10012);
        gemHoeID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.SCARAB_HOE_NAME, 10013).getInt(10013);
        gemShovelID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.SCARAB_SHOVEL_NAME, 10014).getInt(10014);
        dinoPediaID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DINOPEDIA_NAME, 10015).getInt(10015);
        emptyShellID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EMPTY_SHELL_NAME, 10016).getInt(10016);
        magicConchID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.MAGIC_CONCH_NAME, 10017).getInt(10017);
        icedMeatID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.ICED_MEAT_NAME, 10018).getInt(10018);
        woodjavelinID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.WOOD_JAVELIN_NAME, 10019).getInt(10019);
        stonejavelinID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.STONE_JAVELIN_NAME, 10020).getInt(10020);
        ironjavelinID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.IRON_JAVELIN_NAME, 10021).getInt(10021);
        goldjavelinID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.GOLD_JAVELIN_NAME, 10022).getInt(10022);
        diamondjavelinID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DIAMOND_JAVELIN_NAME, 10023).getInt(10023);
        ancientJavelinID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.ANCIENT_JAVELIN_NAME, 10024).getInt(10024);
        whipID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.WHIP_NAME, 10025).getInt(10025);
        legBoneID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.LEGBONE_NAME, 10026).getInt(10026);
        clawID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.CLAW_NAME, 10027).getInt(10027);
        footID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.FOOT_NAME, 10028).getInt(10028);
        skullID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.SKULL_NAME, 10029).getInt(10029);
        brokenSaplingID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.BROKEN_SAPLING_NAME, 10030).getInt(10030);
        amberID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.AMBER_NAME, 10031).getInt(10031);
        ancientVaseID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.ANCIENTVASE_NAME, 10032).getInt(10032);
        ancientVaseBrokenID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.ANCIENTVASEBROKEN_NAME, 10033).getInt(10033);
        boneArrowID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.BONEARROW_NAME, 10034).getInt(10034);
        boneBowID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.BONEBOW_NAME, 10035).getInt(10035);
        boneGlueID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.BONEGLUE_NAME, 10036).getInt(10036);
        boneRodID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.BONEROD_NAME, 10037).getInt(10037);
        boneSwordID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.BONESWORD_NAME, 10038).getInt(10038);
        powderyStringID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.POWDERYSTRING_NAME, 10039).getInt(10039);
//        ancientWoodPlateID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.ANCIENTWOODPLATE_NAME, 10040).getInt(10040);
        animalCoinID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.ANIMALCOIN_NAME, 10041).getInt(10041);
        dinoCoinID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DINOCOIN_NAME, 10042).getInt(10042);
        dodoEggID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DODOEGG_NAME, 10043).getInt(10043);
        cultivatedDodoEggID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.CULTIVATEDDODOEGG_NAME, 10044).getInt(10044);
        //10044
        //10045
        //newItemID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.REPLACEME_NAME, 10046).getInt(10046);
		
		//Armor
		skullHelmetID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.SKULL_HELMET_NAME, 10047).getInt(10047);
		ribCageID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RIBCAGE_NAME, 10048).getInt(10048);
		femursID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.FEMURS_NAME, 10049).getInt(10049);
		feetID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.FEET_NAME, 10050).getInt(10050);
		//newArmorID = var2.getItem(Configuration.CATEGORY_ITEM, "newArmor", 10051).getInt(10051);
		//newArmorID = var2.getItem(Configuration.CATEGORY_ITEM, "newArmor", 10052).getInt(10052);
		//newArmorID = var2.getItem(Configuration.CATEGORY_ITEM, "newArmor", 10053).getInt(10053);
		//newArmorID = var2.getItem(Configuration.CATEGORY_ITEM, "newArmor", 10054).getInt(10054);
		//newArmorID = var2.getItem(Configuration.CATEGORY_ITEM, "newArmor", 10055).getInt(10055);
		//newArmorID = var2.getItem(Configuration.CATEGORY_ITEM, "newArmor", 10056).getInt(10056);
		//newArmorID = var2.getItem(Configuration.CATEGORY_ITEM, "newArmor", 10057).getInt(10057);
		//newArmorID = var2.getItem(Configuration.CATEGORY_ITEM, "newArmor", 10058).getInt(10058);
	
		//DNA
		//dnaID = var2.getItem(Configuration.CATEGORY_ITEM, "dna", 10059).getInt(10059);
        /*dnaTriceratopsID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_TRICERATOPS_NAME, 10060).getInt(10060);
        dnaVelociraptorID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_VELOCIRAPTOR_NAME, 10061).getInt(10061);
        dnaTRexID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_TREX_NAME, 10062).getInt(10062);
        dnaPterosaurID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_PTEROSAUR_NAME, 10063).getInt(10063);
        dnaNautilusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_NAUTILUS_NAME, 10064).getInt(10064);
        dnaPlesiosaurID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_PLESIOSAUR_NAME, 10065).getInt(10065);
        dnaMosasaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_MOSASAURUS_NAME, 10066).getInt(10066);
        dnaStegosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_STEGOSAURUS_NAME, 10067).getInt(10067);
        dnaDilophosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_DILOPHOSAURUS_NAME, 10068).getInt(10068);
        dnaBrachiosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_BRACHIOSAURUS_NAME, 10069).getInt(10069);
        dnaSpinosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_SPINOSAURUS_NAME, 10070).getInt(10070);*/
        for(int i=0;i<EnumDinoType.values().length;i++)
        	DNAIds[i] = var2.getItem(Configuration.CATEGORY_ITEM, "dna"+EnumDinoType.values()[i].name(), 10060+i).getInt(10060+i);
		//newDinoDNAID = var2.getItem(Configuration.CATEGORY_ITEM, "newDinoDNA", 10071).getInt(10071);
		//newDinoDNAID = var2.getItem(Configuration.CATEGORY_ITEM, "newDinoDNA", 10072).getInt(10072);
		//newDinoDNAID = var2.getItem(Configuration.CATEGORY_ITEM, "newDinoDNA", 10073).getInt(10073);
		//newDinoDNAID = var2.getItem(Configuration.CATEGORY_ITEM, "newDinoDNA", 10074).getInt(10074);
		//newDinoDNAID = var2.getItem(Configuration.CATEGORY_ITEM, "newDinoDNA", 10075).getInt(10075);

		//Animal DNA
		//animalDNAID = var2.getItem(Configuration.CATEGORY_ITEM, "animalDNA", 10076).getInt(10076);
		dnaPigID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_PIG_NAME, 10077).getInt(10077);
		dnaSheepID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_SHEEP_NAME, 10078).getInt(10078);
		dnaCowID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_COW_NAME, 10079).getInt(10079);
		dnaChickenID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_CHICKEN_NAME, 10080).getInt(10080);
		dnaSmilodonID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_SMILODON_NAME, 10081).getInt(10081);
		dnaMammothID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_MAMMOTH_NAME, 10082).getInt(10082);
	    dnaDodoID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DNA_DODO_NAME, 10083).getInt(10083);
		
		//MobDNA
		//mobDNAID = var2.getItem(Configuration.CATEGORY_ITEM, "dnaMammoth", 10083).getInt(10083);
		//dnaPigZombieID = var2.getItem(Configuration.CATEGORY_ITEM, "dnaMammoth", 10084).getInt(10084);
		//dnaZombieID = var2.getItem(Configuration.CATEGORY_ITEM, "dnaMammoth", 10085).getInt(10085);
		//dnaGhastID = var2.getItem(Configuration.CATEGORY_ITEM, "dnaMammoth", 10086).getInt(10086);
		//dnaWitherID = var2.getItem(Configuration.CATEGORY_ITEM, "dnaMammoth", 10087).getInt(10087);
		//dnaSpiderID = var2.getItem(Configuration.CATEGORY_ITEM, "dnaMammoth", 10088).getInt(10088);
		//dnaSkeletonID = var2.getItem(Configuration.CATEGORY_ITEM, "dnaMammoth", 10089).getInt(10089);

		//Ancient Egg
		//ancienteggID = var2.getItem(Configuration.CATEGORY_ITEM, "ancientegg", 10090).getInt(10090);
        /*eggTriceratopsID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EGG_TRICERATOPS_NAME, 10091).getInt(10091);
        eggVelociraptorID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EGG_VELOCIRAPTOR_NAME, 10092).getInt(10092);
        eggTRexID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EGG_TREX_NAME, 10093).getInt(10093);
        eggPterosaurID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EGG_PTEROSAUR_NAME, 10094).getInt(10094);
        shellNautilusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.SHELL_NAUTILUS_NAME, 10095).getInt(10095);
        eggPlesiosaurID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EGG_PLESIOSAUR_NAME, 10096).getInt(10096);
        eggMosasaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EGG_MOSASAURUS_NAME, 10097).getInt(10097);
        eggStegosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EGG_STEGOSAURUS_NAME, 10098).getInt(10098);
        eggDilophosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EGG_DILOPHOSAURUS_NAME, 10099).getInt(10099);
        eggBrachiosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EGG_BRACHIOSAURUS_NAME, 10100).getInt(10100);
        eggSpinosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EGG_SPINOSAURUS_NAME, 10101).getInt(10101);*/
        for(int i=0;i<EnumDinoType.values().length;i++)
        	EGGIds[i] = var2.getItem(Configuration.CATEGORY_ITEM, "egg"+EnumDinoType.values()[i].name(), 10091+i).getInt(10091+i);
		//eggNewID = var2.getItem(Configuration.CATEGORY_ITEM, "eggNew", 10102).getInt(10102);
		//eggNewID = var2.getItem(Configuration.CATEGORY_ITEM, "eggNew", 10103).getInt(10103);
		//eggNewID = var2.getItem(Configuration.CATEGORY_ITEM, "eggNew", 10104).getInt(10104);
		//eggNewID = var2.getItem(Configuration.CATEGORY_ITEM, "eggNew", 10105).getInt(10105);
		//eggNewID = var2.getItem(Configuration.CATEGORY_ITEM, "eggNew", 10106).getInt(10106);
	
		//Embryos
		//embyoSyringeID = var2.getItem(Configuration.CATEGORY_ITEM, "embyoSyringe", 10107).getInt(10107);
        embryoPigID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EMBRYO_PIG_NAME, 10108).getInt(10108);
        embryoSheepID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EMBRYO_SHEEP_NAME, 10109).getInt(10109);
        embryoCowID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EMBRYO_COW_NAME, 10110).getInt(10110);
        embryoChickenID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EMBRYO_CHICKEN_NAME, 10111).getInt(10111);
        embryoSmilodonID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EMBRYO_SMILODON_NAME, 10112).getInt(10112);
        embryoMammothID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EMBRYO_MAMMOTH_NAME, 10113).getInt(10113);
//        embryoDodoID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EMBRYO_DODO_NAME, 10114).getInt(10114);
		//embryoPigZombieID = var2.getItem(Configuration.CATEGORY_ITEM, "embryoPigZombie", 10114).getInt(10114);
		//embryoZombieID = var2.getItem(Configuration.CATEGORY_ITEM, "embryoZombie", 10115).getInt(10115);
		//embryoGhastID = var2.getItem(Configuration.CATEGORY_ITEM, "embryoGhast", 10116).getInt(10116);
		//embryoWitherID = var2.getItem(Configuration.CATEGORY_ITEM, "embryoWither", 10117).getInt(10117);
		//embryoSkeletonID = var2.getItem(Configuration.CATEGORY_ITEM, "embryoSkeleton", 10118).getInt(10118);
		//embryoSpiderID = var2.getItem(Configuration.CATEGORY_ITEM, "embryoSpider", 10119).getInt(10119);
		
		//Food
		cookedChickenSoupID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.COOKED_CHICKEN_SOUP_NAME, 10120).getInt(10120);
		rawChickenSoupID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_CHICKEN_SOUP_NAME, 10121).getInt(10121);
		chickenEssID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.EOC_NAME, 10122).getInt(10122);
		sjlID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.SJL_NAME, 10123).getInt(10123);
        dodoWingID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DODOWING_NAME, 10200).getInt(10200);
        dodoWingCookedID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DODOWINGCOOKED_NAME, 10201).getInt(10201);
		//rawDinoMeatID = var2.getItem(Configuration.CATEGORY_ITEM, "rawDinoMeat", 10124).getInt(10124);
		/*rawTriceratopsID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_TRICERATOPS_NAME, 10125).getInt(10125);
		rawVelociraptorID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_VELOCIRAPTOR_NAME, 10126).getInt(10126);
		rawTRexID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_TREX_NAME, 10127).getInt(10127);
		rawPterosaurID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_PTEROSAUR_NAME, 10128).getInt(10128);
		rawNautilusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_NAUTILUS_NAME, 10129).getInt(10129);
		rawPlesiosaurID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_PLESIOSAUR_NAME, 10130).getInt(10130);
		rawMosasaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_MOSASAURUS_NAME, 10131).getInt(10131);
		rawStegosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_STEGOSAURUS_NAME, 10132).getInt(10132);
		rawDilophosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_DILOPHOSAURUS_NAME, 10133).getInt(10133);
		rawBrachiosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_BRACHIOSAURUS_NAME, 10134).getInt(10134);
		rawSpinosaurusID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.RAW_SPINOSAURUS_NAME, 10136).getInt(10136);*/	
		for(int i=0;i<EnumDinoType.values().length;i++)
        	RAWIds[i] = var2.getItem(Configuration.CATEGORY_ITEM, "raw"+EnumDinoType.values()[i].name(), 10125+i).getInt(10125+i);
		cookedDinoMeatID = var2.getItem(Configuration.CATEGORY_ITEM, LocalizationStrings.DINO_STEAK_NAME, 10135).getInt(10135);
		
		/*Option_Gen_Palaeoraphe = var2.get("option", "Palaeoraphe", false).getBoolean(false);
		Option_Gen_Academy = var2.get("option", "Academy", true).getBoolean(true);
		Option_Gen_Ships = var2.get("option", "Ships", true).getBoolean(true);
		Option_Lang_Server = var2.get("option", "Serverlanguage", "en_US").value;
		Option_Heal_Dinos = var2.get("option", "Heal_Dinos", true).getBoolean(true);*/
		
		//FossilOptions.Load(var2);
		FossilOptions.Gen_Palaeoraphe = var2.get("option", "Palaeoraphe", false).getBoolean(false);
		FossilOptions.Gen_Academy = var2.get("option", "Academy", true).getBoolean(true);
		FossilOptions.Gen_Ships = var2.get("option", "Ships", true).getBoolean(true);
//		FossilOptions.Lang_Server = var2.get("option", "Serverlanguage", "en_US").getString();
		FossilOptions.Heal_Dinos = var2.get("option", "Heal_Dinos", true).getBoolean(true);
		FossilOptions.Dinos_Starve = var2.get("option", "Dinos_Starve", true).getBoolean(true);
		FossilOptions.Dino_Block_Breaking = var2.get("option", "Dino_Block_Breaking", true).getBoolean(true);
		FossilOptions.Skull_Overlay = var2.get("option", "Skull_Overlay", false).getBoolean(false);
		}
        catch (Exception var7)
        {
            FMLLog.log(Level.SEVERE, var7, "Fossil Mod Not loading configuration", new Object[0]);
        }
        finally
        {
            var2.save();
        }
		if (event.getSide() == Side.CLIENT)
    		proxy.registerSounds();
//    	UpdateLangProp(event.getSide() == Side.CLIENT);
    	/*else
    	{
    		String path="mods/Fossil-Archeology/fossil/Fossillang/";
    		System.out.println(Minecraft.getMinecraft().mcDataDir.getAbsolutePath());
    		System.out.println(path+Minecraft.getMinecraft().gameSettings.language+".lang");
    	}*/		
	}
	
	@SuppressWarnings("static-access")
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		//Blocks
		skullLantern = new BlockFossilSkull(skullLanternID, true).setHardness(1.0F).setLightValue(0.9375F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(LocalizationStrings.SKULLLANTERN_NAME).setCreativeTab(this.tabFBlocks);
        blockanalyzerIdle = new BlockAnalyzer(blockanalyzerIdleID, false).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName(LocalizationStrings.BLOCKANALYZERIDLE_NAME).setCreativeTab(this.tabFBlocks);
        blockanalyzerActive = new BlockAnalyzer(blockanalyzerActiveID, true).setLightValue(0.9375F).setHardness(3.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName(LocalizationStrings.BLOCKANALYZERACTIVE_NAME);
        blockcultivateIdle = new BlockCultivate(blockcultivateIdleID, false).setLightValue(0.9375F).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName(LocalizationStrings.BLOCKCULTIVATEIDLE_NAME).setCreativeTab(this.tabFBlocks);
        blockcultivateActive = new BlockCultivate(blockcultivateActiveID, true).setLightValue(0.9375F).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName(LocalizationStrings.BLOCKCULTIVATEACTIVE_NAME);
        blockworktableIdle = new BlockWorktable(blockworktableIdleID, false).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName(LocalizationStrings.BLOCKWORKTABLEIDLE_NAME).setCreativeTab(this.tabFBlocks);
        blockworktableActive = new BlockWorktable(blockworktableActiveID, true).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName(LocalizationStrings.BLOCKWORKTABLEACTIVE_NAME);
        feederIdle = new BlockFeeder(feederIdleID).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(LocalizationStrings.FEEDERIDLE_NAME);
        feederActive = new BlockFeeder(feederActiveID).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(LocalizationStrings.FEEDERACTIVE_NAME).setCreativeTab(this.tabFBlocks);
        blockTimeMachine = new BlockTimeMachine(blockTimeMachineID, 0, Material.glass).setLightValue(0.9375F).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName(LocalizationStrings.BLOCKTIMEMACHINE_NAME).setCreativeTab(this.tabFBlocks);
        /*, false*/ferns = new BlockFern(fernsID, Material.plants).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab((CreativeTabs)null);
        //fernUpper = new BlockFern(fernUpperID, 0, true).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab((CreativeTabs)null);
        drum = new BlockDrum(drumID).setHardness(0.8F).setCreativeTab(this.tabFBlocks);
        blockPermafrost = new BlockPermafrost(blockPermafrostID).setHardness(0.5F).setLightOpacity(3).setStepSound(Block.soundGrassFootstep).setUnlocalizedName(LocalizationStrings.BLOCKPERMAFROST_NAME).setCreativeTab(this.tabFBlocks);
        blockIcedStone = new BlockIcedStone(blockIcedStoneID).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(LocalizationStrings.BLOCKICEDSTONE_NAME).setCreativeTab(this.tabFBlocks);
        blockFossil = new BlockFossil(blockFossilID, 1).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(LocalizationStrings.BLOCKFOSSIL_NAME).setCreativeTab(this.tabFBlocks);
        blockSkull = new BlockFossilSkull(blockSkullID, false).setHardness(1.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(LocalizationStrings.BLOCKSKULL_NAME).setCreativeTab(this.tabFBlocks);
        palmLog = new BlockPalmLog(palmLogID).setStepSound(Block.soundWoodFootstep).setHardness(1.4F)/*.setResistance(1.0F)*/.setUnlocalizedName(LocalizationStrings.PALMLOG_NAME);
        palmLeaves = new BlockPalmLeaves(palmLeavesID, 53).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setUnlocalizedName(LocalizationStrings.PALMLEAVES_NAME);
        palmSap = new BlockPalmSapling(palmSapID).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setUnlocalizedName(LocalizationStrings.PALMSAP_NAME);
        palaePlanks = new BlockPalaePlanks(palaePlanksID, Material.wood).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName(LocalizationStrings.PALAEPLANKS_NAME);
        palaeDoubleSlab = (BlockHalfSlab)(new BlockPalaeSlab(palaeDoubleSlabID, true)).setHardness(1.4F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName(LocalizationStrings.PALAEDOUBLESLAB_NAME);
        palaeSingleSlab = (BlockHalfSlab)(new BlockPalaeSlab(palaeSingleSlabID, false)).setHardness(1.4F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName(LocalizationStrings.PALAESINGLESLAB_NAME).setCreativeTab(this.tabFBlocks);
        palaeStairs = new BlockPalaeStairs(palaeStairsID, palaePlanks).setUnlocalizedName(LocalizationStrings.PALAESTAIRS_NAME);
        volcanicAsh = new BlockVolcanicAsh(volcanicAshID).setHardness(0.2F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName(LocalizationStrings.VOLCANICASH_NAME).setCreativeTab(this.tabFBlocks);
        volcanicRock = new BlockVolcanicRock(volcanicRockID).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(LocalizationStrings.VOLCANICROCK_NAME).setCreativeTab(this.tabFBlocks);
        volcanicBrick = new BlockVolcanicBrick(volcanicBrickID).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName(LocalizationStrings.VOLCANICBRICK_NAME).setCreativeTab(this.tabFBlocks);
        sarracina = new BlockSarracenia(sarracinaID).setHardness(0.5F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName(LocalizationStrings.SARRACINA_NAME).setCreativeTab(this.tabFBlocks);
        tar = new BlockTar(tarID, Material.sand).setHardness(100.0F).setUnlocalizedName(LocalizationStrings.TAR_NAME);
        amberOre  = new BlockAmberOre(amberOreID, Material.rock).setHardness(3.0F).setUnlocalizedName(LocalizationStrings.AMBERORE_NAME);
        ancientStone  = new BlockAncientStone(ancientStoneID).setHardness(1.5F).setUnlocalizedName(LocalizationStrings.ANCIENTSTONE_NAME);
        ancientStonebrick  = new BlockAncientStonebrick(ancientStonebrickID).setHardness(1.5F).setUnlocalizedName(LocalizationStrings.ANCIENTSTONEBRICK_NAME);
        ancientWood  = new BlockAncientWood(ancientWoodID, Material.wood).setHardness(2.0F).setUnlocalizedName(LocalizationStrings.ANCIENTWOOD_NAME);
        ancientWoodPillar = new BlockAncientWoodPillar(ancientWoodPillarID, Material.wood).setHardness(2.0F).setUnlocalizedName(LocalizationStrings.ANCIENTWOODPILLAR_NAME);
        ancientGlass = new BlockAncientGlass(ancientGlassID, Material.glass, false).setHardness(0.3F).setUnlocalizedName(LocalizationStrings.ANCIENTGLASS_NAME);
        ancientWoodPlate = new BlockAncientWoodPlate(ancientWoodPlateID, Material.wood).setHardness(0.6F).setUnlocalizedName(LocalizationStrings.ANCIENTWOODPLATE_NAME);
        ancientWoodStairs = new BlockAncientWoodStairs(ancientWoodStairsID, ancientWood).setUnlocalizedName(LocalizationStrings.ANCIENTWOODSTAIRS_NAME);
        ancientWoodDoubleSlab = (BlockHalfSlab)(new BlockAncientWoodSlab(ancientWoodDoubleSlabID, true)).setHardness(1.4F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName(LocalizationStrings.ANCIENTWOOD_DOUBLESLAB_NAME);
        ancientWoodSingleSlab = (BlockHalfSlab)(new BlockAncientWoodSlab(ancientWoodSingleSlabID, false)).setHardness(1.4F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName(LocalizationStrings.ANCIENTWOOD_SINGLESLAB_NAME).setCreativeTab(this.tabFBlocks);
        ancientStoneStairs = new BlockAncientStoneStairs(ancientStoneStairsID, ancientStonebrick).setUnlocalizedName(LocalizationStrings.ANCIENTSTONESTAIRS_NAME);
        ancientStoneDoubleSlab = (BlockHalfSlab)(new BlockAncientStoneSlab(ancientStoneDoubleSlabID, true)).setHardness(1.4F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName(LocalizationStrings.ANCIENTSTONE_DOUBLESLAB_NAME);
        ancientStoneSingleSlab = (BlockHalfSlab)(new BlockAncientStoneSlab(ancientStoneSingleSlabID, false)).setHardness(1.4F).setResistance(7.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName(LocalizationStrings.ANCIENTSTONE_SINGLESLAB_NAME).setCreativeTab(this.tabFBlocks);
        Block.fire.setBurnProperties(Fossil.ferns.blockID, 30, 60);
		Block.fire.setBurnProperties(Fossil.palmLeaves.blockID, 30, 60);
		Block.fire.setBurnProperties(Fossil.palaePlanks.blockID, 5, 20);
		Block.fire.setBurnProperties(Fossil.tar.blockID, 500, 1);
	    Block.fire.setBurnProperties(Fossil.ancientWood.blockID, 10, 20);
	    Block.fire.setBurnProperties(Fossil.ancientWoodPlate.blockID, 5, 10);
        Block.fire.setBurnProperties(Fossil.ancientWoodStairs.blockID, 10, 20);		
        
        //Items
		biofossil = new ItemBioFossil(biofossilID).setUnlocalizedName(LocalizationStrings.BIO_FOSSIL_NAME).setCreativeTab(this.tabFItems);
		relic = new ForgeItem(relicID,"Relic_Scrap").setUnlocalizedName(LocalizationStrings.RELIC_NAME).setCreativeTab(this.tabFItems);
		stoneboard = new ItemStoneBoard(stoneboardID).setUnlocalizedName(LocalizationStrings.TABLET_NAME).setCreativeTab(this.tabFItems);
		ancientSword = new ItemAncientsword(ancientSwordID).setUnlocalizedName(LocalizationStrings.ANCIENT_SWORD_NAME).setCreativeTab(this.tabFCombat);
		brokenSword = new ForgeItem(brokenSwordID,"Broken_Ancient_Sword").setMaxStackSize(1).setUnlocalizedName(LocalizationStrings.BROKEN_SWORD_NAME).setCreativeTab(this.tabFMaterial);
		fernSeed = new ItemFernSeed(fernSeedID, ferns.blockID).setUnlocalizedName(LocalizationStrings.FERNSEED_NAME).setCreativeTab(this.tabFItems);
		ancienthelmet = new ItemAncientHelmet(ancienthelmetID, EnumArmorMaterial.IRON, 3, 0).setUnlocalizedName(LocalizationStrings.ANCIENT_HELMET_NAME).setCreativeTab(this.tabFArmor);
		brokenhelmet = new ForgeItem(brokenhelmetID,"Broken_Ancient_Helm").setMaxStackSize(1).setUnlocalizedName(LocalizationStrings.BROKEN_HELMET_NAME).setCreativeTab(this.tabFMaterial);
		skullStick = new ForgeItem(skullStickID,"Skull_Stick").setUnlocalizedName(LocalizationStrings.SKULL_STICK_NAME).setCreativeTab(this.tabFItems);
		gem = new ForgeItem(gemID,"Scarab_Gem").setUnlocalizedName(LocalizationStrings.GEM_NAME).setCreativeTab(this.tabFItems);
		gemAxe = new ForgeAxe(gemAxeID, EnumToolMaterial.EMERALD,"Gem_Axe").setUnlocalizedName(LocalizationStrings.SCARAB_AXE_NAME).setCreativeTab(this.tabFTools);
		gemPickaxe = new ForgePickaxe(gemPickaxeID, EnumToolMaterial.EMERALD,"Gem_Pickaxe").setUnlocalizedName(LocalizationStrings.SCARAB_PICKAXE_NAME).setCreativeTab(this.tabFTools);
		gemSword = new ForgeSword(gemSwordID, EnumToolMaterial.EMERALD,"Gem_Sword").setUnlocalizedName(LocalizationStrings.SCARAB_SWORD_NAME).setCreativeTab(this.tabFCombat);;
		gemHoe = new ForgeHoe(gemHoeID, EnumToolMaterial.EMERALD,"Gem_Hoe").setUnlocalizedName(LocalizationStrings.SCARAB_HOE_NAME).setCreativeTab(this.tabFTools);
		gemShovel = new ForgeShovel(gemShovelID, EnumToolMaterial.EMERALD,"Gem_Shovel").setUnlocalizedName(LocalizationStrings.SCARAB_SHOVEL_NAME).setCreativeTab(this.tabFTools);
		dinoPedia = new ForgeItem(dinoPediaID,"Dinopedia").setUnlocalizedName(LocalizationStrings.DINOPEDIA_NAME).setCreativeTab(this.tabFItems);
		emptyShell = new ForgeItem(emptyShellID,"Empty_Shell").setUnlocalizedName(LocalizationStrings.EMPTY_SHELL_NAME).setCreativeTab(this.tabFItems);
		magicConch = new ItemMagicConch(magicConchID).setUnlocalizedName(LocalizationStrings.MAGIC_CONCH_NAME).setCreativeTab(this.tabFTools);
        icedMeat = new ItemIcedMeat(icedMeatID, EnumToolMaterial.EMERALD).setUnlocalizedName(LocalizationStrings.ICED_MEAT_NAME).setCreativeTab(this.tabFItems);
        amber = new ItemAmber(amberID).setUnlocalizedName(LocalizationStrings.AMBER_NAME).setCreativeTab(this.tabFItems);
		woodjavelin = new ItemJavelin(woodjavelinID, EnumToolMaterial.WOOD,"Wooden_Javelin").setUnlocalizedName(LocalizationStrings.WOOD_JAVELIN_NAME).setCreativeTab(this.tabFCombat);
		stonejavelin = new ItemJavelin(stonejavelinID, EnumToolMaterial.STONE,"Stone_Javelin").setUnlocalizedName(LocalizationStrings.STONE_JAVELIN_NAME).setCreativeTab(this.tabFCombat);
		ironjavelin = new ItemJavelin(ironjavelinID, EnumToolMaterial.IRON,"Iron_Javelin").setUnlocalizedName(LocalizationStrings.IRON_JAVELIN_NAME).setCreativeTab(this.tabFCombat);
		goldjavelin = new ItemJavelin(goldjavelinID, EnumToolMaterial.GOLD,"Gold_Javelin").setUnlocalizedName(LocalizationStrings.GOLD_JAVELIN_NAME).setCreativeTab(this.tabFCombat);
		diamondjavelin = new ItemJavelin(diamondjavelinID, EnumToolMaterial.EMERALD,"Diamond_Javelin").setUnlocalizedName(LocalizationStrings.DIAMOND_JAVELIN_NAME).setCreativeTab(this.tabFCombat);
		ancientJavelin = new ItemJavelin(ancientJavelinID, EnumToolMaterial.IRON,"Ancient_Javelin").setUnlocalizedName(LocalizationStrings.ANCIENT_JAVELIN_NAME).setCreativeTab(this.tabFCombat);
		whip = new ItemWhip(whipID).setUnlocalizedName(LocalizationStrings.WHIP_NAME).setCreativeTab(this.tabFTools);
        legBone = new ForgeItem(legBoneID,"Leg_Bone").setUnlocalizedName(LocalizationStrings.LEGBONE_NAME).setCreativeTab(this.tabFItems);
		claw = new ForgeItem(clawID,"Claw").setUnlocalizedName(LocalizationStrings.CLAW_NAME).setCreativeTab(this.tabFItems);
		foot = new ForgeItem(footID,"Foot").setUnlocalizedName(LocalizationStrings.FOOT_NAME).setCreativeTab(this.tabFItems);
		skull = new ForgeItem(skullID,"Skull").setUnlocalizedName(LocalizationStrings.SKULL_NAME).setCreativeTab(this.tabFItems);
        brokenSapling = new ForgeItem(brokenSaplingID,"Palae_Fossil").setUnlocalizedName(LocalizationStrings.BROKEN_SAPLING_NAME).setCreativeTab(this.tabFMaterial);
        dodoEgg = new ItemDodoEgg(dodoEggID).setUnlocalizedName(LocalizationStrings.DODOEGG_NAME);
        cultivatedDodoEgg = new ItemCultivatedDodoEgg(cultivatedDodoEggID).setUnlocalizedName(LocalizationStrings.CULTIVATEDDODOEGG_NAME);
		
		//BoneArmor
		skullHelmet = new ItemSkullHelmet(skullHelmetID, bone, 3, 0).setUnlocalizedName(LocalizationStrings.SKULL_HELMET_NAME).setCreativeTab(Fossil.tabFArmor);;
		ribCage = new ItemRibCage(ribCageID, bone, 3, 1).setUnlocalizedName(LocalizationStrings.RIBCAGE_NAME).setCreativeTab(Fossil.tabFArmor);;
		femurs = new ItemFemurs(femursID, bone, 3, 2).setUnlocalizedName(LocalizationStrings.FEMURS_NAME).setCreativeTab(Fossil.tabFArmor);;
		feet = new ItemFeet(feetID, bone, 3, 3).setUnlocalizedName(LocalizationStrings.FEET_NAME).setCreativeTab(this.tabFArmor);
		
		//Ancient Egg
		//Moved to fossilEnums.EnumDinoType
		
		
        for(int i=0;i<EnumDinoType.values().length;i++)
        	EnumDinoType.values()[i].EggItem = new ItemAncientEgg(EGGIds[i],i).setUnlocalizedName("egg"+EnumDinoType.values()[i].name()).setCreativeTab(this.tabFMaterial);

        //DNA
        //Moved to fossilEnums.EnumDinoType
		for(int i=0;i<EnumDinoType.values().length;i++)
        	EnumDinoType.values()[i].DNAItem = new ForgeItem(DNAIds[i],EnumDinoType.values()[i].name()+"_DNA").setUnlocalizedName("dna"+EnumDinoType.values()[i].name()).setCreativeTab(this.tabFMaterial);
		
		//animalDNA
		//animalDNA = new ItemNonDinoDNA(animalDNAID);
		dnaPig = new ForgeItem(dnaPigID,"Pig_DNA").setUnlocalizedName(LocalizationStrings.DNA_PIG_NAME).setCreativeTab(this.tabFMaterial);
		dnaSheep = new ForgeItem(dnaSheepID,"Sheep_DNA").setUnlocalizedName(LocalizationStrings.DNA_SHEEP_NAME).setCreativeTab(this.tabFMaterial);
		dnaCow = new ForgeItem(dnaCowID,"Cow_DNA").setUnlocalizedName(LocalizationStrings.DNA_COW_NAME).setCreativeTab(this.tabFMaterial);
		dnaChicken = new ForgeItem(dnaChickenID,"Chicken_DNA").setUnlocalizedName(LocalizationStrings.DNA_CHICKEN_NAME).setCreativeTab(this.tabFMaterial);
		dnaSmilodon = new ForgeItem(dnaSmilodonID,"Smilodon_DNA").setUnlocalizedName(LocalizationStrings.DNA_SMILODON_NAME).setCreativeTab(this.tabFMaterial);
        dnaMammoth = new ForgeItem(dnaMammothID,"Mammoth_DNA").setUnlocalizedName(LocalizationStrings.DNA_MAMMOTH_NAME).setCreativeTab(this.tabFMaterial);
        dnaDodo = new ForgeItem(dnaDodoID,"Dodo_DNA").setUnlocalizedName(LocalizationStrings.DNA_DODO_NAME).setCreativeTab(this.tabFMaterial);
		
		//Ebryos
		//embyoSyringe = new ItemEmbryoSyringe(embyoSyringeID);
		embryoPig = new ItemEmbryoSyringe(embryoPigID,0).setUnlocalizedName(LocalizationStrings.EMBRYO_PIG_NAME).setCreativeTab(this.tabFItems);
		embryoSheep = new ItemEmbryoSyringe(embryoSheepID,1).setUnlocalizedName(LocalizationStrings.EMBRYO_SHEEP_NAME).setCreativeTab(this.tabFItems);
		embryoCow = new ItemEmbryoSyringe(embryoCowID,2).setUnlocalizedName(LocalizationStrings.EMBRYO_COW_NAME).setCreativeTab(this.tabFItems);
		embryoChicken = new ItemEmbryoSyringe(embryoChickenID,3).setUnlocalizedName(LocalizationStrings.EMBRYO_CHICKEN_NAME).setCreativeTab(this.tabFItems);
		embryoSmilodon = new ItemEmbryoSyringe(embryoSmilodonID,4).setUnlocalizedName(LocalizationStrings.EMBRYO_SMILODON_NAME).setCreativeTab(this.tabFItems);
        embryoMammoth = new ItemEmbryoSyringe(embryoMammothID,5).setUnlocalizedName(LocalizationStrings.EMBRYO_MAMMOTH_NAME).setCreativeTab(this.tabFItems);
//        embryoDodo = new ItemEmbryoSyringe(embryoDodoID,5).setUnlocalizedName(LocalizationStrings.EMBRYO_DODO_NAME).setCreativeTab(this.tabFItems);
		
		//Item Food
        //Moved to fossilEnums.EnumDinoType
        for(int i=0;i<EnumDinoType.values().length;i++)
        	EnumDinoType.values()[i].DropItem = new ForgeFood(RAWIds[i], 3, 0.3F, true,EnumDinoType.values()[i].name()+"_Meat").setUnlocalizedName("raw"+EnumDinoType.values()[i].name()).setCreativeTab(this.tabFFood);
		
        cookedDinoMeat = new ForgeFood(cookedDinoMeatID, 8, 0.8F, true,"Dino_Steak").setUnlocalizedName(LocalizationStrings.DINO_STEAK_NAME).setCreativeTab(this.tabFFood);
		cookedChickenSoup = new ForgeItem(cookedChickenSoupID,"Cooked_Chicken_Soup").setUnlocalizedName(LocalizationStrings.COOKED_CHICKEN_SOUP_NAME).setMaxStackSize(1).setContainerItem(Item.bucketEmpty).setCreativeTab(this.tabFFood);
		rawChickenSoup = new ForgeItem(rawChickenSoupID,"Raw_Chicken_Soup").setUnlocalizedName(LocalizationStrings.RAW_CHICKEN_SOUP_NAME).setMaxStackSize(1).setContainerItem(Item.bucketEmpty).setCreativeTab(this.tabFFood);
		chickenEss = new ItemChickenEss(chickenEssID, 10, 0.0F, false,"Essence_Of_Chicken").setUnlocalizedName(LocalizationStrings.EOC_NAME).setContainerItem(Item.glassBottle).setCreativeTab(this.tabFFood);
		sjl = new ForgeFood(sjlID, 8, 2.0F, false,"Sio_Chiu_Le").setUnlocalizedName(LocalizationStrings.SJL_NAME).setCreativeTab(this.tabFFood);
        dodoWing = new ForgeFood(dodoWingID, 8, 0.8F, true,"Raw_Dodo_Wing").setUnlocalizedName(LocalizationStrings.DODOWING_NAME).setCreativeTab(this.tabFFood);
        dodoWingCooked = new ForgeFood(dodoWingCookedID, 8, 0.8F, true,"Cooked_Dodo_Wing").setPotionEffect(Potion.hunger.id, 30, 0, 0.3F).setUnlocalizedName(LocalizationStrings.DODOWINGCOOKED_NAME).setCreativeTab(this.tabFFood);
		
		
		//Initiate some other things...
		BlockDispenser.dispenseBehaviorRegistry.putObject(Fossil.ancientJavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(),-1));
		
		BlockDispenser.dispenseBehaviorRegistry.putObject(Fossil.woodjavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(),0));
		BlockDispenser.dispenseBehaviorRegistry.putObject(Fossil.stonejavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(),1));
		BlockDispenser.dispenseBehaviorRegistry.putObject(Fossil.ironjavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(),2));
		BlockDispenser.dispenseBehaviorRegistry.putObject(Fossil.diamondjavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(),3));
		BlockDispenser.dispenseBehaviorRegistry.putObject(Fossil.goldjavelin, new BehaviorJavelinDispense(MinecraftServer.getServer(),4));
		
		//HarvestLevel
		MinecraftForge.setBlockHarvestLevel(blockFossil, 0, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blockPermafrost, 0, "shovel", 2);
		MinecraftForge.setBlockHarvestLevel(blockIcedStone, 0, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(blockIcedStone, 1, "pickaxe", 1);
		
        //Block Registry
        GameRegistry.registerBlock(blockFossil, LocalizationStrings.BLOCKFOSSIL_NAME);
        GameRegistry.registerBlock(blockSkull, LocalizationStrings.BLOCKSKULL_NAME);
        GameRegistry.registerBlock(skullLantern, LocalizationStrings.SKULLLANTERN_NAME);
        GameRegistry.registerBlock(blockanalyzerIdle, LocalizationStrings.BLOCKANALYZERIDLE_NAME);
        GameRegistry.registerBlock(blockanalyzerActive, LocalizationStrings.BLOCKANALYZERACTIVE_NAME);
        GameRegistry.registerBlock(blockcultivateIdle, LocalizationStrings.BLOCKCULTIVATEIDLE_NAME);
        GameRegistry.registerBlock(blockcultivateActive, LocalizationStrings.BLOCKCULTIVATEACTIVE_NAME);
        GameRegistry.registerBlock(blockworktableIdle, LocalizationStrings.BLOCKWORKTABLEIDLE_NAME);
        GameRegistry.registerBlock(blockworktableActive, LocalizationStrings.BLOCKWORKTABLEACTIVE_NAME);
        GameRegistry.registerBlock(ferns, LocalizationStrings.FERNBLOCK_NAME);
        GameRegistry.registerBlock(drum, LocalizationStrings.DRUM_NAME);
        GameRegistry.registerBlock(feederIdle, LocalizationStrings.FEEDERIDLE_NAME);
        GameRegistry.registerBlock(feederActive, LocalizationStrings.FEEDERACTIVE_NAME);
        GameRegistry.registerBlock(blockPermafrost, LocalizationStrings.BLOCKPERMAFROST_NAME);
        GameRegistry.registerBlock(blockIcedStone, LocalizationStrings.BLOCKICEDSTONE_NAME);
        GameRegistry.registerBlock(blockTimeMachine, LocalizationStrings.BLOCKTIMEMACHINE_NAME);
        GameRegistry.registerBlock(palmLog, LocalizationStrings.PALMLOG_NAME);
        GameRegistry.registerBlock(palmLeaves, LocalizationStrings.PALMLEAVES_NAME);
        GameRegistry.registerBlock(palmSap, LocalizationStrings.PALMSAP_NAME);
        GameRegistry.registerBlock(palaeSingleSlab, LocalizationStrings.PALAESINGLESLAB_NAME);
        GameRegistry.registerBlock(palaeDoubleSlab, LocalizationStrings.PALAEDOUBLESLAB_NAME);
        GameRegistry.registerBlock(palaeStairs, LocalizationStrings.PALAESTAIRS_NAME);
        GameRegistry.registerBlock(palaePlanks, LocalizationStrings.PALAEPLANKS_NAME);
        GameRegistry.registerBlock(volcanicAsh, LocalizationStrings.VOLCANICASH_NAME);
        GameRegistry.registerBlock(volcanicBrick, LocalizationStrings.VOLCANICBRICK_NAME);
        GameRegistry.registerBlock(volcanicRock, LocalizationStrings.VOLCANICROCK_NAME);
        GameRegistry.registerBlock(tar, LocalizationStrings.TAR_NAME);
        GameRegistry.registerBlock(sarracina, LocalizationStrings.SARRACINA_NAME);
        GameRegistry.registerBlock(amberOre, LocalizationStrings.AMBERORE_NAME);
        GameRegistry.registerBlock(ancientStone, LocalizationStrings.ANCIENTSTONE_NAME);
        GameRegistry.registerBlock(ancientStonebrick, LocalizationStrings.ANCIENTSTONEBRICK_NAME);
        GameRegistry.registerBlock(ancientWood, LocalizationStrings.ANCIENTWOOD_NAME);
        GameRegistry.registerBlock(ancientWoodPillar, LocalizationStrings.ANCIENTWOODPILLAR_NAME);
        GameRegistry.registerBlock(ancientGlass, LocalizationStrings.ANCIENTGLASS_NAME);
        GameRegistry.registerBlock(ancientWoodPlate, LocalizationStrings.ANCIENTWOODPLATE_NAME);
        GameRegistry.registerBlock(ancientWoodStairs, LocalizationStrings.ANCIENTWOODSTAIRS_NAME);
        GameRegistry.registerBlock(ancientWoodSingleSlab, LocalizationStrings.ANCIENTWOOD_SINGLESLAB_NAME);
        GameRegistry.registerBlock(ancientWoodDoubleSlab, LocalizationStrings.ANCIENTWOOD_DOUBLESLAB_NAME);
        GameRegistry.registerBlock(ancientStoneStairs, LocalizationStrings.ANCIENTSTONESTAIRS_NAME);
        GameRegistry.registerBlock(ancientStoneSingleSlab, LocalizationStrings.ANCIENTSTONE_SINGLESLAB_NAME);
        GameRegistry.registerBlock(ancientStoneDoubleSlab, LocalizationStrings.ANCIENTSTONE_DOUBLESLAB_NAME);
        
        LanguageRegistry.instance().addStringLocalization(((BlockPalaeSlab)palaeSingleSlab).getFullSlabName(0)+".name", "Palaeoraphe Slab");
        LanguageRegistry.instance().addStringLocalization(((BlockAncientWoodSlab)ancientWoodSingleSlab).getFullSlabName(0)+".name", "Ancient Wood Slab");
        LanguageRegistry.instance().addStringLocalization(((BlockAncientStoneSlab)ancientStoneSingleSlab).getFullSlabName(0)+".name", "Ancient Stone Slab");
        
//        LanguageRegistry.instance().addStringLocalization(((BlockPalaeSlab)palaeSingleSlab).getFullSlabName(0)+".name", "Palae SingleSlab");
		GameRegistry.addRecipe(new ItemStack(skullLantern, 1), new Object[] {"X", "Y", 'X', blockSkull, 'Y', Block.torchWood});
		GameRegistry.addRecipe(new ItemStack(Item.dyePowder, 5, 15), new Object[] {"X", 'X', blockSkull});
		GameRegistry.addRecipe(new ItemStack(Item.dyePowder, 5, 15), new Object[] {"X", 'X', skullLantern});
		GameRegistry.addRecipe(new ItemStack(blockcultivateIdle, 1), new Object[] {"XYX", "XWX", "ZZZ", 'X', Block.glass, 'Y', new ItemStack(Item.dyePowder, 1, 2), 'W', Item.bucketWater, 'Z', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(blockanalyzerIdle, 1), new Object[] {"XYX", "XWX", 'X', Item.ingotIron, 'Y', relic, 'W', biofossil});
		GameRegistry.addRecipe(new ItemStack(blockworktableIdle, 1), new Object[] {"X", "Y", 'X', Item.paper, 'Y', Block.workbench});
		
		for(int i=0;i<EnumDinoType.values().length;i++)
			GameRegistry.addRecipe(new ItemStack(Item.cake, 1), new Object[] {"MMM", "SES", "WWW", 'M', Item.bucketMilk, 'S', Item.sugar, 'W', Item.wheat, 'E', EnumDinoType.values()[i].EggItem});
		
		GameRegistry.addRecipe(new ItemStack(skullStick, 1), new Object[] {"X", "Y", 'X', blockSkull, 'Y', Item.stick});
		GameRegistry.addRecipe(new ItemStack(drum, 1), new Object[] {"ZZZ", "XYX", "XXX", 'X', Block.planks, 'Y', Item.redstone, 'Z', Item.leather});
		GameRegistry.addRecipe(new ItemStack(feederIdle, 1), new Object[] {"XYX", "ZAB", "BBB", 'X', Item.ingotIron, 'Y', Block.glass, 'Z', Block.stoneButton, 'A', Item.bucketEmpty, 'B', Block.stone});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemAxe), new Object[] {Item.axeWood, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemAxe), new Object[] {Item.axeStone, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemAxe), new Object[] {Item.axeIron, gem});
		GameRegistry.addShapelessRecipe(new ItemStack(gemAxe), new Object[] {Item.axeGold, gem});
		GameRegistry.addShapelessRecipe(new ItemStack(gemAxe), new Object[] {Item.axeDiamond, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemPickaxe), new Object[] {Item.pickaxeWood, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemPickaxe), new Object[] {Item.pickaxeStone, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemPickaxe), new Object[] {Item.pickaxeIron, gem});
		GameRegistry.addShapelessRecipe(new ItemStack(gemPickaxe), new Object[] {Item.pickaxeGold, gem});
		GameRegistry.addShapelessRecipe(new ItemStack(gemPickaxe), new Object[] {Item.pickaxeDiamond, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemHoe), new Object[] {Item.hoeWood, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemHoe), new Object[] {Item.hoeStone, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemHoe), new Object[] {Item.hoeIron, gem});
		GameRegistry.addShapelessRecipe(new ItemStack(gemHoe), new Object[] {Item.hoeGold, gem});
		GameRegistry.addShapelessRecipe(new ItemStack(gemHoe), new Object[] {Item.hoeDiamond, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemSword), new Object[] {Item.swordWood, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemSword), new Object[] {Item.swordStone, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemSword), new Object[] {Item.swordIron, gem});
		GameRegistry.addShapelessRecipe(new ItemStack(gemSword), new Object[] {Item.swordGold, gem});
		GameRegistry.addShapelessRecipe(new ItemStack(gemSword), new Object[] {Item.swordDiamond, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemShovel), new Object[] {Item.shovelWood, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemShovel), new Object[] {Item.shovelStone, gem});
		//GameRegistry.addShapelessRecipe(new ItemStack(gemShovel), new Object[] {Item.shovelIron, gem});
		GameRegistry.addShapelessRecipe(new ItemStack(gemShovel), new Object[] {Item.shovelGold, gem});
		GameRegistry.addShapelessRecipe(new ItemStack(gemShovel), new Object[] {Item.shovelDiamond, gem});
		
		for(int i=0;i<EnumDinoType.values().length;i++)
			GameRegistry.addShapelessRecipe(new ItemStack(dinoPedia), new Object[] {Item.book, EnumDinoType.values()[i].DNAItem});
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(rawChickenSoup, 1, 0), new Object[] {Item.bucketEmpty, Item.chickenRaw});
		//GameRegistry.addShapelessRecipe(new ItemStack(magicConch, 1, 1), new Object[] {new ItemStack(magicConch, 1, 0)});
		//GameRegistry.addShapelessRecipe(new ItemStack(magicConch, 1, 2), new Object[] {new ItemStack(magicConch, 1, 1)});
		//GameRegistry.addShapelessRecipe(new ItemStack(magicConch, 1, 0), new Object[] {new ItemStack(magicConch, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(chickenEss, 8), new Object[] {"XXX", "XYX", "XXX", 'X', Item.glassBottle, 'Y', cookedChickenSoup});
		GameRegistry.addRecipe(new ItemStack(whip, 1), new Object[] {"XXS", "XTS", "TXS", 'T', Item.stick, 'S', Item.silk});
		
		GameRegistry.addRecipe(new ItemStack(volcanicBrick, 4), new Object[] {"VV", "VV", 'V', this.volcanicRock});
		
		GameRegistry.addRecipe(new ItemStack(palaePlanks, 4), new Object[] {"P", 'P', this.palmLog});
		GameRegistry.addRecipe(new ItemStack(Block.woodenButton, 1), new Object[] {"P", 'P', this.palaePlanks});
		GameRegistry.addRecipe(new ItemStack(Item.stick, 3), new Object[] { "P", "P", 'P', this.palaePlanks});
		GameRegistry.addRecipe(new ItemStack(Block.pressurePlatePlanks, 1), new Object[] { "PP", 'P', this.palaePlanks});
		GameRegistry.addRecipe(new ItemStack(Item.boat, 1), new Object[] { "PXP", "PPP", 'P', this.palaePlanks});
		GameRegistry.addRecipe(new ItemStack(Item.bowlEmpty, 3), new Object[] { "PXP", "XPX", 'P', this.palaePlanks});
		GameRegistry.addRecipe(new ItemStack(Block.workbench, 1), new Object[] { "PP", "PP", 'P', this.palaePlanks});
		GameRegistry.addRecipe(new ItemStack(Item.doorWood, 1), new Object[] {"PPX", "PPX", "PPX", 'P', this.palaePlanks});
		GameRegistry.addRecipe(new ItemStack(Block.trapdoor, 2), new Object[] { "PPP", "PPP", 'P', this.palaePlanks});
		GameRegistry.addRecipe(new ItemStack(Block.chest, 1), new Object[] {"PPP", "PXP", "PPP", 'P', this.palaePlanks});
		
		GameRegistry.addRecipe(new ItemStack(Item.shovelWood, 1), new Object[] {"P", "S", "S", 'P', this.palaePlanks, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(Item.swordWood, 1), new Object[] {"P", "P", "S", 'P', this.palaePlanks, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(Item.hoeWood, 1), new Object[] {"PP", "XS", "XS", 'P', this.palaePlanks, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(Item.hoeWood, 1), new Object[] {"PP", "SX", "SX", 'P', this.palaePlanks, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(Item.axeWood, 1), new Object[] {"PP", "PS", "XS", 'P', this.palaePlanks, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(Item.axeWood, 1), new Object[] {"PP", "SP", "SX", 'P', this.palaePlanks, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(Item.pickaxeWood, 1), new Object[] {"PPP", "XSX", "XSX", 'P', this.palaePlanks, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(Block.fenceGate, 1), new Object[] { "SPS", "SPS", 'P', this.palaePlanks, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(Item.sign, 3), new Object[] {"PPP", "PPP", "XSX", 'P', this.palaePlanks, 'S', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(Item.bed, 1), new Object[] { "WWW", "PPP", 'P', this.palaePlanks, 'W',blockanalyzerActive.cloth});
		GameRegistry.addRecipe(new ItemStack(Block.jukebox, 1), new Object[] {"PPP", "PDP", "PPP", 'P', this.palaePlanks, 'D', Item.diamond});
		GameRegistry.addRecipe(new ItemStack(Block.music, 1), new Object[] {"PPP", "PRP", "PPP", 'P', this.palaePlanks, 'R', Item.redstone});
		GameRegistry.addRecipe(new ItemStack(Block.pistonBase, 1), new Object[] {"PPP", "CIC", "CRC", 'P', this.palaePlanks, 'R', Item.redstone, 'I',Item.ingotIron,'C',Block.cobblestone});
		GameRegistry.addRecipe(new ItemStack(Block.bookShelf, 1), new Object[] {"PPP", "BBB", "PPP", 'P', this.palaePlanks, 'B', Item.book});
		
		GameRegistry.addRecipe(new ItemStack(palaeSingleSlab, 6), new Object[] {"PPP", 'P', this.palaePlanks});
		GameRegistry.addRecipe(new ItemStack(palaeStairs, 4), new Object[] {"P  ", "PP ", "PPP", 'P', this.palaePlanks});
		GameRegistry.addRecipe(new ItemStack(palaeStairs, 4), new Object[] {"  P", " PP", "PPP", 'P', this.palaePlanks});
		
	    GameRegistry.addRecipe(new ItemStack(ancientWoodSingleSlab, 6), new Object[] {"PPP", 'P', this.ancientWood});
	    GameRegistry.addRecipe(new ItemStack(ancientWoodStairs, 4), new Object[] {"P  ", "PP ", "PPP", 'P', this.ancientWood});
	    GameRegistry.addRecipe(new ItemStack(ancientWoodStairs, 4), new Object[] {"  P", " PP", "PPP", 'P', this.ancientWood});
	    
	       GameRegistry.addRecipe(new ItemStack(ancientStoneSingleSlab, 6), new Object[] {"PPP", 'P', this.ancientStone});
	        GameRegistry.addRecipe(new ItemStack(ancientStoneStairs, 4), new Object[] {"P  ", "PP ", "PPP", 'P', this.ancientStone});
	        GameRegistry.addRecipe(new ItemStack(ancientStoneStairs, 4), new Object[] {"  P", " PP", "PPP", 'P', this.ancientStone});
		
		GameRegistry.addRecipe(new ItemStack(feet, 1), new Object[] {"* *","# #", '#', this.foot, '*', this.claw});
		GameRegistry.addRecipe(new ItemStack(femurs, 1), new Object[] {"###","* *","# #", '#', Item.bone,'*', this.legBone});
		GameRegistry.addRecipe(new ItemStack(ribCage, 1), new Object[] {"# #"," # ","###", '#', Item.bone});
		GameRegistry.addRecipe(new ItemStack(skullHelmet, 1), new Object[] {"#X#","# #", '#', Item.bone,'X', Fossil.skull});
		
        GameRegistry.addSmelting(rawChickenSoup.itemID, new ItemStack(cookedChickenSoup), 3.0F);
        GameRegistry.addSmelting(EnumDinoType.values()[4].EggItem.itemID, new ItemStack(Fossil.sjl), 3.0F);
        
        for(int i=0;i<EnumDinoType.values().length;i++)
        	if(i!=4)//Nautilus treated specially
        	GameRegistry.addSmelting(EnumDinoType.values()[i].DropItem.itemID, new ItemStack(cookedDinoMeat), 3.0F);
        
        GameRegistry.addSmelting(icedMeat.itemID, new ItemStack(Item.beefCooked), 3.0F);
        GameRegistry.addSmelting(dodoWing.itemID, new ItemStack(Fossil.dodoWingCooked), 3.0F);
		
		EntityRegistry.registerModEntity(EntityStoneboard.class, 		"StoneBoard", 			1, this, 250, 5, false);
		EntityRegistry.registerModEntity(EntityJavelin.class, 			"Javelin", 				2, this, 250, 5, true);
		EntityRegistry.registerModEntity(EntityAncientJavelin.class, 	"AncientJavelin", 		3, this, 250, 5, true);
		EntityRegistry.registerModEntity(EntityMLighting.class, 		"FriendlyLighting", 	4, this, 250, 5, true);
		EntityRegistry.registerModEntity(EntityFailuresaurus.class, 	"Failuresaurus", 		5, this, 250, 5, true);
		EntityRegistry.registerModEntity(EntityBones.class, 			"Bones", 				6, this, 250, 5, true);

		EntityRegistry.registerModEntity(EntityDinoEgg.class, 			"DinoEgg", 				8, this, 250, 5, true);
		
		
		EntityRegistry.registerModEntity(EntityFriendlyPigZombie.class, "FriendlyPigZombie", 	12, this, 250, 5, true);
		EntityRegistry.registerModEntity(EntityPigBoss.class, 			"PigBoss", 				13, this, 250, 5, true);
		
		
		
		EntityRegistry.registerModEntity(EntityPregnantSheep.class, 	"PregnantSheep", 		19, this, 250, 5, true);
		EntityRegistry.registerModEntity(EntityPregnantCow.class, 		"PregnantCow", 			20, this, 250, 5, true);
		EntityRegistry.registerModEntity(EntityPregnantPig.class, 		"PregnantPig", 			21, this, 250, 5, true);
		EntityRegistry.registerModEntity(EntitySmilodon.class, 			"Smilodon", 			22, this, 250, 5, true);
		//EntityRegistry.registerModEntity(EntityBrachiosaurus.class, 	"Brachiosaurus", 		23, this, 250, 5, true);
		EntityRegistry.registerModEntity(EntityMammoth.class, 			"Mammoth", 				24, this, 250, 5, true);
		//EntityRegistry.registerModEntity(EntitySpinosaurus.class, 		"Spinosaurus", 			25, this, 250, 5, true);
	      EntityRegistry.registerModEntity(EntityDodo.class,           "Dodo",              25, this, 250, 5, true);
	       EntityRegistry.registerModEntity(EntityDodoEgg.class,           "DodoEgg",              26, this, 250, 5, true);
           EntityRegistry.registerModEntity(EntityCultivatedDodoEgg.class,           "CultivatedDodoEgg",              27, this, 250, 5, true);
          // EntityRegistry.registerModEntity(EntityPregnantChicken.class,           "PregnantChicken",              27, this, 250, 5, true);

		for(int i=0;i<EnumDinoType.values().length;i++)
			EntityRegistry.registerModEntity(EnumDinoType.values()[i].getDinoClass(),EnumDinoType.values()[i].name(),200+i, this, 250, 5, true);
		
		EntityRegistry.addSpawn(EntityNautilus.class, 5, 4, 14, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.river,BiomeGenBase.ocean});
		

        LanguageRegistry.instance().addStringLocalization("entity.fossil.Failuresaurus.name", Localizations.getLocalizedString(LocalizationStrings.MOB_FAILURESAURUS));
        LanguageRegistry.instance().addStringLocalization("entity.fossil.Bones.name", Localizations.getLocalizedString(LocalizationStrings.MOB_BONES));
        //LanguageRegistry.instance().addStringLocalization("entity.fossil.Nautilus.name", Localizations.getLocalizedString(LocalizationStrings.DINO_NAUTILUS));
        //LanguageRegistry.instance().addStringLocalization("entity.fossil.Velociraptor.name", Localizations.getLocalizedString(LocalizationStrings.DINO_VELOCIRAPTOR));
        //LanguageRegistry.instance().addStringLocalization("entity.fossil.Triceratops.name", Localizations.getLocalizedString(LocalizationStrings.DINO_TRICERATOPS));
        //LanguageRegistry.instance().addStringLocalization("entity.fossil.Tyrannosaurus.name", Localizations.getLocalizedString(LocalizationStrings.DINO_TREX));
        LanguageRegistry.instance().addStringLocalization("entity.fossil.FriendlyPigZombie.name", Localizations.getLocalizedString(LocalizationStrings.MOB_FPZ));
        LanguageRegistry.instance().addStringLocalization("entity.fossil.PigBoss.name", Localizations.getLocalizedString(LocalizationStrings.BOSS_ANU));
        //LanguageRegistry.instance().addStringLocalization("entity.fossil.Pterosaur.name", Localizations.getLocalizedString(LocalizationStrings.DINO_PTEROSAUR));
        //LanguageRegistry.instance().addStringLocalization("entity.fossil.Plesiosaur.name", Localizations.getLocalizedString(LocalizationStrings.DINO_PLESIOSAUR));
        //LanguageRegistry.instance().addStringLocalization("entity.fossil.Mosasaurus.name", Localizations.getLocalizedString(LocalizationStrings.DINO_MOSASAURUS));
        //LanguageRegistry.instance().addStringLocalization("entity.fossil.Stegosaurus.name", Localizations.getLocalizedString(LocalizationStrings.DINO_STEGOSAURUS));
        //LanguageRegistry.instance().addStringLocalization("entity.fossil.Dilophosaurus.name", Localizations.getLocalizedString(LocalizationStrings.DINO_DILOPHOSAURUS));
        LanguageRegistry.instance().addStringLocalization("entity.fossil.PregnantSheep.name", Localizations.getLocalizedString(LocalizationStrings.ANIMAL_PREGNANT_SHEEP));
        LanguageRegistry.instance().addStringLocalization("entity.fossil.PregnantCow.name", Localizations.getLocalizedString(LocalizationStrings.ANIMAL_PREGNANT_COW));
        LanguageRegistry.instance().addStringLocalization("entity.fossil.PregnantPig.name", Localizations.getLocalizedString(LocalizationStrings.ANIMAL_PREGNANT_PIG));
        LanguageRegistry.instance().addStringLocalization("entity.fossil.Smilodon.name", Localizations.getLocalizedString(LocalizationStrings.ANIMAL_SMILODON));
        //LanguageRegistry.instance().addStringLocalization("entity.fossil.Brachiosaurus.name", Localizations.getLocalizedString(LocalizationStrings.DINO_BRACHIOSAURUS));
        LanguageRegistry.instance().addStringLocalization("entity.fossil.Mammoth.name", Localizations.getLocalizedString(LocalizationStrings.ANIMAL_MAMMOTH));
        LanguageRegistry.instance().addStringLocalization("entity.fossil.Dodo.name", Localizations.getLocalizedString(LocalizationStrings.ANIMAL_DODO));
//        LanguageRegistry.instance().addStringLocalization("entity.fossil.PregnantChicken.name", Localizations.getLocalizedString(LocalizationStrings.ANIMAL_PREGNANT_CHICKEN));
        //LanguageRegistry.instance().addStringLocalization("entity.fossil.Spinosaurus.name", Localizations.getLocalizedString(LocalizationStrings.DINO_SPINOSAURUS));

        
        
        for(int i=0;i<EnumDinoType.values().length;i++)
        	LanguageRegistry.instance().addStringLocalization("entity.fossil."+EnumDinoType.values()[i].name()+".name", Localizations.getLocalizedString("Dino."+EnumDinoType.values()[i].name()));
        
		//make the dino types complete by registering the dinos items
		EnumDinoType.init();
		EnumDinoFoodMob.init();

		
		GameRegistry.registerWorldGenerator(new FossilGenerator());
		GameRegistry.registerWorldGenerator(new TarGenerator());
		//GameRegistry.registerWorldGenerator(new WorldGenPalaeoraphe());//not needed?
		if(FossilOptions.Gen_Ships)
			GameRegistry.registerWorldGenerator(new WorldGenShips());
		if(FossilOptions.Gen_Academy)
			GameRegistry.registerWorldGenerator(new WorldGenAcademy());
		if(FossilOptions.Gen_Palaeoraphe)
			GameRegistry.registerWorldGenerator(new WorldGeneratorPalaeoraphe());
		GameRegistry.registerWorldGenerator(new WorldGenWeaponShop());
		GameRegistry.registerWorldGenerator(new WorldGeneratorVolcanicRock());
		
		NetworkRegistry.instance().registerChatListener(messagerHandler);
		NetworkRegistry.instance().registerGuiHandler(this, GH);
		NetworkRegistry.instance().registerChannel(this, "RiderInput");
		NetworkRegistry.instance().registerChannel(this, "PteroFlight");

		GameRegistry.registerTileEntity(TileEntityCultivate.class, LocalizationStrings.BLOCKCULTIVATEIDLE_NAME);
		GameRegistry.registerTileEntity(TileEntityAnalyzer.class, LocalizationStrings.BLOCKANALYZERIDLE_NAME);
		GameRegistry.registerTileEntity(TileEntityWorktable.class, LocalizationStrings.BLOCKWORKTABLEIDLE_NAME);
		GameRegistry.registerTileEntity(TileEntityDrum.class, LocalizationStrings.DRUM_NAME);
		GameRegistry.registerTileEntity(TileEntityFeeder.class, LocalizationStrings.TFEEDERIDLE_NAME);
		GameRegistry.registerTileEntity(TileEntityTimeMachine.class, LocalizationStrings.BLOCKTIMEMACHINE_NAME);
		
		TickRegistry.registerTickHandler(new RenderHUD(), Side.CLIENT);
		TickRegistry.registerTickHandler(new RenderHUD(), Side.SERVER);
		
		RenderingRegistry.registerBlockHandler(2303, RenderFeeder.INSTANCE);
		
		
		proxy.registerTileEntitySpecialRenderer();
        proxy.registerRenderThings();
        
	}
	
	/*public static void fillCreativeList()
    {
        int var2 = 0;
        int var0;

        for (var0 = 0; var0 < EnumDinoType.values().length; ++var0)
        {
            MultiTotalList[var2++] = new ItemStack(dna, 1, var0);
        }

        for (var0 = 0; var0 < EnumDinoType.values().length; ++var0)
        {
            MultiTotalList[var2++] = new ItemStack(ancientegg, 1, var0);
        }

        for (var0 = 0; var0 < EnumDinoType.values().length; ++var0)
        {
            MultiTotalList[var2++] = new ItemStack(rawDinoMeat, 1, var0);
        }

        int var1;

        for (var1 = 0; var1 < EnumAnimalType.values().length; ++var1)
        {
            MultiTotalList[var2++] = new ItemStack(animalDNA, 1, var1);
        }

        for (var1 = 0; var1 < EnumEmbyos.values().length; ++var1)
        {
            MultiTotalList[var2++] = new ItemStack(embyoSyringe, 1, var1);
        }

        for (var1 = 0; var1 < 2; ++var1)
        {
            MultiTotalList[var2++] = new ItemStack(chickenSoup, 1, var1);
        }

        SingleTotalList = new ItemStack[] {new ItemStack(blockFossil, 1, 0), new ItemStack(blockSkull, 1, 0), new ItemStack(skullLantern, 1, 0), new ItemStack(blockanalyzerIdle, 1, 0), new ItemStack(blockcultivateIdle, 1, 0), new ItemStack(blockworktableIdle, 1, 0), new ItemStack(ferns, 1, 0), new ItemStack(drum, 1, 0), new ItemStack(feederIdle, 1, 0), new ItemStack(blockPermafrost, 1, 0), new ItemStack(blockIcedStone, 1, 0)};
    }*/
	/*
    public static String GetLangTextByKey(String var0)
	{
		String var1 = LangProps.getProperty(var0, "");
		if(var1=="" && DebugMode)
				System.err.println("Error finding language key entry: " + var0);
		//if(var1=="")
		//	var1="--Empty--";
		return var1;
	}
	*/

	public static void ShowMessage(String var0, EntityPlayer var1)
	{
			if (var1 != null)
			{
				//var1.getTranslator().currentLanguage==>Use to give each Player the language messages he needs if possible
    			var1.addChatMessage(var0);
			}
	}

	public static void DebugMessage(String var0)
	{
			 if (DebugMode)
		{
    			System.out.println(var0);
		}
	}

	/*public static int EnumToInt(EnumOrderType var0)
	{// NOT NEEDED BY ANYONE==>USE .ordinal
			return var0.ToInt();
	}*/
    


	/*private static void UTF8Reader(Properties var0)
	{
		System.out.println("LANGUAGE: "+Minecraft.getMinecraft().gameSettings.language);

		try
		{
			//InputStream i0=Fossil.class.getResourceAsStream(file);
			//BufferedReader var2 = new BufferedReader(new InputStreamReader(Fossil.class.getResourceAsStream(file), "UTF-8"));
			BufferedReader var2 = new BufferedReader(new FileReader(file));
			for (String var3 = var2.readLine(); var3 != null; var3 = var2.readLine())//"/Fossillang/" + var1 + ".lang"
			{
	    		var3 = var3.trim();
	
	    		if (!var3.startsWith("#"))
	    		{
	        		String[] var4 = var3.split("=");
	        		if (var4 != null && var4.length == 2)
	        		{
	        			var0.setProperty(var4[0], var4[1]);
	        			if(Fossil.DebugMode)
	        				System.out.println("SUCCESS: "+var4[0]+" added");
	        		}
	    		}
			}
		}
		catch(IOException e)
		{
			System.err.println("Error loading language file: " + e.getMessage());
		}
	}*/

	/*private void SetupOptions()
	{
		boolean var1 = false;

		try
		{
			Properties var2 = FossilCfgLoader.loadOptionConfig();
			Properties var3 = new Properties();

			if (var2 != null)
			{
				String var4;

				if (var2.containsKey("AnuSpawn") && !var1)
				{
					var4 = var2.getProperty("AnuSpawn");

					if (FossilOptions.isNegtiveWord(var4))
					{
						FossilOptions.ShouldAnuSpawn = false;
					}
				}

				if (var2.containsKey("SpawnShipWrecks") && !var1)
				{
					var4 = var2.getProperty("SpawnShipWrecks");

					if (FossilOptions.isNegtiveWord(var4))
					{
						FossilOptions.SpawnShipwrecks = false;
					}
				}

        if (var2.containsKey("SpawnWeaponShop") && !var1)
        {
            var4 = var2.getProperty("SpawnWeaponShop");

            if (FossilOptions.isNegtiveWord(var4))
            {
                FossilOptions.SpawnWeaponShop = false;
            }
        }

        if (var2.containsKey("SpawnAcademy") && !var1)
        {
            var4 = var2.getProperty("SpawnAcademy");

            if (FossilOptions.isNegtiveWord(var4))
            {
                FossilOptions.SpawnAcademy = false;
            }
        }

        if (var2.containsKey("DinoGrows") && !var1)
        {
            var4 = var2.getProperty("DinoGrows");

            if (FossilOptions.isNegtiveWord(var4))
            {
                FossilOptions.DinoGrows = false;
            }
        }

        if (var2.containsKey("DinoHunger") && !var1)
        {
            var4 = var2.getProperty("DinoHunger");

            if (FossilOptions.isNegtiveWord(var4))
            {
                FossilOptions.DinoHunger = false;
            }
        }

        if (var2.containsKey("TRexBreakingBlocks") && !var1)
        {
            var4 = var2.getProperty("TRexBreakingBlocks");

            if (FossilOptions.isNegtiveWord(var4))
            {
                FossilOptions.TRexBreakingBlocks = false;
            }
        }

        if (var2.containsKey("BraBreakingBlocks") && !var1)
        {
            var4 = var2.getProperty("BraBreakingBlocks");

            if (FossilOptions.isNegtiveWord(var4))
            {
                FossilOptions.BraBreakingBlocks = false;
            }
        }
    }

    var3.setProperty("AnuSpawn", FossilOptions.ShouldAnuSpawn ? "true" : "false");
    var3.setProperty("SpawnShipWrecks", FossilOptions.SpawnShipwrecks ? "true" : "false");
    var3.setProperty("SpawnWeaponShop", FossilOptions.SpawnWeaponShop ? "true" : "false");
    var3.setProperty("SpawnAcademy", FossilOptions.SpawnAcademy ? "true" : "false");
    var3.setProperty("DinoGrows", FossilOptions.DinoGrows ? "true" : "false");
    var3.setProperty("DinoHunger", FossilOptions.DinoHunger ? "true" : "false");
    var3.setProperty("TRexBreakingBlocks", FossilOptions.TRexBreakingBlocks ? "true" : "false");
    var3.setProperty("BraBreakingBlocks", FossilOptions.BraBreakingBlocks ? "true" : "false");
    var3.setProperty("PalaeorapheSpawn", FossilOptions.PalaeorapheSpawn ? "true" : "false");
    FossilCfgLoader.saveOptionConfig(var3);
    
		}
		catch (IOException var5)
		{
			;
		}
	}*/

	/*public static String GetEmbyoName(EnumEmbyos var0)
	{
		String var1 = "";

		switch (var0.ordinal())
		{
        	case 1:
        	case 2:
        	case 3:
            var1 = " " + StringTranslate.getInstance().translateNamedKey("entity." + var0.toString()).toString();
            break;

        	default:
            var1 = GetLangTextByKey("AnimalType." + var0.toString());
		}

		return var1;
	}*/
	
	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		Item.itemsList[palaeSingleSlab.blockID] = (new ItemSlab(palaeSingleSlab.blockID - 256, (BlockHalfSlab)palaeSingleSlab, (BlockHalfSlab)palaeDoubleSlab, false));
        Item.itemsList[ancientWoodSingleSlab.blockID] = (new ItemSlab(ancientWoodSingleSlab.blockID - 256, (BlockHalfSlab)ancientWoodSingleSlab, (BlockHalfSlab)ancientWoodDoubleSlab, false));
        Item.itemsList[ancientStoneSingleSlab.blockID] = (new ItemSlab(ancientStoneSingleSlab.blockID - 256, (BlockHalfSlab)ancientStoneSingleSlab, (BlockHalfSlab)ancientStoneDoubleSlab, false));
	}

	@Override
	public void onPacketData(INetworkManager manager,Packet250CustomPayload packet, Player player)
	{
		if("RiderInput".equals(packet.channel))
		{
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(packet.data));
			try
	        {
				int EntityID = in.readInt();
				float Strafe = in.readFloat();
				float Forward = in.readFloat();
				boolean Jump = in.readBoolean();
				boolean Sneak = in.readBoolean();
				Entity E0 =((EntityPlayerMP)player).worldObj.getEntityByID(EntityID);
				if(E0 instanceof EntityDinosaur)
				{
					((EntityDinosaur) E0).RiderForward=Forward;
					((EntityDinosaur) E0).RiderJump=Jump;
					((EntityDinosaur) E0).RiderStrafe=Strafe;
					((EntityDinosaur) E0).RiderSneak=Sneak;
				}
	        }
	        catch (IOException e)
	        {
	            throw new RuntimeException(e);
	        }
		}
		if("PteroFlight".equals(packet.channel))
		{
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(packet.data));
			try
	        {
				int EntityID = in.readInt();
				float Angle = in.readFloat();
				float Pitch = in.readFloat();
				float Wing = in.readFloat();
				
				Entity E0 =((EntityClientPlayerMP)player).worldObj.getEntityByID(EntityID);
				if(E0 instanceof EntityPterosaur)
				{
					((EntityPterosaur)E0).AirAngle=Angle;
					((EntityPterosaur)E0).AirPitch=Pitch;
					((EntityPterosaur)E0).WingState=Wing;
					//System.out.println("CLIENT:"+String.valueOf(Wing));
				}
	        }
	        catch (IOException e)
	        {
	            throw new RuntimeException(e);
	        }
		}
		/*if("DinoHealth".equals(packet.channel))ISNT NEEDED, DATAWATCHER USED FOR THAT
		{
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(packet.data));
			try
	        {
				int EntityID = in.readInt();
				int ServerHealth = in.readInt();
				
				Entity E0 =((EntityClientPlayerMP)player).worldObj.getEntityByID(EntityID);
				if(E0 instanceof EntityDinosaur)
					((EntityDinosaur) E0).setEntityHealth(ServerHealth);
	        }
	        catch (IOException e)
	        {
	            throw new RuntimeException(e);
	        }
		}*/
		/*if("RiddenPos".equals(packet.channel))ISNT NEEDED, REPLACED BY USE OF TELEPORT PACKAGE
		{
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(packet.data));
			try
	        {
				int EntityID = in.readInt();
				double posX  = in.readDouble();
				double posY  = in.readDouble();
				double posZ  = in.readDouble();
				float Yaw    = in.readFloat();
				float Pitch  = in.readFloat();
				
				Entity E0 =((EntityClientPlayerMP)player).worldObj.getEntityByID(EntityID);
				E0.setPositionAndRotation(posX, posY, posZ, Yaw, Pitch);
	        }
	        catch (IOException e)
	        {
	            throw new RuntimeException(e);
	        }
		}*/
	}
}
