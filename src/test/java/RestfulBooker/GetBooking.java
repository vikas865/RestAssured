package RestfulBooker;

import io.restassured.RestAssured;


public class GetBooking {
	
	public static void main(String[] args) {
		
		RestAssured
		 .given()
		 	.log()
		 	.all()
		 	.baseUri("https://restful-booker.herokuapp.com/")
		 	.basePath("booking/{id}")
		 	.pathParam("id", 942)
		 //.accept(ContentType.JSON)
		 .when()
		 	.get()
		 .then()
		 	.statusCode(200)
		 .log()
		 .all();
		  
	}

}
