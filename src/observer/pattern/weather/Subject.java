/**
 * 
 */
package observer.pattern.weather;

/**
 * @author neftalialarcon
 *
 */
public interface Subject {
	
	void register(final Observer observer);
	
	void remove(final Observer observer);

	void sendNotification();
	
}
