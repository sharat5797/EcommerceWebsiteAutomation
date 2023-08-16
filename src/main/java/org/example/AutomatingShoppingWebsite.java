package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingShoppingWebsite {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testvagrant.myshopify.com/");
        driver.manage().window().maximize();
        HomePage homePage = new HomePage();
        homePage.goToCatalogPage(driver);

        CatalogPage catalogPage = new CatalogPage();
        catalogPage.gotoProductDetailsPage(driver);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        productDetailsPage.addToCart(driver);
        productDetailsPage.goToViewCartPage(driver);

        ViewMyCartPage viewMyCartPage = new ViewMyCartPage();
        viewMyCartPage.clickCheckoutButton(driver);

        ShippingAddressPage shippingAddressPage = new ShippingAddressPage();
        shippingAddressPage.addShippingAddress(driver);


        PaymentPage paymentPage = new PaymentPage();
        paymentPage.doPayment(driver);

        Thread.sleep(2000);

        driver.quit();

    }
}
