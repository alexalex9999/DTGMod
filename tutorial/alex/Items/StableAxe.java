/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemAxe;
/*    */ import tutorial.alex.AlexMainRegistry;
/*    */ 
/*    */ public class StableAxe extends ItemAxe
/*    */ {
/*    */   public StableAxe(Item.ToolMaterial material)
/*    */   {
/* 10 */     super(AlexItemLoader.ALCHEMIZED);
/* 11 */     setUnlocalizedName("alchemizedAxe");
/* 12 */     setCreativeTab(AlexMainRegistry.tabGodcraft);
/* 13 */     setTextureName("alexmodid:stableaxe");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.StableAxe
 * JD-Core Version:    0.6.0
 */