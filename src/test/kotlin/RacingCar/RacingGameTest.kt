package RacingCar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import java.lang.IllegalArgumentException

class RacingGameTest {

    private var racingGame: RacingGame? = null

    @BeforeEach
    fun setUp() {
        racingGame = RacingGame()
    }

    @Test
    fun numberOfCarsMustExceed0() {
        assertThrows(IllegalArgumentException::class.java) {
            racingGame!!.validateNumberOfCars(0)
        }
        assertThrows(IllegalArgumentException::class.java) {
            racingGame!!.validateNumberOfCars(-3)
        }
        assertDoesNotThrow {
            racingGame!!.validateNumberOfCars(1)
        }
        assertDoesNotThrow {
            racingGame!!.validateNumberOfCars(3)
        }
    }

    @Test
    fun numberOfAttemptsMustExceed0() {
        assertThrows(IllegalArgumentException::class.java) {
            racingGame!!.validateNumberOfAttempts(0)
        }
        assertThrows(IllegalArgumentException::class.java) {
            racingGame!!.validateNumberOfAttempts(-3)
        }
        assertDoesNotThrow {
            racingGame!!.validateNumberOfAttempts(1)
        }
        assertDoesNotThrow {
            racingGame!!.validateNumberOfAttempts(3)
        }
    }

    @Test
    fun carMustNotMove() {
        val car = Car()
        assertThat(car.position).isEqualTo(0)
        racingGame!!.moveCarIfRandomNumberNotLessThan4(car, 0)
        assertThat(car.position).isEqualTo(0)
        racingGame!!.moveCarIfRandomNumberNotLessThan4(car, 1)
        assertThat(car.position).isEqualTo(0)
        racingGame!!.moveCarIfRandomNumberNotLessThan4(car, 2)
        assertThat(car.position).isEqualTo(0)
        racingGame!!.moveCarIfRandomNumberNotLessThan4(car, 3)
        assertThat(car.position).isEqualTo(0)
    }

    @Test
    fun carMustMove() {
        val car = Car()
        assertThat(car.position).isEqualTo(0)
        racingGame!!.moveCarIfRandomNumberNotLessThan4(car, 4)
        assertThat(car.position).isEqualTo(1)
        racingGame!!.moveCarIfRandomNumberNotLessThan4(car, 5)
        assertThat(car.position).isEqualTo(2)
        racingGame!!.moveCarIfRandomNumberNotLessThan4(car, 6)
        assertThat(car.position).isEqualTo(3)
        racingGame!!.moveCarIfRandomNumberNotLessThan4(car, 7)
        assertThat(car.position).isEqualTo(4)
        racingGame!!.moveCarIfRandomNumberNotLessThan4(car, 8)
        assertThat(car.position).isEqualTo(5)
        racingGame!!.moveCarIfRandomNumberNotLessThan4(car, 9)
        assertThat(car.position).isEqualTo(6)
    }

    @Test
    fun rangeOfRandomNumberMustBe0To9() {
        assertThrows(IllegalArgumentException::class.java) {
            racingGame!!.validateRandomNumber(-1)
        }
        assertDoesNotThrow {
            racingGame!!.validateRandomNumber(0)
            racingGame!!.validateRandomNumber(1)
            racingGame!!.validateRandomNumber(2)
            racingGame!!.validateRandomNumber(3)
            racingGame!!.validateRandomNumber(4)
            racingGame!!.validateRandomNumber(5)
            racingGame!!.validateRandomNumber(6)
            racingGame!!.validateRandomNumber(7)
            racingGame!!.validateRandomNumber(8)
            racingGame!!.validateRandomNumber(9)
        }
        assertThrows(IllegalArgumentException::class.java) {
            racingGame!!.validateRandomNumber(10)
        }
    }

    @Test
    fun generateCarsExactlyNumberOfCars() {
        val carCount = 3
        val cars = racingGame!!.generateCars(carCount)
        assertThat(cars.size).isEqualTo(3)
    }
}
