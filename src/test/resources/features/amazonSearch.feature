Feature: Amazon Search

  Scenario: TC01 kullanici amazonda nutella aratir

    Given   kullanici amazon sayfasina gider
    Then    kullanici nutella icin arama yapar
    And     kullanici sonuclarin nutella icerdigini test eder
    And     kullanici sayfayi kapatir