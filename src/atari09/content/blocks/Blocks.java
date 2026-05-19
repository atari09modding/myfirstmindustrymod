package atari09.content.blocks;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;

import static mindustry.type.ItemStack.with;

public class Blocks {

    public static Block red_wall;

    public static void load(){

        int wallHealthMultiplier = 4;

        red_wall = new BlockTypes.ExplosiveWall("explosive-reactive-wall"){{
            requirements(Category.defense, with(Items.graphite, 5, Items.coal, 5));
            health = 100 * wallHealthMultiplier;
            researchCostMultiplier = 0.1f;
        }};
    }
}
