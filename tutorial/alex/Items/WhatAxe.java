/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemAxe;
/*    */ import tutorial.alex.alex;
/*    */ 
/*    */ public class WhatAxe extends ItemAxe
/*    */ {
/*    */   public WhatAxe(Item.ToolMaterial material)
/*    */   {
/* 10 */     super(AlexItemLoader.WHAT);
/* 11 */     setUnlocalizedName("whatAxe");
/* 12 */     setCreativeTab(alex.tabGodcraft);
/* 13 */     setTextureName("alexmodid:whataxe");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.WhatAxe
 * JD-Core Version:    0.6.0
 */