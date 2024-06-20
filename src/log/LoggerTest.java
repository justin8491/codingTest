package log;

public class LoggerTest {

	public static void main(String[] args) {

		MyLogger logger = MyLogger.getLogger();
		logger.log("이거 어떻게 나오냐 ? ");
	}

}
