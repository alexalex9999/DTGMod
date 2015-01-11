package tutorial.alex;

import tutorial.alex.EntityTwin;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;

public class TwinAttackboom implements TwinBuilderAttack {
	
	EntityTwin twinboss;
	boolean isDone;
	int warmuptime = 0;
	
	public void TwinAttackBoom(EntityTwin g){
		twinboss = g;
		isDone = false;
	}
	
	@Override
	public void use(Entity target) {
		warmuptime++;
		if(warmuptime >= 50){
			target.attackEntityFrom(new DamageSource("mob.twinboss.damage.yes"), 5F);
			isDone = true;
		}
	}

	@Override
	public int getTier() {
		return 2;
	}

	@Override
	public boolean isDone() {
		return isDone;
	}

}
