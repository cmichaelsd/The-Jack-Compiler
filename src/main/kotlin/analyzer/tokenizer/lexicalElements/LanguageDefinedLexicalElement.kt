package analyzer.tokenizer.lexicalElements

import analyzer.tokenizer.lexicalElements.LexicalElement

interface LanguageDefinedLexicalElement : LexicalElement {
    /**
     * A list containing all valid elements for the current lexical element.
     */
    val validElement: Set<String>

    override fun has(element: String): Boolean = validElement.contains(element)
}