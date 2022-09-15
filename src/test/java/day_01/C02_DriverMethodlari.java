package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Amazona gidiniz
        // Kaynak kodlari icinde "Gateway" kelimesinin olup olmadigini test edin

        driver.get("https://amazon.com.tr");

        System.out.println(driver.getPageSource().contains("Gateway"));

        String istenenKelime = "Gateway";


        if (driver.getPageSource().contains(istenenKelime)){

            System.out.println("PageSource testi PASSED");
        } else {

            System.out.println("PageSource testi FAILED");
        }

        // } else System.out.println("PageSource testi FAILED");     boyle de yazilabilir else kullanirken


        driver.close(); // sayfayi kapatir

        //driver.quit();  birden fazla sayfa varsa hepsini kapatir
    }
}
