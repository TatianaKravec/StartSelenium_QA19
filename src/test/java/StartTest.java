import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StartTest {
WebDriver wd;
    @BeforeTest
    public void precondition(){
    wd = new ChromeDriver();
    wd.get("https://telranedu.web.app/home");
    }
    @Test
    public void testMethod(){

    }

    @AfterTest
    public void postcondition(){

    }
}
