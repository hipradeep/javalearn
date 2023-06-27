package learnkotlin.basic


fun main(args: Array<String>) {
    println("pradeep")
    Hello.main(arrayOf("hi","bye"))
}
fun main() {
    println("Hello world!")
}

class Hello {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello, pradeep!")
            println(args.contentToString())
        }
    }
}