/**
 * 
 */
package observer.pattern.weather;

/**
 * @author neftalialarcon
 *
 */
public interface Observer {
	
	void update(float temp, float humidity, float pressure);

}
