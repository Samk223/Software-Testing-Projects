package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SauceDemoTests {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void validLoginTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertTrue(
                driver.getCurrentUrl().contains("inventory.html"),
                "Valid login should open the Products page");
    }

    @Test
    public void invalidLoginTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("wrong_password");
        driver.findElement(By.id("login-button")).click();

        String errorMessage = driver.findElement(
                By.cssSelector("[data-test='error']")).getText();

        Assert.assertTrue(
                errorMessage.contains("Username and password do not match"),
                "An error message should appear for invalid credentials");
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
                { "standard_user", "secret_sauce", true },
                { "invalid_user", "wrong_password", false }
        };
    }

    @Test(dataProvider = "loginData")
    public void loginDataProviderTest(
            String username, String password, boolean shouldSucceed) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        if (shouldSucceed) {
            Assert.assertTrue(
                    driver.getCurrentUrl().contains("inventory.html"));
        } else {
            Assert.assertTrue(
                    driver.findElement(By.cssSelector("[data-test='error']"))
                            .isDisplayed());
        }
    }

    @Test
    public void productsAreDisplayedTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        int productCount = driver.findElements(
                By.className("inventory_item")).size();

        Assert.assertEquals(productCount, 6,
                "Products page should display 6 products");
    }

    @Test
    public void addProductToCartTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        String cartCount = driver.findElement(
                By.className("shopping_cart_badge")).getText();

        Assert.assertEquals(cartCount, "1",
                "Cart should show 1 item");
    }

    @Test
    public void removeProductFromCartTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        Assert.assertTrue(
                driver.findElements(By.className("shopping_cart_badge")).isEmpty(),
                "Cart count should disappear after removing the product");
    }

    @Test
    public void checkoutInformationTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("add-to-cart-sauce-labs-backpack"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.className("shopping_cart_link"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("checkout"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("first-name")));

        driver.findElement(By.id("first-name")).sendKeys("QA");
        driver.findElement(By.id("last-name")).sendKeys("Tester");
        driver.findElement(By.id("postal-code")).sendKeys("141001");

        driver.findElement(By.id("continue")).click();

        wait.until(ExpectedConditions.urlContains("checkout-step-two.html"));

        Assert.assertTrue(
                driver.getCurrentUrl().contains("checkout-step-two.html"),
                "Checkout overview should be displayed");
    }

    @Test
    public void completeOrderTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("add-to-cart-sauce-labs-backpack"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.className("shopping_cart_link"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("checkout"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("first-name")));

        driver.findElement(By.id("first-name")).sendKeys("QA");
        driver.findElement(By.id("last-name")).sendKeys("Tester");
        driver.findElement(By.id("postal-code")).sendKeys("141001");

        driver.findElement(By.id("continue")).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("finish"))).click();

        WebElement confirmation = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("complete-header")));

        Assert.assertTrue(
                confirmation.getText().contains("Thank you for your order"),
                "Order confirmation should be displayed");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
