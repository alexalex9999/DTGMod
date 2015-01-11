package tutorial.alex;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class StableShovel extends ItemSpade
{
public StableShovel(ToolMaterial material)
{
super(alex.ALCHEMIZED);
setUnlocalizedName("alchemizedShovel");
setCreativeTab(alex.tabGodcraft);
setTextureName(alex.MODID + ":" + "stableshovel");
}
}