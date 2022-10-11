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


