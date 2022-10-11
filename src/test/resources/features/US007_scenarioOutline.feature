@All
Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given kullanici "<arananUrl>" sayfasina gider
    Then kullanici 3 saniye bekler
    When kullanici urlnin "<arananKelime>" icerdigini test eder
    And kullanici sayfayi kapatir

    Examples:
      | arananUrl     | arananKelime |
      | amazonUrl     | amazon       |
      | fbUrl         | facebook     |
      | blueRentalUrl | blue         |
      | googleUrl     | google       |