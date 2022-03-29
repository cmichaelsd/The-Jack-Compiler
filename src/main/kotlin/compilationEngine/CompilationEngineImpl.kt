package compilationEngine

import java.io.File

class CompilationEngineImpl(val inputFile: File, val outputFile: File) : CompilationEngine {
    /**
     * Compiles a complete class.
     */
    override fun compileClass() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles a static variable declaration, or a field declaration.
     */
    override fun compileClassVarDec() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles a complete method, function, or constructor.
     */
    override fun compileSubroutine() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles a (possibly empty) parameter list.
     * Does not handle the enclosing parentheses tokens ( and ).
     */
    override fun compileParameterList() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles a subroutine's body.
     */
    override fun compileSubroutineBody() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles a var declaration.
     */
    override fun compileVarDec() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles a sequence of statements.
     * Does not handle the enclosing curly bracket tokens { and }.
     */
    override fun compileStatements() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles a let statements.
     */
    override fun compileLet() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles an if statement, possible with a trailing else clause.
     */
    override fun compileIf() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles a while statement.
     */
    override fun compileWhile() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles a do statement.
     */
    override fun compileDo() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles a return statement.
     */
    override fun compileReturn() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles an expression.
     */
    override fun compileExpression() {
        TODO("Not yet implemented")
    }

    /**
     * 	Compiles a term.
     * 	If the current token is an identifier, the routine must resolve it into a variable, an array element, or a subroutine call.
     * 	A single lookahead token, which may be [, (, or ., suffices to distinguish between the possibilities.
     * 	Any other token is not part of this term and should not be advanced over.
     */
    override fun compileTerm() {
        TODO("Not yet implemented")
    }

    /**
     * Compiles a (possibly empty) comma-separated list of expressions.
     * Returns the number of expressions in the list.
     *
     * @return Int
     */
    override fun compileExpressionList(): Int {
        TODO("Not yet implemented")
    }
}