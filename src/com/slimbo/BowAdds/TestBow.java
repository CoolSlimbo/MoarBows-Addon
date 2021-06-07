package com.slimbo.BowAdds;

import net.Indyuce.moarbows.api.MoarBow;
import net.Indyuce.moarbows.api.particle.ParticleData;


import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.block.data.type.Bed;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.ItemStack;

public class TestBow {

    public abstract class Test_Bow extends MoarBow {
        public Test_Bow() {
            super("YOUR_BOW_ID", "Your Bow Name", new String[] { "This is your bow lore.", "Add as many lines as you wish." }, 0, new ParticleData(Particle.BLOCK_DUST), new String[] { "TNT,TNT,TNT", "TNT,BOW,TNT", "TNT,TNT,TNT" });

            addModifier();
    }

    public boolean canShoot(EntityShootBowEvent event, Arrow arrow, Player shooter, ItemStack item) {
        return true;
    }

    public void whenHit(EntityDamageByEntityEvent event, Arrow arrow, Entity hit, Player shooter) {

    }

    public void whenLand(Player shooter, Arrow arrow) {
            arrow.remove();
            Location loc = arrow.getLocation();
            arrow.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
    }
}
}
