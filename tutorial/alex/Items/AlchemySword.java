package tutorial.alex.Items;

import net.minecraft.item.ItemSword;

public class AlchemySword extends ItemSword{
	public int level;

	public AlchemySword(ToolMaterial material) {
		super(material);
		this.level = 1;
		
	}
	public void setLevel(int level){
		this.level = level;
	}

}
