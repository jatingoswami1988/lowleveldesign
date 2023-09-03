package chainOfResponsibility.logger;

public class Main {

	public static void main(String args[]) {

		LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

		logProcessor.log(1, "Testing 1");
		logProcessor.log(2, "Testing 2");
		logProcessor.log(3, "Testing 3");

	}

}
