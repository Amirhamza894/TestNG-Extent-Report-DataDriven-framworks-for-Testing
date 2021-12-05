package Practice.Self;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
//	Method one
	@Test(enabled=false)
	public void SkipDemo() {
		System.out.println("Skipping the Test Case");
	}
	
	/* Method 2 */
	@Test
	public void SkipDemo2() {
		System.out.println("Skipping the Test Case Method 2, forcefully");
		throw new SkipException("this test case is not completed yet");
	}
	
	boolean DataSetup = false;
	@Test
	public void skipDemo3() {
		System.out.println("Skipping based on condition");
		if(DataSetup == true)
		{
			System.out.println("Execute the Test");
		}
		else {
			System.out.println("Do not Execute the Test");
			throw new SkipException("skipping");
		}
	}

}
