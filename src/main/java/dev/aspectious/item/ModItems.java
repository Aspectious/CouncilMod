package dev.aspectious.item;

import dev.aspectious.CouncilMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item testItem = registerItem("testitem", new Item(new FabricItemSettings()));
    public static final Item spenr = registerItem("spenr", new Item(new FabricItemSettings()));
    public static final Item glass_cup = registerItem("glass_cup", new Item(new FabricItemSettings()));
    public static final Item bananium_shard = registerItem("bananium_shard", new Item(new FabricItemSettings()));
    public static final Item bananium = registerItem("bananium", new Item(new FabricItemSettings()));

    public static final Item cum_bucket = registerItem("cum_bucket", new Item(
            new FabricItemSettings()
                    .food(
                            new FoodComponent.Builder()
                                    .saturationModifier(50.0f)
                                    .hunger(6)
                                    .meat()
                                    .alwaysEdible()
                                    .build()
                    )
                    .maxCount(1)
                    .fireproof()
                    .rarity(Rarity.EPIC)
            )
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CouncilMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + CouncilMod.MOD_ID);

    }
}
