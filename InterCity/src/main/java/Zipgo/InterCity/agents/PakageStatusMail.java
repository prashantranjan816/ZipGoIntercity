package Zipgo.InterCity.agents;

import java.net.MalformedURLException;

import org.apache.commons.mail.EmailException;
import org.testng.annotations.Test;

public class PakageStatusMail {
	
//	@Test
	public PakageStatusMail() throws MalformedURLException, EmailException {
		Mail.ReportEmail_Send.sendMail("prashant.ranjan@zipgo.in");
	}
	


}
