package RacingCar.UI

class InputView {

    fun inputNumberOfCars(): Int {
        println("자동차 대수는 몇 대 인가요?")
        return readLine()!!.toInt()
    }

    fun inputNumberOfAttempts(): Int {
        println("시도할 회수는 몇 회인가요?")
        return readLine()!!.toInt()
    }
}
