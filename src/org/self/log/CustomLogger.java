package org.self.log;

import java.util.ResourceBundle;
import java.util.logging.Logger;

public class CustomLogger {

	private Logger logger;

	public CustomLogger() {
		logger = Logger.getLogger("CustomLogger", "custom");
	}

	public void print() {
		ResourceBundle res = logger.getResourceBundle();
		System.out.println(res.getLocale());

		logger.severe("Server Message");
		logger.warning("Warning Message");
		logger.info("Info Message");
		logger.config("Config Message");
		logger.fine("Fine Message");
		logger.finer("Finer Message");
		logger.finest("Finest Message");
	}

}
