fun main() {
    println("Введите строку: ")
    val input = readln()
    var chars = input.toList().distinct().sorted()
    var answer = ""
    for (char in chars) {
        answer += "$char - ${input.count { a -> a == char }}\n"
    }
    println("Результат:\n$answer")
}