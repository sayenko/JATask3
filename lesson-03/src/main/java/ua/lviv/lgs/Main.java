package ua.lviv.lgs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {

	private static Logger LOG = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		outputToConsole();
		System.out.println();
		outputToFile();
	}

	public static void outputToConsole() {
		DOMConfigurator.configure("loggerConfigToConsole.xml");
		LOG.debug("DEBUG Logger message of project");
		LOG.info("INFO Logger message of project");		
		LOG.warn("WARN Logger message of project");
	}
	
	public static void outputToFile() {
		DOMConfigurator.configure("loggerConfigToFile.xml");
		LOG.error("ERROR Logger message of project");
	}
	
}
