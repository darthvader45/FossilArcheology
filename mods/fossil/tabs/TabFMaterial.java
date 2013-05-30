package mods.fossil.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.client.LocalizationStrings;
import net.minecraft.creativetab.CreativeTabs;

public class TabFMaterial extends CreativeTabs 
{

	public TabFMaterial(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
       return Fossil.eggBrachiosaurus.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
     return LocalizationStrings.FMATERIAL_NAME;
    }
	
}
