package Package1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Logging2 {
	
	
	public static Logger log = LogManager.getLogger(Logging2.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  log.debug("This is a DEBUG message"); log.info("his is a INFO message");
		  log.error("This is a ERROR message");
		 
		
	}

}
