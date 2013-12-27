package mods.fossil.items;

import mods.fossil.Fossil;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemHeadRelic extends ItemArmor
{
    public ItemHeadRelic(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
    }

    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("fossil:Bone_Helm");
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
            return "fossil:textures/armor/bone_1.png";
    }
}