package mods.fossil.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.client.LocalizationStrings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockAncientWoodPillar extends Block
{
    @SideOnly(Side.CLIENT)
    private Icon Top;

	public BlockAncientWoodPillar(int par1, Material var2Material)
    {
	    
	    
        super(par1, Material.wood);
        this.setCreativeTab(Fossil.tabFBlocks);
        this.setUnlocalizedName(LocalizationStrings.ANCIENTWOODPILLAR_NAME);
        this.setHardness(2.0F);
        this.setStepSound(Block.soundWoodFootstep);
    }
    
	@Override
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon("fossil:Ancient_Wood_Pillar"); //adding in a texture, 1.5.1 style!
        this.Top = par1IconRegister.registerIcon("fossil:Ancient_Wood_Pillar_Top");
    }
	

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int var1, int var2)
    {
        return ((var2&12)==0 && var1 < 2) || ((var2&12)==8 && var1 > 1 && var1 < 4) || ((var2&12)==4 && var1 > 3)? this.Top : this.blockIcon;
    }
	
    /**
     * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
     */
    public int onBlockPlaced(World var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9)
    {
        int var10 = var9 & 3;
        byte var11 = 0;

        switch (var5)
        {
            case 0:
            case 1:
                var11 = 0;
                break;

            case 2:
            case 3:
                var11 = 8;
                break;

            case 4:
            case 5:
                var11 = 4;
        }

        return var10 | var11;
    }
    
}
