package mods.fossil.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.Fossil;
import mods.fossil.entity.mob.EntityPregnantCow;
import mods.fossil.entity.mob.EntityPregnantPig;
import mods.fossil.entity.mob.EntityPregnantSheep;
import mods.fossil.fossilEnums.EnumAnimalType;
import mods.fossil.fossilInterface.IViviparous;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemEmbryoSyringe extends Item
{
    //private String[] ItemNames = new String[] {"EmbyoPig", "EmbyoSheep", "EmbyoCow", "EmbyoSmilodon", "EmbyoMammoth"};
	int AnimalType;
    public ItemEmbryoSyringe(int var1, int AnimalType0)
    {
        super(var1);
        //this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.maxStackSize = 64;
        this.AnimalType=AnimalType0;
    }
    
    @Override
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("fossil:"+EnumAnimalType.values()[AnimalType].name()+"_Syringe");
    }

    /*
     * Gets an icon index based on an item's damage value
     */
    //public int getIconFromDamage(int var1)
    //{
    //    return var1;
    //}

    //public String getItemNameIS(ItemStack var1)
    //{
    //    int var2 = var1.getItemDamage();
    //    return var2 < this.ItemNames.length ? this.ItemNames[var2] : "EmbyoSyring";
    //}

    public static EnumAnimalType GetEmbryo(int var0)
    {
        return EnumAnimalType.values()[var0];
    }

    /**
     * dye sheep, place saddles, etc ...
     */
    public boolean func_111207_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, EntityLivingBase par3EntityLivingBase)
    {
        if (par3EntityLivingBase instanceof EntityAnimal && ((EntityAnimal)par3EntityLivingBase).getGrowingAge() == 0)
        {
            Object var3 = null;

            if (par3EntityLivingBase instanceof EntityPig)
            {
                var3 = new EntityPregnantPig(par3EntityLivingBase.worldObj);
            }

            if (par3EntityLivingBase instanceof EntityCow)
            {
                var3 = new EntityPregnantCow(par3EntityLivingBase.worldObj);
            }

            if (par3EntityLivingBase instanceof EntitySheep)
            {
                var3 = new EntityPregnantSheep(par3EntityLivingBase.worldObj);
                ((EntitySheep)var3).setFleeceColor(((EntitySheep)par3EntityLivingBase).getFleeceColor());
                ((EntitySheep)var3).setSheared(((EntitySheep)par3EntityLivingBase).getSheared());
            }
            

            if (var3 != null)
            {
            	EnumAnimalType e0=EnumAnimalType.Chicken;
            	if(par1ItemStack.itemID==Fossil.embryoChicken.itemID)e0=EnumAnimalType.Chicken;
            	if(par1ItemStack.itemID==Fossil.embryoCow.itemID)e0=EnumAnimalType.Cow;
            	if(par1ItemStack.itemID==Fossil.embryoMammoth.itemID)e0=EnumAnimalType.Mammoth;
            	if(par1ItemStack.itemID==Fossil.embryoPig.itemID)e0=EnumAnimalType.Pig;
            	if(par1ItemStack.itemID==Fossil.embryoSmilodon.itemID)e0=EnumAnimalType.Smilodon;
            	if(par1ItemStack.itemID==Fossil.embryoSheep.itemID)e0=EnumAnimalType.Sheep;
//                if(var1.itemID==Fossil.embryoDodo.itemID)e0=EnumAnimalType.Dodo;
                ((IViviparous)var3).SetEmbryo(e0);
                ((EntityAnimal)var3).setLocationAndAngles(par3EntityLivingBase.posX, par3EntityLivingBase.posY, par3EntityLivingBase.posZ, par3EntityLivingBase.rotationYaw, par3EntityLivingBase.rotationPitch);
                par3EntityLivingBase.setDead();

                if (!par3EntityLivingBase.worldObj.isRemote)
                {
                	par3EntityLivingBase.worldObj.spawnEntityInWorld((EntityAnimal)var3);
                }

                --par1ItemStack.stackSize;
            }
            return true;
        }
        return false;
    }
}
