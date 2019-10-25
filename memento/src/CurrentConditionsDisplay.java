
	
public class CurrentConditionsDisplay implements Observer {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
	
	public void deregister(){
		weatherData.removeObserver(this);
	}
	
	@Override
	public void undo(float temp, float humidity, float pressure) {
		System.out.println("CurrentConditionsDisplay ciente do undo - temperatura:"+ temp +"; umidade: "+ humidity+"; press�o:" + pressure);		
	}
}
