package tutorial.alex.Items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public class AlchemyItem extends Item{
	public int level;
	public List<Item> parents;

	public AlchemyItem(){
		this.level = 1;
		this.parents = new ArrayList<Item>();
		
	}
	public void setLevel(int level){
		this.level = level;
	}
	public void setParents(List<Item> parents){
		this.parents = parents;
	}
}
