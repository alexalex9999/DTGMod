/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemSword;
/*    */ import tutorial.alex.alex;
/*    */ 
/*    */ public class UunSword extends ItemSword
/*    */ {
/*    */   public UunSword(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.UUN);
/* 12 */     setUnlocalizedName("uunSword");
/* 13 */     setCreativeTab(alex.tabGodcraft);
/* 14 */     setTextureName("alexmodid:uunsword");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.UunSword
 * JD-Core Version:    0.6.0
 */