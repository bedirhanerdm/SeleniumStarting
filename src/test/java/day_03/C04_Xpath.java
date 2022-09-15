package day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Xpath {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        // 2- Add Element butonuna basin
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
                                          //     "//*[@onclick='addElement()']"


        // 3- Delete butonu’nun gorunur oldugunu test edin
        System.out.println(driver.findElement(By.xpath("//*[@class='added-manually']")).isDisplayed()); //true verir
        Thread.sleep(1000);


        // 4- Delete tusuna basin
        driver.findElement(By.xpath("//*[@class='added-manually']")).click();
        Thread.sleep(1000);


        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.xpath("//h3"));

        if (addRemoveElement.isDisplayed()){
            System.out.println("Add Remove PASSED");
        } else System.out.println("Add Remove FAILED");  // passed sonuc verir




        driver.close();
    }
}
