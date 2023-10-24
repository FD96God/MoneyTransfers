fun main(args: Array<String>) {
    val amount = 35
    val commission = 0.75 / 100
    val result = amount * commission
    val minCom = 35
    if (amount <= minCom) {
        println("Перевод невозможен")
    } else {
        if (result <= minCom) {
            println("Комиссия: $minCom руб.")
        } else {
            println("Комиссия: $result руб.")
        }
    }

}