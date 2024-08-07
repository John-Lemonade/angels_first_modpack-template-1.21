package com.github.johnlemonade.register;

import com.github.johnlemonade.Angels_First_Modpack;
import com.github.johnlemonade.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static net.minecraft.item.Items.register;

public class Angels_First_Modpack_Items {

    //Dragon Ball
    public static final Item ONE_STAR_DRAGON_BALL = registerItem("one_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item TWO_STAR_DRAGON_BALL = registerItem("two_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item THREE_STAR_DRAGON_BALL = registerItem("three_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item FOUR_STAR_DRAGON_BALL = registerItem("four_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item FIVE_STAR_DRAGON_BALL = registerItem("five_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item SIX_STAR_DRAGON_BALL = registerItem("six_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item SEVEN_STAR_DRAGON_BALL = registerItem("seven_star_dragon_ball", new Item(new Item.Settings()));
    public static final Item EIGHT_STAR_DRAGON_BALL = registerItem("eight_star_dragon_ball", new Item(new Item.Settings()));

    //Personal

    public static final Item THE_JANK_BURGER = registerItem("the_jank_burger",
            new Item(new Item.Settings().food(FoodList.JANK_BURGER_FOOD_COMPONENT).maxCount(16)));

    //method that allows us to register an item
    public static <T extends Item> T registerItem(String name, T item) {

        return Registry.register(Registries.ITEM, Angels_First_Modpack.id(name), item);

    }

    //Properly initializes this code
    public static void load(){}
}
