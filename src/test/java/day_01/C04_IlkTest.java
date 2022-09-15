package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*

        1- Amazon sayfasına gidiniz
        2- Başlığın "Amazon" içerdiğini test ediniz
        3- Url'nin "amazon" içerdiğini test ediniz
        4- Sayfayı kapatınız

        */
        driver.manage().window().maximize();

        driver.get("https://amazon.com.tr");

        if (driver.getTitle().contains("Amazon")){

            System.out.println("Baslik istenen ismi iceriyor");

        }else System.out.println("Baslik istenen ismi icermiyor");


        if (driver.getCurrentUrl().contains("amazon")){

            System.out.println("Url istenen ismi iceriyor");
        } else System.out.println("Url istenen ismi icermiyor");

        driver.close();
    }
}
