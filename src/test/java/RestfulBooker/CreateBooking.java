package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class CreateBooking {

	public static void main(String[] args) {
		
		//build request
//		RequestSpecification requestSpecification = RestAssured.given().log().all();
//		requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
//		requestSpecification.basePath("booking");
//		requestSpecification.body("{\r\n"
//				+ "    \"firstname\" : \"Jim1\",\r\n"
//				+ "    \"lastname\" : \"Brown\",\r\n"
//				+ "    \"totalprice\" : 111,\r\n"
//				+ "    \"depositpaid\" : true,\r\n"
//				+ "    \"bookingdates\" : {\r\n"
//				+ "        \"checkin\" : \"2018-01-01\",\r\n"
//				+ "        \"checkout\" : \"2019-01-01\"\r\n"
//				+ "    },\r\n"
//				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
//				+ "}");
//		
//		requestSpecification.contentType(ContentType.JSON);
//		//hit request and get response
//		
//		Response response= requestSpecification.post();
//
//		//validate response
//		ValidatableResponse validateResponse= response.then().log().all();
//		validateResponse.statusCode(200);
		
		
		RestAssured
			.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking")
			.contentType(ContentType.JSON)
			.body("{\r\n"
					+ "    \"firstname\" : \"Jim1\",\r\n"
					+ "    \"lastname\" : \"Brown\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			.post()
			.then()
			.log()
			.all()
			.statusCode(200);
		
			
			
		
		
		
		
		
	}

}
