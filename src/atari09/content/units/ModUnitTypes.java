package atari09.content.units;

import arc.Core;
import arc.math.Interp;
import arc.struct.ObjectSet;
import mindustry.content.Fx;
import mindustry.content.Planets;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.gen.Sounds;
import mindustry.gen.UnitEntity;
import mindustry.graphics.Pal;
import mindustry.type.UnitType;
import mindustry.type.Weapon;


import static mindustry.Vars.tilesize;

public class ModUnitTypes {

    public static UnitType razor;

    public static void load(){
        razor = new UnitType("razor"){{
            constructor = UnitEntity::create;
            researchCostMultiplier = 0.5f;
            speed = 3f;
            hitSize = 15f;
            health = 550f;
            armor = 3f;
            buildTime = 20f;
            shownPlanets = ObjectSet.with(Planets.serpulo);
            rotateSpeed = 20f;


            weapons.add(
                    new Weapon("ataris-first-mod-razor-gun"){{
                        top = true;
                        reload = 1.5f;
                        rotate = false;
                        x = 8;
                        y = 4;
                        ejectEffect = Fx.casing3;
                        shootSound = Sounds.shootArc;
                        mirror = true;
                        bullet = new BasicBulletType(20f,15f){{
                            width = 4.5f;
                            height = 35f;
                            lifetime = (26f * tilesize) / 12f;
                            shrinkX = 0.6f;
                            shrinkY = 0f;
                            shrinkInterp = Interp.slope;

                            trailChance = 10f / 80f;
                            trailColor = Pal.redSpark;
                            trailEffect = Fx.bulletSparkSmokeTrailSmall;
                            trailSpread = 2f;
                            shootEffect = Fx.shootPyraFlame;
                            hitEffect = Fx.hitFlamePlasma;
                        }};
                    }}
            );
        }};

    }
}
