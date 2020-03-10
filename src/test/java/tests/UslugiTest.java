package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class UslugiTest extends BaseTest {
    String properUslugiTitle = "Usługi świadczone przez itCraft - software house tworzący aplikacje mobilne";
    @Test
    public void testUslugi(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[1]/a\n")).click();
        int uslugiTitleCompare = driver.getTitle().compareTo(properUslugiTitle);
        System.out.println(uslugiTitleCompare);
        if (uslugiTitleCompare == 0) {
            System.out.println("Uslugi subpage has correct title");
        } else {
            System.out.println("Uslugi subpage has incorrect , actual title is : "+ driver.getTitle()+"" );


        }
        driver.navigate().back();
    }
}
