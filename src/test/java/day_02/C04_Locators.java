package day_02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://amazon.com.tr");

        // amazonda nutella aratalim
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);    boyle olabilir veya

        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //aramaKutusu.sendKeys("nutella", Keys.ENTER);  // boyle de olabilir

        // Eger yanlis id locate edilirse NoSuchElementException hatasi verir
        // id varken name kullanmak hos olmaz (By.name)

        //WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        //aramaKutusu.sendKeys("nutella", Keys.ENTER);

        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field "));  // Calismaz cunku arama kutusunun cercevesini aliyor
        //aramaKutusu.sendKeys("nutella", Keys.ENTER);

        //driver.findElement(By.linkText("Amazon Science")).click();   // </a> tag li olanlardan seciyoruz

        //driver.findElement(By.partialLinkText("zon Science")).click();



        Thread.sleep(3000);

        driver.close();
    }
}
