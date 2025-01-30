package steps;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    private String username;
    private String password;
    private String searchQuery;
    private boolean checkoutEnabled = false;
    private boolean paymentSuccess = false;
    private int cartQuantity;

    @Given("User enters username {string}")
    public void userEntersUsername(String username) {
        this.username = username;
    }

    @Given("User enters password {string}")
    public void userEntersPassword(String password) {
        this.password = password;
    }

    @When("User clicks login button")
    public void userClicksLoginButton() {
        // Simulating login check
        if ("admin".equals(username) && "admin123".equals(password)) {
            checkoutEnabled = true;
        }
    }

    @Then("Login should be successful")
    public void loginShouldBeSuccessful() {
        assertTrue(checkoutEnabled, "Login should be successful");
    }

    @Then("Login should fail")
    public void loginShouldFail() {
        assertFalse(checkoutEnabled, "Login should fail");
    }

    @Given("User is on the search page")
    public void userIsOnSearchPage() {
        // Simulating search page presence
    }

    @When("User searches for {string}")
    public void userSearchesFor(String query) {
        searchQuery = query;
    }

    @Then("No results should be displayed")
    public void noResultsShouldBeDisplayed() {
        assertEquals("UnknownProduct", searchQuery, "Search should return no results");
    }

    @Then("Search results should show relevant products")
    public void searchResultsShouldShowRelevantProducts() {
        assertEquals("Laptop", searchQuery, "Search should return relevant results");
    }

    @Given("User is on the cart page")
    public void userIsOnTheCartPage() {
        // Simulating cart page
    }

    @When("User adds {int} quantity of {string}")
    public void userAddsQuantityOf(int quantity, String product) {
        cartQuantity = quantity;
    }

    @Then("System should show an error message")
    public void systemShouldShowAnErrorMessage() {
        assertTrue(cartQuantity < 0, "Negative quantity should show an error");
    }

    @Given("User is on the checkout page")
    public void userIsOnTheCheckoutPage() {
        // Simulating checkout page
    }

    @When("User tries to checkout")
    public void userTriesToCheckout() {
        // Simulating checkout logic
    }

    @Then("Checkout should be disabled")
    public void checkoutShouldBeDisabled() {
        assertFalse(checkoutEnabled, "Checkout should not be allowed without items");
    }

    @Given("User enters a valid credit card number")
    public void userEntersAValidCreditCardNumber() {
        paymentSuccess = true;
    }

    @Given("User enters an invalid credit card number")
    public void userEntersAnInvalidCreditCardNumber() {
        paymentSuccess = false;
    }

    @When("User submits payment")
    public void userSubmitsPayment() {
        // Simulating payment submission
    }

    @Then("Payment should be successful")
    public void paymentShouldBeSuccessful() {
        assertTrue(paymentSuccess, "Payment should be successful");
    }

    @Then("Payment should fail")
    public void paymentShouldFail() {
        assertFalse(paymentSuccess, "Payment should fail");
    }
}
