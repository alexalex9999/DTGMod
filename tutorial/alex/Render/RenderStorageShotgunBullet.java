package tutorial.alex.Render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import tutorial.alex.Entity.EntityStdBullet;
import tutorial.alex.Entity.EntityStorageShotgunBullet;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemCloth;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;

public class RenderStorageShotgunBullet extends Render{
	private EntityItem insEntityItem;
	private ItemStack  bulletItemStack;
	private RenderItem rendItem;
	public RenderStorageShotgunBullet(){
		rendItem = new RenderItem();
	 }
	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture(insEntityItem);
    }
	@Override
	public void doRender(Entity par1EntityStorageShotgun, double par2,
			double par4, double par6, float p_76986_8_,
			float par9) {
		 
		 if (((EntityStorageShotgunBullet) par1EntityStorageShotgun).insertedBlock != null){
			 bulletItemStack = new ItemStack(((EntityStorageShotgunBullet) par1EntityStorageShotgun).insertedBlock);
		 }
		 else{
			 bulletItemStack = new ItemStack(((EntityStorageShotgunBullet) par1EntityStorageShotgun).insertedItem);
		 }
		 insEntityItem = new EntityItem(par1EntityStorageShotgun.worldObj, par2, par4, par6, bulletItemStack);
		 rendItem.doRender(insEntityItem, par2, par4, par6, p_76986_8_, par9);		
	}
}