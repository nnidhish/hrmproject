package com.hrm.utilities;

import org.openqa.selenium.WebElement;

public class CommanMethods {
	/**
	 * Method that clears and sends keys
	 * 
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	public static void click(WebElement element) {
		element.click();
}

}
