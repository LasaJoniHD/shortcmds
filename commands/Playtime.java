package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Playtime implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player p = (Player) sender;
		if (p.hasPermission("shortcmds.playtime")) {
			printPlayerTime(p);
		} else if (p.hasPermission("shortcmds.playtimeall")) {
			if (args.length == 1) {
				if (Bukkit.getPlayer(args[0]) != null) {
					final Player target = Bukkit.getPlayer(args[1]);
					printPlayerTime(target);
				}
			} else if (args.length == 0) {
				printPlayerTime(p);
			} else {
				p.sendMessage("Falsche Argumente!");
			}
		}
		return false;

	}

	private void printPlayerTime(Player p) {
		long TargetTime = p.getPlayerTime();
		long TargetTimehour = TargetTime / 20 / 60 / 60;
		long TargetTime2 = TargetTimehour * 20 * 60 * 60;
		long TargetTimeminute = (TargetTime - TargetTime2) / 20 / 60;
		p.sendMessage(p.getName() + "'s momentane Spielzeit beträgt " + TargetTimehour + " Stunden " + TargetTimeminute
				+ " Minuten.");

	}
}