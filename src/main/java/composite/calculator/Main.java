package composite.calculator;

public class Main {

	public static void main(String[] args) {

		// 5 * (1+7)

		// *
		// / \
//			5	  +
		// / \
		// 1 7
//	
//		
		ArithmaticExpression five = new Number(5);
		ArithmaticExpression one = new Number(1);
		ArithmaticExpression seven = new Number(7);
		Expression addExpression = new Expression(one, seven, Operation.ADD);
		Expression finalResult = new Expression(five, addExpression, Operation.MULTIPLY);
		System.out.println(finalResult.evaluate());

	}

}
