/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemSpade;
/*    */ import tutorial.alex.alex;
/*    */ 
/*    */ public class UunShovel extends ItemSpade
/*    */ {
/*    */   public UunShovel(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.UUN);
/* 12 */     setUnlocalizedName("uunShovel");
/* 13 */     setCreativeTab(alex.tabGodcraft);
/* 14 */     setTextureName("alexmodid:uunshovel");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.UunShovel
 * JD-Core Version:    0.6.0
 */