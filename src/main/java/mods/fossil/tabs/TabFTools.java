package mods.fossil.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.client.LocalizationStrings;
import mods.fossil.client.Localizations;
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
        return Fossil.gemHoe.itemID;
    }

    public String getTranslatedTabLabel()
    {
        return LocalizationStrings.FTOOLS_NAME;
    }
}
