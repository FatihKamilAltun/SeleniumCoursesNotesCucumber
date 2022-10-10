Feature: US001 background kullanimi

  Background: ortak adimlar
    Given kullanici amazon sayfasina gider

  Scenario: TC01 kullanici amazonda nutella aratir
    Then    kullanici nutella icin arama yapar
    And     kullanici sonuclarin nutella icerdigini test eder


  Scenario: TC02 kullanici amazonda selenium aratir
    Then    kullanici selenium icin arama yapar
    And     kullanici sonuclarin selenium icerdigini test eder


  Scenario: TC03 kullanici amazonda iphone aratir
    Then    kullanici iphone icin arama yapar
    And     kullanici sonuclarin iphone icerdigini test eder
    And     kullanici sayfayi kapatir

    Scenario: alisveris sitesi testi
    * url` ye gidilir
    * Giris yap' a tiklanir
    * Gecerli kullanici bilgileri girilir
    * Giris yap' a tiklanir
    * Hesabim sayfasina giris yapildigi test edilir
    * Acilan sayfada siparisler bolumune tiklanir
    * Acilan sayfada Browse Products(Urunlere Goz At) butonuna tiklanir
    * Magaza butonunun gorunur oldugu test edilir
    * Rastgele 5 urun secilir ve sepete eklenir
    * Urunlerin sepette gorundugu test edilir
