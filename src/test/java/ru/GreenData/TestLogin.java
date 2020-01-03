package ru.GreenData;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestLogin extends WebDriverSettings {

    @Test
    public void testTask1 () {
        driver.get("https://gdcloud.ru/release-17/auth/login");

        WebElement elementLogin;
        elementLogin = driver.findElement(By.name("login"));

        WebElement elementPass;
        elementPass = driver.findElement(By.name("password"));

        WebElement elementButton;
        elementButton = driver.findElement(By.id("login_button"));

        elementLogin.sendKeys("Ulyana");
        elementPass.sendKeys("123456");
        elementButton.click();

        String Url = driver.getCurrentUrl();

        Assert.assertTrue(Url.equals("https://gdcloud.ru/release-17/auth/login"));

    }

    @Test
    public void testTask2 () {
        driver.get("https://gdcloud.ru/release-17/auth/login");

        WebElement elementLogin;
        elementLogin = driver.findElement(By.name("login"));

        WebElement elementPass;
        elementPass = driver.findElement(By.name("password"));

        WebElement elementButton;
        elementButton = driver.findElement(By.id("login_button"));

        elementLogin.sendKeys("");
        elementPass.sendKeys("123456");
        elementButton.click();

        String Url = driver.getCurrentUrl();

        Assert.assertTrue(Url.equals("https://gdcloud.ru/release-17/auth/login"));

    }

    @Test
    public void testTask3 () {
        driver.get("https://gdcloud.ru/release-17/auth/login");

        WebElement elementLogin;
        elementLogin = driver.findElement(By.name("login"));

        WebElement elementPass;
        elementPass = driver.findElement(By.name("password"));

        WebElement elementButton;
        elementButton = driver.findElement(By.id("login_button"));

        elementLogin.sendKeys("");
        elementPass.sendKeys("");
        elementButton.click();

        String Url = driver.getCurrentUrl();

        Assert.assertTrue(Url.equals("https://gdcloud.ru/release-17/auth/login"));

    }

    @Test
    public void testTask4 () {
        driver.get("https://gdcloud.ru/release-17/auth/login");

        WebElement elementLogin;
        elementLogin = driver.findElement(By.name("login"));

        WebElement elementPass;
        elementPass = driver.findElement(By.name("password"));

        WebElement elementButton;
        elementButton = driver.findElement(By.id("login_button"));

        elementLogin.sendKeys("**-+/%");
        elementPass.sendKeys("пароль");
        elementButton.click();

        String Url = driver.getCurrentUrl();

        Assert.assertTrue(Url.equals("https://gdcloud.ru/release-17/auth/login"));

    }

}
