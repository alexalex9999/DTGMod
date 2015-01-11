package tutorial.alex;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class BookPick extends ItemPickaxe
{
public BookPick(ToolMaterial material)
{
super(alex.BOOK);
setUnlocalizedName("bookPick");
setCreativeTab(alex.tabGodcraft);
setTextureName(alex.MODID + ":" + "bookpick");
}
}