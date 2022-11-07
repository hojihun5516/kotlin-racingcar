package race

class Car {
    var current = ""

    fun move(): String {
        current += MOVEMENT
        return current
    }

    companion object {
        const val MOVEMENT = "-"
    }
}