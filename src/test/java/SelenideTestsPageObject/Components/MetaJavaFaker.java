package SelenideTestsPageObject.Components;

import SelenideTestsPageObject.SelenideTestsPageObjectTestBase;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MetaJavaFaker extends SelenideTestsPageObjectTestBase {


	private SelenideElement firstNameInput = $x(".//*[@id='firstName']");
	private SelenideElement lastNameInput = $x(".//*[@id='lastName']");
	private SelenideElement userEmailInput = $x(".//*[@id='userEmail']");
	private SelenideElement phoneNumber1Input = $x(".//*[@id='userNumber']");
	private SelenideElement phoneNumber2Input = $x(".//*[@id='userNumber']");
	private SelenideElement currentAddressInput = $x(".//*[@id='currentAddress']");
	private SelenideElement subjectInput = $x(".//*[@id='subjectsInput']");

	public MetaJavaFaker setSubjectInput(String value) {
		subjectInput.setValue(value);
		return this;
	}


	public MetaJavaFaker setFirstNameInput(String value) {
		firstNameInput.setValue(value);
		return this;
	}

	public MetaJavaFaker setLastNameInput(String value) {
		lastNameInput.setValue(value);
		return this;
	}

	public MetaJavaFaker setUserEmailInput(String value) {
		userEmailInput.setValue(value);
		return this;
	}

	public MetaJavaFaker setPhoneNumber1Input(int value) {
		phoneNumber1Input.setValue(String.valueOf(value));
		return this;
	}

	public MetaJavaFaker setPhoneNumber2Input(long value) {
		phoneNumber2Input.setValue(String.valueOf(value));
		return this;
	}

	public MetaJavaFaker setCurrentAddressInput(String value) {
		currentAddressInput.setValue(value);
		return this;
	}

//	public MetaJavaFaker getCheckResult(String key, String value) {
//		$x(".//*[@class='table table-dark table-striped table-bordered table-hover']").$(byText(key)).parent()
//				.shouldHave(text(value));
//		return this;
//	}
}