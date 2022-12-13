package com.ita.edu.rozetka.pages.searchpage;

import com.ita.edu.rozetka.locators.CartLocators;
import com.ita.edu.rozetka.locators.HeaderLocators;
import com.ita.edu.rozetka.pages.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartComponent extends BasePO {
   private WebElement likeButton;
   private WebElement title;
   private WebElement root;

    public CartComponent(WebDriver driver) {
        super(driver);
    }
    public CartComponent(WebDriver driver, WebElement root) {
        super(driver);
        this.root = root;
    }

    public WebElement getLikeButton() {
        if(likeButton == null) {
            likeButton = this.root.findElement(CartLocators.LIKE.getPath());
        }
        return likeButton;
    }

    public WebElement getTitle() {
        if(title == null) {
            title = this.root.findElement(CartLocators.TITLE.getPath());
        }
        return title;
    }
}
