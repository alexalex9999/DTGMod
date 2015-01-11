/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemPickaxe;
/*    */ import tutorial.alex.alex;
/*    */ 
/*    */ public class BookPick extends ItemPickaxe
/*    */ {
/*    */   public BookPick(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.BOOK);
/* 12 */     setUnlocalizedName("bookPick");
/* 13 */     setCreativeTab(alex.tabGodcraft);
/* 14 */     setTextureName("alexmodid:bookpick");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.BookPick
 * JD-Core Version:    0.6.0
 */