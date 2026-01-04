package stepdefinitions.api;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class UserApiSteps {

    private Response response;

    @Given("API base url is set")
    public void setBaseUrl() {
        RestAssured.baseURI = "https://dummyapi.io/data/v1";
    }

    @When("user sends GET request to get user by id {string}")
    public void getUserById(String userId) {
        response = RestAssured
                .given()
                .header("app-id", "63a804408eb0cb069b57e43a")
                .get("/user/" + userId);
    }

    @Then("response status code should be {int}")
    public void validateStatusCode(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }
}
