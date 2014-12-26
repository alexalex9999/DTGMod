/*    */ package tutorial.alex.Items;
/*    */ 
/*    */ import net.minecraft.item.Item;
		 import net.minecraft.item.Item.ToolMaterial;
/*    */ import net.minecraft.item.ItemPickaxe;
/*    */ import tutorial.alex.alex;
/*    */ 
/*    */ public class WhatPick extends ItemPickaxe
/*    */ {
/*    */   public WhatPick(Item.ToolMaterial material)
/*    */   {
/* 11 */     super(AlexItemLoader.WHAT);
/* 12 */     setUnlocalizedName("whatPick");
/* 13 */     setCreativeTab(alex.tabGodcraft);
/* 14 */     setTextureName("alexmodid:whatpick");
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Items.WhatPick
 * JD-Core Version:    0.6.0
 */