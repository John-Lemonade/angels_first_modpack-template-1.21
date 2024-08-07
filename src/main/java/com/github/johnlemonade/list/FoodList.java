package com.github.johnlemonade.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {

    public static final FoodComponent JANK_BURGER_FOOD_COMPONENT = new FoodComponent.Builder()

            //measured in half drumpsticks
            .nutrition(8)
            .alwaysEdible()

            //20 ticks = 1 second; amplified = level; 1.0 = 100% chance
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 6 * 20, 1), .99f)
            .build();

}
