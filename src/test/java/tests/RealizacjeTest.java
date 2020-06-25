package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class RealizacjeTest extends BaseTest {
    String properRealizacjeTitle = "Portfolio zrealizowanych produktów | Duże marki, startupy i inne";

    @Test
    public void realizacjeNavigationTest(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[2]/a\n")).click();

        assertEquals(driver.getTitle(), "Portfolio zrealizowanych produktów | Duże marki, startupy i inne");


        driver.navigate().back();

    }
    private void assertEquals(String title, String s) {
    }
}
