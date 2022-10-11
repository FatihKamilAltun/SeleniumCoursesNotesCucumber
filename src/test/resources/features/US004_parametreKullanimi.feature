Feature: US004 Parametre Kullanimi
  Scenario: TC001 Parametre Kullanimi
    Given kullanici "https://hepsiburada.com" sayfasinda
    Then kullanici 3 saniye bekler
    When kullanici urlnin "hepsi" icerdigini test eder
    And kullanici sayfayi kapatir