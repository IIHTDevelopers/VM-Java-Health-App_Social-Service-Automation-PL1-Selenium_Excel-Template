package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class socialService_Pages extends StartupPage {
	
	By usernameTextfield=By.id(" ");
	By usernameTextbox = By.xpath(" ");
	By passwordTextbox = By.xpath(" ");
	By signInButton = By.xpath(" ");
	By registeredPatientTextElement = By.xpath(" ");	
	By totalDoctorsTextElement = By.xpath(" ");	
	By todaysAppointmentTextElement = By.xpath(" ");	
	By socialServiceModule = By.xpath(" ");	
	By registerNewSSUPatientButton = By.xpath(" ");	
	By searchBar = By.id(" ");
	By newSSUpatientRegistrationPopup= By.xpath(" ");
	By firstNameTextField = By.id(" ");
	By middelNameTextField = By.id(" ");
	By lastNameTextField = By.id(" ");
	By ageTextField = By.id(" ");
	By phoneNumberTextField = By.id(" ");
	By phoneNumberTextFieldErrorMessage = By.xpath(" ");
	By countryDropdown = By.id(" ");
	By countryDropdownMenuElement = By.xpath(" ");
	By selectIndiaIncountryDropdown = By.xpath(" ");
	By warningMessage = By.xpath(" ");
	By hasTG_certificateDropdown = By.id(" ");
	By selectYesFromhasTG_certificateDropdown = By.xpath(" ");
	By addressTextField = By.id(" ");
	By patientInformationBar = By.xpath(" ");
	By patientInformationText = By.xpath(" ");	
	By ssuInformationBar = By.xpath(" ");
	By targetGroupDropdown = By.id(" ");
	By registerButton = By.id(" ");
	By newSSUPatientRegistrationFormNameElement = By.xpath(" ");
	By registrationButtonOfNewSSUPatientRegistrationForms = By.xpath(" ");
	By errorMeesageInLastNameTextFieldElement = By.xpath(" ");
	By registerButtonOfNewSSUPatientRegistrationForms = By.xpath(" ");
	By targetGroupCertificateTypeTextbox = By.xpath(" ");
	By certificateNoTextbox = By.xpath(" ");
	By ssuPatientListButtonByElement = By.xpath(" ");
	By subCategoryTabByElement = By.xpath(" ");
	By cuttonSubCategoryNameByElement = By.xpath(" ");
	By itemSubmenuByElement = By.xpath(" ");
	By addItemButtonByElement = By.xpath(" ");
	By generalInventoryRadioButtonByElement = By.xpath(" ");
	By commonRadioButtonByElement = By.xpath(" ");
	By inactiveRadioButton = By.xpath(" ");
	By activeRadioButton = By.xpath(" ");
	By addItemPageNameByElement = By.xpath(" ");
	By isCssdApplicableCheckBoxByElement = By.xpath(" ");
	By isColdStorageApplicableCheckBoxByElement = By.xpath(" ");
	By isPatConsumptionApplicableCheckBoxByElement = By.xpath(" ");

	String pageName = this.getClass().getSimpleName();
	public socialService_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1
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
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
			
		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
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
	 * about this method registerNewSSUPatientButtonisPresent() 
	 * @param : null
	 * @description : Verify that Register New SSU Patient button is present inside the SocialService Tab.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public String verifyRegisterNewSSUPatientButtonisPresentAndValidateFormName() throws Exception {
		return null;
	}

	/**@Test4
	 * about this method validateErrorMessageInLastNameTextfield() 
	 * @param : null
	 * @description : Validate the error message in Last Name text field without filling any data and clicking on "Register" Button
	 * @author : YAKSHA
	 */
	public String validateErrorMessageInLastNameTextfield() throws Exception {
		
		return null;
	}

	/**@Test5
	 * about this method fillAllTheTextfieldsinsideTheNewSSUPatientRegistrationForm() 
	 * @param : Map<String, String>
	 * @description : Fill all the text fields which are present inside the New SSU Patient Registration popup  and Check the data which we are entered are present in First Name Field. 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String fillDataInTextfieldsAndVerifyEnteredData(Map<String, String> expectedData) throws Exception {
		
		return null;
	}

	/**@Test6
	 * about this method selectIndiaFromCountryDropdownAndVerifySelection() 
	 * @param : get the data from Excel file as type Map<String, String> expectedData
	 * @description : it will select the country as per Excel expected data
	 * @return : String
	 * @author : YAKSHA
	 */
	public String selectIndiaFromCountryDropdownAndVerifySelection(Map<String, String> expectedData) throws Exception {

		return null;	
	}

	/**@Test7
	 * about this method scrollToButtomOfThePageAndVerifyCloseButtonIsPresent() 
	 * @param : null
	 * @description : scroll to the bottom of the page and verify that "Close" button is present or not.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean scrollToButtomOfThePageAndVerifyCloseButtonIsPresent() throws Exception {
		
		return false;
	}

	/**@Test8
	 * about this method validateWarnningMessageOfNewSSUPatientRegistrationForms() 
	 * @param : Map<String, String>
	 * @description : Validate the warnning message for the membership dropdown.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String validateWarnningMessageOfNewSSUPatientRegistrationForms(Map<String, String> expectedData) throws Exception {
		
		return null;
	}



	
}
