package RacingCar

import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun initialCarPositionIs1() {
        val car = Car()
        assert(car.position == 1)
    }

    @Test
    fun moveCarOnce() {
        val car = Car()
        car.move()
        assert(car.position == 2)
    }

    @Test
    fun moveCarTwice() {
        val car = Car()
        car.move()
        car.move()
        assert(car.position == 3)
    }
}
