package RacingCar.UI

import RacingCar.Car

class ResultView {
    fun printResult() {
        println("실행 결과")
    }

    fun printCarPosition(cars: List<Car>) {
        cars.forEach { car: Car ->
            println("-".repeat(car.position))
        }
        println()
    }
}
