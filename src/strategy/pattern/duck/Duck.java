/**
 * 
 */
package strategy.pattern.duck;

/**
 * @author neftalialarcon
 *
 */
public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void display() {
		System.out.println("Display duck");
	}
	
	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	} 

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
