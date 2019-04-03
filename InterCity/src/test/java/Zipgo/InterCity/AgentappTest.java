package Zipgo.InterCity;

import java.io.IOException;

import org.testng.annotations.Test;


import jxl.read.biff.BiffException;
import  mobileApp.AgentApp;

public class AgentappTest {
	
	AgentApp agent=new AgentApp();
	
  
  @Test(priority=1)
  public void Open_AgentApp() throws BiffException, IOException, InterruptedException { 		
	
		 agent.openagentapp();
		
	   
  }
  
  @Test(priority=2)
  public void Login_AgentApp() throws BiffException, IOException, InterruptedException { 		
	
		agent.loginagentapp();
		
	   
  }
  
  @Test(priority=3)
  public void BookaTicket_AgentApp() throws BiffException, IOException, InterruptedException { 		

		  agent.bookaticket();
		
	   
  }
  
  @Test(priority=4)
  public void view_more_details() throws BiffException, IOException, InterruptedException {
	 
	      agent.view_more_ticket_details();
  }
  
  @Test(priority=5)
  public void edit_booking() throws BiffException, IOException, InterruptedException {
	 
	      agent.edit_booking();
  }
  
  @Test(priority=6)
  public void Cancel_booking_agentapp() throws BiffException, IOException, InterruptedException { 		

		  agent.cancel_booking();
		
	   
  }
  
  @Test(priority=7)
  public void Recharge_AgentApp() throws BiffException, IOException, InterruptedException { 		

		 agent.agentrecharge();
		
	   
  }
  
  @Test(priority=8)
  public void multiple_booking_Agentapp() throws InterruptedException, BiffException, IOException {
	    
	    agent.multple_ticket();
  }
  
  @Test(priority=9)
  public void partial_cancel_agentapp() throws BiffException, InterruptedException, IOException {
	 
	    agent.partial_cancel();
  }
  
    
  @Test(priority=11)
  public void Logout_agentapp() throws InterruptedException {
	    
	    agent.agentlogout();
  }
  
	
	
  @Test(priority=10)
  public void filtercheck_agentapp() throws InterruptedException, BiffException, IOException {
		    
		      agent.filtercheck();
		    //agent.test();
	  }

  @Test(priority=11)
  public void teeest() throws InterruptedException {
	 // agent.test();
	    
	   
}
}
