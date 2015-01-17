package tutorial.alex.Blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import scala.actors.threadpool.Arrays;
import tutorial.alex.AlexMainRegistry;
import net.minecraft.block.BlockFurnace;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class DoubleFurnace extends BlockFurnace{
	public int level;
	public Object[] parents = {Blocks.furnace, Blocks.furnace};
	@SideOnly(Side.CLIENT)
    private IIcon topIcon;
    @SideOnly(Side.CLIENT)
    private IIcon frontIcon;
    boolean isOn;
	
	public DoubleFurnace(boolean p_i45407_1_) {
		super(p_i45407_1_);
		isOn = p_i45407_1_;
		this.level = 1;
		setBlockName("doubleFurnace");
		setCreativeTab(AlexMainRegistry.tabGodcraft);
	}
	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if (p_149727_1_.isRemote)
        {
            return true;
        }
        else
        {
            TileEntityDoubleFurnace tileentityfurnace = (TileEntityDoubleFurnace)p_149727_1_.getTileEntity(p_149727_2_, p_149727_3_, p_149727_4_);

            if (tileentityfurnace != null)
            {
                p_149727_5_.func_146101_a(tileentityfurnace);
            }

            return true;
        }
    }
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TileEntityDoubleFurnace();
    }
	@SideOnly (Side.CLIENT)
	@Override
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return Item.getItemFromBlock(AlexAlchemyBlockLoader.doubleFurnace);
    }
	@SideOnly(Side.CLIENT)
	@Override
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.topIcon : (p_149691_1_ == 0 ? this.topIcon : (p_149691_1_ != p_149691_2_ ? this.blockIcon : this.frontIcon));
    }
	@SideOnly(Side.CLIENT)
	@Override
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon("DoubleFurnaceSide");
        this.frontIcon = p_149651_1_.registerIcon(this.isOn ? "DoubleFurnaceFrontOn" : "DoubleFurnaceFrontOff");
        this.topIcon = p_149651_1_.registerIcon("DoubleFurnaceTop");
    }
}
