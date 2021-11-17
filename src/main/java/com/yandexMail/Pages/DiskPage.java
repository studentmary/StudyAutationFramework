package com.yandexMail.Pages;

import com.yandexMail.elements.Button;
import com.yandexMail.elements.HtmlElement;
import org.openqa.selenium.By;


public class DiskPage {

	private static final By DISK_PAGE_LOCATOR = By.id("#nb-1");
	private static final By BUTTON_FILES_SIDE_BAR_LOCATOR = By.xpath("//a[@title='Файлы']");
	//	private static final By BUTTON_DOWNLOAD_FOLDER_LOCATOR = By.xpath("");
//	private static final By LIST_BOX_LOCATOR = By.className("resources-actions-popup__wrapper");
//	private static final By BUTTON_MOVE_LIST_LOCATOR = By.xpath("//div[@data-key='item-3']");
	private static final By DOWNLOAD_DIALOG_WRAP_LOCATOR = By.className("dialog__wrap");
	private static final By FILES_DIALOG_WRAP_LOCATOR = By.xpath("//div[@title=\"Файлы\"]");
	private static final By BUTTON_MOVE_DIALOG_WRAP_LOCATOR = By.xpath("//div[@class='confirmation-dialog__footer']//button[2]");
	private static final By FILE_LOCATOR = By.xpath("");
	private static final By MENU_GROUP_LOCATOR = By.xpath("");
	private static final By MOVE_FILE_LOCATOR = By.xpath("//span[text()='Переместить']");
	private static final By DOWNLOAD_FILE_LOCATOR = By.xpath("");
	private static final By BASKET_LOCATOR = By.xpath("");

	public static HtmlElement getOpenDiskPage() {
		return new HtmlElement(DISK_PAGE_LOCATOR);
	}

	public static Button getClickFile() {
		return new Button(FILE_LOCATOR);

	}

	public static HtmlElement getOpenMenuGroup() {
		return new HtmlElement(MENU_GROUP_LOCATOR);
	}

	public static Button getClickMoveButtonFromMenuGroup() {
		return new Button(MOVE_FILE_LOCATOR);
	}

	public static HtmlElement getOpenDialogWrap() {
		return new HtmlElement(DOWNLOAD_DIALOG_WRAP_LOCATOR);
	}

	public static Button getClickFilesFromDialogWrap() {
		return new Button(FILES_DIALOG_WRAP_LOCATOR);
	}

	public static Button getClickMoveButtonFromDialogWrap() {
		return new Button(BUTTON_MOVE_DIALOG_WRAP_LOCATOR);
	}

	public static Button getFilesFromSideBar() {
		return new Button(BUTTON_FILES_SIDE_BAR_LOCATOR);
	}

	public static HtmlElement getDownloadFile() {
		return new HtmlElement(DOWNLOAD_FILE_LOCATOR);
	}

	public static HtmlElement getBasket() {
		return new HtmlElement(BASKET_LOCATOR);
	}


//	public static HtmlElement getDownloadFolder() {
//		return new HtmlElement(BUTTON_DOWNLOAD_FOLDER_LOCATOR);
//	}
//
//	public static HtmlElement getListBox() {
//		return new HtmlElement(LIST_BOX_LOCATOR);
//	}
//
//	public static Button getClickMoveButtonFromList() {
//		return new Button(BUTTON_MOVE_LIST_LOCATOR);
//	}


}
