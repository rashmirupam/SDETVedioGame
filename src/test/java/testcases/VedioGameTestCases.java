package testcases;

import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;




//FOR GET REQUEST
public class VedioGameTestCases {
    @Test (priority=1)
    public void getAllVedioGame() {
        given()
                .when()
                .get("http://localhost:8080/app/videogames")
                .then()
                .statusCode(200);

    }

//FOR POST REQUEST

    @Test (priority=2)
    public void PostAddNewVedioGame() {
        HashMap data = new HashMap();
        data.put("id", 100);
        data.put("name", "Batman");
        data.put("releaseDate", "2020-09-20T08:37:46.498Z");
        data.put("reviewScore", 4);
        data.put("category", "Adventure");
        data.put("rating", "Universal");

        Response response = given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("http://localhost:8080/app/videogames")
                .then()
                .statusCode(200)
                .log().body().extract().response();
        String jsonString = response.asString();
        Assert.assertEquals(jsonString.contains("Record Added Successfully"), true);
    }


//FOR GET REQUEST

    @Test(priority=3)
    public void getVedioGameById() {
        given()
                .when()
                .get("http://localhost:8080/app/videogames/100")
                .then()
                .statusCode(200)
                .log().body()
                .body("VedioGame.id", equalTo("100"))
                .body("vedioGame.name", equalTo("Batman"));

    }

//FOR PUT REQUEST

     @Test (priority = 4)
    public void updateVedioGame() {
        HashMap data = new HashMap();
        data.put("id", 100);
        data.put("name", "Pacham");
        data.put("releaseDate", "2020-09-20T08:57:58.510Z");
        data.put("reviewScore", 4);
        data.put("category", "Adventure");
        data.put("rating", "Universal");

        given()
                .contentType("application/json")
                .body(data)
                .when()
                .put("http://localhost:8080/app/videogames/100")
                .then()
                .statusCode(200)
                .log().body()
                .body("VedioGame.id", equalTo("100"))
                .body("vedioGame.name", equalTo("Pacham"));

}

    //FOR DELETE REQUEST

@Test (priority = 5)
public void DeleteVedioGame()
{
    Response res=
    given()
            .when()
            .delete("http://localhost:8080/app/videogames/100")
            .then()
            .statusCode(200)
            .log().body()
            .extract().response();
    String jsonString=res.asString();
    Assert.assertEquals(jsonString.contains("Record Deleted Successfully"),true);
}
}
