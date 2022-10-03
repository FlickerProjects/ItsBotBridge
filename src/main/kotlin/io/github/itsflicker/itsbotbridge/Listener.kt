package io.github.itsflicker.itsbotbridge

import com.google.common.cache.CacheBuilder
import io.github.itsflicker.itsbotbridge.database.OfflineProxyPlayer
import org.bukkit.entity.Player
import org.bukkit.event.player.AsyncPlayerPreLoginEvent
import org.bukkit.event.player.PlayerKickEvent
import org.bukkit.event.player.PlayerQuitEvent
import taboolib.common.platform.event.SubscribeEvent
import taboolib.common.platform.function.submitAsync
import taboolib.expansion.getDataContainer
import taboolib.expansion.releaseDataContainer
import taboolib.expansion.setupDataContainer
import java.util.*
import java.util.concurrent.TimeUnit

object Listener {

    private val captchaCache = CacheBuilder.newBuilder()
        .expireAfterWrite(5, TimeUnit.MINUTES)
        .build<UUID, String>()


    private fun onDisconnect(player: Player) {
        player.releaseDataContainer()
    }

    @SubscribeEvent
    fun onAsyncLogin(e: AsyncPlayerPreLoginEvent) {
        val player = OfflineProxyPlayer(e.uniqueId, e.name)
        player.setupDataContainer()
        if (player.getDataContainer()["bind"] == null) {
            val code = captchaCache.get(player.uniqueId) { genCode() }
            e.disallow(AsyncPlayerPreLoginEvent.Result.KICK_WHITELIST, """
                
                §f为了服务器的安全
                §f你需要验证你的账号才能继续游戏
                
                §f请先加入Q群: §d859550473
                §f然后在五分钟之内发送消息 §3$code §f来完成验证
            """.trimIndent())
            submitAsync {
                post(
                    "localhost", 2000, "/captcha",
                    mapOf("name" to player.name, "uuid" to player.uniqueId, "code" to code)
                )
            }
        }
    }

    @SubscribeEvent
    fun onQuit(e: PlayerQuitEvent) {
        onDisconnect(e.player)
    }

    @SubscribeEvent
    fun onKick(e: PlayerKickEvent) {
        onDisconnect(e.player)
    }

    private fun genCode(): String {
        return buildString {
            repeat(4) { append(taboolib.common.util.random(10).toString()) }
        }
    }

}