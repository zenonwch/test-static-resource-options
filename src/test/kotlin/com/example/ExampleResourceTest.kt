package com.example

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import io.restassured.http.ContentType
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test

@QuarkusTest
class ExampleResourceTest {

    @Test
    fun `test static content - GET`() {
        RestAssured.given()
            .contentType(ContentType.JSON)
            .get("/img/document.png")
            .then()
            .statusCode(Matchers.equalTo(200))
    }

    @Test
    fun `test static content - OPTIONS`() {
        RestAssured.given()
            .contentType(ContentType.JSON)
            .options("/img/document.png")
            .then()
            .statusCode(Matchers.equalTo(200))
    }
}