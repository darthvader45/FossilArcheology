package mods.fossil;


import net.minecraft.client.model.ModelBiped;

public class CommonProxy
{
    public void registerRenderThings()
    {
    }

    public void registerTileEntitySpecialRenderer() {}

    public void registerSounds()
    {
    }

    public void registerEvents()
    {
    }

    public void registerChestItems()
    {
      //  Random rand = new Random();
       // ChestGenHooks chestGenAcademyHooks = ChestGenHooks.getInfo("Academy");
        //chestGenAcademyHooks.addItem(new WeightedRandomChestContent(new ItemStack(Item.paper), rand.nextInt(22), 10, 70));
    }
    
    public ModelBiped getArmorModel(int id){
    	return null;
    }
}
