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
				p.sendMessage("§6Dein Chat wurde gelöscht!");
			} else {
				sender.sendMessage("§4Däfür hast du keine Rechte!");
			}
		} else {
			sender.sendMessage("§6Dieser Kommand kann nur von einen Spieler ausgeführt werden!");
		}

		return false;
	}

}
