package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class RealizacjeTest extends BaseTest {
    String properRealizacjeTitle = "Portfolio zrealizowanych produktów | Duże marki, startupy i inne";

    @Test
    public void realizacjeNavigationTest(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[2]/a\n")).click();
        int realizacjeTitleCompare = driver.getTitle().compareTo(properRealizacjeTitle);
        System.out.println(realizacjeTitleCompare);
        if (realizacjeTitleCompare == 0) {
            System.out.println("Realizacje subpage has correct title");
        } else {
            System.out.println("Realizacje subpage has incorrect title");


        }
        driver.navigate().back();

    }
}
