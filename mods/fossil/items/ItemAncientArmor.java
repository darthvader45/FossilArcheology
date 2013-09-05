package mods.fossil.items;

import mods.fossil.Fossil;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemAncientArmor extends ItemArmor
{
	public ItemAncientArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) 
	{
		
          super(par1, par2EnumArmorMaterial, par3, par4);
          this.setCreativeTab(Fossil.tabFArmor);
    }
 
    public String getArmorTextureFile(ItemStack par1)
    {
    	return "/mods/fossil/textures/armor/TextureAncientHelmet.png";
    }
	
    @Override
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("fossil:Ancient_Helm");
	}
	
}