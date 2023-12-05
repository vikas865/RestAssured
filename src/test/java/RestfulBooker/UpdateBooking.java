package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UpdateBooking {
	
	public static void main(String[] args) {
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
			 	.basePath("booking/{id}")
			 	.pathParam("id", 942)
			 	.header("Content-Type",ContentType.JSON)
			 	.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
			 	.body("{\r\n"
						+ "    \"firstname\" : \"Jim2\",\r\n"
						+ "    \"lastname\" : \"Brown\",\r\n"
						+ "    \"totalprice\" : 111,\r\n"
						+ "    \"depositpaid\" : true,\r\n"
						+ "    \"bookingdates\" : {\r\n"
						+ "        \"checkin\" : \"2018-01-02\",\r\n"
						+ "        \"checkout\" : \"2019-01-01\"\r\n"
						+ "    },\r\n"
						+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
						+ "}")
			.when()
				.put()
			.then()
				.assertThat()
				.statusCode(200)
				.log()
				.all();
	}

}
