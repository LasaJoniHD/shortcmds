package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player p = (Player) sender;
		if (sender instanceof Player) {
			if (p.hasPermission("shortcmds.feed")) {
				if (args.length == 0) {
					p.setFoodLevel(20);
					p.sendMessage("Du hast nun kein Hunger mehr!");
				} else if (args.length == 1) {
					if (Bukkit.getPlayer(args[0]) != null) {
						final Player target = Bukkit.getPlayer(args[1]);
						target.setFoodLevel(20);
						target.sendMessage("Du hast nun kein Hunger mehr!");
					} else {
						p.sendMessage("Bitte gebe einen Spieler an!");
					}

				} else {
					p.sendMessage("Falsche Argumente!");
				}
			}
		} else {
			sender.sendMessage("Dieser Kommand kann nur von einen Spieler ausgeführt werden!");
		}
		return false;
	}
}