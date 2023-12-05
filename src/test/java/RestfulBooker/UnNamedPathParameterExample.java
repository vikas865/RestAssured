package RestfulBooker;

import io.restassured.RestAssured;

public class UnNamedPathParameterExample {
	
	public static void main(String[] args) {
		
		RestAssured
			.given()
				.log()
				.all()
			.when()
				.get("https://restful-booker.herokuapp.com/{basepath}/{bookingid}","booking",2)
			.then()
				.statusCode(200)
				.log()
				.all();
				
				
			
		
	}

}
