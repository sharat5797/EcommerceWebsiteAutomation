package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShippingAddressPage {
    public void addShippingAddress(ChromeDriver driver) {
        addContactDetails(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.name("firstName")).sendKeys("Roshan");

        driver.findElement(By.name("lastName")).sendKeys("Kumar");

        driver.findElement(By.name("address1")).sendKeys("TestVagrant Technologies");

        driver.findElement(By.name("address2")).sendKeys("100ft Road, Indiranagar");

        driver.findElement(By.name("city")).sendKeys("Bengaluru");

        driver.findElement(By.name("zone")).sendKeys("Karnataka");

        driver.findElement(By.name("postalCode")).sendKeys("560008");

        driver.findElement(By.name("save_shipping_information")).click();

        driver.findElement(By.xpath("//*[@id=\"Form0\"]/div[1]/div/div[2]/div[2]/div/button")).click();
    }

    private void addContactDetails(ChromeDriver driver) {
        driver.findElement(By.name("email")).sendKeys("roshank@testvagrant.com");

        driver.findElement(By.name("marketing_opt_in")).click();
    }
}
