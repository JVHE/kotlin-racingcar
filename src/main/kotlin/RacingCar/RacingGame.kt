package RacingCar

import RacingCar.UI.InputView

class RacingGame {
    fun start() {
        val inputView = InputView()
        val numberOfCars = inputView.inputNumberOfCars()
        val numberOfAttempts = inputView.inputNumberOfAttempts()

        validateNumberOfCars(numberOfCars)
        validateNumberOfAttempts(numberOfAttempts)

        val cars = generateCars(numberOfCars)
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
}
