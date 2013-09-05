package mods.fossil.fossilTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.config.FossilArmorItem;
import net.minecraft.creativetab.CreativeTabs;

public class TabFArmor extends CreativeTabs 
{

	public TabFArmor(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
       return FossilArmorItem.ancientHelmet.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
    	return "Ancient Armor";
    }
	
}
