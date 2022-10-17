package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPages {
    public AutoPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
