

import java.util.*;

public class WeatherStation {

	public static void main(String[] args) {
		ControladorUndo undo = new ControladorUndo();
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.registerObserver(currentDisplay);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		undo.add(weatherData.createMemento());
		
		System.out.println();
		weatherData.setMeasurements(82, 70, 29.2f);
		undo.add(weatherData.createMemento());

		System.out.println();
		weatherData.setMeasurements(78, 90, 29.2f);
		undo.add(weatherData.createMemento());

			
		weatherData.getStateFromMemento(undo.undo());
		
		currentDisplay.deregister();
		currentDisplay2.deregister();
		
		System.out.println();
		System.out.println("Sem Condicoes Atuais");
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
