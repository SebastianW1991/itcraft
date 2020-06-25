package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class BlogTest extends BaseTest {
    String properBlogTitle = "Blog itCraftApps | Dawka Najświeższych Informacji z Branży";

    @Test
    public void testBlog(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[7]/a\n")).click();

        assertEquals(driver.getTitle(), "Blog itCraftApps | Dawka Najświeższych Informacji z Branży");

        driver.navigate().back();
    }
    private void assertEquals(String title, String s) {
    }
}
