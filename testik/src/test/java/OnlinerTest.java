import driver.Browser;

import driver.TestRes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CurrentPage;
import pages.GetPopularSections;
import pages.LoginForm;
import pages.OnlinerMainPage;

import java.util.concurrent.TimeUnit;

public class OnlinerTest {

    private String login;
    private String password;

    @BeforeMethod
    public void setUp() {
        login = TestRes.getLogin();
        password = TestRes.getPassword();
        Browser.getDriver().manage().window().maximize();
        Browser.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Browser.getDriver().get("http://onliner.by/");
    }

    @Test
    public void onlinerTest() {

        OnlinerMainPage onlinerMainPage = new OnlinerMainPage();
        onlinerMainPage.clickLogIn();

        LoginForm loginForm = new LoginForm();
        loginForm.login(login, password);

        String popularSectionName = GetPopularSections.goToRandomSection();
        Assert.assertEquals(new CurrentPage().getSectionTitleText(), popularSectionName);

        Browser.getDriver().navigate().back();
        onlinerMainPage.clickLogOut();
    }
}
