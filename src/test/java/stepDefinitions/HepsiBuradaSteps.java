package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class HepsiBuradaSteps {
    @Given("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @When("kullanici urlnin {string} icerdigini test eder")
    public void kullaniciUrlninIcerdiginiTestEder(String beklenenUrl) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(beklenenUrl));
    }
}
