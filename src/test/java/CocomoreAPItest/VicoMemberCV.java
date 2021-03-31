package CocomoreAPItest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class VicoMemberCV {
	@Test
	public void test_1() {
		given().
		get("https://qa-be.vicoland.com/index.php/api/v1/vicos/market/19").
		then().
		statusCode(200).


		assertThat().body("data.fellows.members.member.name[1]",equalTo("Meera Agney")).
		assertThat().body("data.fellows.members.cvFile.url[0]",equalTo("https://s3.eu-central-1.amazonaws.com/vicoland-files-sb-qa/pub/files/member_cvs/90/90/46/1/35096517.pdf")).
		log().all();

	}
}
