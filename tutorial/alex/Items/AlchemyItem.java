package tutorial.alex.Items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public class AlchemyItem extends Item{
	public int level;
	public Object[] parents;

	public AlchemyItem(){
		this.level = 1;
		this.parents = new Object[0];
		
	}
	public void setLevel(int level){
		this.level = level;
	}
	public void setParents(Object[] parentArray){
		this.parents = parentArray;
	}
}
