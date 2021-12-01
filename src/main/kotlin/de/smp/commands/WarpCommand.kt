package de.smp.commands

import de.smp.guis.WarpGUI
import net.axay.kspigot.gui.openGUI
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class WarpCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        val warpGui = WarpGUI().gui
        if (sender !is Player) {
            return true
        }
        val player: Player = sender
        player.openGUI(warpGui)
        return true
    }
}