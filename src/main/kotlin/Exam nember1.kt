fun main() {
    val numbers = readLine()!!.split(" ").map { it.toInt() }.toMutableList()//toMutableList숫자바꾸는 명령어
    //var temp = 0
    //val a = ""
    bubbleSort(numbers)
    printNumbers(numbers)
    printNumbersReversed(numbers)

    // for(m in numbers.indices){
    //    println(numbers[m])
    // }
}

//var maxDepth = numbers.size - 1

    fun bubbleSort(numbers: MutableList<Int>) {
        var lastIndex = numbers.size - 1
        var raiseCount = 0
        var depth = lastIndex
        while (depth >= 1) {
            println("raiseCount : ${++raiseCount}, depth : $depth")

            for (i in 0 until depth) {
                println("numbers[$i] vs numbers[${i + 1}]")

                if (i == depth - 1 && numbers[i] < numbers[i + 1]) {
                    // 위 조건이 depth를 1 깍고 부합되면 for문을 종료한다.
                    // for 문 밑에서 depth-- 를 한번 더 만나게 되기 때문에
                    // 결과적으로는 depth -= 2 가 된다.
                    depth--
                    break
                }

                if (numbers[i] > numbers[i + 1]) {
                    numbers[i] = numbers[i + 1].also { numbers[i + 1] = numbers[i] }
                }
            }

            depth--
        }
    }

    /**    for (deoth in maxDepth downTo 1) {
            println("raiseCount: ${++raiseCount}")
        //    for (i in 0 until deoth) {
                if (numbers[i] > numbers[i + 1]) {
                    numbers[i] = numbers[i + 1].also { numbers[i + 1] = numbers[i] }
                }
            }**/





        /**  var temp = 0
        // for(i in numbers.indices) {
        //    for (j in 1 until numbers.size - i) {
        //        if (numbers[j] < numbers[j - 1]) {
        //          temp = numbers[j]
        //        numbers[j] = numbers[j - 1]
        //      numbers[j - 1] = temp

        }
        }

        }
        }**/





//var raiseCount = 0
fun printNumbersReversed(numbers: MutableList<Int>) {
            numbers.withIndex().reversed().forEach {
                print("${it.value} ")
            }
            println()
}

fun printNumbers(numbers: MutableList<Int>) {
    numbers.forEach {
        print("$it ")
    }
    println()
}
