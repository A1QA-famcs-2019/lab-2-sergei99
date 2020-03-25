package pages;

import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginForm {
    private WebElement loginTextField = Browser.getDriver().findElement(By.xpath("//div[contains(@class,'auth-form__line')]//input[@type=\"text\"]"));
    private WebElement passwordTextField = Browser.getDriver().findElement(By.xpath("//div[contains(@class,'auth-form__line')]//input[@type=\"password\"]"));
    private WebElement loginButton = Browser.getDriver().findElement(By.xpath("//div[contains(@class, 'auth-form__control')]//button[@type='submit']"));

    public void login(String login, String password) {
        loginTextField.sendKeys(login);
        passwordTextField.sendKeys(password);
        loginButton.click();
    }

}
