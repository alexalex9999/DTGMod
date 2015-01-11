package tutorial.alex;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid=alex.MODID, name="DTG", version= alex.VERSION)
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class alex {

	public static final String MODID = "alexmodid";
	public static final String VERSION = "0.1.0";
	public static Item alexItem;
	public static Item alexIngot;
	public static Item bookIngot;
	public static Block alexIngotBlock;
	public static Block unstableOre;
	public static Block alchemizedOre;
	public static Item alchemizedAxe;
	public static Item alchemizedShovel;
	public static Item alchemizedPickaxe;
	public static Item alchemizedSword;
	public static Item bookPick;
	public static Item bookSword;
	public static Item bookAxe;
	public static Item bookShovel;
	public static Item twinSword;
		
	public static CreativeTabs tabGodcraft = new CreativeTabs("tabGodcraft")
	{
	public Item getTabIconItem()
	{
	return Items.diamond;
	}
	};
	public static final Item.ToolMaterial ALCHEMIZED = EnumHelper.addToolMaterial("ALCHEMIZED", 2, 413, 7.0F, 1.5F, 7);
	public static final Item.ToolMaterial UNSTABLE = EnumHelper.addToolMaterial("UNSTABLE", 3, 1000, 4.0F, 3.0F, 30);
	public static final Item.ToolMaterial BOOK = EnumHelper.addToolMaterial("BOOK", 2, 2000, 0.25F, 0.25F, 100);
	public static final Item.ToolMaterial TWIN = EnumHelper.addToolMaterial("TWIN", 4, -1, 10.0F, 5.0F, 500);
	

	
	
      // The instance of your mod that Forge uses.
      @Instance(value = "alexmodid")
      public static alex instance;
      
      public boolean isAIEnabled()
      {
      	 return true;
      }
      
      public static void registerEntity(Class entityClass, String name)
      {
      int entityID = EntityRegistry.findGlobalUniqueEntityId();
      long seed = name.hashCode();
      Random rand = new Random(seed);
      int primaryColor = rand.nextInt() * 16777215;
      int secondaryColor = rand.nextInt() * 16777215;

      EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
      EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
      EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
      }
      
      
      @SidedProxy(clientSide="tutorial.alex.client.ClientProxy", serverSide="tutorial.alex.CommonProxy")
      public static CommonProxy proxy;
      
      @EventHandler // used in 1.6.2
      //@PreInit    // used in 1.5.2
      public void load(FMLPreInitializationEvent event) {
    	  registerEntity(EntityTest.class, "entityTest");
    	  registerEntity(EntityTwin.class, "entityTwin");
       alexItem = new AlexItem(5000).setCreativeTab(tabGodcraft).setTextureName(MODID + ":" + "unstable");
    	  GameRegistry.registerItem(alexItem, "alexItem");
    	  alexIngot = new AlexIngot().setCreativeTab(tabGodcraft).setTextureName(MODID + ":" + "stable");
    	  alexIngotBlock = new AlexIngotBlock();
    	  alchemizedOre = new AlchemizedOre();
    	  unstableOre = new UnstableOre();
    	  GameRegistry.registerItem(alexIngot, "alexIngot");  
    	  GameRegistry.registerBlock(alexIngotBlock, "AlchemizedBlock");
    	  GameRegistry.registerBlock(alchemizedOre, "alchemizedOre");
    	  GameRegistry.registerBlock(unstableOre, "unstableOre");
    	  alchemizedAxe = new StableAxe(null);
    	  GameRegistry.registerItem(alchemizedAxe, "alchemizedAxe");
    	  alchemizedShovel = new StableShovel(null);
    	  GameRegistry.registerItem(alchemizedShovel, "alchemizedShovel");
    	  alchemizedPickaxe = new StablePickaxe(null);
    	  GameRegistry.registerItem(alchemizedPickaxe, "alchemizedPickaxe");
    	  alchemizedSword = new StableSword(null);
    	  GameRegistry.registerItem(alchemizedSword, "alchemizedSword");
    	  twinSword = new TwinSword(null);
    	  GameRegistry.registerItem(twinSword, "twinSword");
    	  bookIngot = new BookIngot();
    	  GameRegistry.registerItem(bookIngot, "bookIngot");
    	  bookPick = new BookPick(null);
    	  GameRegistry.registerItem(bookPick, "bookPick");
    	  bookSword = new BookSword(null);
    	  bookAxe = new BookAxe(null);
    	  bookShovel = new BookShovel(null);
    	  GameRegistry.registerItem(bookSword, "bookSword");
    	  GameRegistry.registerItem(bookAxe, "bookAxe");
    	  GameRegistry.registerItem(bookShovel, "booxShovel");
    	  proxy.registerRenderers();
              // Stub Method
      }
      
      @EventHandler // used in 1.6.2
      //@Init       // used in 1.5.2
      public void load(FMLInitializationEvent event) {
    	  GameRegistry.registerWorldGenerator(new MyGenerator(), 0);
    	  ItemStack diamondsStack = new ItemStack (Items.diamond); 
    	  ItemStack obsidianStack = new ItemStack (Blocks.obsidian);
    	  ItemStack alexIngotStack = new ItemStack (alex.alexIngot);
    	  ItemStack bookStack = new ItemStack (Items.book);
    	  ItemStack alexItemStack = new ItemStack (alex.alexItem);
    	  ItemStack alchemizedOreStack = new ItemStack (alex.alchemizedOre);
    	  ItemStack alchemizedBlockStack = new ItemStack (alex.alexIngotBlock);
    	  ItemStack bookIngotStack = new ItemStack (alex.bookIngot);
    	  ItemStack stickStack = new ItemStack (Items.stick);
    	  ItemStack bedrockStack = new ItemStack (Blocks.bedrock);
    	  ItemStack twinswordStack = new ItemStack (alex.twinSword);
    	  
    	  GameRegistry.addRecipe(new ItemStack (alex.alexIngot), " x ", "xyx", " x ",
    	  			'x', diamondsStack, 'y', obsidianStack);
    	  GameRegistry.addSmelting(Items.book, new ItemStack (alex.alexItem), 1.0f);
          GameRegistry.addRecipe(new ItemStack (alex.alexIngot), "xxx", "xxx", "xxx",
        		  	'x', alexItemStack);    
          GameRegistry.addSmelting(alex.alchemizedOre, new ItemStack (alex.alexIngot), 2.0f);
          GameRegistry.addRecipe(new ItemStack (alex.alexIngotBlock), "xxx", "xxx", "xxx", 'x', alexIngotStack);
          proxy.registerRenderers();
          GameRegistry.addRecipe(new ItemStack (alex.bookIngot), "xxx", "xyx", "xxx", 'x', bookStack, 'y', alexIngotStack);
          GameRegistry.addRecipe(new ItemStack (alex.bookAxe), "xx ", "xy ", " y ", 'x', bookIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.bookAxe), " xx", " yx", " y ", 'x', bookIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.bookSword), " x ", " x ", " y ", 'x', bookIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.bookPick), "xxx", " y ", " y ", 'x', bookIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.bookShovel), " x ", " y ", " y ", 'x', bookIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.bookShovel), "x  ", "y  ", "y  ", 'x', bookIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.bookShovel), "  x", "  y", "  y", 'x', bookIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.alchemizedAxe), "xx ", "xy ", " y ", 'x', alexIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.alchemizedAxe), " xx", " yx", " y ", 'x', alexIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.alchemizedSword), " x ", " x ", " y ", 'x', alexIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.alchemizedPickaxe), "xxx", " y ", " y ", 'x', alexIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.alchemizedShovel), " x ", " y ", " y ", 'x', alexIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.alchemizedShovel), "x  ", "y  ", "y  ", 'x', alexIngotStack, 'y', stickStack);
          GameRegistry.addRecipe(new ItemStack (alex.alchemizedShovel), "  x", "  y", "  y", 'x', alexIngotStack, 'y', stickStack);
      }
      
      @EventHandler // used in 1.6.2
      //@PostInit   // used in 1.5.2
      public void postInit(FMLPostInitializationEvent event) {
              // Stub Method
      }
}