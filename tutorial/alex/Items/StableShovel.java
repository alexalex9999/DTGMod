/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemSpade;
/*    */ import tutorial.alex.alex;
/*    */ 
/*    */ public class StableShovel extends ItemSpade
/*    */ {
/*    */   public StableShovel(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.ALCHEMIZED);
/* 12 */     setUnlocalizedName("alchemizedShovel");
/* 13 */     setCreativeTab(alex.tabGodcraft);
/* 14 */     setTextureName("alexmodid:stableshovel");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.StableShovel
 * JD-Core Version:    0.6.0
 */