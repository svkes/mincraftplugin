package newdev.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FartCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player p) {
            if(args.length == 0) {
                p.sendMessage("U farted on urself");
                p.setHealthScale(0.5);
            }else{

                String playerName = args[0];

                Player target = Bukkit.getServer().getPlayerExact(playerName);

                if(target == null) {
                    p.sendMessage("This player is not online");
                }else{
                    p.sendMessage("You successfully farted on " + target.getDisplayName());
                    target.sendMessage("You got farted on by " + p.getDisplayName());
                    target.setHealthScale(0.5);
                }
            }
        }

        return true;
    }
}
