package mods.fossil.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.fossil.client.DinoSoundHandler;
import mods.fossil.entity.mob.EntityDinosaur;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.Item;
import net.minecraft.item.ItemCarrotOnAStick;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;

public class ItemWhip extends ItemCarrotOnAStick
{
    public ItemWhip(int var1)
    {
        super(var1);
        this.setMaxDamage(100);
        this.setMaxStackSize(1);
    }
    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
     * hands.
     */
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack I, World W, EntityPlayer P)
    {
        if (P.isRiding() && P.ridingEntity instanceof EntityDinosaur)
        {
            EntityDinosaur D = (EntityDinosaur)P.ridingEntity;

//            if (D.getRidingHandler().isControlledByPlayer() && I.getMaxDamage() - I.getItemDamage() >= 5)

            if (D.getAIControlledByPlayer().isControlledByPlayer())
            {
                //   D.getRidingHandler().boostSpeed();
                //System.out.println("SPEED BOOSTED!");
                //System.out.println("Damage before:"+String.valueOf(I.getItemDamage()));
                I.damageItem(1, P);
                //System.out.println("Damage after:"+String.valueOf(I.getItemDamage()));
                //I.setItemDamage(I.getItemDamage()+5);
                //W.playSoundEffect(P.posX, P.posY, P.posZ, "WhipCrack", 0.5F, 1.0F);
                P.swingItem();
                P.ridingEntity.playSound("fossil:whip", 1.0F, 1.0F);
            }
        }
        else
        {
            /*
            if (!W.isRemote)
            {
                W.spawnEntityInWorld(new EntityWhipAttachment(W, P));
            }
            */
            P.swingItem();
            W.playSoundAtEntity(P, "fossil:whip", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
        }

        return I;
    }

    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon("fossil:Whip");
    }
}
