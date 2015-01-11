package tutorial.alex;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;

public class TwinAttack implements TwinBuilderAttack {
	
	EntityTwin twin;
	boolean isDone = false;
	int warmuptime = 0;
	public TwinAttack(EntityTwin a){
		twin = a;
	}
	public void use(Entity target) {
		target.attackEntityFrom(new DamageSource("mob.twinboss.damage.attack"), 4F);
		isDone = true;
		}
	public int getTier() {
		return 1;
	}
public boolean isDone() {
		return isDone;
	}

}
