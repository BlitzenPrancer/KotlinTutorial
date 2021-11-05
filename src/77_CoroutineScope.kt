import kotlinx.coroutines.*

fun main() = runBlocking {
    

    async {
        println("async: $this")
    }

    println("... some other code...")

    println("runBlocking: $this")

    launch {
        println("launch: $this")

        launch(coroutineContext) {
            println("child launch: $this")
        }
    }
}
