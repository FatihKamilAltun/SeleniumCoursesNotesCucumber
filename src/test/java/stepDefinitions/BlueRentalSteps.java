package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentalSteps {

    BlueRentalPage blueRentalPage=new BlueRentalPage();

    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        blueRentalPage.loginButtonHomePage.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        blueRentalPage.emailBox.sendKeys(ConfigReader.getProperty("blueWrongEmail"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        blueRentalPage.passwordBox.sendKeys(ConfigReader.getProperty("blueWrongPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        blueRentalPage.loginButton.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(blueRentalPage.loginFailedText.isDisplayed());
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
