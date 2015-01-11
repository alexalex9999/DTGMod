package tutorial.alex;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class BookShovel extends ItemSpade
{
public BookShovel(ToolMaterial material)
{
super(alex.BOOK);
setUnlocalizedName("bookShovel");
setCreativeTab(alex.tabGodcraft);
setTextureName(alex.MODID + ":" + "bookshovel");
}
}