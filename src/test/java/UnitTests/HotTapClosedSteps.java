package UnitTests;

import static org.junit.Assert.*;
import Objects.ColdTap;
import Objects.HotTap;
import Objects.Sink;
import Objects.User;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HotTapClosedSteps {
	private Sink sink;
	private User user;

	
	public HotTapClosedSteps(){
		sink = new Sink(new HotTap(), new ColdTap());
		user = new User(sink);
	}
	
	@Given("^that the hot tap is closed$")
	public void that_the_hot_tap_is_closed() throws Throwable {
		sink.turnOffHotTap();
		assertFalse(sink.getHotTap().isOpen());
	    
	}

	@Given("^have water falling into the sink$")
	public void have_water_falling_into_the_sink() throws Throwable {
		sink.openHotTap();
		assertTrue(sink.haveWaterFallingIntoTheSink(sink.getHotTap().isOpen()));
	}

	@Then("^I can call a plumber to verify this problem$")
	public void i_can_call_a_plumber_to_verify_this_problem() throws Throwable {
		user.setCallAPlumber(true);
		assertTrue(user.isCallAPlumber());
	}

	@Given("^dont have water falling into the sink$")
	public void dont_have_water_falling_into_the_sink() throws Throwable {
		sink.turnOffHotTap();
		assertFalse(sink.haveWaterFallingIntoTheSink(sink.getHotTap().isOpen()));
	}

	@Then("^Is everything good$")
	public void is_everything_good() throws Throwable {
		user.setTheResultIsExpected(true);
		assertTrue(user.isTheResultIsExpected());
	}
}
