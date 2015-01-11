package tutorial.alex;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class MyGenerator implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for(int k = 0; k < 17; k++){
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
        	int firstBlockYCoord = rand.nextInt(48);
        	int firstBlockZCoord = chunkZ + rand.nextInt(16);
        	
        	(new WorldGenMinable(alex.alchemizedOre, 6)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        	
        	for(int g = 0; g < 17; g++){
            	int firstBlockXCooord = chunkX + rand.nextInt(16);
            	int firstBlockYCooord = rand.nextInt(24);
            	int firstBlockZCooord = chunkZ + rand.nextInt(16);
            	
            	(new WorldGenMinable(alex.unstableOre, 3)).generate(world, rand, firstBlockXCooord, firstBlockYCooord, firstBlockZCooord);
        	
        }}
	}

	private void generateNether(World world, Random rand, int chunkX, int chunkZ) {}
}