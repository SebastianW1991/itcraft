package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestTeam extends BaseTest{
    String properTeamTitle = "Nasz Zespół Zatrudniamy najlepszych | itCraftApps";

    @Test
    public void testTeam(){
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div[1]/ul/li[5]/a\n")).click();
        int teamTitleCompare = driver.getTitle().compareTo(properTeamTitle);
        System.out.println(teamTitleCompare);
        if (teamTitleCompare == 0) {
            System.out.println("Zespół subpage has correct title");
        } else {
            System.out.println("Zespół subpage has incorrect , actual title is : "+ driver.getTitle()+"" );


        }
        driver.navigate().back();
    }

}
