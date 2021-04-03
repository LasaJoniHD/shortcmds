package main;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import commands.ClearMyChat;
import commands.CreateConfig;
import commands.Feed;
import commands.Fly;
import commands.Heal;
import commands.Info;
import commands.Kill;
import commands.Playtime;
import commands.gamemode;
import listener.JoinListener;

public class main extends JavaPlugin implements Listener, CommandExecutor {

	public static FileConfiguration config;
	private static main plugin;

	@Override
	public void onLoad() {
		System.out.println(" ");
		System.out.println("ShortCMDS wird geladen!");
		System.out.println(" ");
	}

	@Override
	public void onEnable() {

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("░██████╗██╗░░██╗░█████╗░██████╗░████████╗░█████╗░███╗░░░███╗██████╗░░██████╗");
		System.out.println("██╔════╝██║░░██║██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗████╗░████║██╔══██╗██╔════╝");
		System.out.println("╚█████╗░███████║██║░░██║██████╔╝░░░██║░░░██║░░╚═╝██╔████╔██║██║░░██║╚█████╗░");
		System.out.println("░╚═══██╗██╔══██║██║░░██║██╔══██╗░░░██║░░░██║░░██╗██║╚██╔╝██║██║░░██║░╚═══██╗");
		System.out.println("██████╔╝██║░░██║╚█████╔╝██║░░██║░░░██║░░░╚█████╔╝██║░╚═╝░██║██████╔╝██████╔╝");
		System.out.println("╚═════╝░╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░░░░╚═╝╚═════╝░╚═════╝░");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("by LasaJoni");
		System.out.println(" ");
		System.out.println("ShortCMDS was started successful!");

		PluginManager pluginmanager = Bukkit.getPluginManager();
		pluginmanager.registerEvents(new JoinListener(), this);

		config = getConfig();
		plugin = this;

		getCommand("gamemode").setExecutor(new gamemode());
		getCommand("gm").setExecutor(new gamemode());
		getCommand("spielmodus").setExecutor(new gamemode());
		getCommand("cmc").setExecutor(new ClearMyChat());
		getCommand("clearmychat").setExecutor(new ClearMyChat());
		getCommand("löschemeinenchat").setExecutor(new ClearMyChat());
		getCommand("heal").setExecutor(new Heal());
		getCommand("heilen").setExecutor(new Heal());
		getCommand("feed").setExecutor(new Feed());
		getCommand("füttern").setExecutor(new Feed());
		getCommand("playtime").setExecutor(new Playtime());
		getCommand("spielzeit").setExecutor(new Playtime());
		getCommand("kill").setExecutor(new Kill());
		getCommand("töte").setExecutor(new Kill());
		getCommand("createconfig").setExecutor(new CreateConfig());
		getCommand("fly").setExecutor(new Fly());
		getCommand("fliegen").setExecutor(new Fly());
		getCommand("shortcmds").setExecutor(new Info());

	}

	@Override
	public void onDisable() {

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("░██████╗██╗░░██╗░█████╗░██████╗░████████╗░█████╗░███╗░░░███╗██████╗░░██████╗");
		System.out.println("██╔════╝██║░░██║██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗████╗░████║██╔══██╗██╔════╝");
		System.out.println("╚█████╗░███████║██║░░██║██████╔╝░░░██║░░░██║░░╚═╝██╔████╔██║██║░░██║╚█████╗░");
		System.out.println("░╚═══██╗██╔══██║██║░░██║██╔══██╗░░░██║░░░██║░░██╗██║╚██╔╝██║██║░░██║░╚═══██╗");
		System.out.println("██████╔╝██║░░██║╚█████╔╝██║░░██║░░░██║░░░╚█████╔╝██║░╚═╝░██║██████╔╝██████╔╝");
		System.out.println("╚═════╝░╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░░░░╚═╝╚═════╝░╚═════╝░");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("by LasaJoni");
		System.out.println(" ");
		System.out.println("ShortCMDS was disabled successful!");
	}

	public static main getPlugin() {
		return plugin;
	}

}
