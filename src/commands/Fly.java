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
					p.sendMessage("§6Du kannst jetzt fliegen!");
				} else {
					p.setAllowFlight(false);
					p.setFlying(false);
					p.sendMessage("§6Du kannst jetzt nicht mehr fliegen!");
				}
			} else {
				sender.sendMessage("§6Dieser Kommand kann nur von einen Spieler ausgeführt werden!");
			}
		} else {
			sender.sendMessage("§4Däfür hast du keine Rechte!");
		}
		return false;
	}
}