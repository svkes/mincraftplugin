package newdev.listeners;

import newdev.newdev.NewDev;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class ShearSheepListener implements Listener {
    public ShearSheepListener(NewDev plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onSheerSheep(PlayerShearEntityEvent e) {
        Player player = e.getPlayer();
        Entity entity = e.getEntity();

        if (entity.getType() == EntityType.SHEEP) {
            e.setCancelled(true);
            player.sendMessage(player.getDisplayName() + "you can't shear sheeps");
        } else {
            player.sendMessage(player.getDisplayName() +"cice shearing");
        }

    }
}
