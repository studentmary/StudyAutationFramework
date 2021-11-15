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
		Waiter.untilInVisible(UserPage.getPlaceholder(), " Element wasn't find");
	}

	@Step("Click the send button")
	public static void submitSendMail() {
		UserPage.getButtonSend().click();
	}

	//	@Step("Wait letter send")
//	public static void waitLetterSend() {
//		Waiter.untilVisible(UserPage.getMailField(), "Letter was not send");
//	}
	@Step("Reload user page click button")
	public static void reloadUserPage() {
		UserPage.getButtonReloadUserPage().click();
	}

	@Step("Wait button save on disk will visible")
	public static void waitButtonSaveOnDisk() {
		Waiter.untilVisible(UserPage.getButtonSaveOnDisk(), "Button was not visible");
	}

	@Step("Click the  save on disk button")
	public static void clickSaveOnDiskButton() {
		UserPage.getButtonSaveOnDisk().click();
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
		//waitLetterSend();
		reloadUserPage();
		waitButtonSaveOnDisk();
		clickSaveOnDiskButton();
	}
}

