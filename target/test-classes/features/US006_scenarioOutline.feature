Feature: US006 kullanici amazonda istedigi kelimeleri aratabilir

  Scenario Outline: TC01 kullanici istedigi kelimeleri aratir

    Given kullanici amazon sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    And kullanici sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And kullanici sayfayi kapatir

    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | iphone        | iphone               |
      | selenium      | selenium             |
      | SQL           | SQL                  |

    # TestNG deki dataProvider kullanimindaki gibi Cucumberda da Scenario Outline kullaniriz.
    # Bu şekilde birden fazla kelimeyi tek seferde aratabiliriz.

      # Feature dosyasinda yazdığımız komutta eğer "" (Tırnak) kullanirsak stepDefinition da parametreli
      # bir method oluşturur. Ve artik stepDefinition'ı kullanmadan Feature dosyasında ""(tırnak) içindeki
      # string'i değiştirerek istediğim kelimeyi aratabilirim.
      # Scenario Outline da ise yine ""(Tırnak) içinde birden fazla kelime aratıcaksam "<>" şeklindeki kullanım ile# "<>" içine yazdığım herhangi bir kelimeyi Scenario Outline'ın aşağıda oluşturduğu Examples altında aratmak
      # istediğim kelimeleri yazar ve sırasıyla aratabiliriz