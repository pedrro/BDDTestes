package Objects;

public abstract class Tap {

	private boolean isOpen;
	private boolean haveHotWater;
	protected int temperature;
	protected int waterFlow;

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public boolean isHaveHotWater() {
		return haveHotWater;
	}

	public void setHaveHotWater(boolean haveHotWater) {
		this.haveHotWater = haveHotWater;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public void setWaterFlow(int waterFlow) {
		this.waterFlow = waterFlow;
	}

	public abstract String getTemperature();
}
