package mods.fossil.fossilTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.config.FossilItem;
import net.minecraft.creativetab.CreativeTabs;

public class TabFItems extends CreativeTabs 
{

	public TabFItems(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
       return FossilItem.dinoPedia.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
        return "Ancient Items";
    }
	
}
