package StepDefinitions;

import io.cucumber.java.en.Then;
import static pages.ProductCategoryPage.visibility_productcategory;
import static org.junit.Assert.assertEquals;

public class ProductCategoryPage {

    @Then("^User should be able to see product category page$")
    public void see_product_category_page(){
        String actualProductCategory = visibility_productcategory();
        assertEquals(actualProductCategory,"Formal Shoes");
    }
}
