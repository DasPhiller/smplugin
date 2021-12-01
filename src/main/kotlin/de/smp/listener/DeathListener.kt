package de.smp.listener

import net.axay.kspigot.chat.KColors
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.inventory.ItemStack

class DeathListener : Listener {

    @EventHandler
    fun deathListener(event: PlayerDeathEvent) {
        event.droppedExp = 100
        val i = ItemStack(Material.OAK_BOAT)
        event.entity.inventory.setItem(0, i)
        event.deathMessage = KColors.RED.toString() + event.entity.name + " ist Gestorben!"
    }
}