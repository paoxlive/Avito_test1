package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToFavoritesTest {
    public static void main(String[] args) {
        // Установка пути к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\webDriver\\chromedriver.exe");
        // Создание экземпляра браузера
        WebDriver driver = new ChromeDriver();
        // Переход на страницу объявления
        driver.get("https://www.avito.ru/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363");
        // Нахождение и клик по кнопке "Добавить в избранное"
        WebElement addToFavoritesButton = driver.findElement(By.cssSelector(".desktop-usq1f1"));
        addToFavoritesButton.click();
        // Проверка успешного добавления в избранное
        WebElement favoritesList = driver.findElement(By.cssSelector(".desktop-1gzlbya"));
        favoritesList.click();
        String text = driver.getPageSource();
        if (text.contains("/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363")) {
            System.out.printf("объявление добавлено в избранное");
        } else {
            System.out.printf("объявление  не добавлено в избранное");
        }
        // Закрытие браузера
        driver.quit();


    }
}