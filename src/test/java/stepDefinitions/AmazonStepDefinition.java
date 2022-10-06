package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get("https://amazon.com");
        throw new io.cucumber.java.PendingException();
    }

    @Then("kullanici nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);
        throw new io.cucumber.java.PendingException();
    }

    @And("kullanici sonuclarin nutella icerdigini test eder")
    public void kullaniciSonuclarinNutellaIcerdiginiTestEder() {
        assert amazonPage.resultTextWE.getText().contains("Nutella");
        throw new io.cucumber.java.PendingException();
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
        throw new io.cucumber.java.PendingException();
    }
}
