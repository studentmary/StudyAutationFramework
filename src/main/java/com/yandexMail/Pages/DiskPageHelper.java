package com.yandexMail.Pages;

import com.yandexMail.driver.UiDriver;
import com.yandexMail.driver.Waiter;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;
import utility.logerator.Logger;

public class DiskPageHelper {

	@Step("Download file into Files")
	public static void downloadFileInFiles() {
		DiskPage.getButtonDownloads().click();
		Waiter.untilVisible(DiskPage.getFile(), "File appeared");
		Actions action = new Actions(UiDriver.getDriver());
		action.contextClick(DiskPage.getFile().getElement())
				.build()
				.perform();
		Waiter.presenceOfElement(DiskPage.getFile());
		DiskPage.getClickMoveButtonFromList().click();
		Waiter.untilVisible(DiskPage.getOpenDialogWrap(), "Dialog wrap has not opened");
		DiskPage.getClickMoveButtonFromDialogWrap().click();


		Logger.getLogger().info("File upload in Files");
	}

	@Step("Send file in basket")
	public static void sendFileInBasket() {
		Waiter.untilVisible(DiskPage.getFilesFromSideBar(), "Button Files found");
		DiskPage.getFilesFromSideBar().click();
		Waiter.untilVisible(DiskPage.getFileInFiles(), "File appeared");
		Actions action = new Actions(UiDriver.getDriver());
		action.dragAndDrop(DiskPage.getFileInFiles().getElement(), DiskPage.getBasket().getElement())
				.build()
				.perform();

		Logger.getLogger().info("File send in basket");
	}

	public static void sendFileToDiskAndDelete() {
		downloadFileInFiles();
		sendFileInBasket();
	}


}
