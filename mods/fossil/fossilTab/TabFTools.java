package mods.fossil.fossilTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.config.FossilToolItem;
import net.minecraft.creativetab.CreativeTabs;

public class TabFTools extends CreativeTabs 
{

	public TabFTools(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
       return FossilToolItem.scarabHoe.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
        return "Ancient Tools";
    }
	
}
