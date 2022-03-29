package tokenizer

import java.io.File

class TokenizerImpl(val inputFile: File) : Tokenizer {
    /**
     * Are there more tokens in the input.
     *
     * @return Boolean
     */
    override fun hasMoreTokens(): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * Gets the next token from the input, and makes it the current token.
     * This method should be called only if hasMoreTokens is true.
     * Initially there is no current token.
     */
    override fun advance() {
        TODO("Not yet implemented")
    }

    /**
     * Returns the type of the current token, as a constant.
     *
     * @return TokenType
     */
    override fun tokenType(): TokenType {
        TODO("Not yet implemented")
    }

    /**
     * Returns the keyword which is the current token, as a constant.
     * This method should be called only if tokenType is KEYWORD.
     *
     * @return KeyWord
     */
    override fun keyWord(): KeyWord {
        TODO("Not yet implemented")
    }

    /**
     * Returns the character which is the current token.
     * Should be called only if tokenType is SYMBOL.
     *
     * @return Char
     */
    override fun symbol(): Char {
        TODO("Not yet implemented")
    }

    /**
     * Returns the string which is the current token.
     * Should be called only if tokenType is IDENTIFIER.
     *
     * @return String
     */
    override fun identifier(): String {
        TODO("Not yet implemented")
    }

    /**
     * Returns the integer value of the current token.
     * Should be called only if tokenType is INT_CONST.
     *
     * @return Int
     */
    override fun intVal(): Int {
        TODO("Not yet implemented")
    }

    /**
     * Returns the string value of the current token, without the opening and closing double quotes.
     * Should be called only if tokenType is STRING_CONST.
     *
     * @return String
     */
    override fun stringVal(): String {
        TODO("Not yet implemented")
    }
}