package newdev.commands;

import newdev.newdev.NewDev;
import newdev.util.ConfigUtil;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCommand implements CommandExecutor {

    private final NewDev plugin;
    private ConfigUtil config;


    public SetSpawnCommand(NewDev plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player p) {
            Location location = p.getLocation();

            ConfigUtil config = new ConfigUtil(plugin, "spawn.yml");
            config.getConfig().set("spawn", location);
            config.save();
            p.sendMessage("Spawn location set!");



        }

        return true;
    }
}
