package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductDetailsPage {

    public void addToCart(ChromeDriver driver) {
        WebElement quantityElement = driver.findElement(By.name("quantity"));
        quantityElement.clear();
        quantityElement.sendKeys("4");

        WebElement addToCartButton = driver.findElement(By.name("add"));
        addToCartButton.click();
    }

    public void goToViewCartPage(ChromeDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#cart-notification-button")).click();
    }
}



