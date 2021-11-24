package com.yandexMail.Pages;

import com.yandexMail.elements.Button;
import com.yandexMail.elements.HtmlElement;
import com.yandexMail.elements.InPut;
import org.openqa.selenium.By;


public class UserPage {
	//Locators for Step "Write and send letter"
	private static final By BUTTON_WRITE_LOCATOR = By.xpath("//a[@href='#compose']");
	private static final By MAIL_FIELD_LOCATOR = By.xpath("//div[@class='composeYabbles']");
	private static final By TOPIC_FIELD_LOCATOR = By.xpath("//input[@name='subject']");
	private static final By TEXT_FIELD_LOCATOR = By.xpath("//div[@role='textbox']");
	private static final By ATTACH_FILE_LOCATOR = By.xpath("//input[@type='file']");
	private static final By PLACEHOLDER_LOCATOR = By.xpath("//div[contains(@class,'ATTACH_FIELD_LOCATORF')]");
	private static final By BUTTON_SEND_MAIL_LOCATOR = By.xpath("//div[@class='ComposeSendButton-Text']//ancestor::button[@type='button']");
	private static final By FORM_SEND_MAIL_LOCATOR = By.xpath("//div[contains(@class,'ComposeDoneScreen-Header')]");

	//Locators for Step "Save letter to disk"
	private static final By LETTER_FIELD_LOCATOR = By.xpath("//div[@data-key='box=infoline-box']");
	private static final By BUTTON_SAVE_ON_DISK_LOCATOR = By.xpath("//a[contains(@title, 'Сохранить на Диск')]");
	private static final By FRAME_LOCATOR =By.xpath("//div[contains(@class, '_nb-popup-content')]");
	private static final By BUTTON_OPEN_DISK_LOCATOR = By.xpath ("//div[contains(@class, 'PSHeaderIcon-Image_Disk')]");     //("//a[@href=\"https://disk.yandex.ru\"]");


	public static Button getButtonWrite() {
		return new Button(BUTTON_WRITE_LOCATOR);
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

	public static HtmlElement getPlaceholder() {
		return new HtmlElement(PLACEHOLDER_LOCATOR);
	}

	public static Button getButtonSend() {
		return new Button(BUTTON_SEND_MAIL_LOCATOR);
	}

	public static HtmlElement getFormSendLetter() {
		return new HtmlElement(FORM_SEND_MAIL_LOCATOR);
	}

	public static HtmlElement getLetterField() {
		return new HtmlElement(LETTER_FIELD_LOCATOR);
	}

	public static Button getButtonSaveOnDisk() {
		return new Button(BUTTON_SAVE_ON_DISK_LOCATOR);
	}

	public static HtmlElement getDownloadIframe() {
		return new HtmlElement(FRAME_LOCATOR);
	}

	public static Button getButtonOpenDisk() {
		return new Button(BUTTON_OPEN_DISK_LOCATOR);
	}
}