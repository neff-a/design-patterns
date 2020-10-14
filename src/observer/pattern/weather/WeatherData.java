/**
 * 
 */
package observer.pattern.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * @author neftalialarcon
 *
 */
public class WeatherData implements Subject {
	
	private List<Observer> observers;
	
	private float temperature; 
	private float humidity; 
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(final Observer observer) {
		final int indexOf = observers.indexOf(observer);
		if (indexOf >= 0) {
			observers.remove(indexOf);
		}
	}

	@Override
	public void sendNotification() {
		for (final Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void onChangeMeasurements() {
		sendNotification();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		onChangeMeasurements();
	}

}
