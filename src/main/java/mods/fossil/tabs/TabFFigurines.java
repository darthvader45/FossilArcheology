package mods.fossil.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.client.LocalizationStrings;
import net.minecraft.creativetab.CreativeTabs;

public class TabFFigurines extends CreativeTabs
{
    public TabFFigurines(int par1, String par2Str)
    {
        super(par1, par2Str);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return Fossil.figurineBlock.blockID;
    }

    public String getTranslatedTabLabel()
    {
    	return LocalizationStrings.FFIGURINES_NAME;
    }
}
