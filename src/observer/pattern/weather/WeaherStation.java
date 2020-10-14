/**
 * 
 */
package observer.pattern.weather;

/**
 * @author neftalialarcon
 *
 */
public class WeaherStation {
	
	public static void main(String[] args) {
		
		final WeatherData weatherData = new WeatherData();
		
		new CurrentConditionDisplay(weatherData);
		new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
	}

}
