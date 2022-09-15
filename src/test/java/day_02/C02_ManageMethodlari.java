package day_02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com.tr");

        // sayfanin konum ve boyutlarini yazdirin
        System.out.println("Pencere konumu: " + driver.manage().window().getPosition());
        System.out.println("Pencere olculeri: " + driver.manage().window().getSize());

        // sayfanin konum ve boyutunu istediginiz gibi ayarlayin
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(600,300));

        // test edin
        System.out.println("Yeni pencere konumu: " + driver.manage().window().getPosition());
        System.out.println("Yeni pencere olculeri: " + driver.manage().window().getSize());

        // kapatin
        Thread.sleep(2000);
        driver.close();
    }
}
