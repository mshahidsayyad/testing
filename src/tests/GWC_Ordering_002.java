package tests;

import logger.FrameworkLogger;
import logger.FrameworkLogger.LEVEL;
import harness.TestInfinity;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GWC_Ordering_002  extends TestInfinity{

	
	@Test
	private void gwc_Ordering_002(){
		
		FrameworkLogger.log("Starting GWC_Ordering_002", LEVEL.info, GWC_Ordering_002.class);
		Assert.assertEquals(true, false);
	}
}
