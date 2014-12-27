package tutorial.alex;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import tutorial.alex.Blocks.AlexBlockLoader;
import tutorial.alex.Items.AlexItemLoader;

public class AlexCraftingManager {
	public static ItemStack diamondsStack = new ItemStack(Items.diamond);
	public static ItemStack obsidianStack = new ItemStack(Blocks.obsidian);
	public static ItemStack alexIngotStack = new ItemStack(AlexItemLoader.alexIngot);
	public static ItemStack bookStack = new ItemStack(Items.book);
	public static ItemStack alexItemStack = new ItemStack(AlexItemLoader.alexItem);
	public static ItemStack alchemizedOreStack = new ItemStack(AlexBlockLoader.alchemizedOre);
	public static ItemStack alchemizedBlockStack = new ItemStack(AlexBlockLoader.alexIngotBlock);
	public static ItemStack bookIngotStack = new ItemStack(AlexItemLoader.bookIngot);
	public static ItemStack stickStack = new ItemStack(Items.stick);
	public static ItemStack bedrockStack = new ItemStack(Blocks.bedrock);
	public static ItemStack twinswordStack = new ItemStack(AlexItemLoader.twinSword);
	public static ItemStack uunStack = new ItemStack(AlexItemLoader.uunIngot);
	public static ItemStack uunoreStack = new ItemStack(AlexBlockLoader.uunOre);
	
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}

	public static void addCraftingRec() {
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.alexIngot), new Object[] { " x ", "xyx", " x ", 
			Character.valueOf('x'), diamondsStack, Character.valueOf('y'), obsidianStack });
		GameRegistry.addSmelting(AlexBlockLoader.uunOre, new ItemStack(AlexItemLoader.uunIngot), 2.0F);
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.alexIngot), new Object[] { "xxx", "xxx", "xxx", 
			Character.valueOf('x'), alexItemStack });
		GameRegistry.addSmelting(AlexBlockLoader.alchemizedOre, new ItemStack(AlexItemLoader.alexIngot), 2.0F);
		GameRegistry.addRecipe(new ItemStack(AlexBlockLoader.alexIngotBlock), new Object[] { "xxx", "xxx", "xxx", Character.valueOf('x'), alexIngotStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.bookIngot), new Object[] { "xxx", "xyx", "xxx", Character.valueOf('x'), bookStack, Character.valueOf('y'), alexIngotStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.bookAxe), new Object[] { "xx ", "xy ", " y ", Character.valueOf('x'), bookIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.bookAxe), new Object[] { " xx", " yx", " y ", Character.valueOf('x'), bookIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.bookSword), new Object[] { " x ", " x ", " y ", Character.valueOf('x'), bookIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.bookPick), new Object[] { "xxx", " y ", " y ", Character.valueOf('x'), bookIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.bookShovel), new Object[] { " x ", " y ", " y ", Character.valueOf('x'), bookIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.bookShovel), new Object[] { "x  ", "y  ", "y  ", Character.valueOf('x'), bookIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.bookShovel), new Object[] { "  x", "  y", "  y", Character.valueOf('x'), bookIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.alchemizedAxe), new Object[] { "xx ", "xy ", " y ", Character.valueOf('x'), alexIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.alchemizedAxe), new Object[] { " xx", " yx", " y ", Character.valueOf('x'), alexIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.alchemizedSword), new Object[] { " x ", " x ", " y ", Character.valueOf('x'), alexIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.alchemizedPickaxe), new Object[] { "xxx", " y ", " y ", Character.valueOf('x'), alexIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.alchemizedShovel), new Object[] { " x ", " y ", " y ", Character.valueOf('x'), alexIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.alchemizedShovel), new Object[] { "x  ", "y  ", "y  ", Character.valueOf('x'), alexIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.alchemizedShovel), new Object[] { "  x", "  y", "  y", Character.valueOf('x'), alexIngotStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.uunAxe), new Object[] { "xx ", "xy ", " y ", Character.valueOf('x'), uunStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.uunAxe), new Object[] { " xx", " yx", " y ", Character.valueOf('x'), uunStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.uunShovel), new Object[] { " x ", " y ", " y ", Character.valueOf('x'), uunStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.uunSword), new Object[] { " x ", " x ", " y ", Character.valueOf('x'), uunStack, Character.valueOf('y'), stickStack });
		GameRegistry.addRecipe(new ItemStack(AlexItemLoader.uunPick), new Object[] { "xxx", " y ", " y ", Character.valueOf('x'), uunStack, Character.valueOf('y'), stickStack });
		
	}

	public static void addSmeltingRec() {
		// TODO Auto-generated method stub
		
	}

}
