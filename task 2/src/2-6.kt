fun main() {

    print("Введите первую цифру (0-9): ")
    val firstDigit = readln().toIntOrNull()

    print("Введите вторую цифру (0-9): ")
    val secondDigit = readln().toIntOrNull()

    if (firstDigit == null || secondDigit == null || firstDigit < 0 || firstDigit > 9 ||
        secondDigit < 0 || secondDigit > 9 || firstDigit == secondDigit) {
        println("Неверный ввод. Убедитесь, что введены две разные цифры от 0 до 9.")
        return
    }


    val oddDigit = if (firstDigit % 2 != 0) firstDigit else null
    val oddDigit1 = if (secondDigit % 2 != 0) secondDigit else null


    if (oddDigit != null) {
        if(oddDigit1 != null)
        {
            println("Нечетные числа: $firstDigit$secondDigit и $secondDigit$firstDigit")
        }
        else
        {
            print("Нечетное число: $secondDigit$firstDigit ")
        }
    }
    else {
        if(oddDigit1 != null) {
            print("Нечетное число: $firstDigit$secondDigit ")
        }
        else {println("Создать нечетное число невозможно.")
        }
    }
}