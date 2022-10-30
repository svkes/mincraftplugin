package newdev.listeners;

import newdev.newdev.NewDev;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public class XPBottleBreakListener implements Listener {

    public XPBottleBreakListener(NewDev plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onXPBottleBreak(ExpBottleEvent e) {
        e.setShowEffect(false);

    }
}
