package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class UslugiTest extends BaseTest {

    @Test
    public void testUslugi(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[1]/a\n")).click();
        assertEquals(driver.getTitle(), "Usługi świadczone przez itCraft - software house tworzący aplikacje mobilne");

        driver.navigate().back();
    }
    private void assertEquals(String title, String s) {
    }

}
