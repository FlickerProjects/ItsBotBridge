package io.github.itsflicker.itsbotbridge

import io.github.itsflicker.itsbotbridge.database.OfflineProxyPlayer
import org.bukkit.Bukkit
import org.bukkit.command.CommandSender
import taboolib.common.platform.command.CommandBody
import taboolib.common.platform.command.CommandHeader
import taboolib.common.platform.command.subCommand
import taboolib.common.platform.command.suggestPlayers
import taboolib.expansion.getDataContainer
import taboolib.expansion.releaseDataContainer
import taboolib.expansion.setupDataContainer
import java.util.*

@CommandHeader("itsbotbridge", ["ibb"], permission = "itsbotbridge.access")
object CommandHandler {

    @CommandBody
    val bind = subCommand {
        dynamic("uuid") {
            dynamic("qq") {
                execute<CommandSender> { sender, context, argument ->
                    val uuid = context.argument(-1)
                    val player = OfflineProxyPlayer(UUID.fromString(uuid), "")
                    player.setupDataContainer()
                    player.getDataContainer()["bind"] = argument
                    player.releaseDataContainer()
                    sender.sendMessage("OK")
                }
            }
        }
    }

    @CommandBody
    val send = subCommand {
        dynamic("player") {
            suggestPlayers()
            dynamic("qq") {
                dynamic("message") {
                    execute<CommandSender> { _, context, argument ->
                        val player = Bukkit.getPlayer(context.argument(-2))!!
                        val qq = context.argument(-1)
                        player.sendMessage("§6$qq§7对你说: §r$argument")
                    }
                }
            }
        }
    }

}