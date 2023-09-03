package composite.calculator;

public class Expression implements ArithmaticExpression {

	ArithmaticExpression leftArithmaticExpression;
	ArithmaticExpression righArithmaticExpression;
	Operation operation;

	public Expression(ArithmaticExpression leftArithmaticExpression, ArithmaticExpression righArithmaticExpression,
			Operation operation) {
		this.leftArithmaticExpression = leftArithmaticExpression;
		this.righArithmaticExpression = righArithmaticExpression;
		this.operation = operation;
	}

	@Override
	public int evaluate() {
		int value = 0;
		switch (operation) {

		case ADD:
			value = leftArithmaticExpression.evaluate() + righArithmaticExpression.evaluate();
			break;
		case SUBSTRACT:
			value = leftArithmaticExpression.evaluate() - righArithmaticExpression.evaluate();
			break;
		case MULTIPLY:
			value = leftArithmaticExpression.evaluate() * righArithmaticExpression.evaluate();
			break;
		case DIVIDE:
			value = leftArithmaticExpression.evaluate() / righArithmaticExpression.evaluate();
			break;

		}
		return value;
	}

}
