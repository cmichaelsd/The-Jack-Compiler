package analyzer.tokenizer

import analyzer.parser.Parser
import analyzer.tokenizer.lexicalElements.*
import java.io.File

class TokenizerImpl(inputFile: File) : Parser(), Tokenizer {
    /**
     * A list of tokens parsed from the input file.
     */
    private val tokens: List<String> = parse(inputFile)

    /**
     * The current index being observed by the tokenizer.
     */
    private var index = -1

    /**
     * The current token being observed.
     */
    private var currentToken = ""

    /**
     * Are there more tokens in the input.
     *
     * @return Boolean
     */
    override fun hasMoreTokens(): Boolean = index < tokens.size

    /**
     * Gets the next token from the input, and makes it the current token.
     * This method should be called only if hasMoreTokens is true.
     * Initially there is no current token.
     */
    override fun advance() {
        currentToken = tokens[++index]
    }

    /**
     * Returns the type of the current token, as a constant.
     *
     * @return TokenType
     * @throws TokenTypeException
     */
    @Throws(TokenTypeException::class)
    override fun tokenType(): TokenType {
        return when {
            KeyWord.has(currentToken)         -> KeyWord.getType()
            Symbol.has(currentToken)          -> Symbol.getType()
            IntegerConstant.has(currentToken) -> IntegerConstant.getType()
            StringConstant.has(currentToken)  -> StringConstant.getType()
            Identifier.has(currentToken)      -> Identifier.getType()
            else                              -> throw TokenTypeException("Illegal token type found: $currentToken")
        }
    }

    /**
     * Returns the keyword which is the current token, as a constant.
     * This method should be called only if tokenType is KEYWORD.
     *
     * @return KeyWord.Element
     */
    override fun keyWord(): KeyWord.Element = KeyWord.getElement(currentToken)

    /**
     * Returns the character which is the current token.
     * Should be called only if tokenType is SYMBOL.
     *
     * @return Char
     */
    override fun symbol(): Char = currentToken[0]

    /**
     * Returns the string which is the current token.
     * Should be called only if tokenType is IDENTIFIER.
     *
     * @return String
     */
    override fun identifier(): String = currentToken

    /**
     * Returns the integer value of the current token.
     * Should be called only if tokenType is INT_CONST.
     *
     * @return Int
     */
    override fun intVal(): Int = currentToken.toInt()

    /**
     * Returns the string value of the current token, without the opening and closing double quotes.
     * Should be called only if tokenType is STRING_CONST.
     *
     * @return String
     */
    override fun stringVal(): String = currentToken.substring(1, currentToken.lastIndex)
}