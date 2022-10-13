Feature: parametre kullanimi

  Scenario: TC001 parametre kullaniminda configreader kullanimi
    Given kullanici "blueRentalUrl" sayfasina gider
    Then kullanici 5 saniye bekler
    When url'in "blue" icerdigini test edelim
    And kullanici sayfayi kapatir

  Scenario: TC002 parametre kullaniminda configreader kullanimi
    Given kullanici "amazonUrl" sayfasina gider
    Then kullanici 5 saniye bekler
    When url'in "amazon" icerdigini test edelim
    And kullanici sayfayi kapatir

    @gp2
  Scenario: TC003 parametre kullaniminda configreader kullanimi
    Given kullanici "googleUrl" sayfasina gider
    Then kullanici 4 saniye bekler
    When url'in "google" icerdigini test edelim
    And kullanici sayfayi kapatir

  Scenario: TC004 parametre kullaniminda configreader kullanimi
    Given kullanici "fbUrl" sayfasina gider
    Then kullanici 5 saniye bekler
    When url'in "facebook" icerdigini test edelim
    And kullanici sayfayi kapatir