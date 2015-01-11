package tutorial.alex;

import net.minecraft.entity.Entity;

public interface ITwinAttack {
	
	void use(Entity target);
	
	int getTier();
	
	boolean isDone();
}
