package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import files.Playerdataconfigfile;

public class Nick implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender.hasPermission("shortcmds.setdisplayname")) {
			if (sender instanceof Player) {
				Player p = (Player) sender;
				if (args[0].length() < 16) {
					if (args.length == 1) {
						String msg = args[0];
						p.setDisplayName(msg.replaceAll("&", "§"));
						p.setPlayerListName(msg.replaceAll("&", "§"));
						Playerdataconfigfile.get().addDefault(p.getName() + "Nick", msg.replaceAll("&", "§"));
						Playerdataconfigfile.get().options().copyDefaults(true);
						Playerdataconfigfile.save();
						p.sendMessage("§6Dein Nickname wurde auf §c" + msg.replaceAll("&", "§") + "§6 gesetzt!");
					} else if (args.length == 2) {
						if (Bukkit.getPlayer(args[1]) != null) {
							final Player target = Bukkit.getPlayer(args[1]);
							String msg = args[0];
							target.setDisplayName(msg.replaceAll("&", "§"));
							target.setPlayerListName(msg.replaceAll("&", "§"));
							Playerdataconfigfile.get().addDefault(target.getName() + "Nick", msg.replaceAll("&", "§"));
							Playerdataconfigfile.get().options().copyDefaults(true);
							Playerdataconfigfile.save();
							target.sendMessage(
									"§6Dein Displayname wurde auf §c" + msg.replaceAll("&", "§") + "§6 gesetzt!");
							p.sendMessage("§6Du hast erfolgreich den Nickname von §c" + target.getName() + " §6zu §c"
									+ msg.replaceAll("&", "§") + " §6geändert!");
						} else {
							sender.sendMessage("§6Bitte gebe einen Spieler an!");
						}
					} else {
						sender.sendMessage("§6Benutze §6/nick <Name> <Spieler>§6!");
					}
				} else if (args[0].length() > 3) {
					sender.sendMessage("§6Zu kurzer Nickname, benutze mehr als §c3§6 Zeichen!");
				} else {
					sender.sendMessage("§6Zu langer Nickname, benutze weniger als §c16§6 Zeichen!");
				}
			} else {
				sender.sendMessage("§6Dieser Kommand kann nur von einen Spieler ausgeführt werden!");
			}
		} else {
			sender.sendMessage("§4Dafür hast du keine Rechte!");
		}
		return false;
	}

}
