package asg06;

public class Subtraction extends BinaryExpression {
	Expression left;
	Expression right;
	
	public Subtraction(Expression l, Expression r) {
		this.left = l;
		this.right = r;
	}
	
	public int evaluate() {
		return left.evaluate() - right.evaluate();
	}
	
	public String toString() {
		return String.format("%s%s", left, right);
	}
}