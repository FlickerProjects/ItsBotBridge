package io.github.itsflicker.itsbotbridge

import taboolib.common.io.newFile
import taboolib.common.platform.Plugin
import taboolib.common.platform.function.getDataFolder
import taboolib.expansion.setupPlayerDatabase
import taboolib.module.configuration.Config
import taboolib.module.configuration.Configuration

object ItsBotBridge : Plugin() {

    @Config
    lateinit var conf: Configuration
        private set

    override fun onEnable() {
        if (conf.getBoolean("database.enabled")) {
            setupPlayerDatabase(conf.getConfigurationSection("database")!!, conf.getString("database.table")!!)
        } else {
            setupPlayerDatabase(newFile(getDataFolder(), "data.db"))
        }
    }

}