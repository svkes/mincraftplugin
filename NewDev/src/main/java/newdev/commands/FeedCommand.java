package newdev.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player p) {
            if(p.hasPermission("newdev.feed") == true) {
                p.setFoodLevel(20);
                p.sendMessage(ChatColor.YELLOW + "Food set to max");
            }else{
                p.sendMessage(ChatColor.RED + "You do not have permission");
            }
        }
        return true;
    }

}
