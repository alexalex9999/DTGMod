package tutorial.alex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;
import tutorial.alex.TwinAttack;
import tutorial.alex.TwinSpawn;
import tutorial.alex.TwinAttackboom;
import tutorial.alex.TwinTeleport;
import tutorial.alex.TwinAttackyes;

public class EntityTwin extends EntityMob implements IBossDisplayData{
	public TwinBuilderAttack currentAttack;
	public HashMap<Integer, List<Class<? extends TwinBuilderAttack>>> attacks = new HashMap<Integer, List<Class<? extends TwinBuilderAttack>>>();
	public void onLivingUpdate()
	{
		if(FMLCommonHandler.instance().getEffectiveSide().isClient()){

			BossStatus.setBossStatus(this, true);
			currentAttack =  null;
			attacks.put(1, new ArrayList<Class<? extends TwinBuilderAttack>>());
			attacks.put(2, new ArrayList<Class<? extends TwinBuilderAttack>>());
			attacks.put(3, new ArrayList<Class<? extends TwinBuilderAttack>>());
			attacks.put(4, new ArrayList<Class<? extends TwinBuilderAttack>>());
			attacks.put(5, new ArrayList<Class<? extends TwinBuilderAttack>>());
			attacks.put(6, new ArrayList<Class<? extends TwinBuilderAttack>>());
			addAttacks();
	}	
		super.onLivingUpdate();};

public EntityTwin(World par1World) {
super(par1World);
experienceValue = 1900;
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityTest.class, 0, true));
}

@Override
protected void applyEntityAttributes()
{
	 super.applyEntityAttributes();
this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100.0D);
this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0D);
this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(2.D);
this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
	

}
@Override
public IChatComponent func_145748_c_()
{
 
  // TODO: 
  return new ChatComponentText("TwinBuilder");
}
private void addAttacks(){
	//1
	attacks.get(1).add(TwinAttack.class);
	attacks.get(1).add(TwinAttackboom.class);
	attacks.get(1).add(TwinAttackyes.class);
	//2
	attacks.get(2).add(TwinTeleport.class);
	attacks.get(2).add(TwinSpawn.class);
	//3
	//4
	//5
	//6
}
public boolean teleportRandomly(int warmuptime)
{
	double d0 = this.posX + (this.rand.nextDouble() - 0.5D) * 16.0D;
	double d1 = this.posY + (double)(this.rand.nextInt(64) - 8);
	double d2 = this.posZ + (this.rand.nextDouble() - 0.5D) * 16.0D;
	return this.teleportTo(d0, d1, d2, warmuptime);
}
boolean teleportTo(double d0, double d1, double d2, int warmuptime) {
	// TODO Auto-generated method stub
	return false;
}

public double[] getTeleportRandomly(){
	return new double[] {this.posX + (this.rand.nextDouble() - 0.5D) * 16.0D, this.posY + (double)(this.rand.nextInt(64) - 8), this.posZ + (this.rand.nextDouble() - 0.5D) * 16.0D};
}
	@Override
	protected String getHurtSound(){
		return "mob.enderman.scream";}
		@Override
		public void onDeath(DamageSource d){
			super.onDeath(d);
}
		@Override
		protected void dropFewItems(boolean par1, int par2)
	    {
	        this.entityDropItem(new ItemStack(alex.twinSword, 1, 0), 0.0F);

	    }
}
