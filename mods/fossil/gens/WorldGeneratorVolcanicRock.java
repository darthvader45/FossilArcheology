package mods.fossil.gens;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorVolcanicRock implements IWorldGenerator 
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId)
		  {
		   case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		   case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		  }		
	}
	private void generateSurface(World world, Random random, int blockX, int blockZ) 
    {
		for(int x = 0;x<2;x++)
		{
			int i = blockX + random.nextInt(16);
			int k = blockZ + random.nextInt(16);
			int j = world.getHeightValue(i, k);
	        (new WorldGenVolcanicRock()).generate(world, random, i, j, k);
	    }
	}
	private void generateNether(World world, Random random, int blockX, int blockZ) 
	{
			  
	}
}