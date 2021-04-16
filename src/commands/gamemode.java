package commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gamemode implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player p = (Player) sender;
		if (sender instanceof Player) {
			if (p.hasPermission("shortcmds.gamemode")) {
				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("0")) {
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage("§6Dein Spielmodus wurde auf §cÜberleben§6 gesetzt!");
					} else if (args[0].equalsIgnoreCase("1")) {
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage("§6Dein Speilmodus wurde auf §cKreativ§6 gesetzt!");
					} else if (args[0].equalsIgnoreCase("2")) {
						p.setGameMode(GameMode.ADVENTURE);
						p.sendMessage("§6Dein Speilmodus wurde auf §cAbenteuer§6 gesetzt!");
					} else if (args[0].equalsIgnoreCase("3")) {
						p.setGameMode(GameMode.SPECTATOR);
						p.sendMessage("§6Dein Speilmodus wurde auf §cZuschauer§6 gesetzt!");

					} else if (args[0].equalsIgnoreCase("creative")) {
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage("§6Dein Speilmodus wurde auf §cKreativ§6 gesetzt!");
					} else if (args[0].equalsIgnoreCase("adventure")) {
						p.setGameMode(GameMode.ADVENTURE);
						p.sendMessage("§6Dein Speilmodus wurde auf §cAbenteuer§6 gesetzt!");
					} else if (args[0].equalsIgnoreCase("spectator")) {
						p.setGameMode(GameMode.SPECTATOR);
						p.sendMessage("§6Dein Speilmodus wurde auf §cZuschauer§6 gesetzt!");
					} else if (args[0].equalsIgnoreCase("survival")) {
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage("§6Dein Spielmodus wurde auf §cÜberleben§6 gesetzt!");
					} else if (args[0].equalsIgnoreCase("kreativ")) {
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage("§6Dein Speilmodus wurde auf §cKreativ§6 gesetzt!");
					} else if (args[0].equalsIgnoreCase("abenteuer")) {
						p.setGameMode(GameMode.ADVENTURE);
						p.sendMessage("§6Dein Speilmodus wurde auf §cAbenteuer§6 gesetzt!");
					} else if (args[0].equalsIgnoreCase("zuschauer")) {
						p.setGameMode(GameMode.SPECTATOR);
						p.sendMessage("§6Dein Speilmodus wurde auf §cZuschauer§6 gesetzt!");
					} else if (args[0].equalsIgnoreCase("überleben")) {
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage("§6Dein Spielmodus wurde auf §cÜberleben§6 gesetzt!");
					}
				} else if (args.length == 2) {
					if (Bukkit.getPlayer(args[1]) != null) {
						final Player target = Bukkit.getPlayer(args[1]);
						if (args[0].equalsIgnoreCase("0")) {
							target.setGameMode(GameMode.SURVIVAL);
							target.sendMessage("§6Dein Spielmodus wurde auf §cÜberleben§6 gesetzt!");
						} else if (args[0].equalsIgnoreCase("1")) {
							target.setGameMode(GameMode.CREATIVE);
							target.sendMessage("§6Dein Speilmodus wurde auf §cKreativ§6 gesetzt!");
						} else if (args[0].equalsIgnoreCase("2")) {
							target.setGameMode(GameMode.ADVENTURE);
							target.sendMessage("§6Dein Speilmodus wurde auf §cAbenteuer§6 gesetzt!");
						} else if (args[0].equalsIgnoreCase("3")) {
							target.setGameMode(GameMode.SPECTATOR);
							target.sendMessage("§6Dein Speilmodus wurde auf §cZuschauer§6 gesetzt!");

						} else if (args[0].equalsIgnoreCase("creative")) {
							target.setGameMode(GameMode.CREATIVE);
							target.sendMessage("§6Dein Speilmodus wurde auf §cKreativ§6 gesetzt!");
						} else if (args[0].equalsIgnoreCase("adventure")) {
							target.setGameMode(GameMode.ADVENTURE);
							target.sendMessage("§6Dein Speilmodus wurde auf §cAbenteuer§6 gesetzt!");
						} else if (args[0].equalsIgnoreCase("spectator")) {
							target.setGameMode(GameMode.SPECTATOR);
							target.sendMessage("§6Dein Speilmodus wurde auf §cZuschauer§6 gesetzt!");
						} else if (args[0].equalsIgnoreCase("survival")) {
							target.setGameMode(GameMode.SURVIVAL);
							target.sendMessage("§6Dein Spielmodus wurde auf §cÜberleben§6 gesetzt!");
						} else if (args[0].equalsIgnoreCase("kreativ")) {
							target.setGameMode(GameMode.CREATIVE);
							target.sendMessage("§6Dein Speilmodus wurde auf §cKreativ§6 gesetzt!");
						} else if (args[0].equalsIgnoreCase("abenteuer")) {
							target.setGameMode(GameMode.ADVENTURE);
							target.sendMessage("§6Dein Speilmodus wurde auf §cAbenteuer§6 gesetzt!");
						} else if (args[0].equalsIgnoreCase("zuschauer")) {
							target.setGameMode(GameMode.SPECTATOR);
							target.sendMessage("§6Dein Speilmodus wurde auf §cZuschauer§6 gesetzt!");
						} else if (args[0].equalsIgnoreCase("überleben")) {
							target.setGameMode(GameMode.SURVIVAL);
							target.sendMessage("§6Dein Spielmodus wurde auf §cÜberleben§6 gesetzt!");
						}
					} else {
						p.sendMessage("§6Bitte gebe ein Spieler ein!");
					}
				} else {
					p.sendMessage("§4Falsche Argumente!");
				}

			} else {
				p.sendMessage("§4Dafür hast du keine Rechte");
			}
		} else {
			sender.sendMessage("§6Dieser Kommand kann nur von einen Spieler ausgeführt werden!");
		}
		return false;
	}

}
