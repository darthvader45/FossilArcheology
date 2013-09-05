package mods.fossil.config;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.EntityRegistry;

public class FossilConfig {

	public static boolean isInMetric = true;

	public static Configuration config;

	public static void loadConfig(Configuration configuration) {
		config = configuration;
		FossilBlocks.load(config);
		config.save();

		FossilBlocks.addNames();
		FossilBlocks.registerBlocks();
	}

}