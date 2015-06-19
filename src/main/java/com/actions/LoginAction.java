package com.actions;

import org.apache.log4j.Logger;

public class LoginAction {

	private static Logger Log = Logger.getLogger(LoginAction.class.getName());

	public static void startTestCase(String sTestCaseName) {
		Log.info("****************************************************************************************");

		Log.info("****************************************************************************************");

		Log.info("                               " + sTestCaseName
				+ "                                       ");

		Log.info("****************************************************************************************");

		Log.info("****************************************************************************************");
	}

	public static void endTestCase(String sTestCaseName) {
		Log.info("****************************************************************************************");

		Log.info("****************************************************************************************");

		Log.info("$$$$$$$$$$$$$$$$$$             " + "E------N------D"
				+ "                $$$$$$$$$$$$$$$$$$$");

		Log.info("****************************************************************************************");

		Log.info("****************************************************************************************");

	}

	public static void info(String message) {
		Log.info(message);
	}

	public static void error(String message) {
		Log.info(message);
	}

}
