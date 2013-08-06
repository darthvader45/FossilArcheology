package mods.fossil.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;



public class ItemAmber extends Item
{
    public ItemAmber(int var1)
    {
        super(var1);
        this.maxStackSize = 64;
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("fossil:Amber");
    }


}
