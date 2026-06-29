package atari09.content.blocks;

import mindustry.entities.Damage;
import mindustry.world.blocks.defense.Wall;

public class ModBlockTypes {

    public static class ExplosiveWall extends Wall{

        public ExplosiveWall(String name) {
            super(name);
        }


        public class ExplosiveWallBuild extends WallBuild {

            @Override
            public void onDestroyed() {
                Damage.dynamicExplosion(this.x, this.y, 0f, 400f, 100f, 50f, true,false, null, this.block.destroyEffect, 20f);
                super.onDestroyed();
            }
        }

    }
}


