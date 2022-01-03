package Log4jAlpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemoApha {

	public static Logger log = LogManager.getLogger(log4jDemoApha.class.getName());
	public static void main(String[] args) {
		
		log.debug("This is a debug error");
		log.fatal("This is a fatal error");
		log.info("program execution is  started");
		log.error("This is error");
		
		/*
		 *******When to Use log. Error, debug and info methods in Selenium test cases*****************************
		Use log. Error() to log when elements are not displayed in the page or if any validations fail
		Use Log. Debug()
		When each Selenium action is performed like click, SendKeys, getText()
		Use log.info()
		When operation is successfully completed ex: After loading page, or after any successful validations
		It’s just counterpart to log. Error()
		*****************sample Testcase is found at the end of this section***********************************
		 */

	}

}
