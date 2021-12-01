package de.smp.guis

import net.axay.kspigot.chat.KColors
import net.axay.kspigot.gui.*
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class WarpGUI {

    val gui = kSpigotGUI(GUIType.ONE_BY_NINE) {
        title = "${KColors.AQUA}Warp menu"
        //Glass
        val glass = ItemStack(Material.GLASS)
        val glassmeta = glass.itemMeta
        glassmeta?.setDisplayName("")
        glass.itemMeta = glassmeta

        //paper
        val paper = ItemStack(Material.PAPER)
        val papermeta = paper.itemMeta
        papermeta?.setDisplayName("${KColors.AQUA}Nächste Seite")
        paper.itemMeta = papermeta

        page(0) {
            placeholder(Slots.RowOneSlotOne rectTo Slots.RowOneSlotFour, glass)
            nextPage(Slots.RowOneSlotNine, paper)
        }
        page(1) {
            transitionFrom = PageChangeEffect.SLIDE_HORIZONTALLY
            transitionTo = PageChangeEffect.SLIDE_HORIZONTALLY
            val soon = ItemStack(Material.REDSTONE)
            val soonmeta = soon.itemMeta
            soonmeta?.setDisplayName("${KColors.DARKRED}${KColors.ITALIC}»Soon")
            soon.itemMeta = soonmeta
            placeholder(Slots.All, soon)
        }

    }
}