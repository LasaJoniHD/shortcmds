package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearMyChat implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player p = (Player) sender;
		if (sender instanceof Player) {
			if (sender.hasPermission("shortcmds.clearmychat")) {
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage(" ");
				p.sendMessage("Dein Chat wurde gel�scht!");
			} else {
				sender.sendMessage("Daf�r hast du keine Rechte!");
			}
		} else {
			sender.sendMessage("Dieser Kommand kann nur von einen Spieler ausgef�hrt werden!");
		}

		return false;
	}

}
