package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@parametre", // @All diyerek tum features'i calistirabiliriz
        dryRun = false
)

public class Runner {
    /*
    Runner Class'i TestNG'deki XML mantigi ile calisir
    Calistirmak istedigimiz senaryolara tag belirtiriz ve
    belirttigimiz tag'lari calistirir
    XML'deki gibi istedigimiz testleri calistirmak icin kullaniriz
    Runner Class body'si bostur ve Runner Class'ina ekleyecegimiz notasyonlar aktive eder
    Bu class'ta kullanacagimiz 2 adet notasyon vardir
    1) @RunWith(Cucumber.class) notasyonu Runner Class'ina calisma ozelligi ekler
    Bu notasyon oldugu icin Cucumber framework'umuzde Junit kullanmayi tercih ederiz
    2) @CucumberOptions notasyonu icinde features runner dosyasinin feature dosyasini
    nereden bulacagini tarif eder.
    glue : StepDefinition yolunu belirtiriz
    tag :  hangi tag'i calistirmak istiyorsak onu belli eder
    dryRun: True : Testimizi calistirmadan eksik adimlari bize verir
    dryRun: False : Testlerimizi driver ile calistirir
     */

}
