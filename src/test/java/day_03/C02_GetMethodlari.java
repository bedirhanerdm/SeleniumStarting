package day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class C02_GetMethodlari {
    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //Amazon sayfasına gidiniz.
        driver.get("https://amazon.com.tr");


        //Arama kutusuna locate ediniz.
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        //Arama kutusunun tagName'inin input oldugunu test ediniz.
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();

        if (actualTagName.equals(expectedTagName)){
            System.out.println("Tagname PASSED " + actualTagName);
        }else System.out.println("Tagname FAILED " + actualTagName);


        //Arama kutusunun name attributenin field-keywords oldugunu test ediniz.
        String expectedName = "field-keywords";
        String actualName = aramaKutusu.getAttribute("name");

        if (expectedName.equals(actualName)){
            System.out.println("Name Test PASSED " + actualName);
        } else System.out.println("Name Test FAILED " + actualName);




        driver.close();
    }
}
