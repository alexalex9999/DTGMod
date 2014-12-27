package tutorial.alex.Items;

import net.minecraft.item.Item;

public class AlchemyItem extends Item{
	int level;
	public AlchemyItem(){
		this.level = 1;
		
	}
	public void setLevel(int level){
		this.level = level;
	}
}
