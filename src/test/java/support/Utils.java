package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

    public void esperarElemento(By element, int tempo) {

        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getRandomEmail() {

        String email_init = "fulano_";
        String email_final = "@corporation.com";

        Random randon = new Random();
        int min = 1;
        int max = 9999999;
        int tot = randon.nextInt(max-min) + min;

        return email_init + tot + email_final;

    }
}
