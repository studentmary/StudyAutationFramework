package com.yandexMail.Pages;

import com.yandexMail.driver.Waiter;
import io.qameta.allure.Step;

public class UserPageHelper {

	@Step("Wait visible  button write")
	public static void waitVisibleButtonWrite() {
		Waiter.untilVisible(UserPage.getButtonWrite(), " Button write was not visible");
	}

	@Step("Click the write button")
	public static void submitForm() {
		UserPage.getButtonWrite().click();
	}

	@Step("Wait open letter form")
	public static void writeNewLetterForm() {
		UserPage.getMailField();
	}

	@Step("Fill mail")
	public static void fillMail(String mail) {
		UserPage.getMailField().sendKeys(mail);
	}

	@Step("Wait topic field")
	public static void waitTopicField() {
		UserPage.getTopicField();
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

	@Step("Click the send button")
	public static void submitSend() {
		UserPage.getButtonSend().click();
	}

	@Step("Send letter")
	public static void sendLetter(String mail, String topic, String text) {
		waitVisibleButtonWrite();
		submitForm();
		writeNewLetterForm();
		fillMail(mail);
		waitTopicField();
		fillTopic(topic);
		fillText(text);
		attachFile("D://формулы");
		submitSend();


	}
}
