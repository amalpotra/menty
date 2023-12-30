package com.menty.poll.api.web.v1;

import com.menty.poll.api.model.PollRequest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PollControllerTest {
    @Test @Order(1)
    void testCreatePoll() {
        var pollRequest = new PollRequest("example", "sample", List.of("option1", "option2"));

        given().contentType(MediaType.APPLICATION_JSON_VALUE).body(pollRequest)
                .when().post("/api/v1/polls")
                .then().statusCode(HttpStatus.CREATED.value()).header(HttpHeaders.LOCATION, "/api/v1/polls/1")
                .body("title", equalTo("example"),
                        "id", equalTo(1),
                        "description", equalTo("sample"),
                        "options", hasSize(2),
                        "options[0].title", equalTo("option1"),
                        "options[1].title", equalTo("option2")
                );
    }

    @Test @Order(2)
    void testGetPollById() {
        when().get("/api/v1/polls/1")
                .then().statusCode(HttpStatus.OK.value())
                .body("title", equalTo("example"),
                        "id", equalTo(1),
                        "description", equalTo("sample"),
                        "options", hasSize(2),
                        "options[0].title", equalTo("option1"),
                        "options[1].title", equalTo("option2")
                );
    }

    @Test @Order(3)
    void testDeletePoll() {
        when().delete("/api/v1/polls/1").then().statusCode(HttpStatus.NO_CONTENT.value());
    }
}
