package stepDefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebDriverPages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;

public class WebDriverUniSteps {
    WebDriverPages webDriverPages=new WebDriverPages();
    ArrayList<String> windows;

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("kullanici Login Portala kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiIner() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {
        webDriverPages.loginButton.click();
    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
        windows=new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(1));
    }

    @And("kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String username) {
        webDriverPages.userNameBox.sendKeys(username);
    }

    @And("kullanici {string} bolumune bilgileri girer")
    public void kullaniciBolumuneBilgileriGirer(String password) {
        webDriverPages.passwordBox.sendKeys(password);
    }

    @And("kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
        webDriverPages.secondLoginButton.click();
    }

    @And("kullanici Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() {
        String actualPopUpText=Driver.getDriver().switchTo().alert().getText();
        String expectedPopUpText="validation failed";
        Assert.assertEquals(expectedPopUpText,actualPopUpText);
    }

    @And("kullanici Ok diyerek Popup'i kapatir")
    public void kullaniciOkDiyerekPopupIKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {
        Driver.getDriver().switchTo().window(windows.get(0));
    }

    @And("kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
        Assert.assertTrue(webDriverPages.loginButton.isDisplayed());
    }
}
