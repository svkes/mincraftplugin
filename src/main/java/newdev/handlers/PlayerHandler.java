package newdev.handlers;

import newdev.newdev.NewDev;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerHandler implements Listener{
    public PlayerHandler(NewDev plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        ItemStack item = new ItemStack(Material.GRASS_BLOCK, 10);
        Inventory inv = player.getInventory();

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("weed");
        item.setItemMeta(meta);

        inv.addItem(item);
        inv.setItem(8, item);
    }
}
