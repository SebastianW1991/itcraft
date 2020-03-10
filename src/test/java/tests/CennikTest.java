package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class CennikTest extends BaseTest {
    String properCennikTitle ="Tworzenie Aplikacji Mobilnych Cennik - iOS Android | itCraftApps";
    @Test
    public void testCennik(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[3]/a\n")).click();
        int cennikTitleCompare = driver.getTitle().compareTo(properCennikTitle);
        System.out.println(cennikTitleCompare);
        if (cennikTitleCompare == 0) {
            System.out.println("Cennik subpage has correct title");
        } else {
            System.out.println("Cennik subpage has incorrect , actual title is : "+ driver.getTitle()+"" );


        }
        driver.navigate().back();
    }

}
