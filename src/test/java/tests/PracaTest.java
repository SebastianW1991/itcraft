package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class PracaTest extends BaseTest {

    @Test
    public void testPraca(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[6]/a\n")).click();

        assertEquals(driver.getTitle(), "Oferty pracy w itCraft | itCraft apps - aplikacje mobilne i webowe");

        driver.navigate().back();
    }
    private void assertEquals(String title, String s) {
    }
}
