package StepDefinitions;

import io.cucumber.java.en.When;

import static pages.SingInPage.click_login_btn;
import static pages.SingInPage.sendkeys_password;
import static pages.SingInPage.sendkeys_username;

public class SignInPage {
    @When("User successfully logs in")
    public void userSuccessfullyLogsIn() throws InterruptedException {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }
}
