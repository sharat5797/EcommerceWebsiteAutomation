package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewMyCartPage {
    public void clickCheckoutButton(ChromeDriver driver) {
        driver.findElement(By.id("checkout")).click();
    }
}
