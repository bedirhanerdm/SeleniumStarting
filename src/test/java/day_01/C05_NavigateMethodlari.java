package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com.tr");
        // driver.navigate().to() methodu sayfada ileri geri yapicaksak kullanilir.
        // driver.get() methodu gibi bizi istedigimiz url e goturur.

        Thread.sleep(3000); // 3 saniye beklettik


        driver.navigate().to("https://techproeducation.com");

        Thread.sleep(3000); // 3 saniye beklettik


        driver.navigate().back(); // Geri amazona donduk

        Thread.sleep(3000);


        driver.navigate().forward(); // Tekrar techproya gittik

        Thread.sleep(3000);


        driver.navigate().refresh(); // Sayfaya f5 cektik

        Thread.sleep(5000);

        driver.close();
    }
}
