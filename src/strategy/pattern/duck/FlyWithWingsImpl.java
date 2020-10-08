/**
 * 
 */
package strategy.pattern.duck;

/**
 * @author neftalialarcon
 *
 */
public class FlyWithWingsImpl implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Duck is Flying");
	}

}
