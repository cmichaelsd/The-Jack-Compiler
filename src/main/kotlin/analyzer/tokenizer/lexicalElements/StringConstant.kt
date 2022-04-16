package analyzer.tokenizer.lexicalElements

object StringConstant : LexicalElement {
    override fun getType(): TokenType = TokenType.STRING_CONST
    override fun has(element: String): Boolean = element.startsWith('"') && element.endsWith('"')
}