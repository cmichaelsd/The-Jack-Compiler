package analyzer.tokenizer

object KeyWord : LexicalElement {
    override val validElement: Set<String> = setOf(
        "class",
        "constructor",
        "function",
        "method",
        "field",
        "static",
        "var",
        "int",
        "char",
        "boolean",
        "void",
        "true",
        "false",
        "null",
        "this",
        "let",
        "do",
        "if",
        "else",
        "while",
        "return"
    )
    override fun getType(): TokenType = TokenType.KEYWORD
}