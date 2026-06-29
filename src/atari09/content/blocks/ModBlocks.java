package atari09.content.blocks;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.world.Block;

import static mindustry.type.ItemStack.with;

public class ModBlocks {

    public static Block red_wall;

    public static void load(){

        int wallHealthMultiplier = 4;

        red_wall = new ModBlockTypes.ExplosiveWall("explosive-reactive-wall"){{
            requirements(Category.defense, with(Items.silicon, 5, Items.blastCompound, 5));
            health = 100 * wallHealthMultiplier;
            researchCostMultiplier = 0.1f;


        }};
    }
}
