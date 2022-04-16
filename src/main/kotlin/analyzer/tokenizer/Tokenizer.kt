package analyzer.tokenizer

import analyzer.tokenizer.lexicalElements.KeyWord
import analyzer.tokenizer.lexicalElements.TokenType

interface Tokenizer {
    fun hasMoreTokens(): Boolean
    fun advance()
    fun tokenType(): TokenType
    fun keyWord(): KeyWord.Element
    fun symbol(): Char
    fun identifier(): String
    fun intVal(): Int
    fun stringVal(): String
}