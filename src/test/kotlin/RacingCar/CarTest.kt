package RacingCar

import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun initialCarPositionIs0() {
        val car = Car()
        assert(car.position == 0)
    }

    @Test
    fun moveCarOnce() {
        val car = Car()
        car.move()
        assert(car.position == 1)
    }

    @Test
    fun moveCarTwice() {
        val car = Car()
        car.move()
        car.move()
        assert(car.position == 2)
    }
}
