package mods.fossil.items;

import mods.fossil.Fossil;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemFeet extends ItemArmor
{
    public ItemFeet(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
        //this.setCreativeTab(Fossil.tabFArmor);
    }

    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("fossil:Bone_Boots");
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.itemID == Fossil.skullHelmet.itemID || stack.itemID == Fossil.ribCage.itemID || stack.itemID == Fossil.feet.itemID)
        {
            return "fossil:textures/armor/bone_1.png";
        }

        if (stack.itemID == Fossil.femurs.itemID)
        {
            return "fossil:textures/armor/bone_2.png";
        }

        return "fossil:textures/armor/bone_2.png";
    }
}