import analyzer.Analyzer
import java.io.File

const val FILE_ARGUMENT_INDEX = 0

fun main(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    println("Program arguments: ${args.joinToString()}")

    if (args.isEmpty()) return

    val inputFile = File(args[FILE_ARGUMENT_INDEX])

    Analyzer.initialize(inputFile)
}