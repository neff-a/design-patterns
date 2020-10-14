/**
 * 
 */
package observer.pattern.weather;

/**
 * @author neftalialarcon
 *
 */
public class ForecastDisplay implements DisplayElement, Observer {
	
	private float temperature; 
	private float humidity;
	private float pressure;

	private Subject weatherData;
	
	public ForecastDisplay(final Subject weatherD) {
		this.weatherData = weatherD;
		this.weatherData.register(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		this.display();
	}

	@Override
	public void display() {
		System.out.println("Forecast: "
				+ "Temperature " + temperature
				+ ", Humidity " + humidity
				+ ", Pressure " + pressure);
	}

}
