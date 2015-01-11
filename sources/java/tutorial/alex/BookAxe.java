package tutorial.alex;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class BookAxe extends ItemAxe
{
public BookAxe(ToolMaterial material)
{
super(alex.BOOK);
setUnlocalizedName("bookAxe");
setCreativeTab(alex.tabGodcraft);
setTextureName(alex.MODID + ":" + "bookaxe");
}
}