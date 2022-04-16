package analyzer.tokenizer.lexicalElements

object Identifier : LexicalElement {
    private val regex = Regex("^[a-zA-Z_][a-zA-Z_0-9]*$")
    override fun getType(): TokenType = TokenType.IDENTIFIER
    override fun has(element: String): Boolean = regex matches element
}