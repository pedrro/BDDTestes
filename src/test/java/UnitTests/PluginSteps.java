package UnitTests;

import Objects.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class PluginSteps {
	private Sink sink;
	private User user;

	public PluginSteps() {
		sink = new Sink(new HotTap(), new ColdTap());
		user = new User(sink);
	}

	@Given("^that the plugin is installed on sink$")
	public void that_the_plugin_is_installed_on_sink() throws Throwable {
		sink.setPlugin(true);
		assertTrue(sink.isPlugin());
	}

	@Given("^the water is blocked by plugin$")
	public void the_water_is_blocked_by_plugin() throws Throwable {
		sink.openHotTap();
		sink.setPlugin(true);
		assertTrue(sink.pluginIsBlockingTheWater(sink.getHotTap().isOpen(),
				sink.isPlugin()));
	}

	@Then("^Its not ok$")
	public void its_not_ok() throws Throwable {
		user.setTheResultIsExpected(false);
		assertFalse(user.isTheResultIsExpected());
	}

	@Then("^Is everything right$")
	public void is_everything_right() throws Throwable {
		user.setTheResultIsExpected(true);
		assertTrue(user.isTheResultIsExpected());
	}

	@Given("^the water is not blocked by plugin$")
	public void the_water_is_not_blocked_by_plugin() throws Throwable {
		sink.openHotTap();
		sink.setPlugin(false);
		assertFalse(sink.pluginIsBlockingTheWater(sink.getHotTap().isOpen(),
				sink.isPlugin()));
	}

}
