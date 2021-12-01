package de.smp.commands

import net.axay.kspigot.chat.KColors
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class SpawnCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            return true
        }

        val player: Player = sender

        if (player.world.environment.equals(World.Environment.NORMAL) ) {
            val loc:Location = Location(player.world, 0.0, 100.0, 0.0)
            player.teleport(loc)
        } else {
            player.sendMessage("${KColors.RED}Du musst dich in der Normalen Welt befinden")
        }

        return true
    }
}