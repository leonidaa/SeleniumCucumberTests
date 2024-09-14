package StepDefinitions;

import io.cucumber.java.en.Given;

import static pages.HomePage.click_hamburger_menu;
import static pages.HomePage.click_singIn_link;

public class BasePage {

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() throws InterruptedException {
        click_hamburger_menu();
        click_singIn_link();
    }
}
