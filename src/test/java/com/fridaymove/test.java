package com.fridaymove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import Resources.Base;

public class test {
	public static Logger Log = LogManager.getLogger(test.class.getName());
	@Test
	public void tyest() {
		Log.debug("This is for testing purposes");
		Log.debug("Test");
		Log.error("Error message");
	}

}
