import kotlin.math.*

fun main() {
    while (true) {

        print("Введите целое число n: ")
        val n = readln().toIntOrNull()
        print("Введите основание степени x: ")
        val x = readln().toDoubleOrNull()

        if (n == null || x == null) {
            println("Неправильный ввод. Попробуйте снова.")
            continue
        }

        if (n < 0 && x <= 0) {
            println("Невозможно вычислить целочисленный показатель для n < 0 и x <= 0.")
            continue
        }

        val maxY = sqrt(n.toDouble()).toInt() + 1

        for (y in -maxY..maxY) {
            if (x.pow(y) == n.toDouble()) {
                println("Целочисленный показатель существует: y = $y")
                return
            }
        }

        println("Целочисленный показатель не существует.")
        break
    }
}