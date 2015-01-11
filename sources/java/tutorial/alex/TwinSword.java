package tutorial.alex;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class TwinSword extends ItemSword
{
public TwinSword(ToolMaterial material)
{
super(alex.TWIN);
setUnlocalizedName("twinSword");
setCreativeTab(alex.tabGodcraft);
setTextureName(alex.MODID + ":" + "twinsword");
}
}