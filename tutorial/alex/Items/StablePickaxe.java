/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemPickaxe;
/*    */ import tutorial.alex.alex;
/*    */ 
/*    */ public class StablePickaxe extends ItemPickaxe
/*    */ {
/*    */   public StablePickaxe(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.ALCHEMIZED);
/* 12 */     setUnlocalizedName("alchemizedPickaxe");
/* 13 */     setCreativeTab(alex.tabGodcraft);
/* 14 */     setTextureName("alexmodid:stablepick");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.StablePickaxe
 * JD-Core Version:    0.6.0
 */