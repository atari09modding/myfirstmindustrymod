package atari09.content.units;

import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.type.ItemStack;
import mindustry.world.blocks.units.UnitFactory;

public class ModUnitPlans {

    public static void load(){
        ((UnitFactory) Blocks.groundFactory).plans.add(
                new UnitFactory.UnitPlan(ModUnitTypes.razor, 60f*20f, ItemStack.with(Items.silicon, 70, Items.lead, 40)));
    }

}
