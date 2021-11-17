package com.yandexMail.Pages;

import com.yandexMail.driver.Waiter;
import com.yandexMail.elements.HtmlElement;
import io.qameta.allure.Step;

public class DiskPageHelper {

	@Step("Wait open disk page")
	public static void waitUntilOpenDiskPage() {
		Waiter.untilVisible(DiskPage.getOpenDiskPage(), "Disk page was not opened");
	}

	@Step("Click  file")
	public static void clickFile() {
		DiskPage.getClickFile().getRightClickButton();
	}

	@Step("Wait open  menu group")
	public static void waitUntilVisibleOpenMenuGroup() {
		Waiter.untilVisible(DiskPage.getOpenMenuGroup(), "Menu group has not opened");
	}

	@Step("Click move button from menu group")
	public static void ClickMoveButtonFromMenuGroup() {
		DiskPage.getClickMoveButtonFromMenuGroup().click();
	}

//	@Step("Wait open list box")
//	public static void waitUntilVisibleList() {
//		Waiter.untilVisible(DiskPage.getListBox(), "List box has not opened");
//	}
//
//	@Step("Click move button from list box")
//	public static void clickMoveButton() {
//		DiskPage.getClickMoveButtonFromList().click();
//	}

	@Step("Wait open dialog wrap")
	public static void waitUntilOpenDialogWrap() {
		Waiter.untilVisible(DiskPage.getOpenDialogWrap(), "Download wrap was not opened");
	}

	@Step("Click files from dialog wrap")
	public static void clickFilesFromDialogWrap() {
		DiskPage.getClickFilesFromDialogWrap().click();
	}

	@Step("Click button move from dialog wrap")
	public static void clickMoveButtonFromDialogWrap() {
		DiskPage.getClickMoveButtonFromDialogWrap().click();
	}

	//wait надо для попапа

	@Step("Click files from side bar")
	public static void clickButtonFilesFromSideBar() {
		DiskPage.getFilesFromSideBar().click();
	}

	@Step("Move the file in basket")
	public static void moveFileInBasket() {
		DiskPage.getDownloadFile().getDrugAndDropButton();

		}



	public static void sendFileToDiskAndDelete() {
		waitUntilOpenDiskPage();
		clickFile();
		waitUntilVisibleOpenMenuGroup();
		ClickMoveButtonFromMenuGroup();
		waitUntilOpenDialogWrap();
		clickFilesFromDialogWrap();
		clickMoveButtonFromDialogWrap();
//		clickButtonFilesFromSideBar();
//		clickButtonDownloadsFolder();
//		waitUntilVisibleList();
//		clickMoveButton();

	}


}
