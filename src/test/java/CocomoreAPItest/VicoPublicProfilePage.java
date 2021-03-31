package CocomoreAPItest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

public class VicoPublicProfilePage {

	@Test
	public void test_1() {
		given().
		get("https://qa-be.vicoland.com/index.php/api/v1/vicos/market/19").
		then().
		statusCode(200).
		assertThat().body("data.vico.name",equalTo("Smart City Vico")).
		assertThat().body("data.vico.slogan",equalTo("Serving technology better.")).
		assertThat().body("data.vico.description",equalTo("SOLUTIONS THAT EMPOWER YOUR BUSINESS")).
		assertThat().body("data.vico.teamExperience",equalTo("2016")).
		assertThat().body("data.vico.projectCapacity",equalTo("400000")).
		assertThat().body("data.vicoReferences.vicoReference.name[0]",equalTo("PRODUCT ENGINEERING")).
		assertThat().body("data.vicoReferences.vicoReference.customerName[0]",equalTo("Thinkpalm")).
		assertThat().body("data.vicoReferences.vicoReference.name[1]",equalTo("Custom Software Development")).		    
		assertThat().body("data.vicoReferences.vicoReference.customerName[1]",equalTo("NewAgeSys")).
		assertThat().body("data.fellows.members.member.name[0]",equalTo("Manoj PR")).
		assertThat().body("data.fellows.members.member.name[1]",equalTo("Meera Agney")).
		log().all();


	}
}
