package listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import files.Playerdataconfigfile;
import main.main;

public class JoinListener implements Listener {

	@EventHandler
	public void handlePlayerJoin(PlayerJoinEvent event) {
		String msg = main.config.getString("Messages.JoinMessage");
		Player p = event.getPlayer();
		p.setDisplayName(Playerdataconfigfile.get().getString(p.getName() + "Nick"));
		p.setPlayerListName(Playerdataconfigfile.get().getString(p.getName() + "Nick"));
		msg = msg.replace("[Player]", p.getName());
		event.setJoinMessage(msg.replaceAll("&", "§"));
	}

	@EventHandler
	public void handlePlayerQuit(PlayerQuitEvent event) {
		String msg = main.config.getString("Messages.QuitMessage");
		Player p = event.getPlayer();
		msg = msg.replace("[Player]", p.getName());
		event.setQuitMessage(msg.replaceAll("&", "§"));

	}

}
