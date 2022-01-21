package un6.dip.nosolid

import java.util.logging.Level
import java.util.logging.LogManager

internal val l = LogManager.getLogManager().getLogger("DIP").apply { level = Level.ALL }
internal fun i(tag:String, msg:String)
{
    l.info("[$tag] - $msg")
}
open class RacingCar(private var remainingFuel: Int) {
    private var power = 0
    fun accelerate() {
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

class Driver {
    val racingCar: RacingCar
    init {
        racingCar = RacingCar(100)
        i("Driver", "Creado RacingCar")
    }

    fun increaseSpeed() {
        i("Driver", "Acelera")
        racingCar.accelerate()
    }

}