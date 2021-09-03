import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {

    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();

    }

    @Test
    public void startContact() {

//wd.get("https://contacts-app.tobbymarshall815.vercel.app/home\n");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        WebElement element1 = wd.findElement(By.tagName("div"));

        List<WebElement> list = wd.findElements(By.tagName("div"));
        WebElement element2 = wd.findElement(By.id("root"));

        //WebElement element3 = wd.findElement(By.className("navbar-logged_nav__2Hx7M"));
    }

    @Test
    public void loginTest() {
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        WebElement loginA = wd.findElement(By.linkText("LOGIN"));
        loginA.click();
        List<WebElement> listInput = wd.findElements(By.tagName("input"));
        WebElement email = listInput.get(0);
        email.click();
        email.clear();
        email.sendKeys("VASYA@mail.ru");

        WebElement password = listInput.get(1);
        password.click();
        password.clear();
        password.sendKeys("Awww123~");

        List<WebElement> listButtons = wd.findElements(By.tagName("button"));
        WebElement loginButton = listButtons.get(0);
        loginButton.click();


    }


    @AfterMethod
    public void postConditions() {
       wd.close();
    }

}
