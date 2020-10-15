/**
 * 
 */
package decorator.pattern.beverage;

/**
 * @author neftalialarcon
 *
 */
public class StarbuzzCoffee {
	
	public static void main(String[] args) {
		final Beverage espresso = new Espresso();
		final Beverage espressoWithMilk = new Milk(espresso);
		System.out.println("Your order is\n" + "-" + espresso.getDescription() + " $" + espresso.cost());
		System.out.println("-" + espressoWithMilk.getDescription() + " $" + espressoWithMilk.cost() + "\n");
	}

}
