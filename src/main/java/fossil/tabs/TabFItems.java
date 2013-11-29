package mods.fossil.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.client.LocalizationStrings;
import mods.fossil.client.Localizations;
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
        return Fossil.dinoPedia.itemID;
    }

    public String getTranslatedTabLabel()
    {
        return LocalizationStrings.FITEMS_NAME;
    }
}
