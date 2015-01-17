/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemSpade;
/*    */ import tutorial.alex.AlexMainRegistry;
/*    */ 
/*    */ public class WhatShovel extends ItemSpade
/*    */ {
/*    */   public WhatShovel(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.WHAT);
/* 12 */     setUnlocalizedName("whatShovel");
/* 13 */     setCreativeTab(AlexMainRegistry.tabGodcraft);
/* 14 */     setTextureName("alexmodid:whatshovel");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.WhatShovel
 * JD-Core Version:    0.6.0
 */