package Objects;

public class ColdTap extends Tap {
	public String getTemperature() {
		if (temperature >= 50) {
			return "The temperature is very hot";
		} else {
			return "Is a good temperature";
		}
	}

	public String validateWaterFlow() {
		if (waterFlow >= 80) {
			return "The flow of water is very high";
		} else if (waterFlow >= 30 && waterFlow <= 79) {
			return "The flow of water is normal";
		} else {
			return "The flow of water is minimal";
		}
	}

	public int getWaterFlow() {
		return waterFlow;
	}

}
