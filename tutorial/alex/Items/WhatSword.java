/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemSword;
/*    */ import tutorial.alex.alex;
/*    */ 
/*    */ public class WhatSword extends ItemSword
/*    */ {
/*    */   public WhatSword(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.WHAT);
/* 12 */     setUnlocalizedName("whatSword");
/* 13 */     setCreativeTab(alex.tabGodcraft);
/* 14 */     setTextureName("alexmodid:whatsword");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.WhatSword
 * JD-Core Version:    0.6.0
 */