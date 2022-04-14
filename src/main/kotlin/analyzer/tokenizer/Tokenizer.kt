package analyzer.tokenizer

interface Tokenizer {
    fun hasMoreTokens(): Boolean
    fun advance()
    fun tokenType(): TokenType
    fun keyWord(): KeyWord
    fun symbol(): Char
    fun identifier(): String
    fun intVal(): Int
    fun stringVal(): String
}