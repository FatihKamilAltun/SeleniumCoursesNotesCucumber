@auto
Feature: US0012 Automation Exercise

  http://automationpractice.com/index.php

  Scenario: TC01 Kullanici sistemde hesap olusturur
    Given kullanici "autoUrl" sayfasinda
    And kullanici sign in linkine tiklar
    And kullanici Create and account bölümüne email adresi girer
    And Create an Account butonuna basar
    And kullanici kisisel bilgilerini ve iletisim bilgilerini girer  And user Register butonuna basar
    Then kullanicinin hesap olustugunu dogrulayin
    And kullanici sayfayi kapatir