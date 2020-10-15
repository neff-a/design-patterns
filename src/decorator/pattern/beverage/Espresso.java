/**
 * 
 */
package decorator.pattern.beverage;

/**
 * @author neftalialarcon
 *
 */
public class Espresso extends Beverage {
	
	public Espresso() {
		this.setDescription("Espresso");
	}

	@Override
	float cost() {
		return 1.99f;
	}

}
