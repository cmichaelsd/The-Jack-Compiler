package analyzer

import java.io.File
import java.io.IOException

object Analyzer {
    private const val VALID_FILE_WRITE_TYPE_1 = "xml"
    private const val VALID_FILE_WRITE_TYPE_2 = "vm"
    private const val VALID_FILE_READ_TYPE    = "jack"
    /*
    prompt>JackAnalyzer source
    Where source is either a file name of the form Xxx.jack or the name of a folder containing one or more .jack files.
    The file/folder name may contain a file path.
    If no path is specified, the analyzer operates on the current folder.
    For each Xxx.jack file the parser creates an output file Xxx.xml and writes the parsed output into it.
    The output file is created in the same folder as that of the input.
    If there is a file by this name in the folder, it will be overwritten.

    1) creates a tokenizer from the Xxx.jack input file
    2) creates an output file named Xxx.xml; and
    3) uses the tokenizer and the compilationEngine to parse the input file and write the parsed code to the output file

    NOTE: The first routine that must be called when compiling a .jack file is compileClass.
     */
    @Throws(IOException::class)
    fun initialize(inputFile: File) {
        if (!inputFile.exists()) return

        val resultFilePath = if (inputFile.isDirectory) "${inputFile.path}${File.separator}${inputFile.name}.${VALID_FILE_WRITE_TYPE_1}"
        else "${inputFile.parentFile}${File.separator}${inputFile.nameWithoutExtension}.${VALID_FILE_WRITE_TYPE_1}"

        try {
           if (inputFile.isDirectory) inputFile.walk().forEach { /* TODO */ }
            else {/* TODO */}
        } catch (e: IOException) {
            throw e
        } finally {
            // Clean up anything which requires closing.
        }
    }
}