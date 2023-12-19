package br.dev.a2.application.entrypoint;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;

@QuarkusTest
class ProviderControllerTest {

    @Inject
    private ProviderController sut;

    @Test
    @DisplayName("Given a new request for tickets, just return tickets")
    public void retrieveTickets(){

        given()
                .contentType(MediaType.APPLICATION_JSON)
                .when()
                .get("/api/ticket")
                .then()
                .statusCode(Response.Status.OK.getStatusCode())
                .body(hasItems());
    }
}