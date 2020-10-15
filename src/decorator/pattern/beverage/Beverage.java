/**
 * 
 */
package decorator.pattern.beverage;

/**
 * @author neftalialarcon
 *
 */
public abstract class Beverage {
	
	private String description;
	
	abstract float cost();

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
