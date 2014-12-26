/*    */ package tutorial.alex.Render;
/*    */ 
/*    */ import cpw.mods.fml.common.IWorldGenerator;

/*    */ import java.util.Random;

/*    */ import net.minecraft.world.World;
/*    */ import net.minecraft.world.WorldProvider;
/*    */ import net.minecraft.world.chunk.IChunkProvider;
/*    */ import net.minecraft.world.gen.feature.WorldGenMinable;
/*    */ import tutorial.alex.alex;
import tutorial.alex.Blocks.AlexBlockLoader;
/*    */ 
/*    */ public class MyGenerator
/*    */   implements IWorldGenerator
/*    */ {
/*    */   public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
/*    */   {
/* 16 */     switch (world.provider.dimensionId) {
/*    */     case 0:
/* 18 */       generateSurface(world, random, chunkX * 16, chunkZ * 16);
/*    */     }
/*    */   }
/*    */ 
/*    */   private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {
/*    */   }
/*    */ 
/*    */   private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
/* 26 */     for (int k = 0; k < 17; k++) {
/* 27 */       int firstBlockXCoord = chunkX + rand.nextInt(16);
/* 28 */       int firstBlockYCoord = rand.nextInt(48);
/* 29 */       int firstBlockZCoord = chunkZ + rand.nextInt(16);
/*    */ 
/* 31 */       new WorldGenMinable(AlexBlockLoader.alchemizedOre, 6).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
/*    */       int firstBlockZCooord;
/* 33 */       for (int g = 0; g < 17; g++) {
/* 34 */         int firstBlockXCooord = chunkX + rand.nextInt(16);
/* 35 */         int firstBlockYCooord = rand.nextInt(24);
/* 36 */         firstBlockZCooord = chunkZ + rand.nextInt(16);
/*    */ 
/* 38 */         new WorldGenMinable(AlexBlockLoader.unstableOre, 3).generate(world, rand, firstBlockXCooord, firstBlockYCooord, firstBlockZCooord);
/*    */       }
/* 40 */       new WorldGenMinable(AlexBlockLoader.uunOre, 6).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
/*    */ 
/* 42 */       for (int g = 0; g < 13; g++) {
/* 43 */         int firstBlockXCooord = chunkX + rand.nextInt(16);
/* 44 */         int firstBlockYCooord = rand.nextInt(14);
/* 45 */         firstBlockZCooord = chunkZ + rand.nextInt(16);
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   private void generateNether(World world, Random rand, int chunkX, int chunkZ)
/*    */   {
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Render.MyGenerator
 * JD-Core Version:    0.6.0
 */