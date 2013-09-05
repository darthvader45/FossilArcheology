package mods.fossil.fossilTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.config.FossilBlocks;
import net.minecraft.creativetab.CreativeTabs;

public class TabFBlocks extends CreativeTabs 
{

	public TabFBlocks(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
       return FossilBlocks.drum.blockID;
    }
    
    public String getTranslatedTabLabel()
    {
        return "Ancient Blocks";
    }
	
}
