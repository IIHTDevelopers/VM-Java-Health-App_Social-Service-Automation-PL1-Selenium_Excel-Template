package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class socialService_Pages extends StartupPage {
	
//	TC1-Locators
	By usernameTextbox = null;
	By passwordTextbox = null;
	By signInButton = null;
	By registeredPatientTextElement = null;
//	TC2-Locators
	By socialServiceModule = null;
//	TC3-Locators
	By registerNewSSUPatientButton = null;
	By newSSUPatientRegistrationFormNameElement = null;
//	TC4-Locators
	By registrationButtonOfNewSSUPatientRegistrationForms = null;
	By errorMeesageInLastNameTextFieldElement = null;
//	TC5-Locators
	By firstNameTextField = null;
	By middelNameTextField = null;
	By lastNameTextField = null;
//	TC6-Locators
	By registerButtonOfNewSSUPatientRegistrationForms = null;
	By closeButtonOfNewSsuPatientRegistrationByElement = null;

	String pageName = this.getClass().getSimpleName();
	public socialService_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1.1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		
		return false;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and return the title of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {

		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will return the URL of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
			
		return null;
	}

	/**@Test2
	 * about this method verifySocialServiceModuleisPresentAndGoToSocialServiceTab() 
	 * @param : null
	 * @description : Verify that SocialService module is present and Go to SocialService Tab.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifySocialServiceModuleisPresentAndGoToSocialServiceTab() throws Exception {
		
		return false;
	}

	/**@Test3
	 * about this method verifyRegisterNewSSUPatientButtonisPresentAndValidateFormName()
	 * @param : null
	 * @description : It will return the title of the form pop up by clicking the "Register New SSU Patient" button.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyRegisterNewSSUPatientButtonisPresentAndValidateFormName() throws Exception {
		return null;
	}

	/**@Test4
	 * about this method validateErrorMessageInLastNameTextfield() 
	 * @param : null
	 * @description : return the error message in Last Name text field without filling any data and clicking on "Register" Button
	 * @return : String 
  	 * @author : YAKSHA
	 */
	public String validateErrorMessageInLastNameTextfield() throws Exception {
		
		return null;
	}

	/**@Test5
	 * about this method fillDataInTextfieldsAndVerifyEnteredDataInFirstName() 
	 * @param : Map<String, String>,get the data from Excel file (expected_Data) as required
	 * @description : Fill all the mandatory text fields which are present inside the New SSU Patient Registration popup and return the data which we have entered in First Name Field. 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String fillDataInTextfieldsAndVerifyEnteredDataInFirstName(Map<String, String> expectedData) throws Exception {
		
		return null;
	}


	/**@Test6
	 * about this method scrollToButtomOfThePageAndVerifyRegisterAndCloseButtonIsPresent()
	 * @param : null
	 * @description : scroll to the bottom of the page and verify that "Register" and "Close" button are present or not.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean scrollToButtomOfThePageAndVerifyRegisterAndCloseButtonIsPresent() throws Exception {
		
		return false;
	}

	



	
}
