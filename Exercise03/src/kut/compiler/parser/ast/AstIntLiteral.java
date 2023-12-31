package kut.compiler.parser.ast;

import kut.compiler.tokenizer.Token;

/**
 * @author hnishino
 *
 */
public class AstIntLiteral extends AstNode
{
	private Token t;
	
	/**
	 * 
	 */
	public AstIntLiteral(Token t) {
		this.t = t;
	}
	
	/**
	 * @return
	 */
	public int getIntValue() {
		return Integer.parseInt(t.getLexeme());
	}
	
	
	/**
	 *
	 */
	@Override
	public String getTreeString(int indent) {
		return this.indent(indent, "IntLiteral:" + this.getIntValue());
	}

}
