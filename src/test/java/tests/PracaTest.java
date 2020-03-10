package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class PracaTest extends BaseTest {
    String properPracaTitle ="Oferty pracy w itCraft | itCraft apps - aplikacje mobilne i webowe";

    @Test
    public void testPraca(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[6]/a\n")).click();
        int pracaTitleCompare = driver.getTitle().compareTo(properPracaTitle);
        System.out.println(pracaTitleCompare);
        if (pracaTitleCompare == 0) {
            System.out.println("Praca subpage has correct title");
        } else {
            System.out.println("Praca subpage has incorrect , actual title is : "+ driver.getTitle()+"" );


        }
        driver.navigate().back();
    }
}
