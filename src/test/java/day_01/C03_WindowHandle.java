package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://amazon.com.tr");

        System.out.println(driver.getWindowHandle()); // CDwindow-7E60C46A632714477280C34EE7A1299C

        // farkli pencereler arasinda gezinebilmek icin windowhandle kullanilir


    }
}
