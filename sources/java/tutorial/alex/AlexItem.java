package tutorial.alex;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tutorial.alex.alex;

public class AlexItem extends Item{

	public AlexItem(int i) {
		super();
		setMaxStackSize(64);
		setUnlocalizedName("alexItem");
		setTextureName(alex.MODID + ":" + "assets.AlexModID.textures.items.stable");
		// TODO Auto-generated constructor stub
	}

}
