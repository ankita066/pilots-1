/* Generated By:JJTree: Do not edit this line. ASTDim.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package pilots.compiler.parser;

public
class ASTDim extends SimpleNode {
  public ASTDim(int id) {
    super(id);
  }

  public ASTDim(PilotsParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PilotsParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3a3f30f720c03e140989015fbbab0d67 (do not edit this line) */
