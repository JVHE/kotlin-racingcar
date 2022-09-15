package RacingCar

import RacingCar.UI.InputView

class RacingGame {
    fun start() {
        val inputView = InputView()
        val numberOfCars = inputView.inputNumberOfCars()
        val numberOfAttempts = inputView.inputNumberOfAttempts()
    }
}
