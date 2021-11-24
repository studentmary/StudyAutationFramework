package com.yandexMail.Pages;

import com.yandexMail.driver.UiDriver;
import com.yandexMail.driver.Waiter;
import io.qameta.allure.Step;
import utility.logerator.Logger;

public class UserPageHelper {

	@Step("Write and send letter")
	public static void wtiteAndSendLetter(String mail, String topic, String text, String file) {
		Waiter.untilVisible(UserPage.getButtonWrite(), " User page is not open");
		UserPage.getButtonWrite().click();
		Waiter.untilVisible(UserPage.getMailField(), "Letter form is not open");
		UserPage.getMailField().sendKeys(mail);
		UserPage.getTopicField().sendKeys(topic);
		UserPage.getTextField().sendKeys(text);
		UserPage.getAttachFile().sendKeys(file);
		Waiter.untilInVisible(UserPage.getPlaceholder(), "File isn't load ");
		UserPage.getButtonSend().click();
		Waiter.untilVisible(UserPage.getFormSendLetter(), "Letter send successful");
		UiDriver.getDriver().navigate().refresh();
		Logger.getLogger().info("Mail send success");
	}

	@Step("Save letter to disk")
	public static void saveLetterToDisk() {
		Waiter.untilVisible(UserPage.getLetterField(), "Letter field visible");
		Waiter.presenceOfElement(UserPage.getButtonSaveOnDisk());
		UserPage.getButtonSaveOnDisk().click();
		Waiter.untilVisible(UserPage.getDownloadIframe(), "Frame open");
		Waiter.presenceOfElement(UserPage.getButtonOpenDisk());
		UserPage.getButtonOpenDisk().click();
		Logger.getLogger().info("File save on disk successful");
	}

}