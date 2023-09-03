package composite.calculator;

public class Number implements ArithmaticExpression {

	public int value;

	public Number(int value) {
		this.value = value;
	}

	@Override
	public int evaluate() {
		return value;
	}

}
