package seleniumPracti.headLess_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class TestheadlessBrowser {

    @Test
    public void headlesssB()
    {
        WebDriver driver=new HtmlUnitDriver();

        driver.get("https://www.google.co.in");

        String titelof_Page =driver.getTitle();

        System.out.println(titelof_Page);

    }
}
