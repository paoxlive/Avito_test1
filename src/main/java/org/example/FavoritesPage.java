package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FavoritesPage {

    public WebDriver driver;

    public FavoritesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // Нахождение и клик по кнопке "Добавить в избранное" и переход во вкладку избранное
    public void ClickButton() {

        WebElement addToFavoritesButton = driver.findElement(By.cssSelector(".desktop-usq1f1"));
        addToFavoritesButton.click();
        WebElement favoritesList = driver.findElement(By.cssSelector(".desktop-1gzlbya"));
        favoritesList.click();
    }
    public  boolean getInfo(){
        String text = driver.getPageSource();
        if(text.contains("/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363")) return true;

        return false;
    }
}
