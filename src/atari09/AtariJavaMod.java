package atari09;

import arc.*;
import arc.util.*;
import atari09.content.blocks.ModBlockTypes;
import atari09.content.blocks.ModBlocks;
import atari09.content.techtree.ModTechTreeLoader;
import atari09.content.units.ModUnitPlans;
import atari09.content.units.ModUnitTypes;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class AtariJavaMod extends Mod{

    public AtariJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        Runnable ACTION_2 = () -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("atari");
                dialog.cont.add("Attention!").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("ataris-first-mod-logo")).pad(20f).row();
                dialog.cont.button("You are now playing with my first ever mindustry mod.", dialog::hide).size(500f, 100f);
                dialog.show();
            });};

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("ataris-first-mod-frog")).pad(20f).row();
                dialog.cont.button("I see", () -> {
                    ACTION_2.run();
                    dialog.hide();
                }).size(100f, 50f);
                dialog.show();
            });
        });





    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
        ModBlocks.load();
        ModUnitTypes.load();
        ModUnitPlans.load();
        ModTechTreeLoader.load();
    }


    public void putClasses(){
        ClassMap.classes.put("ExplosiveWallBuild", ModBlockTypes.ExplosiveWall.ExplosiveWallBuild.class);
    }

}
