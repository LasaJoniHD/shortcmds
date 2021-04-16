package main;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import commands.Broadcast;
import commands.ClearMyChat;
import commands.CreateConfig;
import commands.Feed;
import commands.Fly;
import commands.Heal;
import commands.Info;
import commands.Kill;
import commands.Nick;
import commands.Playtime;
import commands.gamemode;
import files.Playerdataconfigfile;
import listener.JoinListener;

public class main extends JavaPlugin implements Listener, CommandExecutor {

	public static FileConfiguration config;
	private static main plugin;
	public static String version = "1.4";

	@Override
	public void onLoad() {
		System.out.println(" ");
		System.out.println("ShortCMDS wird geladen!");
		System.out.println(" ");
	}

	@Override
	public void onEnable() {

		ShortCMDSAnzeige(version);
		System.out.println("ShortCMDS was started successful!");

		Playerdataconfigfile.setup();
		Playerdataconfigfile.get().options().copyDefaults(true);
		Playerdataconfigfile.save();

		PluginManager pluginmanager = Bukkit.getPluginManager();
		pluginmanager.registerEvents(new JoinListener(), this);

		config = getConfig();
		plugin = this;

		getCommand("gamemode").setExecutor(new gamemode());
		getCommand("cmc").setExecutor(new ClearMyChat());
		getCommand("heal").setExecutor(new Heal());
		getCommand("feed").setExecutor(new Feed());
		getCommand("playtime").setExecutor(new Playtime());
		getCommand("kill").setExecutor(new Kill());
		getCommand("createconfig").setExecutor(new CreateConfig());
		getCommand("fly").setExecutor(new Fly());
		getCommand("shortcmds").setExecutor(new Info());
		getCommand("broadcast").setExecutor(new Broadcast());
		getCommand("setdisplayname").setExecutor(new Nick());

	}

	@Override
	public void onDisable() {

		ShortCMDSAnzeige(version);
		System.out.println("ShortCMDS was disabled successful!");
	}

	public static main getPlugin() {
		return plugin;
	}

	private void ShortCMDSAnzeige(String version) {
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
		System.out.println("Version: " + version);
		System.out.println(" ");
	}

}
