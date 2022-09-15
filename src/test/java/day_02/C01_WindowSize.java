package day_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WindowSize {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        // Sayfanin konum ve olculerini yazdirin
        System.out.println("Pencere konumu: " + driver.manage().window().getPosition());
        System.out.println("Pencere olculeri: " + driver.manage().window().getSize());

        // Sayfayi 3 sn bekletip maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // Sayfanin konum ve olculerini maximize durumunda yazdirin
        System.out.println("Pencere konumu: " + driver.manage().window().getPosition());
        System.out.println("Pencere olculeri: " + driver.manage().window().getSize());

        // Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        // Sayfanin konum ve olculerini fullscreen durumunda yazdirin
        System.out.println("Pencere konumu: " + driver.manage().window().getPosition());
        System.out.println("Pencere olculeri: " + driver.manage().window().getSize());

        // Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
