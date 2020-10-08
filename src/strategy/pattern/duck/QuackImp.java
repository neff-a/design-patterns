/**
 * 
 */
package strategy.pattern.duck;

/**
 * @author neftalialarcon
 *
 */
public class QuackImp implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Duck Quacking");
	}

}
