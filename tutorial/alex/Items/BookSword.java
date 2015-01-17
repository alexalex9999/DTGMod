/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemSword;
/*    */ import tutorial.alex.AlexMainRegistry;
/*    */ 
/*    */ public class BookSword extends ItemSword
/*    */ {
/*    */   public BookSword(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.BOOK);
/* 12 */     setUnlocalizedName("bookSword");
/* 13 */     setCreativeTab(AlexMainRegistry.tabGodcraft);
/* 14 */     setTextureName("alexmodid:booksword");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.BookSword
 * JD-Core Version:    0.6.0
 */