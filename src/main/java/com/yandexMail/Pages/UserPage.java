package com.yandexMail.Pages;

import com.yandexMail.elements.Button;
import com.yandexMail.elements.HtmlElement;
import com.yandexMail.elements.InPut;
import org.openqa.selenium.By;

public class UserPage {
	private static final By TEXT_FIELD_LOCATOR = By.xpath("//div[@role='textbox']");////a[@class='control link link_theme_normal ComposeDoneScreen-Link']
	private static final By TOPIC_FIELD_LOCATOR = By.xpath("//input[@name='subject']");
	private static final By MAIL_FIELD_LOCATOR = By.xpath("//div[@class='composeYabbles']");
	private static final By BUTTON_WRITE_LOCATOR = By.xpath("//a[@href='#compose']");
	private static final By BUTTON_SEND_MAIL_LOCATOR = By.xpath("//div [@class='ComposeSendButton-Text']//ancestor::button[@type='button']");
	private static final By ATTACH_FILE_LOCATOR = By.xpath("//input[@type='file']");
	private static final By PLACEHOLDER_LOCATOR = By.xpath("//div[contains(@class, 'AttachmentsHeader__actions')]");
	private static final By CLOSE_POPUP_LOCATOR = By.xpath(" //a[@class='control link link_theme_normal ComposeDoneScreen-Link'] ");  //a[text()='Вернуться во \"Входящие\"']
	private static final By BUTTON_RELOAD_USER_PAGE_LOCATOR = By.xpath("//span[@data-click-action='mailbox.check']");
	private static final By LETTER_FIELD_LOCATOR = By.xpath("//div[@data-key='box=infoline-box']");
	private static final By BUTTON_SAVE_ON_DISK_LOCATOR = By.xpath("//a[contains(@title, 'Сохранить на Диск')]");
	private static final By POPUP_LOCATOR = By.id("#app");
	private static final By DOWNLOAD_FORM_LOCATOR = By.xpath("\"//span[@data-reactid=\".0.2.$text.0.0\"]");
	private static final By BUTTON_MOVE_TO_DISK_LOCATOR = By.xpath("//button[@data-reactid='.0.3.$left']");
	private static final By BUTTON_DISK_LOCATOR = By.xpath("//a[@href=\"https://disk.yandex.ru\"]");


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

	public static HtmlElement getPopup() {
		return new HtmlElement(POPUP_LOCATOR);
	}

	public static Button getClosePopup() {
		return new Button(CLOSE_POPUP_LOCATOR);
	}

	public static Button getButtonReloadUserPage() {
		return new Button(BUTTON_RELOAD_USER_PAGE_LOCATOR);

	}
	public static HtmlElement getLetterFieldVisible() {
		return new HtmlElement(LETTER_FIELD_LOCATOR);
	}
	public static Button getButtonSaveOnDisk() {
		return new Button(BUTTON_SAVE_ON_DISK_LOCATOR);
	}

	public static HtmlElement getDownloadForm() {
		return new HtmlElement(DOWNLOAD_FORM_LOCATOR);
	}

	public static Button getButtonMoveDisk() {
		return new Button(BUTTON_MOVE_TO_DISK_LOCATOR);
	}
	public static Button getClickDisk() {
		return new Button(BUTTON_DISK_LOCATOR);
	}
}