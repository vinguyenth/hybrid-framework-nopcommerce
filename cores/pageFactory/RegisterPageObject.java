package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BasePageFactory;

public class RegisterPageObject extends BasePageFactory {
	private WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Page UI
	@FindBy(id="FirstName")
	private WebElement firstNameTextbox;
	
	@FindBy(id="LastName")
	private WebElement lasttNameTextbox;
	
	@FindBy(id="Email")
	private WebElement emailTextbox;
	
	@FindBy(id="Password")
	private WebElement passwordTextbox;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextbox;
	
	@CacheLookup
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	@FindBy(id="FirstName-error")
	private WebElement firstNameErrorMessage;
	
	@FindBy(id="LastName-error")
	private WebElement lastNameErrorMessage;
	
	@FindBy(id="Email-error")
	private WebElement emailErrorMessage;
	
	@FindBy(id="Password-error")
	private WebElement passwordErrorMessage;
	
	@FindBy(id="ConfirmPassword-error")
	private WebElement confirmPasswordErrorMessage;
	
	@FindBy(xpath="ico-logout")
	private WebElement logoutButton;
	
	@FindBy(xpath="//div[@class='result']")
	private WebElement registerSuccessMessage;
	
	@FindBy(xpath="//div[@class= 'message-error validation-summary-errors']//li")
	private WebElement existingEmailErrorMessage;
	
	// PageObject/ Action
	public void inputToFirstNameTextbox(String firstName) {
		waitForElementVisible(driver, firstNameTextbox);
		sendkeyToElement(driver, firstNameTextbox, firstName);
		}

		public void inputToLastNameTextbox(String lastName) {
			waitForElementVisible(driver, lasttNameTextbox);
			sendkeyToElement(driver, lasttNameTextbox, lastName);
		}

		public void inputToEmailTextbox(String emailAddress) {
			waitForElementVisible(driver, emailTextbox);
			sendkeyToElement(driver, emailTextbox, emailAddress);
		}

		public void inputToPasswordTextbox(String password) {
			waitForElementVisible(driver, passwordTextbox);
			sendkeyToElement(driver, passwordTextbox, password);
		}

		public void inputToConfirmPasswordTextbox(String confirmPassword) {
			waitForElementVisible(driver, confirmPasswordTextbox);
			sendkeyToElement(driver, confirmPasswordTextbox, confirmPassword);
		}

		public void clickToRegisterButton() {
			waitForElementClickable(driver, registerButton);
			clickToElement(driver, registerButton);
		}

		public String getErrorMessageAtFirstnameTextbox() {
			waitForElementVisible(driver, firstNameErrorMessage);
			return getElementText(driver, firstNameErrorMessage);
		}

		public String getErrorMessageAtLastnameTextbox() {
			waitForElementVisible(driver, lastNameErrorMessage);
			return getElementText(driver, lastNameErrorMessage);
		}

		public String getErrorMessageAtEmailTextbox() {
			waitForElementVisible(driver, emailErrorMessage);
			return getElementText(driver, emailErrorMessage);
		}

		public String getErrorMessageAtPasswordTextbox() {
			waitForElementVisible(driver, passwordErrorMessage);
			return getElementText(driver, passwordErrorMessage);
		}

		public String getErrorMessageAtConfirmPasswordTextbox() {
			waitForElementVisible(driver, confirmPasswordErrorMessage);
			return getElementText(driver, confirmPasswordErrorMessage);
		}

		public String getRegisterSuccessMessage() {
			waitForElementVisible(driver, registerSuccessMessage);
			return getElementText(driver, registerSuccessMessage);
		}

		public void clickToLogoutLink() {
			waitForElementClickable(driver, logoutButton);
			clickToElement(driver, logoutButton);
		}

		public String getErrorExistingEmailMessage() {
			waitForElementVisible(driver, existingEmailErrorMessage);
			return getElementText(driver, existingEmailErrorMessage);
		}

		
	
}
