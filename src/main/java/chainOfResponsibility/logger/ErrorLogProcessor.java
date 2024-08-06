package chainOfResponsibility.logger;

public class ErrorLogProcessor extends LogProcessor {

	public ErrorLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
	}

	@Override
	public void log(int level, String message) {
		System.out.println("Inside Error LogProcessor");
		if (level == ERROR) {
			System.out.println("Error :" + message);
		} else {
			super.log(level, message);
		}

	}

}
