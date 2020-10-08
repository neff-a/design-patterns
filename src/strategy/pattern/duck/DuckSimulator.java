/**
 * 
 */
package strategy.pattern.duck;

/**
 * @author neftalialarcon
 *
 */
public class DuckSimulator {
	
	public static void main(String[] args) {
		final MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.setQuackBehavior(new MuteQuackImpl());
		mallardDuck.performQuack();
	}

}
