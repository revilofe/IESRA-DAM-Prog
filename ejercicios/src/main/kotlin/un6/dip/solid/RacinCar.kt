package un6.dip.solid

import java.util.logging.Level
import java.util.logging.LogManager

internal val l = LogManager.getLogManager().getLogger("DIP").apply { level = Level.ALL }
internal fun i(tag:String, msg:String)
{
    l.info("[$tag] - $msg")
}



interface Car {
    fun accelerate()
}

open class SuperRacingCar (private var remainingFuel: Int): Car {
    private var power = 0
    override fun accelerate() {
        increasePower()
        decrementFuel()
        i("Acelerate", "Gasolina:$remainingFuel, Power:$power")
    }

    open protected fun decrementFuel() {
        remainingFuel-=2
    }

    open protected fun increasePower() {
        power+=2
    }

}


open class RacingCar (private var remainingFuel: Int): Car {
    private var power = 0
    override fun accelerate() {
        increasePower()
        decrementFuel()
        i("Acelerate", "Gasolina:$remainingFuel, Power:$power")
    }

    open protected fun decrementFuel() {
        remainingFuel--
    }

    open protected fun increasePower() {
        power++
    }

}

class Driver(car: Car) {
    val racingCar: Car
    init {
        racingCar = RacingCar(100)
        i("Driver", "Creado RacingCar")
    }

    fun increaseSpeed() {
        i("Driver", "Acelera")
        racingCar.accelerate()
    }

}

