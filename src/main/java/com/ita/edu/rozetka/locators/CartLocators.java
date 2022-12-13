package com.ita.edu.rozetka.locators;

import org.openqa.selenium.By;

public enum CartLocators {
    LIKE(By.xpath("./rz-catalog-tile/app-goods-tile-default/div/div[2]/div[1]/app-goods-wishlist/button")),
    TITLE(By.xpath("./rz-catalog-tile/app-goods-tile-default/div/div[2]/a[2]/span"));

    private final By path;

    CartLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
