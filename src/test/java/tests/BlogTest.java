package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class BlogTest extends BaseTest {
    String properBlogTitle = "Blog itCraftApps | Dawka Najświeższych Informacji z Branży";

    @Test
    public void testBlog(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[7]/a\n")).click();
        int blogTitleCompare = driver.getTitle().compareTo(properBlogTitle);
        System.out.println(blogTitleCompare);
        if (blogTitleCompare == 0) {
            System.out.println("Blog subpage has correct title");
        } else {
            System.out.println("Blog subpage has incorrect , actual title is : "+ driver.getTitle()+"" );


        }
        driver.navigate().back();
    }
}
