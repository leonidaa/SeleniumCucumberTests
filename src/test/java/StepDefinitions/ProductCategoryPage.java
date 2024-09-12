package StepDefinitions;

import io.cucumber.java.en.Then;

import static pages.ProductCategoryPage.visibility_productcategory;

public class ProductCategoryPage {
    @Then("User should be able to see product category page")
    public void productCategory_validation(){
        visibility_productcategory();
    }


}
