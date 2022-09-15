package day_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class C05_findElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com.tr");

        // Amazon sayfasindaki tagleri link(a) olanlarin sayisini yazdirin
        List<WebElement> tagSayisi = driver.findElements(By.tagName("a"));

        System.out.println("a tag'inin sayisi: " + tagSayisi.size());


        // Amazon sayfasindaki tagleri link(input) olanlarin sayisini yazdirin
        List<WebElement> tagSayisi2 = driver.findElements(By.tagName("input"));

        System.out.println("input tag'inin sayisi: " + tagSayisi2.size());


        driver.close();
    }
}
