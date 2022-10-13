Feature: US004 Parametre Kullanimi
  @gp6
  Scenario: TC001 Parametre Kullanimi
  Given kullanici "googleUrl" sayfasinda
  Then kullanici 3 saniye bekler
  When kullanici urlnin "amazon" icerdigini test eder
  And kullanici sayfayi kapatir