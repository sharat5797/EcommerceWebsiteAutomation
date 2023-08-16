package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class PaymentPage {
    public void doPayment(ChromeDriver driver) {

        driver.findElement(By.xpath("//*[@id=\"Form1\"]/div[1]/div/div/div[2]/div[1]/button")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame(getFrame("Field container for: Card number", driver));
        driver.findElement(By.id("number")).sendKeys("1125");
        driver.switchTo().defaultContent();

        driver.switchTo().frame(getFrame("Field container for: Name on card", driver));
        driver.findElement(By.id("name")).sendKeys("Sharat");
        driver.switchTo().defaultContent();

        driver.switchTo().frame(getFrame("Field container for: Expiration date (MM / YY)", driver));
        WebElement expiry = driver.findElement(By.id("expiry"));
        expiry.sendKeys("04");
        expiry.sendKeys("24");
        driver.switchTo().defaultContent();

        driver.switchTo().frame(getFrame("Field container for: Security code", driver));
        driver.findElement(By.id("verification_value")).sendKeys("111");
        driver.switchTo().defaultContent();

        driver.findElement(By.cssSelector("#Form2 > div:nth-child(1) > div > div.oQEAZ.WD4IV > div:nth-child(1) > button")).click();
    }

    public WebElement getFrame(String title, ChromeDriver driver) {
        return driver.findElement(By.xpath("//*[@class='card-fields-iframe' and @title='" + title + "']"));
    }
}