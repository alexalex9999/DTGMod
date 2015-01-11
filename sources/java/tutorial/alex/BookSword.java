package tutorial.alex;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class BookSword extends ItemSword
{
public BookSword(ToolMaterial material)
{
super(alex.BOOK);
setUnlocalizedName("bookSword");
setCreativeTab(alex.tabGodcraft);
setTextureName(alex.MODID + ":" + "booksword");
}
}