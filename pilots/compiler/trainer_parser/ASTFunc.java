/* Generated By:JJTree: Do not edit this line. ASTFunc.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package pilots.compiler.trainer.parser;

public
class ASTFunc extends SimpleNode {
  public ASTFunc(int id) {
    super(id);
  }

  public ASTFunc(TrainerParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(TrainerParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b7212e84c66bd4147d6cb032fdc465ad (do not edit this line) */
