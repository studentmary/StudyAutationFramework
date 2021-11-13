package com.yandexMail.Pages;

import com.yandexMail.elements.Button;
import com.yandexMail.elements.InPut;
import org.openqa.selenium.By;

public class UserPage {
	private static final By TEXT_FIELD_LOCATOR = By.xpath("//div[@role='textbox']");
	private static final By TOPIC_FIELD_LOCATOR = By.xpath("//input[@name='subject']");
	private static final By MAIL_FIELD_LOCATOR = By.xpath("//div[@class='composeYabbles']");
	private static final By BUTTONWRITE_LOCATOR = By.xpath("//a[@href='#compose']");
	private static final By BUTTONSEND_LOCATOR = By.xpath("//div [@class='ComposeSendButton-Text']//ancestor::button[@type='button']");
	private static final By ATTACHFILE_LOCATOR = By.xpath("//input[@type='file']");

	public static Button getButtonWrite() {
		return new Button(BUTTONWRITE_LOCATOR);
	}

	public static Button getButtonSend() {
		return new Button(BUTTONSEND_LOCATOR);
	}

	public static InPut getMailField() {
		return new InPut(MAIL_FIELD_LOCATOR);
	}

	public static InPut getTopicField() {
		return new InPut(TOPIC_FIELD_LOCATOR);
	}

	public static InPut getTextField() {
		return new InPut(TEXT_FIELD_LOCATOR);
	}

	public static InPut getAttachFile() {
		return new InPut(ATTACHFILE_LOCATOR);
	}
}
