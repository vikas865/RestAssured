package RestfulBooker;

import io.restassured.RestAssured;

public class PathParameterExample {
	
	public static void main(String[] args) {
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("{basepath}/{bookingid}")
				.pathParam("basepath", "booking")
				.pathParam("bookingid", "1")
			.when()
				.get()
			.then()
				.statusCode(200)
				.log()
				.all();
				
				
			
		
	}

}
