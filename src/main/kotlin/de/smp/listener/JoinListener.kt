package de.smp.listener

import net.axay.kspigot.chat.KColors
import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class JoinListener : Listener{

    @EventHandler
    fun joinEvent(event: PlayerJoinEvent) {
        event.joinMessage = KColors.GREEN.toString() + event.player.name + " hat den Server betreten"
        event.player.sendMessage("§5»§6Willkommen zurück")
    }
}
