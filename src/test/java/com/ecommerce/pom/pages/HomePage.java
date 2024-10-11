package com.ecommerce.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PurchasePage{

    By shopNowBtn = By.cssSelector("[class='wp-block-button__link']");
    By findMoreBtn = By.xpath("//a[contains(@class, 'wp-block-button__link') and text()='Find More']");
    By menCategory = By.id("menu-item-1228");
    By accountCategory = By.id("#menu-item-1237");
    By cartIcon =By.xpath("//a[@title='View your shopping cart']");


    public HomePage(WebDriver driver) {
        super(driver);
    }
}
