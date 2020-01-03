package ru.GreenData;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class WebDriverSettings {
    public ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\анна\\Desktop\\IT\\Программы\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void close () {
        driver.quit();
    }

}