/**
 * 
 */
package observer.pattern.weather;

/**
 * @author neftalialarcon
 *
 */
public class CurrentConditionDisplay implements DisplayElement, Observer {
	
	private float temperature; 
	private float humidity; 

	private Subject weatherData;
	
	public CurrentConditionDisplay(final Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.register(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature
				+ " F degrees and " + humidity + "% humidity");
	}

}
