/**
 * 
 */
package decorator.pattern.beverage;

/**
 * @author neftalialarcon
 *
 */
public class Milk extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Milk(final Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", and Milk";
	}

	@Override
	float cost() {
		return this.beverage.cost() + 0.10f;
	}

}
