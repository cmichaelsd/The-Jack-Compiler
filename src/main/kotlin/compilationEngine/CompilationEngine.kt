package compilationEngine

interface CompilationEngine {
    fun compileClass()
    fun compileClassVarDec()
    fun compileSubroutine()
    fun compileParameterList()
    fun compileSubroutineBody()
    fun compileVarDec()
    fun compileStatements()
    fun compileLet()
    fun compileIf()
    fun compileWhile()
    fun compileDo()
    fun compileReturn()
    fun compileExpression()
    fun compileTerm()
    fun compileExpressionList(): Int
}