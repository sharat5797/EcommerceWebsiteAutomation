package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CatalogPage {
    public void gotoProductDetailsPage(ChromeDriver driver) {
        driver.findElement(By.partialLinkText("ADIDAS | KID'S STAN SMIT")).click();
    }
}
