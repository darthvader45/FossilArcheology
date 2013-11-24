package mods.fossil.gens.structure.academy;

import java.sql.Struct;
import java.util.Random;

import mods.fossil.Fossil;
import mods.fossil.fossilEnums.EnumDinoType;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBeach;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.biome.BiomeGenJungle;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.biome.BiomeGenRiver;
import net.minecraft.world.biome.BiomeGenSnow;
import net.minecraft.world.biome.BiomeGenSwamp;
import net.minecraft.world.biome.BiomeGenTaiga;
import net.minecraftforge.common.ChestGenHooks;

public class AcademyUtil {
	
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int CUSTOM_CHEST = 4097, CUSTOM_DISPENSER = 4098, ITEM_FRAME = 4099, PAINTING = 4100,
			SPAWN_VILLAGER = 4101, CUSTOM_SKULL = 4102, CUSTOM_SIGNWALL = 4103, CUSTOM_SIGNPOST = 4104,
			RANDOM_HOLE = 4105, RANDOM_HOLE_L2 = 4106, RANDOM_HOLE_L3 = 4107, BIOME_BLOCK = 4108;

	/** Start of specific chests; I'll use negative values so as not to conflict with item types and such */
	public static final int RARE_LOOT_1 = -1;

	/** Custom signs */
	public static final int CUSTOM_SIGN_1 = 1;

	


	
}
