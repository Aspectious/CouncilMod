package dev.aspectious.block;

import dev.aspectious.CouncilMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModBlocks {
    public static final Block jarttlinglyinium = registerBlock("jarttlinglyinium", new Block(FabricBlockSettings.create().strength(4.0f)));
    public static final Block jarttlinglyinium_ore = registerBlock("jarttlinglyinium_ore",
            new Block(
                    FabricBlockSettings.create()
                            .strength(4.0f)
                            .luminance(3)
                            .hardness(2.0f)
                            .requiresTool()
            )
    );
    public static final Block allenminium = registerBlock("allenminium_ore",
            new Block(
                    FabricBlockSettings.create()
                            .strength(1.0f)
                            .hardness(1.0f)
                            .requiresTool()
            )
    );
    public static final Block bananium_ore = registerBlock("bananium_ore",
            new Block(
                    FabricBlockSettings.create()
                            .strength(2.0f)
                            .hardness(1.0f)
                            .slipperiness(200.0f)
                            .requiresTool()
            )
    );
    public static final Block seabirdium_ore = registerBlock("seabirdium_ore",
            new Block(
                    FabricBlockSettings.create()
                            .strength(5.0f)
                            .hardness(3.0f)
                            .requiresTool()
            )
    );


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CouncilMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CouncilMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Items for " + CouncilMod.MOD_ID);

    }
}
