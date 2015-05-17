package Objects;

public class User {
	private boolean theResultIsExpected;
	private boolean callAPlumber;
	private boolean washMyHand;
	private boolean openHotTap;
	private boolean openColdTap;
	private Sink sink;

	public User(Sink sink) {
		this.sink = sink;
	}

	public boolean isTheResultIsExpected() {
		return theResultIsExpected;
	}

	public void setTheResultIsExpected(boolean theResultIsExpected) {
		this.theResultIsExpected = theResultIsExpected;
	}

	public boolean isCallAPlumber() {
		return callAPlumber;
	}

	public void setCallAPlumber(boolean callAPlumber) {
		this.callAPlumber = callAPlumber;
	}

	public boolean isWashMyHand() {
		if (sink.getHotTap().getTemperature()
				.equals("The temperature is very hot")) {
			setWashMyHand(false);
		} else {
			setWashMyHand(true);
		}
		return washMyHand;
	}

	public void setWashMyHand(boolean washMyHand) {
		this.washMyHand = washMyHand;
	}

	public boolean isOpenColdTap() {
		if (openColdTap == true) {
			sink.openColdTap();
		} else {
			sink.turnOffColdTap();
		}
		return openColdTap;
	}

	public void setOpenColdTap(boolean openColdTap) {
		this.openColdTap = openColdTap;
	}

	public boolean isOpenHotTap() {
		if (openHotTap == true) {
			sink.openHotTap();
		} else {
			sink.turnOffHotTap();
		}
		return openHotTap;
	}

	public String washMyHandWithHighFlow(int waterFlow) {
		if (waterFlow >= 80) {
			return "High flow";
		} else if (waterFlow >= 30 || waterFlow <= 79) {
			return "Normal flow";
		} else {
			return "Small flow";
		}
	}

	public void setOpenHotTap(boolean openHotTap) {
		this.openHotTap = openHotTap;
	}
}
