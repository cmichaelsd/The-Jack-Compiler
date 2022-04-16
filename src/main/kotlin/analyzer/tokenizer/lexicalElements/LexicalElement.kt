package analyzer.tokenizer.lexicalElements

interface LexicalElement {
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
    fun has(element: String): Boolean
}