/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemPickaxe;
/*    */ import tutorial.alex.AlexMainRegistry;
/*    */ 
/*    */ public class UunPick extends ItemPickaxe
/*    */ {
/*    */   public UunPick(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.UUN);
/* 12 */     setUnlocalizedName("uunPick");
/* 13 */     setCreativeTab(AlexMainRegistry.tabGodcraft);
/* 14 */     setTextureName("alexmodid:uunpick");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.UunPick
 * JD-Core Version:    0.6.0
 */