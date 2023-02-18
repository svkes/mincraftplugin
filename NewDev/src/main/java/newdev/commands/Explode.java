package newdev.commands;

import newdev.newdev.NewDev;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Explode implements CommandExecutor {

    Plugin plugin = NewDev.getPlugin(NewDev.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String food = plugin.getConfig().getString("Food");

        Player player = (Player) sender;
        player.sendMessage(food);

        return false;
    }
}
