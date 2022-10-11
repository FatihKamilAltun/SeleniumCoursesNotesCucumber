package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get("https://amazon.com");

    }

    @Then("kullanici nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);

    }

    @And("kullanici sonuclarin nutella icerdigini test eder")
    public void kullaniciSonuclarinNutellaIcerdiginiTestEder() {
        assert amazonPage.resultTextWE.getText().contains("Nutella");

    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();

    }

    @Then("kullanici selenium icin arama yapar")
    public void kullaniciSeleniumIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("selenium",Keys.ENTER);
    }

    @And("kullanici sonuclarin selenium icerdigini test eder")
    public void kullaniciSonuclarinSeleniumIcerdiginiTestEder() {
        assert amazonPage.resultTextWE.getText().contains("selenium");
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("iphone",Keys.ENTER);
    }

    @And("kullanici sonuclarin iphone icerdigini test eder")
    public void kullaniciSonuclarinIphoneIcerdiginiTestEder() {
        assert amazonPage.resultTextWE.getText().contains("iphone");
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String searchedWord) {
        amazonPage.searchBox.sendKeys(searchedWord,Keys.ENTER);
    }

    @And("kullanici sonuclarin {string} icerdigini test eder")
    public void kullaniciSonuclarinIcerdiginiTestEder(String expectedResult) {
        assert amazonPage.resultTextWE.getText().contains(expectedResult);
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String searchedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchedUrl));
    }

    @When("url'in {string} icerdigini test edelim")
    public void urlInIcerdiginiTestEdelim(String expectedUrl) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
