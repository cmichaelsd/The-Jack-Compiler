package analyzer.tokenizer

interface LexicalElement {
    /**
     * A list containing all valid elements for the current lexical element.
     */
    val validElement: Set<String>

    /**
     * Returns the token type for the current lexical element.
     *
     * @return TokenType
     */
    fun getType(): TokenType

    /**
     * Compares a given command against valid elements for this lexical element.
     *
     * @param  element a string representing a lexical element
     * @return Boolean
     */
    fun has(element: String): Boolean = validElement.contains(element)
}