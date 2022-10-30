package newdev.newdev;

import newdev.commands.*;
import newdev.handlers.PlayerHandler;
import newdev.handlers.TorchHandler;
import newdev.listeners.ShearSheepListener;
import newdev.listeners.XPBottleBreakListener;
import newdev.util.ConfigUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public final class NewDev extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Hello World");

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        ConfigUtil config = new ConfigUtil(this, "test.yml");
        config.getConfig().set("hello", "world");
        config.save();


        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("god").setExecutor(new GodCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("explode").setExecutor(new Explode());
        getCommand("repeat").setExecutor(new RepeatCommand());
        getCommand("fart").setExecutor(new FartCommand());
        getCommand("menu").setExecutor(new MenuCommand(this));
        getCommand("setspawn").setExecutor(new SetSpawnCommand(this));

        new TorchHandler(this);

        new XPBottleBreakListener(this);

        new ShearSheepListener(this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Shutting Down");
    }
}
