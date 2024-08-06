package com.github.johnlemonade.register;

import com.github.johnlemonade.Angels_First_Modpack;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static net.minecraft.item.Items.register;

public class Angels_First_Modpack_Items {
    public static final Item ONE_STAR_DRAGON_BAL = register("one_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item TWO_STAR_DRAGON_BAL = register("two_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item THREE_STAR_DRAGON_BAL = register("three_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item FOUR_STAR_DRAGON_BAL = register("four_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item FIVE_STAR_DRAGON_BAL = register("five_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item SIX_STAR_DRAGON_BAL = register("six_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item SEVEN_STAR_DRAGON_BAL = register("seven_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item EIGHT_STAR_DRAGON_BAL = register("eight_star_dragon_ball", new Item(new Item.Settings()));

    //method that allows us to register an item
    public static <T extends Item> T registerItem(String name, T item) {

        return Registry.register(Registries.ITEM, Angels_First_Modpack.id(name), item);

    }

    public static void load(){


    }
}
