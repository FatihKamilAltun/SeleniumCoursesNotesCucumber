package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;
import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String title) {

        int index = 0;

        for (int i = 0; i < guruPage.titles.size(); i++) {
            if (guruPage.titles.get(i).getText().equals(title)) {
                System.out.println(guruPage.titles.get(i).getText());
                index = i + 1;
                List<WebElement> sutunElementi =
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                sutunElementi.forEach(t -> System.out.println(t.getText()));
            }

        }
    }
}
