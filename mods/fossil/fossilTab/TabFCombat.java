package mods.fossil.fossilTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.config.FossilCombatItem;
import net.minecraft.creativetab.CreativeTabs;

public class TabFCombat extends CreativeTabs 
{

	public TabFCombat(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
       return FossilCombatItem.ancientSword.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
        return "Ancient Weapons";
    }
	
}
