fun main() {
    println("Введите строку символов: ")
    val inputVal = readln()
    var result =""
    var countChar = 1
    var previousChar = inputVal[0]

    for (i in 1 .. inputVal.length -1){
        if(previousChar == inputVal[i]){
            countChar += 1
            previousChar = inputVal[i]
        } else {
            if (countChar>1)
            {
                result= result  + previousChar + countChar
            } else {
                result = result+previousChar

            }
            countChar = 1
            previousChar = inputVal[i]
        }
    }
    if (countChar>1)
    {
        result= result  + previousChar + countChar
    } else
    {
        result =  result+previousChar

    }
    println(result)
}