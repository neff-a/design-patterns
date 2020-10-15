/**
 * 
 */
package decorator.pattern.beverage;

/**
 * @author neftalialarcon
 *
 */
public class Decaf extends Beverage {
	
	public Decaf() {
		this.setDescription("Decaf");
	}

	@Override
	float cost() {
		return 1.05f;
	}

}
