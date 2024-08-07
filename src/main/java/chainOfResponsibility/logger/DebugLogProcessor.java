package chainOfResponsibility.logger;

public class DebugLogProcessor extends LogProcessor {

	public DebugLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
	}

	@Override
	public void log(int level, String message) {
		System.out.println("Inside Debug LogProcessor");
		if (level == DEBUG) {
			System.out.println("Debug :" + message);
		} else {
			super.log(level, message);
		}

	}

}
