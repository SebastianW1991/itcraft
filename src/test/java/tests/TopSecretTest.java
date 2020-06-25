package tests;

import org.junit.Test;

public class TopSecretTest extends RealizacjeTest{

    @Test
    public void topSecretTest(){
        driver.navigate().to("https://itcraftapps.com/pl/realizacje/");
        assertEquals(driver.getTitle(), "Top Secret Aplikacja Mobilna Dla Klientów | itCraftApps");

        driver.navigate().back();
    }

    private void assertEquals(String title, String s) {
    }
}
