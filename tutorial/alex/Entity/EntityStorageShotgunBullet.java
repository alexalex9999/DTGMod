package tutorial.alex.Entity;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityStorageShotgunBullet extends EntityThrowable{
	
	public Block insertedBlock;
	public Item insertedItem;
	public EntityStorageShotgunBullet(World p_i1776_1_) {
		super(p_i1776_1_);
		setThrowableHeading(this.motionX, this.motionY, this.motionZ, 7.5F, 1.0F);
	}
	public EntityStorageShotgunBullet(World par1World, EntityLivingBase par2EntityLivingBase){
        super(par1World, par2EntityLivingBase);
		setThrowableHeading(this.motionX, this.motionY, this.motionZ, 7.5F, 1.0F);
	}
	public EntityStorageShotgunBullet(World par1World, double par2, double par4, double par6){
        super(par1World, par2, par4, par6);
        setThrowableHeading(this.motionX, this.motionY, this.motionZ, 7.5F, 1.0F);
	}
	public void setInsertedBlock(Block inBlock){
		this.insertedBlock = inBlock;
	}
	public void setInsertedItem(Item inItem){
		this.insertedItem = inItem;
	}
	@Override
	protected void onImpact(MovingObjectPosition pos) {
		if (this.insertedBlock != null){
			if (this.insertedBlock == Blocks.tnt){
				this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 2.0f, true); 
				if (pos.entityHit != null){
					pos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 2.5f);
				}
			}
			else if (pos.entityHit != null)
	        {
				if (this.insertedBlock == Blocks.netherrack){
					pos.entityHit.setFire(3);
				}
				else{
					float damage;
					if (this.insertedBlock.getBlockHardness(null, 0, 0, 0) >= 5.0f){
						damage = 12.5f;
					}
					else{
						damage = 2.0f * this.insertedBlock.getBlockHardness(null, 0, 0, 0);
					}
		            pos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), damage);
				}
	        }
	
	        for (int i = 0; i < 8; ++i)
	        {
	            this.worldObj.spawnParticle("blockdust(" + this.insertedBlock.getIdFromBlock(this.insertedBlock) + ")", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
	        }
	
	        if (!this.worldObj.isRemote)
	        {
	            this.setDead();
	        }
		}
		else{
			if (pos.entityHit != null){
				if (this.insertedItem == Items.blaze_powder || this.insertedItem == Items.blaze_rod || this.insertedItem == Items.fire_charge){
					int fire_time = 0;
					if (this.insertedItem == Items.blaze_powder){
						fire_time = 2;
					}
					else if (this.insertedItem == Items.blaze_rod){
						fire_time = 4;
					}
					else if (this.insertedItem == Items.fire_charge){
						fire_time = 6;
					}
					pos.entityHit.setFire(fire_time);
				}
				else{
					float hit_damage = 0.0f;
					if (this.insertedItem == Items.flint){
						hit_damage = 9.0f;
					}
					else if (this.insertedItem == Items.flint_and_steel){
						hit_damage = 9.0f;
						pos.entityHit.setFire(2);
					}
					else if (this.insertedItem == Items.arrow){
						hit_damage = 12.0f;
					}
					else if (this.insertedItem == Items.diamond){
						hit_damage = 13.0f;
					}
					else if (this.insertedItem == Items.diamond_sword){
						hit_damage = 16.0f;
					}
					else{
						hit_damage = 5.0f;
					}
					pos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), hit_damage);
				}
			}
		}
	}
	@Override
	protected float func_70182_d(){
		return 7.5f;
		
	}

}
