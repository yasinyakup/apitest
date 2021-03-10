package com.yaytech;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    public void test1(){
        Response response = given().accept("Application/json").
                //and().pathParam("id", 4).
                and().queryParam("q", "{\"id\": 4}").
                when().get("http://52.87.216.245:8000/api/spartans/");

        System.out.println(response.statusCode());
        response.prettyPrint();
        //System.out.println(response.path("id").toString());
    }
}
