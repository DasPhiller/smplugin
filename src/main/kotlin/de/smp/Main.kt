package de.smp

import de.smp.listener.JoinListener
import de.smp.listener.QuitListener
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.main.KSpigot
import org.bukkit.Bukkit

class Main : KSpigot() {
    override fun startup() {
        val manager = Bukkit.getPluginManager()
        Bukkit.getConsoleSender().sendMessage("${KColors.GREEN}Plugin gestartet!")
        Bukkit.getPluginManager().registerEvents(JoinListener(), this)
        manager.registerEvents(QuitListener(), this)
    }

    override fun shutdown() {
        Bukkit.getConsoleSender().sendMessage("${KColors.RED}Plugin stopped!")

    }
}