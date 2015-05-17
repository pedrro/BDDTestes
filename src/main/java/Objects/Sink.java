package Objects;

public class Sink {

	private HotTap hotTap;
	private ColdTap coldTap;
	private boolean plugin;

	public Sink(HotTap hotTap, ColdTap coldTap) {
		this.hotTap = hotTap;
		this.coldTap = coldTap;
	}

	public void setColdTap(ColdTap coldTap) {
		this.coldTap = coldTap;
	}

	public void setHotTap(HotTap hotTap) {
		this.hotTap = hotTap;
	}

	public ColdTap getColdTap() {
		return coldTap;
	}

	public HotTap getHotTap() {
		return hotTap;
	}

	// Set tap on or off
	public void openColdTap() {
		coldTap.setOpen(true);
	}

	public void turnOffColdTap() {
		coldTap.setOpen(false);
	}

	public void openHotTap() {
		hotTap.setOpen(true);
	}

	public void turnOffHotTap() {
		hotTap.setOpen(false);
	}

	public boolean haveWaterFallingIntoTheSink(boolean tapStatus) {
		if (tapStatus == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPlugin() {
		return plugin;
	}

	public void setPlugin(boolean plugin) {
		this.plugin = plugin;
	}

	public boolean pluginIsBlockingTheWater(boolean tapisOpen,
			boolean pluginStatus) {
		if (tapisOpen == true && pluginStatus == true) {
			return true;

		} else {
			return false;
		}
	}

}
