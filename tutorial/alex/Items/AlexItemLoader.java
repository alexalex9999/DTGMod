package tutorial.alex.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import tutorial.alex.alex;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class AlexItemLoader {
	public static Item alexItem;
    public static Item alexIngot;
	public static Item bookIngot;
	public static Item alchemizedAxe;
	public static Item alchemizedShovel;
	public static Item alchemizedPickaxe;
	public static Item alchemizedSword;
	public static Item bookPick;
	public static Item bookSword;
	public static Item bookAxe;
	public static Item bookShovel;
	public static Item twinSword;
	public static Item uunIngot;
	public static Item uunAxe;
	public static Item uunSword;
	public static Item uunPick;
	public static Item uunShovel;
	public static Item whatAxe;
	public static Item whatSword;
	public static Item whatPick;
	public static Item whatShovel;
	public static Item whatIngot;
	public static Item sassy;
	
	public static final Item.ToolMaterial ALCHEMIZED = EnumHelper.addToolMaterial("ALCHEMIZED", 2, 413, 7.0F, 1.5F, 7);
	public static final Item.ToolMaterial UNSTABLE = EnumHelper.addToolMaterial("UNSTABLE", 3, 1000, 4.0F, 3.0F, 30);
	public static final Item.ToolMaterial BOOK = EnumHelper.addToolMaterial("BOOK", 2, 2000, 0.25F, 0.25F, 100);
	public static final Item.ToolMaterial TWIN = EnumHelper.addToolMaterial("TWIN", 4, 100000, 10.0F, 5.0F, 125);
	public static final Item.ToolMaterial UUN = EnumHelper.addToolMaterial("UUN", 3, 10000, 7.0F, 3.0F, 8);
	public static final Item.ToolMaterial WHAT = EnumHelper.addToolMaterial("WHAT", 4, 1413, 8.0F, 4.5F, 37);
	
	public static void mainRegistry(){
		initializeItem();
		registerItem();
		AlexSuppliesLoader.mainRegistry();
	}

	public static void initializeItem() {
		alexItem = new AlexItem(5000).setCreativeTab(alex.tabGodcraft).setTextureName("alexmodid:unstable");
		alexIngot = new AlexIngot();
		uunIngot = new UunIngot();
		alchemizedAxe = new StableAxe(null);
		alchemizedShovel = new StableShovel(null);
		alchemizedPickaxe = new StablePickaxe(null);
		alchemizedSword = new StableSword(null);
		twinSword = new TwinSword(null);
		bookIngot = new BookIngot();
		bookPick = new BookPick(null);
		bookSword = new BookSword(null);
		bookAxe = new BookAxe(null);
		bookShovel = new BookShovel(null);
		sassy = new SassaBook();
		uunSword = new UunSword(null);
		uunAxe = new UunAxe(null);
		uunPick = new UunPick(null);
		uunShovel = new UunShovel(null);
		whatAxe = new WhatAxe(null);
		whatPick = new WhatPick(null);
		whatShovel = new WhatShovel(null);
		whatSword = new WhatSword(null);
		whatIngot = new WhatIngot();
		
	}

	public static void registerItem() {
		GameRegistry.registerItem(alexItem, "alexItem");
		GameRegistry.registerItem(alexIngot, "alexIngot");
		GameRegistry.registerItem(alchemizedAxe, "alchemizedAxe");
		GameRegistry.registerItem(alchemizedShovel, "alchemizedShovel");
		GameRegistry.registerItem(alchemizedPickaxe, "alchemizedPickaxe");
		GameRegistry.registerItem(alchemizedSword, "alchemizedSword");
		GameRegistry.registerItem(twinSword, "twinSword");
		GameRegistry.registerItem(bookIngot, "bookIngot");
		GameRegistry.registerItem(bookPick, "bookPick");
		GameRegistry.registerItem(bookSword, "bookSword");
		GameRegistry.registerItem(sassy, "sassy");
		GameRegistry.registerItem(bookAxe, "bookAxe");
		GameRegistry.registerItem(uunIngot, "uunIngot");
		GameRegistry.registerItem(bookShovel, "booxShovel");
		GameRegistry.registerItem(uunSword, "uunSword");
		GameRegistry.registerItem(uunAxe, "uunAxe");
		GameRegistry.registerItem(uunPick, "uunPick");
		GameRegistry.registerItem(uunShovel, "uunShovel");
		GameRegistry.registerItem(uunSword, "uunSword");
		GameRegistry.registerItem(whatAxe, "whatAxe");
		GameRegistry.registerItem(whatPick, "whatPick");
		GameRegistry.registerItem(whatShovel, "whatShovel");
		GameRegistry.registerItem(whatSword, "whatSword");
		GameRegistry.registerItem(whatIngot, "whatIngot");
		
	}
}
