package UnitTests;

import Objects.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class HotTapSteps {
	private Sink sink;
	private User user;

	public HotTapSteps() {
		sink = new Sink(new HotTap(), new ColdTap());
		user = new User(sink);
	}

	@Given("^that the hot tap is open$")
	public void that_the_hot_tap_is_open() throws Throwable {
		sink.openHotTap();
		assertTrue(sink.getHotTap().isOpen());
	}

	@Then("^I can wash my hand$")
	public void i_can_wash_my_hand() throws Throwable {
		user.setWashMyHand(true);
		assertTrue(user.isWashMyHand());

	}

	@Then("^need to call a plumber$")
	public void need_to_call_a_plumber() throws Throwable {
		user.setCallAPlumber(true);
		assertTrue(user.isCallAPlumber());
	}

	@Given("^the water is very hot$")
	public void the_water_is_very_hot() throws Throwable {
		sink.getHotTap().setTemperature(50);
		assertEquals("The temperature is very hot", sink.getHotTap()
				.getTemperature());
	}

	@Given("^I cant wash my hands$")
	public void i_can_t_wash_my_hands() throws Throwable {
		sink.getHotTap().setTemperature(100);
		assertFalse(user.isWashMyHand());
	}

	@Then("^I can open the cold tap$")
	public void i_can_open_the_cold_tap() throws Throwable {
		user.setOpenColdTap(true);
		assertTrue(user.isOpenColdTap());
	}

	@Then("^the temperature of water will be better$")
	public void the_temperature_of_water_will_be_better() throws Throwable {
		sink.getHotTap().setTemperature(30);
		assertEquals("Is a good temperature", sink.getHotTap().getTemperature());
	}

	@Then("^I know that is something wrong$")
	public void i_know_that_is_something_wrong() throws Throwable {
		assertFalse(user.isTheResultIsExpected());
	}

	@Given("^the water flow is very big$")
	public void the_water_flow_is_very_big() throws Throwable {
		sink.getHotTap().setWaterFlow(100);
		assertEquals("The flow of water is very high", sink.getHotTap()
				.validateWaterFlow());
	}

	@Given("^I cant wash my hands with this flow$")
	public void i_can_t_wash_my_hands_with_this_flow() throws Throwable {
		sink.getHotTap().setWaterFlow(100);
		assertEquals("The flow of water is very high", sink.getHotTap()
				.validateWaterFlow());
	}

	@Then("^I can close a little the hot tap$")
	public void i_can_close_a_little_the_hot_tap() throws Throwable {
		sink.turnOffHotTap();
		assertFalse(sink.getHotTap().isOpen());
	}

	@Given("^the water flow is small$")
	public void the_water_flow_is_small() throws Throwable {
		sink.getHotTap().setWaterFlow(10);
		assertEquals("The flow of water is minimal", sink.getHotTap()
				.validateWaterFlow());
	}

	@Then("^I can open more the hot tap$")
	public void i_can_open_more_the_hot_tap() throws Throwable {
		sink.openHotTap();
		assertTrue(sink.getHotTap().isOpen());
	}
}
