package atari09.content.techtree;

import atari09.content.blocks.ModBlocks;
import atari09.content.units.ModUnitTypes;
import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.content.TechTree;
import mindustry.content.UnitTypes;
import mindustry.type.ItemStack;

public class ModTechTreeLoader {

    public static void load(){
        TechTree.node(UnitTypes.nova, ()-> {
            TechTree.node(ModUnitTypes.razor,
                    ItemStack.with(Items.silicon, 500, Items.lead, 200), ()->{});

        });

        TechTree.node(Blocks.titaniumWall, ()->{
            TechTree.node(ModBlocks.red_wall,
                    ItemStack.with(Items.blastCompound, 200, Items.silicon, 200), ()->{});
        });
    }
}
