Feature: US009 Class Work

  @guru
  Scenario Outline: TC_001 kullanici sutun basligi ile liste atabilmeli
    Given kullanici "guruUrl" sayfasinda
    And "<Titles>" sutunundaki tum degerleri yazdirir

    Examples:
      | Titles             |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |

    Scenario: Kullanici Sayfayi Kapatir
      Then kullanici sayfayi kapatir
