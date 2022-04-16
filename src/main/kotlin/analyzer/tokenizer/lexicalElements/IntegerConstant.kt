package analyzer.tokenizer.lexicalElements

object IntegerConstant : LexicalElement {
    override fun getType(): TokenType = TokenType.INT_CONST
    override fun has(element: String): Boolean {
        val n = element.toIntOrNull() ?: return false
        return n in 0..32767
    }
}