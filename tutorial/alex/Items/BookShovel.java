/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemSpade;
/*    */ import tutorial.alex.AlexMainRegistry;
/*    */ 
/*    */ public class BookShovel extends ItemSpade
/*    */ {
/*    */   public BookShovel(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.BOOK);
/* 12 */     setUnlocalizedName("bookShovel");
/* 13 */     setCreativeTab(AlexMainRegistry.tabGodcraft);
/* 14 */     setTextureName("alexmodid:bookshovel");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.BookShovel
 * JD-Core Version:    0.6.0
 */