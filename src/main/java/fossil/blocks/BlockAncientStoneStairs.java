package mods.fossil.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockAncientStoneStairs extends BlockStairs
{
    /** The block that is used as model for the stair. */
    private  Block modelBlock;
    public BlockAncientStoneStairs(int par1, Block modelBlockx)
    {
        super(par1, modelBlockx, par1);
        //blockIndexInTexture = par2;
        this.modelBlock = modelBlockx;
        this.setLightOpacity(0);
        this.setCreativeTab(Fossil.tabFBlocks);
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("fossil:Ancient_Stonebricks"); //adding in a texture, 1.5.1 style!
    }
}
