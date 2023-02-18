package newdev.handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import newdev.newdev.NewDev;
import org.bukkit.event.block.BlockPlaceEvent;

public class TorchHandler implements Listener {
    public TorchHandler(NewDev plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onTorchPlace_Low(BlockPlaceEvent event) {
        if (!event.getPlayer().hasPermission("NewDev.rich")) {
            event.getBlock().setType(Material.DIAMOND_BLOCK);
            event.setCancelled(true);
        }
    }
}
