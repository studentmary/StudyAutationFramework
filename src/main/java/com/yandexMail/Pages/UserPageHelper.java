package com.yandexMail.Pages;

import com.yandexMail.driver.Waiter;
import io.qameta.allure.Step;

public class UserPageHelper {

	@Step("Wait open user page")
	public static void waitOpenUserPage() {
		Waiter.untilVisible(UserPage.getButtonWrite(), " User page was not open");
	}

	@Step("Click the write button")
	public static void submitForm() {
		UserPage.getButtonWrite().click();
	}

	@Step("Wait open letter form")
	public static void writeNewLetterForm() {
		Waiter.untilVisible(UserPage.getMailField(), "Letter form was not open");
	}

	@Step("Fill mail")
	public static void fillMail(String mail) {
		UserPage.getMailField().sendKeys(mail);
	}

	@Step("Fill topic")
	public static void fillTopic(String topic) {
		UserPage.getTopicField().sendKeys(topic);
	}

	@Step("Fill text")
	public static void fillText(String text) {
		UserPage.getTextField().sendKeys(text);
	}

	@Step("Attach file")
	public static void attachFile(String file) {
		UserPage.getAttachFile().sendKeys(file);
	}

	@Step("Wait placeholder will be invisible")
	public static void invisiblePlaceholder() {
		Waiter.untilInVisible(UserPage.getPlaceholder());
	}

	@Step("Click the send button")
	public static void submitSendMail() {
		UserPage.getButtonSend().click();
	}

	@Step("Wait popup has been visible")
	public static void waitPopupVisible() {
		Waiter.untilVisible(UserPage.getPopup(), "Popup has not visible");
	}

	@Step("Close popup")
	public static void closePopup() {
		UserPage.getClosePopup().click();
	}

	@Step("Reload user page click button")
	public static void reloadUserPage() {
		UserPage.getButtonReloadUserPage().click();
	}

	@Step("Wait letter field has been visible")
	public static void waitLetterField() {
		Waiter.untilVisible(UserPage.getLetterFieldVisible(), "Letter field has not visible");
	}

	@Step("Wait and click the button save on disk")
	public static void waitSaveOnDiskButton() {
		Waiter.untilVisible(UserPage.getButtonSaveOnDisk(), "Button has not visible");
	}

	@Step("Wait and click the button save on disk")
	public static void clickSaveOnDiskButton() {
		UserPage.getButtonSaveOnDisk().click();
	}

	@Step("Wait visible download form")
	public static void visibleDownloadForm() {
		Waiter.untilVisible(UserPage.getDownloadForm(), "Form has not visible");
	}

	@Step("Click  button to move disk")
	public static void clickMoveDisk() {
		UserPage.getButtonMoveDisk().click();
	}
	@Step("Click the button disk")
	public static void clickDisk() {
		UserPage.getClickDisk().click();
	}

	public static void sendLetter(String mail, String topic, String text, String file) {
		waitOpenUserPage();
		submitForm();
		writeNewLetterForm();
		fillMail(mail);
		fillTopic(topic);
		fillText(text);
		attachFile(file);
		invisiblePlaceholder();
		submitSendMail();
		waitPopupVisible();
		closePopup();
		reloadUserPage();
		waitLetterField();
		waitSaveOnDiskButton();
		clickSaveOnDiskButton();
		visibleDownloadForm();
		clickMoveDisk();
		clickDisk();



	}


}