package com.yandexMail.Pages;

import com.yandexMail.elements.Button;
import com.yandexMail.elements.HtmlElement;
import org.openqa.selenium.By;


public class DiskPage {

	//Locators for Step "Download file into Files"

	private static final By BUTTON_DOWNLOADS_LOCATOR = By.xpath("//a[contains(@class, 'navigation__link_favorite navigation__link_downloads')]");
	private static final By FILE_LOCATOR = By.xpath("//div[contains(@class,'listing-item__icon listing-item__icon_type_icon listing-item__icon_resource_file')][1]");
	private static final By BUTTON_MOVE_LIST_LOCATOR = By.xpath("//div[@data-key='item-4']");
	private static final By DOWNLOAD_DIALOG_WRAP_LOCATOR = By.className("dialog__wrap");
	private static final By BUTTON_MOVE_DIALOG_WRAP_LOCATOR = By.xpath("//div[@class='confirmation-dialog__footer']//button[2]");

	//Locators for Step "Move file into basket"

	private static final By BUTTON_FILES_SIDE_BAR_LOCATOR = By.xpath("//a[contains(@class,'navigation__link navigation__link_current')]");
	private static final By FILE_IN_FILES_LOCATOR = By.xpath("//div[contains(@class,'listing-item_type_file')][1]");
	private static final By BASKET_LOCATOR = By.xpath("//div[contains(@class,'listing-item_type_dir')][last()]");


	public static Button getButtonDownloads() {
		return new Button(BUTTON_DOWNLOADS_LOCATOR);
	}

	public static HtmlElement getFile() {
		return new HtmlElement(FILE_LOCATOR);
	}

	public static Button getClickMoveButtonFromList() {
		return new Button(BUTTON_MOVE_LIST_LOCATOR);
	}

	public static HtmlElement getOpenDialogWrap() {
		return new HtmlElement(DOWNLOAD_DIALOG_WRAP_LOCATOR);
	}

	public static Button getClickMoveButtonFromDialogWrap() {
		return new Button(BUTTON_MOVE_DIALOG_WRAP_LOCATOR);
	}

	public static Button getFilesFromSideBar() {
		return new Button(BUTTON_FILES_SIDE_BAR_LOCATOR);
	}

	public static HtmlElement getFileInFiles() {
		return new HtmlElement(FILE_IN_FILES_LOCATOR);
	}

	public static HtmlElement getBasket() {
		return new HtmlElement(BASKET_LOCATOR);
	}

}
