package asg06;

public class Numeral extends Expression {
	public int value;
	public Numeral(int val) {
		this.value = val;
	}
	
	public int evaluate() {
		return value;
	}
	
	public String toString() {
		return String.format("%s", value);
	}
}
