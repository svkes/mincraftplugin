package newdev.commands;

import newdev.newdev.NewDev;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class MenuCommand implements Listener, CommandExecutor {
    private String invName = "Server Selector";
    public MenuCommand(NewDev plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if(!event.getView().getTitle().equals((invName))) {
            return;
        }

        Player p = (Player) event.getWhoClicked();
        int slot = event.getSlot();

        //if(slot == 11) ADD MORE CODE HERE

        event.setCancelled(true);
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player p) {
            Inventory inv = Bukkit.createInventory(p, 9*3, invName);

            inv.setItem(11, getItem(new ItemStack(Material.DIAMOND_SWORD), "&9PVP", "&9Click to Join", "&aBattle it out in our arena"));
            inv.setItem(13, getItem(new ItemStack(Material.BEACON), "&9Creative Plots", "&9Click to Join", "&9Infinite Builds", "Have fun!"));
            inv.setItem(15, getItem(new ItemStack(Material.COMPASS), "&9Lobby Selector", "&9Click to Join", "&9Join one of our lobbies"));

            p.openInventory(inv);



        }else{
            sender.sendMessage("Only players can run this command");
        }

        return true;
    }

    private ItemStack getItem(ItemStack item, String name, String ... lore) {
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));

        List<String> lores = new ArrayList<>();

        for (String s : lore) {
            lores.add(ChatColor.translateAlternateColorCodes('&', s));
        }
        meta.setLore(lores);

        item.setItemMeta(meta);
        return item;
    }
}
