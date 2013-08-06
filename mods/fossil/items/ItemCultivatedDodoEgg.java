package mods.fossil.items;

import mods.fossil.Fossil;
import mods.fossil.entity.EntityCultivatedDodoEgg;
import mods.fossil.entity.EntityDodoEgg;
import mods.fossil.entity.mob.EntityDodo;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCultivatedDodoEgg extends Item
{
    public ItemCultivatedDodoEgg(int par1)
    {
        super(par1);
        this.maxStackSize = 16;
        this.setCreativeTab(Fossil.tabFItems);
    }

    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("fossil:Egg_Cultivated_Dodo");
    }
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityCultivatedDodoEgg(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }
}
