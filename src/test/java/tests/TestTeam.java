package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestTeam extends BaseTest{

    @Test
    public void testTeam(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[5]/a\n")).click();

        assertEquals(driver.getTitle(), "Nasz Zespół Zatrudniamy najlepszych | itCraftApps");

        driver.navigate().back();
    }
    private void assertEquals(String title, String s) {
    }
}
