package analyzer.tokenizer

object StringConstant : LexicalElement {
    // validElement should be unused in this situation.
    override val validElement: Set<String> = setOf()
    override fun getType(): TokenType = TokenType.STRING_CONST
    override fun has(element: String): Boolean = element.startsWith('"') && element.endsWith('"')
}