package com.ita.edu.rozetka.pages;

import com.ita.edu.rozetka.pages.header.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class BasePageWithHeader extends BasePO{
    private HeaderComponent headerComponent;

    public BasePageWithHeader(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
    }

    public HeaderComponent getHeaderComponent() {
        return headerComponent;
    }
}
