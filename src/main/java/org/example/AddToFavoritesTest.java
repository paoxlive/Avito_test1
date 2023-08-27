package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AddToFavoritesTest {

    public static FavoritesPage favoritesPage;

    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        // Установка пути к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        // Создание экземпляра браузера
        driver = new ChromeDriver();
        favoritesPage = new FavoritesPage(driver);
        // Вывод полного окна
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        // Переход на страницу объявления
        driver.get(ConfProperties.getProperty("loginpage"));
    }
        @Test
        public void Test() {
            favoritesPage.ClickButton();
            boolean flag = favoritesPage.getInfo();
            // сравниваем его с логином из файла настроек
            Assert.assertTrue(flag);
        }
        @AfterClass
        public static void quit() {
            driver.quit();
        }
    }
