package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class CennikTest extends BaseTest {
    @Test
    public void testCennik(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[3]/a\n")).click();
        assertEquals(driver.getTitle(), "Tworzenie Aplikacji Mobilnych Cennik - iOS Android | itCraftApps");

        driver.navigate().back();
    }
    private void assertEquals(String title, String s) {
    }

}
