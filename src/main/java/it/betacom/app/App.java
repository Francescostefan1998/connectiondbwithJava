package it.betacom.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.itextpdf.text.Document;

public class App {

	private static Logger Logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		System.out.println("hello world");
		Document document;
		Logger.info("info message");
		Logger.warn("warning message");
		Logger.error("error message ");
		Logger.fatal("fatal message");
	}

}