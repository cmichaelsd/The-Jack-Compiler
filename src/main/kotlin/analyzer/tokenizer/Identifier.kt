package analyzer.tokenizer

object Identifier : LexicalElement {
    private val regex = Regex("^[a-zA-Z_][a-zA-Z_0-9]*$")
    override val validElement: Set<String> = setOf()
    override fun getType(): TokenType = TokenType.IDENTIFIER
    override fun has(element: String): Boolean = regex matches element
}