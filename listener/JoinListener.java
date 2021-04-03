package listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import main.main;

public class JoinListener implements Listener {

	@EventHandler
	public void handlePlayerJoin(PlayerJoinEvent event) {
		String msg = main.config.getString("Config.JoinMessage");
		Player p = event.getPlayer();
		msg = msg.replace("[Player]", p.getName());
		event.setJoinMessage(ChatColor.translateAlternateColorCodes('&', msg));
	}

	@EventHandler
	public void handlePlayerQuit(PlayerQuitEvent event) {
		String msg = main.config.getString("Config.QuitMessage");
		Player p = event.getPlayer();
		msg = msg.replace("[Player]", p.getName());
		event.setQuitMessage(ChatColor.translateAlternateColorCodes('&', msg));

	}

}
