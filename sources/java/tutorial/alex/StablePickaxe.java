package tutorial.alex;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class StablePickaxe extends ItemPickaxe
{
public StablePickaxe(ToolMaterial material)
{
super(alex.ALCHEMIZED);
setUnlocalizedName("alchemizedPickaxe");
setCreativeTab(alex.tabGodcraft);
setTextureName(alex.MODID + ":" + "stablepick");
}
}