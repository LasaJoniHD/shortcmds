package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player p = (Player) sender;
		if (sender instanceof Player) {
			if (p.hasPermission("shortcmds.heal")) {
				if (args.length == 0) {
					p.setHealth(p.getMaxHealth());
					p.setFoodLevel(20);
					p.sendMessage("§6Du wurdest geheilt!");
				} else if (args.length == 1) {
					if (Bukkit.getPlayer(args[0]) != null) {
						final Player target = Bukkit.getPlayer(args[0]);
						target.setHealth(p.getMaxHealth());
						target.setFoodLevel(20);
						target.sendMessage("§6Du wurdest geheilt!");
						p.sendMessage("§6" + target.getName() + " §6wurde geheilt!");
					} else {
						p.sendMessage("§6Bitte gebe einen Spieler an!");
					}

				} else {
					p.sendMessage("§4Falsche Argumente!");
				}
			} else {
				p.sendMessage("§4Däfür hast du keine Rechte!");
			}
		} else {
			sender.sendMessage("§6Dieser Kommand kann nur von einen Spieler ausgeführt werden!");
		}
		return false;
	}
}