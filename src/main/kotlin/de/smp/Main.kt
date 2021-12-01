package de.smp

import de.smp.commands.SpawnCommand
import de.smp.commands.WarpCommand
import de.smp.listener.DeathListener
import de.smp.listener.JoinListener
import de.smp.listener.QuitListener
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.extensions.pluginManager
import net.axay.kspigot.main.KSpigot
import org.bukkit.Bukkit

class Main : KSpigot() {
    override fun startup() {
        Bukkit.getConsoleSender().sendMessage("${KColors.GREEN}Plugin gestartet!")
        Bukkit.getPluginManager().registerEvents(JoinListener(), this)
        pluginManager.registerEvents(QuitListener(), this)
        pluginManager.registerEvents(DeathListener(), this)
        getCommand("spawn")?.setExecutor(SpawnCommand())
        getCommand("warp")?.setExecutor(WarpCommand())
    }

    override fun shutdown() {
        Bukkit.getConsoleSender().sendMessage("${KColors.RED}Plugin stopped!")

    }
}