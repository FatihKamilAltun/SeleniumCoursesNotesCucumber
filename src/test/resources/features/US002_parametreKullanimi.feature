Feature: US002 Parametre Kullanimi

  Background: ortak kisimlar
    Given kullanici amazon sayfasina gider

  @parametre
  Scenario: TC001 kullanici parametreli arama yapar
    Then kullanici "nutella" icin arama yapar
    And kullanici sonuclarin "nutella" icerdigini test eder
    And kullanici sayfayi kapatir

  Scenario: TC002 kullanici parametreli arama yapar
    Then kullanici "iphone" icin arama yapar
    And kullanici sonuclarin "iphone" icerdigini test eder
    And kullanici sayfayi kapatir

  Scenario: TC003 kullanici parametreli arama yapar
    Then kullanici "java" icin arama yapar
    And kullanici sonuclarin "java" icerdigini test eder
    And kullanici sayfayi kapatir

  Scenario: TC004 kullanici parametreli arama yapar
    Then kullanici "selenium" icin arama yapar
    And kullanici sonuclarin "selenium" icerdigini test eder
    And kullanici sayfayi kapatir

    # Feature dosyasinda parametreli arama yaptigimizda ""(tirnak) icine aldigimiz degeri
    # StepDefinition'da 1 kere parametreli bir method olusturur ve yeni bir arama yapmak istedigimizde
    # yeni bir method olusturmadan feature dosyasindan ""(tirnak) icindeki ifadeyi degistirmemiz
    # yeterli olacaktir boylece kodlarimiz dinamik olacaktir