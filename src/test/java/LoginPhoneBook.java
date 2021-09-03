import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPhoneBook {

    WebDriver wd;

    @BeforeMethod
    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.manage().window().maximize();
    }

    @Test
    public void loginTest() {
        WebElement loginForm = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m :last-child"));
        loginForm.click();
        type(By.cssSelector("[placeholder='Email']"), "VASYA@mail.ru");
        type(By.cssSelector("[placeholder='Password']"), "Awww123~");
        WebElement loginButton = wd.findElement(By.cssSelector(".login_login__3EHKB :nth-child(4)"));
        loginButton.click();

    }

    @Test
    public void logintTestXpath(){


    }

    public void type(By locator, String text) {
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);

    }


}
