package asg06;

public class Multiplication extends BinaryExpression {
	Expression left;
	Expression right;
	
	public Multiplication(Expression l, Expression r) {
		this.left = l;
		this.right = r;
	}
	
	public int evaluate() {
		return left.evaluate() * right.evaluate();
	}
	
	public String toString() {
		return String.format("%s%s", left, right);
	}
}
