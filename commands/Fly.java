package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender.hasPermission("shortcmds.fly")) {
			if (sender instanceof Player) {
				Player p = (Player) sender;
				if (!p.getAllowFlight()) {
					p.setAllowFlight(true);
					p.setFlying(true);
					p.sendMessage("Du kannst jetzt fliegen!");
				} else {
					p.setAllowFlight(false);
					p.setFlying(false);
					p.sendMessage("Du kannst jetzt nicht mehr fliegen!");
				}
			} else {
				sender.sendMessage("Dieser Kommand kann nur von einen Spieler ausgeführt werden!");
			}
		} else {
			sender.sendMessage("Dafür hast du keine Rechte!");
		}
		return false;
	}
}