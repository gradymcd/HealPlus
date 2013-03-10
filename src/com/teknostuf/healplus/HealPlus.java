package com.teknostuf.healplus;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class HealPlus extends JavaPlugin {
	public final Logger logger = Logger.getLogger("Minecraft");
	public static HealPlus plugin;

	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled.");
	}

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled!");
	}

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		Player player = (Player) sender;

		if (commandLabel.equalsIgnoreCase("healplus") || commandLabel.equalsIgnoreCase("hp") && player.hasPermission("hp.heal")){
			if (args.length == 0) {
				player.setHealth(20);
				player.setFireTicks(0);
				player.setFoodLevel(20);
				player.sendMessage(ChatColor.GREEN + "You have been healed!");
			} else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					targetPlayer.setHealth(20);
					targetPlayer.setFireTicks(0);
				}else if (args[0].equalsIgnoreCase("0")){
					player.setHealth(0);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("1")){
					player.setHealth(1);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("2")){
					player.setHealth(2);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("3")){
					player.setHealth(3);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("4")){
					player.setHealth(4);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("5")){
					player.setHealth(5);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("6")){
					player.setHealth(6);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("7")){
					player.setHealth(7);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("8")){
					player.setHealth(8);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("9")){
					player.setHealth(9);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("10")){
					player.setHealth(10);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("11")){
					player.setHealth(11);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("12")){
					player.setHealth(12);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("13")){
					player.setHealth(13);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("14")){
					player.setHealth(14);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("15")){
					player.setHealth(15);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("16")){
					player.setHealth(16);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("17")){
					player.setHealth(17);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("18")){
					player.setHealth(18);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("19")){
					player.setHealth(19);
					player.setFireTicks(0);
				} else if (args[0].equalsIgnoreCase("20")){
					player.setHealth(20);
					player.setFireTicks(0);
				}
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				player.sendMessage(ChatColor.GREEN + "You have healed " + targetPlayer.getDisplayName() + "!");
				targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "You have been healed by " + player.getDisplayName());
			} else if (args.length == 2) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					if (args[1].equalsIgnoreCase("1")){
						targetPlayer.setHealth(1);
					}else if (args[1].equalsIgnoreCase("0")){
						targetPlayer.setHealth(0);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("2")){
						targetPlayer.setHealth(2);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("3")){
						targetPlayer.setHealth(3);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("4")){
						targetPlayer.setHealth(4);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("5")){
						targetPlayer.setHealth(5);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("6")){
						targetPlayer.setHealth(6);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("7")){
						targetPlayer.setHealth(7);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("8")){
						targetPlayer.setHealth(8);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("9")){
						targetPlayer.setHealth(9);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("10")){
						targetPlayer.setHealth(10);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("11")){
						targetPlayer.setHealth(11);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("12")){
						targetPlayer.setHealth(12);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("13")){
						targetPlayer.setHealth(13);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("14")){
						targetPlayer.setHealth(14);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("15")){
						targetPlayer.setHealth(15);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("16")){
						targetPlayer.setHealth(16);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("17")){
						targetPlayer.setHealth(17);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("18")){
						targetPlayer.setHealth(18);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("19")){
						targetPlayer.setHealth(19);
						targetPlayer.setFireTicks(0);
					} else if (args[1].equalsIgnoreCase("20")){
						targetPlayer.setHealth(20);
						targetPlayer.setFireTicks(0);
				}
					player.sendMessage(ChatColor.GREEN + "You have healed " + targetPlayer.getDisplayName() + "!");
					targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "You have been healed by " + player.getDisplayName());
				}
			} else {
				player.sendMessage(ChatColor.RED + "That player is not online!");
				}
			
			
		} if (commandLabel.equalsIgnoreCase("feedplus") || commandLabel.equalsIgnoreCase("fp") && player.hasPermission("hp.feed")) {
			if (args.length == 0) {
				player.setFoodLevel(20);
				player.sendMessage(ChatColor.LIGHT_PURPLE + "You have been fed!");
			} else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					targetPlayer.setFoodLevel(20);
				}else if (args[0].equalsIgnoreCase("0")){
					player.setFoodLevel(0);
				} else if (args[0].equalsIgnoreCase("1")){
					player.setFoodLevel(1);
				} else if (args[0].equalsIgnoreCase("2")){
					player.setFoodLevel(2);
				} else if (args[0].equalsIgnoreCase("3")){
					player.setFoodLevel(3);
				} else if (args[0].equalsIgnoreCase("4")){
					player.setFoodLevel(4);
				} else if (args[0].equalsIgnoreCase("5")){
					player.setFoodLevel(5);
				} else if (args[0].equalsIgnoreCase("6")){
					player.setFoodLevel(6);
				} else if (args[0].equalsIgnoreCase("7")){
					player.setFoodLevel(7);
				} else if (args[0].equalsIgnoreCase("8")){
					player.setFoodLevel(8);
				} else if (args[0].equalsIgnoreCase("9")){
					player.setFoodLevel(9);
				} else if (args[0].equalsIgnoreCase("10")){
					player.setFoodLevel(10);
				} else if (args[0].equalsIgnoreCase("11")){
					player.setFoodLevel(11);
				} else if (args[0].equalsIgnoreCase("12")){
					player.setFoodLevel(12);
				} else if (args[0].equalsIgnoreCase("13")){
					player.setFoodLevel(13);
				} else if (args[0].equalsIgnoreCase("14")){
					player.setFoodLevel(14);
				} else if (args[0].equalsIgnoreCase("15")){
					player.setFoodLevel(15);
				} else if (args[0].equalsIgnoreCase("16")){
					player.setFoodLevel(16);
				} else if (args[0].equalsIgnoreCase("17")){
					player.setFoodLevel(17);
				} else if (args[0].equalsIgnoreCase("18")){
					player.setFoodLevel(18);
				} else if (args[0].equalsIgnoreCase("19")){
					player.setFoodLevel(19);
				} else if (args[0].equalsIgnoreCase("20")){
					player.setFoodLevel(20);
				}
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				player.sendMessage(ChatColor.GREEN + "You have fed " + targetPlayer.getDisplayName() + "!");
				targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "You have been fed by " + player.getDisplayName() + "!");
			} else if (args.length == 2) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = player.getServer().getPlayer(args[0]);
					if (args[1].equalsIgnoreCase("1")){
						targetPlayer.setFoodLevel(1);
					}else if (args[0].equalsIgnoreCase("0")){
						targetPlayer.setFoodLevel(0);
					} else if (args[1].equalsIgnoreCase("2")){
						targetPlayer.setFoodLevel(2);
					} else if (args[1].equalsIgnoreCase("3")){
						targetPlayer.setFoodLevel(3);
					} else if (args[1].equalsIgnoreCase("4")){
						targetPlayer.setFoodLevel(4);
					} else if (args[1].equalsIgnoreCase("5")){
						targetPlayer.setFoodLevel(5);
					} else if (args[1].equalsIgnoreCase("6")){
						targetPlayer.setFoodLevel(6);
					} else if (args[1].equalsIgnoreCase("7")){
						targetPlayer.setFoodLevel(7);
					} else if (args[1].equalsIgnoreCase("8")){
						targetPlayer.setFoodLevel(8);
					} else if (args[1].equalsIgnoreCase("9")){
						targetPlayer.setFoodLevel(9);
					} else if (args[1].equalsIgnoreCase("10")){
						targetPlayer.setFoodLevel(10);
					} else if (args[1].equalsIgnoreCase("11")){
						targetPlayer.setFoodLevel(11);
					} else if (args[1].equalsIgnoreCase("12")){
						targetPlayer.setFoodLevel(12);
					} else if (args[1].equalsIgnoreCase("13")){
						targetPlayer.setFoodLevel(13);
					} else if (args[1].equalsIgnoreCase("14")){
						targetPlayer.setFoodLevel(14);
					} else if (args[1].equalsIgnoreCase("15")){
						targetPlayer.setFoodLevel(15);
					} else if (args[1].equalsIgnoreCase("16")){
						targetPlayer.setFoodLevel(16);
					} else if (args[1].equalsIgnoreCase("17")){
						targetPlayer.setFoodLevel(17);
					} else if (args[1].equalsIgnoreCase("18")){
						targetPlayer.setFoodLevel(18);
					} else if (args[1].equalsIgnoreCase("19")){
						targetPlayer.setFoodLevel(19);
					} else if (args[1].equalsIgnoreCase("20")){
						targetPlayer.setFoodLevel(20);
					}
					player.sendMessage(ChatColor.GREEN + "You have fed " + targetPlayer.getDisplayName() + "!");
					targetPlayer.sendMessage(ChatColor.LIGHT_PURPLE + "You have been fed by " + player.getDisplayName());
				}
			} else {
					player.sendMessage(ChatColor.RED + "That player is not online!");
					}
				}
		return false;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> Beta 1.2.0
