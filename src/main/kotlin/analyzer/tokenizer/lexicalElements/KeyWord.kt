package analyzer.tokenizer.lexicalElements

object KeyWord : LanguageDefinedLexicalElement {
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

    fun getElement(keyword: String) = Element.valueOf(keyword.uppercase())

    enum class Element {
        CLASS,
        CONSTRUCTOR,
        FUNCTION,
        METHOD,
        FIELD,
        STATIC,
        VAR,
        INT,
        CHAR,
        BOOLEAN,
        VOID,
        TRUE,
        FALSE,
        NULL,
        THIS,
        LET,
        DO,
        IF,
        ELSE,
        WHILE,
        RETURN
    }
}
