Feature: US005 BlueRental

  Scenario: TC01 kullanici gecerli bilgilerle giris yapar

    Given kullanici bluerentacar ana sayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    And kullanici 5 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    And kulllanici sayfayi kapatir