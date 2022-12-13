package com.ita.edu.rozetka.runners;

import com.ita.edu.rozetka.pages.HomePage;
import com.ita.edu.rozetka.pages.searchpage.CartComponent;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.List;

public class OPTest extends BaseRunner {

    @BeforeClass
    public void beforeMethod(){
        setDriver();
    }
    @Test
    public void loginTest(){
        new HomePage(driver)
                .getHeaderComponent()
                .clickOnLoginButton()
                .successLogin("tiger38@gmail.com", "11111111");
    }
    @Test
    public void searchS22Test(){
        List<CartComponent> carts = new HomePage(driver)
                .getHeaderComponent()
                .clickOnLoginButton()
                .successLogin("tiger38@gmail.com", "11111111")
                .getHeaderComponent()
                .enterSearchField("S22")
                .getItems();
        Assert.assertTrue(carts
                .stream()
                .map(webEl -> webEl.getTitle()
                        .getText())
                .allMatch(el->el.contains("S22")));
    }
}
