/*    */ package tutorial.alex.Blocks;
/*    */ 
/*    */ import java.util.Random;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import net.minecraft.item.Item;
/*    */ import tutorial.alex.AlexMainRegistry;
/*    */ 
/*    */ public class AlchemizedOre extends Block
/*    */ {
/*    */   public AlchemizedOre()
/*    */   {
/* 14 */     super(Material.rock);
/* 15 */     setHardness(3.5F);
/* 16 */     setStepSound(Block.soundTypeStone);
/* 17 */     setBlockName("alchemizedOre");
/* 18 */     setCreativeTab(AlexMainRegistry.tabGodcraft);
/* 19 */     setHarvestLevel("pickaxe", 2);
/* 20 */     setBlockTextureName("alexmodid:stablealchemized");
/*    */   }
/*    */ 
/*    */   public Item getItemDropped(int metadata, Random random, int fortune)
/*    */   {
/* 26 */     return Item.getItemFromBlock(AlexBlockLoader.alchemizedOre);
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Blocks.AlchemizedOre
 * JD-Core Version:    0.6.0
 */