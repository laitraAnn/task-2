fun main() {
    print("Введите число: ")
    val number = readln().toIntOrNull() ?: 0
    println("Число в двоичной системе: ${number.toString(2)}")
}