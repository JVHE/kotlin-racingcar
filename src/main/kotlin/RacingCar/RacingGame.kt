package RacingCar

import RacingCar.UI.InputView
import RacingCar.UI.ResultView
import kotlin.random.Random

class RacingGame {
    fun start() {
        val inputView = InputView()
        val numberOfCars = inputView.inputNumberOfCars()
        val numberOfAttempts = inputView.inputNumberOfAttempts()

        validateNumberOfCars(numberOfCars)
        validateNumberOfAttempts(numberOfAttempts)

        val resultView = ResultView()
        resultView.printResult()

        val cars = generateCars(numberOfCars)

        repeat(numberOfAttempts) {
            cars.forEach {
                val randomNumber = Random.nextInt(10)
                moveCarIfRandomNumberNotLessThan4(it, randomNumber)
            }
            resultView.printCarPosition(cars)
        }
    }

    fun validateNumberOfCars(numberOfCars: Int) {
        if (numberOfCars < 1) {
            throw IllegalArgumentException()
        }
    }

    fun validateNumberOfAttempts(numberOfAttempts: Int) {
        if (numberOfAttempts < 1) {
            throw IllegalArgumentException()
        }
    }

    fun generateCars(numberOfCars: Int): List<Car> {
        validateNumberOfCars(numberOfCars)

        val cars = mutableListOf<Car>()
        for (i in 0 until numberOfCars) {
            cars.add(Car())
        }
        return cars
    }

    fun moveCarIfRandomNumberNotLessThan4(car: Car, randomNumber: Int) {
        validateRandomNumber(randomNumber)

        if (randomNumber >= 4) {
            car.move()
        }
    }

    fun validateRandomNumber(randomNumber: Int) {
        if (randomNumber < 0 || randomNumber > 9) {
            throw IllegalArgumentException()
        }
    }
}
