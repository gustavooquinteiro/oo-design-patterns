

import java.util.*;

public class ForecastDisplay implements Observer {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
                lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
	
	@Override
	public void undo(float temp, float humidity, float pressure) {
		System.out.println("ForecastDisplay ciente do undo - temperatura:"+ temp +"; umidade: "+ humidity+"; pressão:" + pressure);		
	}
}
