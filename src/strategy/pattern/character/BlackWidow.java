/**
 * 
 */
package strategy.pattern.character;

/**
 * @author neftalialarcon
 *
 */
public class BlackWidow extends Character {
	
	public BlackWidow() {
		this.weaponBehavior = new KnifeBehaviorImpl();
	}

}
