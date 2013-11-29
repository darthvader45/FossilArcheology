package mods.fossil.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mods.fossil.Fossil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockJukeBox;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemFossilRecord extends ItemRecord
{
    private static final Map records = new HashMap();

    /** The name of the record. */
    public final String recordName;

    public ItemFossilRecord(int id, String par2Str)
    {
        super(id, par2Str);
        this.recordName = par2Str;
        this.maxStackSize = 1;
        setCreativeTab(Fossil.tabFItems);
        records.put(par2Str, this);
    }

    @SideOnly(Side.CLIENT)
    public String getRecordTitle()
    {
        return "WhiteJoshMan - " + this.recordName;
    }

    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.rare;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg)
    {
        this.itemIcon = reg.registerIcon(Fossil.modid + ":record_bones");
    }

    /**
     * Return the record item corresponding to the given name.
     */
    public static ItemFossilRecord getRecord(String par0Str)
    {
        return (ItemFossilRecord)records.get(par0Str);
    }
}