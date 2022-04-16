package analyzer.tokenizer.lexicalElements

object Symbol : LanguageDefinedLexicalElement {
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