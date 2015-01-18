/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemAxe;
/*    */ import tutorial.alex.AlexMainRegistry;
/*    */ 
/*    */ public class BookAxe extends ItemAxe
/*    */ {
/*    */   public BookAxe(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.BOOK);
/* 12 */     setUnlocalizedName("bookAxe");
/* 13 */     setCreativeTab(AlexMainRegistry.tabGodcraft);
/* 14 */     setTextureName("alexmodid:bookaxe");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.BookAxe
 * JD-Core Version:    0.6.0
 */