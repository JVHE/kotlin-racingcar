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
    fun generateCarsExactlyNumberOfCars() {
        val carCount = 3
        val cars = racingGame!!.generateCars(carCount)
        assertThat(cars.size).isEqualTo(3)
    }
}
