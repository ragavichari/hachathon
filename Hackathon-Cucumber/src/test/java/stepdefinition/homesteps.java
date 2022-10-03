package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.home;
//import pageobject.loginpage;
import utility.helper;

public class homesteps extends Baseclass{
	
	
	
	//@When("User landed on the Home page after logging into the LMS website")
	//public void user_landed_on_the_home_page_after_logging_into_the_lms_website() {
		
	   // hp=new home(helper.getDriver());
	//}

	/*@Then("verify that title of the page is LMS")
	public void verify_that_title_of_the_page_is_lms() {
		
		hp.titlehome();
		System.out.println("print manage program");
	}
	
	@When("User see a heading with text LMS - Learning Management System on the Home page")
	public void user_see_a_heading_with_text_lms_learning_management_system_on_the_home_page() {
	    
	}

	@When("verify site header on the homepage")
	public void verify_site_header_on_the_homepage() {
	    hp.titleprogram();
	    System.out.println("print manage program");
	}

	@When("User see a button with text Program on the menu bar")
	public void user_see_a_button_with_text_program_on_the_menu_bar() {
		
		hp.buttonprogramtab();
	}

	@Then("verifying the program button on the menu bar")
	public void verifying_the_program_button_on_the_menu_bar() {
		hp.titleprogram();
		System.out.println(" program");
	}

	@When("User see a button with text Batch on the menu bar")
	public void user_see_a_button_with_text_batch_on_the_menu_bar() {
	    hp.buttonbatchtab();
	}

	@Then("verifying the batchbutton on the menu bar")
	public void verifying_the_batchbutton_on_the_menu_bar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User see a button with text useron the menu bar")
	public void user_see_a_button_with_text_useron_the_menu_bar() {
	   hp.buttonusertab();
	}

	@Then("verifying the user button on the menu bar")
	public void verifying_the_user_button_on_the_menu_bar() {
	    
	}

	@When("User see a button with text on Assignment the menu bar")
	public void user_see_a_button_with_text_on_assignment_the_menu_bar() {
	    hp.buttonassignmenttab();
	}

	@Then("verifying the Assignment button on the menu bar")
	public void verifying_the_assignment_button_on_the_menu_bar() {
	    
	}

	@When("User see a button with text on Attendance the menu bar")
	public void user_see_a_button_with_text_on_attendance_the_menu_bar() {
	    hp.buttonAttendancetab();
	}

	@Then("verifying the Attendance button on the menu bar")
	public void verifying_the_attendance_button_on_the_menu_bar() {
	    
	}

	@When("User see a button with text on logout the menu bar")
	public void user_see_a_button_with_text_on_logout_the_menu_bar() {
	    hp.buttonlogout();
	}

	@Then("verifying the logout button on the menu bar")
	public void verifying_the_logout_button_on_the_menu_bar() {
	   	}*/

	@Given("User is on the LMS Home page")
	public void user_is_on_the_lms_home_page() {
		hp=new home(helper.getDriver());
		hp.checkTitle();
	}

	@When("User should see the LMS page")
	public void user_should_see_the_lms_page() {
	    hp.checkTitle();
	}

	@Then("Verify the title of the Home page")
	public void verify_the_title_of_the_home_page() {
	   hp.checkTitle();
	}

	@Then("User should see a heading with text LMS - Learning Management System on the Home page")
	public void user_should_see_a_heading_with_text_lms_learning_management_system_on_the_home_page() {
		//hp.checkTitle();
	}

	@Then("User should see a button with text Program on the menu bar")
	public void user_should_see_a_button_with_text_program_on_the_menu_bar() {
	    hp.checkProgramHeader();
	}

	@Then("User should see a button with text Batch on the menu bar")
	public void user_should_see_a_button_with_text_batch_on_the_menu_bar() {
	    hp.checkBatchHeader();
	}

	@Then("User should see a button with text User on the menu bar")
	public void user_should_see_a_button_with_text_user_on_the_menu_bar() {
	    hp.checkUserHeader();
	}

	@Then("User should see a button with text Assignment on the menu bar")
	public void user_should_see_a_button_with_text_assignment_on_the_menu_bar() {
	    hp.checkAssignmentHeader();
	}

	@Then("User should see a button with text Attendance on the menu bar")
	public void user_should_see_a_button_with_text_attendance_on_the_menu_bar() {
	    hp.checkAttendanceHeader();
	}

	@Then("User should see a button with text Logout on the menu bar")
	public void user_should_see_a_button_with_text_logout_on_the_menu_bar() {
	    hp.checkLogoutHeader();
	}

	
}
