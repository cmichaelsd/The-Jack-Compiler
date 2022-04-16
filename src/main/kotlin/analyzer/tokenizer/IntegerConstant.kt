package analyzer.tokenizer

object IntegerConstant : LexicalElement {
    // validElement should be unused in this situation.
    override val validElement: Set<String> = setOf()
    override fun getType(): TokenType = TokenType.INT_CONST
    override fun has(element: String): Boolean = element.toInt() in 0..32767
}