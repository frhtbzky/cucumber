Feature: US1002 Amazon Title Testi

  @smoke @regression
  Scenario: TC04 Kullanici amazon sayfasinin title'inin dogru oldugunu kontrol eder


    Given Kullanici amazon ana sayfaya gider
    Then Title'in Amazon icerdigini test eder
    And Sayfayi kapatir


