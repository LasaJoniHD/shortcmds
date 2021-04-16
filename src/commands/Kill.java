package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kill implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player p = (Player) sender;
		if (sender instanceof Player) {
			if (sender.hasPermission("shortcmds.kill")) {
				if (args.length == 0) {
					p.setHealth(0);
					p.sendMessage("§6Du hast dich getötet!");
				} else if (args.length == 1) {
					if (Bukkit.getPlayer(args[0]) != null) {
						final Player target = Bukkit.getPlayer(args[0]);
						target.setHealth(0);
						target.sendMessage("§6Du wurdest von " + p.getName() + " getötet!");
						p.sendMessage("§6Du hast erfolgreich " + target.getName() + " getötet!");
					} else {
						p.sendMessage("§6Bitte gebe einen Spieler an!");
					}

				} else {
					p.sendMessage("§4Falsche Argumente!");
				}
			} else {
				sender.sendMessage("§4Dafür hast du keine Rechte!");
			}
		}

		return false;
	}

}
