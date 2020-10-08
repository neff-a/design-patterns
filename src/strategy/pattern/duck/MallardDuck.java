/**
 * 
 */
package strategy.pattern.duck;

/**
 * @author neftalialarcon
 *
 */
public class MallardDuck extends Duck {
	
	public MallardDuck() {
		this.flyBehavior = new FlyWithWingsImpl();
		this.quackBehavior = new QuackImp();
	}

}
