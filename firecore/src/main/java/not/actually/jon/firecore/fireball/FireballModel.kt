package not.actually.jon.firecore.fireball

import kotlin.random.Random

data class Fireball(
    val damage: Int = Random.nextInt()
)