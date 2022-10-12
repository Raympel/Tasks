import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    print("Введите ребро а: ")
    val ribA = scan.nextInt()
    print("Введите ребро b: ")
    val ribB = scan.nextInt()
    print("Введите ребро c: ")
    val ribC = scan.nextInt()

    val res = ribA * ribB * ribC

    print("Объем параллепипеда = $res")
}