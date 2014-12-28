package tutorial.alex.Items;

import net.minecraft.item.Item;

//Very WIP. Doesn't shoot.
public class AlchemyGun extends Item{
	int level;
	public AlchemyGun(){
		this.level = 1;
	}
	public void setLevel(int level){
		this.level = level;
	}

}
