package io.github.itsflicker.itsbotbridge.database

import taboolib.common.platform.ProxyGameMode
import taboolib.common.platform.ProxyParticle
import taboolib.common.platform.ProxyPlayer
import taboolib.common.util.Location
import taboolib.common.util.Vector
import java.net.InetSocketAddress
import java.util.*

class OfflineProxyPlayer(override val uniqueId: UUID, override val name: String) : ProxyPlayer {

    override var absorptionAmount: Double
        get() = TODO("Not yet implemented")
        set(_) {}
    override val address: InetSocketAddress
        get() = TODO("Not yet implemented")
    override var allowFlight: Boolean
        get() = TODO("Not yet implemented")
        set(_) {}
    override val attackCooldown: Int
        get() = TODO("Not yet implemented")
    override var bedSpawnLocation: Location?
        get() = TODO("Not yet implemented")
        set(_) {}
    override var compassTarget: Location
        get() = TODO("Not yet implemented")
        set(_) {}
    override var displayName: String?
        get() = TODO("Not yet implemented")
        set(_) {}
    override var exhaustion: Float
        get() = TODO("Not yet implemented")
        set(_) {}
    override var exp: Float
        get() = TODO("Not yet implemented")
        set(_) {}
    override val facing: String
        get() = TODO("Not yet implemented")
    override val firstPlayed: Long
        get() = TODO("Not yet implemented")
    override var flySpeed: Float
        get() = TODO("Not yet implemented")
        set(_) {}
    override var foodLevel: Int
        get() = TODO("Not yet implemented")
        set(_) {}
    override var gameMode: ProxyGameMode
        get() = TODO("Not yet implemented")
        set(_) {}
    override var hasGravity: Boolean
        get() = TODO("Not yet implemented")
        set(_) {}
    override var health: Double
        get() = TODO("Not yet implemented")
        set(_) {}
    override val isBlocking: Boolean
        get() = TODO("Not yet implemented")
    override val isConversing: Boolean
        get() = TODO("Not yet implemented")
    override val isDead: Boolean
        get() = TODO("Not yet implemented")
    override var isFlying: Boolean
        get() = TODO("Not yet implemented")
        set(_) {}
    override var isGliding: Boolean
        get() = TODO("Not yet implemented")
        set(_) {}
    override var isGlowing: Boolean
        get() = TODO("Not yet implemented")
        set(_) {}
    override val isInsideVehicle: Boolean
        get() = TODO("Not yet implemented")
    override val isLeashed: Boolean
        get() = TODO("Not yet implemented")
    override val isOnGround: Boolean
        get() = TODO("Not yet implemented")
    override var isOp: Boolean
        get() = TODO("Not yet implemented")
        set(_) {}
    override val isRiptiding: Boolean
        get() = TODO("Not yet implemented")
    override val isSleeping: Boolean
        get() = TODO("Not yet implemented")
    override var isSleepingIgnored: Boolean
        get() = TODO("Not yet implemented")
        set(_) {}
    override val isSneaking: Boolean
        get() = TODO("Not yet implemented")
    override val isSprinting: Boolean
        get() = TODO("Not yet implemented")
    override var isSwimming: Boolean
        get() = TODO("Not yet implemented")
        set(_) {}
    override val lastPlayed: Long
        get() = TODO("Not yet implemented")
    override var level: Int
        get() = TODO("Not yet implemented")
        set(_) {}
    override val locale: String
        get() = TODO("Not yet implemented")
    override val location: Location
        get() = TODO("Not yet implemented")
    override var maxHealth: Double
        get() = TODO("Not yet implemented")
        set(_) {}
    override val maximumAir: Int
        get() = TODO("Not yet implemented")
    override var noDamageTicks: Int
        get() = TODO("Not yet implemented")
        set(_) {}
    override val origin: Any
        get() = TODO("Not yet implemented")
    override val ping: Int
        get() = TODO("Not yet implemented")
    override var playerListName: String?
        get() = TODO("Not yet implemented")
        set(_) {}
    override var playerTime: Long
        get() = TODO("Not yet implemented")
        set(_) {}
    override val pose: String
        get() = TODO("Not yet implemented")
    override var remainingAir: Int
        get() = TODO("Not yet implemented")
        set(_) {}
    override var saturation: Float
        get() = TODO("Not yet implemented")
        set(_) {}
    override val sleepTicks: Int
        get() = TODO("Not yet implemented")
    override var walkSpeed: Float
        get() = TODO("Not yet implemented")
        set(_) {}
    override val world: String
        get() = TODO("Not yet implemented")

    override fun chat(message: String) {
        TODO("Not yet implemented")
    }

    override fun hasPermission(permission: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun isOnline(): Boolean {
        TODO("Not yet implemented")
    }

    override fun kick(message: String?) {
        TODO("Not yet implemented")
    }

    override fun performCommand(command: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun playSound(location: Location, sound: String, volume: Float, pitch: Float) {
        TODO("Not yet implemented")
    }

    override fun playSoundResource(location: Location, sound: String, volume: Float, pitch: Float) {
        TODO("Not yet implemented")
    }

    override fun sendActionBar(message: String) {
        TODO("Not yet implemented")
    }

    override fun sendMessage(message: String) {
        TODO("Not yet implemented")
    }

    override fun sendParticle(
        particle: ProxyParticle,
        location: Location,
        offset: Vector,
        count: Int,
        speed: Double,
        data: ProxyParticle.Data?
    ) {
        TODO("Not yet implemented")
    }

    override fun sendRawMessage(message: String) {
        TODO("Not yet implemented")
    }

    override fun sendTitle(title: String?, subtitle: String?, fadein: Int, stay: Int, fadeout: Int) {
        TODO("Not yet implemented")
    }

    override fun teleport(loc: Location) {
        TODO("Not yet implemented")
    }
}