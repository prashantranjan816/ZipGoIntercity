package Mail;

import java.io.File;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.testng.ISuite;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;
import org.testng.xml.XmlSuite;

public class ReportEmail_Send {
	
	static String mailid 					= "prashant.zipgouser@gmail.com";
	static String mailpwd 					= "Zipgouser@321";
	static String dateFinal;
	static String DayName;
	static int full;
	int type;
	static String ProjectReportPath		="./target/surefire-reports/ExtendReport/InterCityExtendReport.html";
	
//	@Test
	public static void sendMail(String mailaddto1) throws EmailException, MalformedURLException {
		calender();
		Day(full);
		
		String mailSubject="InterCity ProjectReport Mail";
		String HostName="smtp.gmail.com";
		int SmtpPort=465;
		
		
		/*
		 * // String mailaddto1="prashant.ranjan@zipgo.in"; String
		 * mailaddto2="Harshdeep@zipgo.in"; String mailaddto3="sandesh@zipgo.in"; String
		 * mailaddto4="siddhartha@zipgo.in"; String mailaddto5="pooja.sharma@zipgo.in";
		 */
		
		
/*
		System.out.println("Sending attachement mail..");
		
		// Create the attachment
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("./target"+File.separator+"surefire-reports"+ File.separator + "ExtendReport" + File.separator + "InterCityExtendReport.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setName("InterCityExtendReport.html");
		
		// Create the attachment
				EmailAttachment attachment1 = new EmailAttachment();
				attachment1.setPath("./screenshot/headlessSetup_ScreenShot.png");
				attachment1.setDisposition(EmailAttachment.ATTACHMENT);
				attachment1.setName(dateFinal+"SecondScreenShot1.png");
		
		*/
		
		// Create the email message
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName(HostName);
		email.setSmtpPort(SmtpPort); //smtpPort=465 fix for Gmail.
		email.setAuthenticator(new DefaultAuthenticator(mailid, mailpwd));
		email.setSSLOnConnect(true);
		email.setFrom(mailid);
		email.setSubject(mailSubject+" |[ "+dateFinal+"]:"+DayName+"http://13.233.139.207/#!");
		email.addTo(mailaddto1);
		/*
		 * email.addTo(mailaddto2); // email.addTo(mailaddto3); email.addTo(mailaddto4);
		 * email.addTo(mailaddto5);
		 */
	
		
		email.addReplyTo(mailaddto1);
		

		email.setMsg("Please see the atached screenshot & Report to your browser on ip http://13.233.139.207/#!"
				+ " OR You will get full extend report at location  >> "+ProjectReportPath);
		/*//Attached the file
		try {
			email.attach(attachment);
			email.attach(attachment1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("please checkattachement location");
			e.printStackTrace();
		}*/
		// send the email
		email.send();
		System.out.println("Sent!");
		//master origin branch
	}
	
	public static void calender() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 0);//insted of 0 we can use +-1 to indrease or decrease current date.
		dateFinal = df.format(cal.getTime());
	}
	
	public static void Day(int type) {
		
		
		 Date todayDay = new Date();
		 if (type==full) {
	        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
	        DayName=simpleDateformat.format(todayDay);
		 }else {
	        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EE"); // the day of the week spelled out partial
	        DayName=simpleDateformat.format(todayDay);
		 }
	        
//	        System.out.println(DayName);
	}
	

}
