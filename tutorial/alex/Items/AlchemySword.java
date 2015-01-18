package tutorial.alex.Items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class AlchemySword extends ItemSword{
	public int level;
	public Object[] parents;

	public AlchemySword(ToolMaterial material) {
		super(material);
		this.level = 1;
		this.parents = new Object[0];
		
	}
	public void setLevel(int level){
		this.level = level;
	}
	public void setParents(Object[] parents){
		this.parents = parents;
	}

}
