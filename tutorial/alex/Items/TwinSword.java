/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemSword;
/*    */ import tutorial.alex.alex;
/*    */ 
/*    */ public class TwinSword extends ItemSword
/*    */ {
/*    */   public TwinSword(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.TWIN);
/* 12 */     setUnlocalizedName("twinSword");
/* 13 */     setCreativeTab(alex.tabGodcraft);
/* 14 */     setTextureName("alexmodid:twinsword");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.TwinSword
 * JD-Core Version:    0.6.0
 */