package mods.fossil.fossilTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.config.FossilMaterialItem;
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
       return FossilMaterialItem.brachEgg.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
        return "Ancient Materials";
    }
	
}
