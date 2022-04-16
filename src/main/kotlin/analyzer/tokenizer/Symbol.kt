package analyzer.tokenizer

object Symbol : LexicalElement {
    override val validElement: Set<String> = setOf(
        "{",
        "}",
        "(",
        ")",
        "[",
        "]",
        ".",
        ",",
        ";",
        "+",
        "-",
        "*",
        "/",
        "&",
        "|",
        "<",
        ">",
        "=",
        "~"
    )
    override fun getType(): TokenType = TokenType.SYMBOL
}