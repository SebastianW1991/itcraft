package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class TopSecretTest extends RealizacjeTest{
    String properTopSecretTitle = "Top Secret Aplikacja Mobilna Dla Klientów | itCraftApps";

    @Test
    public void topSecretTest(){
        driver.navigate().to("https://itcraftapps.com/pl/realizacje/");
        driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[1]/div[2]/div[2]/a")).click();
        int teamTitleCompare = driver.getTitle().compareTo(properTopSecretTitle);
        System.out.println(teamTitleCompare);
        if (teamTitleCompare == 0) {
            System.out.println("TopSecret subpage has correct title");
        } else {
            System.out.println("TopSecret subpage has incorrect , actual title is : "+ driver.getTitle()+"" );


        }
        driver.navigate().back();
    }
}
