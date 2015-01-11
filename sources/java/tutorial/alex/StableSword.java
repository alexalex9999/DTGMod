package tutorial.alex;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class StableSword extends ItemSword
{
public StableSword(ToolMaterial material)
{
super(alex.ALCHEMIZED);
setUnlocalizedName("alchemizedSword");
setCreativeTab(alex.tabGodcraft);
setTextureName(alex.MODID + ":" + "stablesword");
}
}