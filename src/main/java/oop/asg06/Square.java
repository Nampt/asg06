package asg06;

public class Square extends Expression {
	private Expression expression;
	
	public Square(Expression exp) {
		this.expression = exp;
	}
	
	public int evaluate() {
		return expression.evaluate()*expression.evaluate();
	}
	
	public String toString() {
		return String.format("%s^2", expression);
	}
}
