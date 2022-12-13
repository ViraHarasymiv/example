package com.ita.edu.rozetka.pages.searchpage;

import com.ita.edu.rozetka.locators.SearchLocators;
import com.ita.edu.rozetka.pages.BasePageWithHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BasePageWithHeader {
    private List<CartComponent> items;
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public List<CartComponent> getItems() {
        items = new ArrayList<>();
        List<WebElement> elements = driver.findElements(SearchLocators.CARTS.getPath());
        for (WebElement cart: elements){
            items.add(new CartComponent(driver,cart));
        }
        return items;
    }
}
