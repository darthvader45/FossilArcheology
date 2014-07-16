package mods.fossil.fossilEnums;

import mods.fossil.Fossil;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public enum EnumDinoFoodItem
{
    Wheat(Item.wheat, 10, 2), //Veggie Foods
    Melon(Item.melon, 10, 2),
    Apple(Item.appleRed, 15, 3),
    Potato(Item.potato, 10, 2),
    BakedPotato(Item.bakedPotato, 15, 3),
    Cake(Item.cake, 25, 5),
    Carrot(Item.carrot, 10, 2),
    Cookie(Item.cookie, 15, 4),
    PumpkinPie(Item.pumpkinPie, 20, 4),
    Sugar(Item.sugar, 10, 2),
    Bread(Item.bread, 25, 2),
    Seeds(Item.seeds, 5, 1),
    melonSeeds(Item.melonSeeds, 5, 1),

	/*
	 * TODO: Change FoodValue so things higher up on the food chain are worth less in FoodValue,
	 * but maybe trade off with higher HealValue and vice versa.
	 */
    
    FishRaw(Item.fishRaw, 30, 3), //this MUST BE the first carnivore food!
    FishCooked(Item.fishCooked, 40, 4),
    BeefCooked(Item.beefCooked, 50, 5),
    BeefRaw(Item.beefRaw, 40, 4),
    ChickenCooked(Item.chickenCooked, 10, 2),
    ChickenRaw(Item.chickenRaw, 15, 3),
    PorkRaw(Item.porkRaw, 30, 2),
    PorkCooked(Item.porkCooked, 50, 3),
    Egg(Item.egg, 10, 2),
    Sjl(Fossil.sjl, 30, 3), //SioChiuLe
    Nautilus(EnumDinoType.Nautilus.DropItem, 20, 2),
    ChickenSoupRaw(Fossil.rawChickenSoup, 30, 3),
    ChickenSoupCooked(Fossil.cookedChickenSoup, 40, 3),
    Triceratops(EnumDinoType.Triceratops.DropItem, 50, 3),
    Velociraptor(EnumDinoType.Velociraptor.DropItem, 20, 3),
    TRex(EnumDinoType.TRex.DropItem, 20, 3),
    Pterosaur(EnumDinoType.Pterosaur.DropItem, 15, 2),
    Plesiosaur(EnumDinoType.Plesiosaur.DropItem, 30, 3),
    Mosasaurus(EnumDinoType.Mosasaurus.DropItem, 20, 3),
    Stegosaurus(EnumDinoType.Stegosaurus.DropItem, 50, 3),
    Dilophosaurus(EnumDinoType.Dilophosaurus.DropItem, 25, 2),
    Brachiosaur(EnumDinoType.Brachiosaurus.DropItem, 50, 4),
    Spinosaurus(EnumDinoType.Spinosaurus.DropItem, 20, 3),
    Compsognathus(EnumDinoType.Compsognathus.DropItem, 10, 1),
    Ankylosaurus(EnumDinoType.Ankylosaurus.DropItem, 50, 3),
    Pachycephalosaurus(EnumDinoType.Pachycephalosaurus.DropItem, 50,3),
    Deinonychus(EnumDinoType.Deinonychus.DropItem, 30, 3),
    Gallimimus(EnumDinoType.Gallimimus.DropItem, 35, 4),
    DinoMeatCooked(Fossil.cookedDinoMeat, 50, 5),
    DodoWing(Fossil.dodoWing, 20, 2),
    DodoWingCooked(Fossil.dodoWingCooked, 30, 3),
    ;
    public Item item;
    public int FoodValue;
    public int HealValue;

    public static final int ISHERBIVOROUS = 1;
    public static final int ISCARNIVOROUS = 2;
    public static final int ISNOFOOD = 0;

    private EnumDinoFoodItem(Item item0, int Food, int Heal)
    {
        this.item = item0;
        this.FoodValue = Food;
        this.HealValue = Heal;
    }

    /**
     *
     * Takes the itemid and tells if its herbivore, carnivore or no food
     */
    public static int foodtype(int i0)
    {
        for (int i = 0; i < EnumDinoFoodItem.values().length; i++) //check all entries
        {
            if (EnumDinoFoodItem.values()[i].item.itemID == i0) //found it in the list
            {
                if (i < EnumDinoFoodItem.FishRaw.ordinal()) //its before SJL, the first carn. food
                {
                    return ISHERBIVOROUS;
                }

                return ISCARNIVOROUS;
            }
        }

        return ISNOFOOD;//wasnt found at all
    }

    /**
     *
     * Takes the itemid and gives the food value
     */
    public static int getItemFood(int i0)
    {
        for (int i = 0; i < EnumDinoFoodItem.values().length; i++)
        {
            if (EnumDinoFoodItem.values()[i].item.itemID == i0)
            {
                return EnumDinoFoodItem.values()[i].FoodValue;
            }
        }

        return 0;
    }
}
