fun main() {
    while (true) {
        print("Введите 2 числа и оператор: ")
        val input = readln().split(' ')

        if (input.count() != 3) {
            println("Неверный ввод. Попробуйте снова.")
            continue
        }

        val first = input[0].toDoubleOrNull()
        val second = input[1].toDoubleOrNull()

        if (first == null || second == null) {
            println("Неверный ввод. Попробуйте снова.")
            continue
        }

        val operation = input[2]

        when (operation) {
            "+" -> println("Результат: ${first + second}")
            "-" -> println("Результат: ${first - second}")
            "/" -> {
                if (second == 0.0) {
                    println("Ошибка: Деление на ноль. Попробуйте снова.")
                    continue
                }
                println("Результат: ${first / second}")
            }
            "*" -> println("Результат: ${first * second}")
            else -> {
                println("Неверный ввод. Попробуйте снова.")
                continue
            }
        }

        break
    }
}