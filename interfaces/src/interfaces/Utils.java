package interfaces;

public class Utils {
	//Java'da �st class static  olamaz.
	
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger : loggers) {
			logger.log(message);
		}
	}
}
