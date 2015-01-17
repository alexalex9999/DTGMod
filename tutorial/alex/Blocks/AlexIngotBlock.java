/*    */ package tutorial.alex.Blocks;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.block.material.Material;
/*    */ import tutorial.alex.AlexMainRegistry;
/*    */ 
/*    */ public class AlexIngotBlock extends Block
/*    */ {
/*    */   public AlexIngotBlock()
/*    */   {
/* 11 */     super(Material.iron);
/* 12 */     setHardness(4.0F);
/* 13 */     setStepSound(Block.soundTypeMetal);
/* 14 */     setBlockName("AlchemizedBlock");
/* 15 */     setCreativeTab(AlexMainRegistry.tabGodcraft);
/* 16 */     setHarvestLevel("pickaxe", 1);
/* 17 */     setBlockTextureName("alexmodid:stableblock");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Blocks.AlexIngotBlock
 * JD-Core Version:    0.6.0
 */