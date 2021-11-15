package com.yandexMail.Pages;

import com.yandexMail.elements.Button;
import com.yandexMail.elements.InPut;
import com.yandexMail.elements.Placeholder;
import org.openqa.selenium.By;

public class UserPage {
	private static final By TEXT_FIELD_LOCATOR = By.xpath("//div[@role='textbox']");
	private static final By TOPIC_FIELD_LOCATOR = By.xpath("//input[@name='subject']");
	private static final By MAIL_FIELD_LOCATOR = By.xpath("//div[@class='composeYabbles']");
	private static final By BUTTON_WRITE_LOCATOR = By.xpath("//a[@href='#compose']");
	private static final By BUTTON_SEND_LOCATOR = By.xpath("//div [@class='ComposeSendButton-Text']//ancestor::button[@type='button']");
	private static final By ATTACH_FILE_LOCATOR = By.xpath("//input[@type='file']");
	private static final By PLACEHOLDER_LOCATOR = By.xpath("//div[@class='composeReact_placeholder']");
	private static final By BUTTON_RELOAD_USER_PAGE_LOCATOR = By.xpath("//span[@data-click-action='mailbox.check']");
	private static final By BUTTON_SAVE_ON_DISK_LOCATOR = By.xpath("//a[contains(@class,\"mail-File-Actions-Item_secondary\")][1]");

	public static Button getButtonWrite() {
		return new Button(BUTTON_WRITE_LOCATOR);
	}

	public static Button getButtonSend() {
		return new Button(BUTTON_SEND_LOCATOR);
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
		return new InPut(ATTACH_FILE_LOCATOR);
	}

	public static Placeholder getPlaceholder() {
		return new Placeholder(PLACEHOLDER_LOCATOR);
	}
	public static Button getButtonReloadUserPage() {
		return new Button(BUTTON_RELOAD_USER_PAGE_LOCATOR);
	}
	public static Button getButtonSaveOnDisk() {
		return new Button(BUTTON_SAVE_ON_DISK_LOCATOR);
	}

}
