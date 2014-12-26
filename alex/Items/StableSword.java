/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemSword;
/*    */ import tutorial.alex.alex;
/*    */ 
/*    */ public class StableSword extends ItemSword
/*    */ {
/*    */   public StableSword(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.ALCHEMIZED);
/* 12 */     setUnlocalizedName("alchemizedSword");
/* 13 */     setCreativeTab(alex.tabGodcraft);
/* 14 */     setTextureName("alexmodid:stablesword");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.StableSword
 * JD-Core Version:    0.6.0
 */