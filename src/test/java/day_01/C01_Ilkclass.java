package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Ilkclass {
    public static void main(String[] args) {

        /*

        En temel haliyle bir otomasyon yapmak icin classimiza otomasyon icin
        gerekli olan webdriver in yerini gostermek gerekir ve bunun icin java
        kutuphanesinden System.setProperty() methodunu kullaniriz.
        Methodun icine ilk olarak driver i yazariz, ikinci olarak fiziki yolunu kopyalariz.

        */

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("Actual title: " + driver.getTitle());  // Gidilen sitenin basligini yazdirir

        System.out.println("Actual url: " + driver.getCurrentUrl());

        System.out.println("Root codes: " + driver.getPageSource());
    }
}
