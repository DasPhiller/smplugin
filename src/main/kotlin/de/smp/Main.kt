package de.smp

import de.smp.listener.JoinListener
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.main.KSpigot
import org.bukkit.Bukkit

class Main : KSpigot() {
    override fun startup() {
        Bukkit.getConsoleSender().sendMessage("${KColors.GREEN}Plugin gestartet!")
        Bukkit.getPluginManager().registerEvents(JoinListener(), this)
    }

    override fun shutdown() {
        Bukkit.getConsoleSender().sendMessage("${KColors.RED}Plugin stopped!")

    }
}