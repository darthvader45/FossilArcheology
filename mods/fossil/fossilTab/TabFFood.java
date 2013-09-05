package mods.fossil.fossilTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.config.FossilFoodItem;
import net.minecraft.creativetab.CreativeTabs;

public class TabFFood extends CreativeTabs 
{

	public TabFFood(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
       return FossilFoodItem.cookedChickenSoup.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
        return "Ancient Food";
    }
	
}
