package com.slimbo.BowAdds;

import net.Indyuce.moarbows.api.ArrowData;
import net.Indyuce.moarbows.api.MoarBow;
import net.Indyuce.moarbows.api.particle.ParticleData;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityShootBowEvent;

public class TestBow {

    public static class Test_Bow extends MoarBow {
        public Test_Bow() {
            super("Test_Bow", "Test Bow", new String[] { "This is your bow lore.", "Add as many lines as you wish." }, 1000, new ParticleData(Particle.BLOCK_DUST), new String[] { "TNT,TNT,TNT", "TNT,BOW,TNT", "TNT,TNT,TNT" });

            addModifier();
    }

        @Override
        public boolean canShoot(EntityShootBowEvent event, ArrowData arrow) {
            return false;
        }

        @Override
        public void whenHit(EntityDamageByEntityEvent event, ArrowData arrow, Entity entity) {

        }

        @Override
        public void whenLand(ArrowData arrow) {
            arrow.getArrow().remove();
            Location loc = arrow.getArrow().getLocation();
            arrow.getArrow().getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
        }
    }
}
