fun main() {

    val numbers = readLine()!!.split(" ").map { it.toInt() }
    val a = numbers[0]
    val b = numbers[1]
   // val c = numbers[2]
    println(a*(b%10))
    println(a*(b%100))

 //   println((a + b) % c)
   // println(((a % c) + (b % c)) % c)
   // println((a * b) % c)
   // println(((a % c) * (b % c)) % c)

}