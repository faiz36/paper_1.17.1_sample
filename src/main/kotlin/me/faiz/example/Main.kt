package me.faiz.example

import net.kyori.adventure.text.Component
import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin(), Listener {

    override fun onEnable() {
        this.server.pluginManager.registerEvents(this,this)
        this.logger.info("Example Plugin has Enabled!")
    }

    override fun onDisable() {
        this.logger.info("Example Plugin has Disabled!")
    }

    @EventHandler
    fun onJoin(e: PlayerJoinEvent){
        e.joinMessage(Component.text("§l§b"+e.player.name+"님이 접속하셨씁니다!"))
    }

}