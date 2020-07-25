package demo.pages.api.jsonplaceholder;


import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class apicontroller {

  public Response getPokemonData(String pokemonName) {
    pokemonName = pokemonName.toLowerCase();
    Response response = given().baseUri("https://jsonplaceholder.typicode.com").basePath("/posts")
        .log().all()
        .contentType(ContentType.JSON)
        .accept(ContentType.JSON).get("/posts/{userId}");
    response.getBody().prettyPrint();
    return response;
  }
}
