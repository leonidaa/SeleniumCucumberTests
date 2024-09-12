package StepDefinitions;

import io.cucumber.java.en.When;

import static pages.SingInPage.click_login_btn;
import static pages.SingInPage.sendkeys_password;
import static pages.SingInPage.sendkeys_username;

public class SignInPage {
    @When("User succesfully logs in")
    public void user_login_to_login_page() throws InterruptedException {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }

}
