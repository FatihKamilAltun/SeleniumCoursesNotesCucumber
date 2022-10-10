@All
Feature: Amazon Search

  @gp1
  Scenario: TC01 kullanici amazonda nutella aratir

    Given   kullanici amazon sayfasina gider
    Then    kullanici nutella icin arama yapar
    And     kullanici sonuclarin nutella icerdigini test eder


  @gp3
  Scenario: TC02 kullanici amazonda selenium aratir

    Given   kullanici amazon sayfasina gider
    Then    kullanici selenium icin arama yapar
    And     kullanici sonuclarin selenium icerdigini test eder


  @gp2
  Scenario: TC03 kullanici amazonda iphone aratir

    Given   kullanici amazon sayfasina gider
    Then    kullanici iphone icin arama yapar
    And     kullanici sonuclarin iphone icerdigini test eder
    And     kullanici sayfayi kapatir