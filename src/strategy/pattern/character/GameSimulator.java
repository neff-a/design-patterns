/**
 * 
 */
package strategy.pattern.character;

/**
 * @author neftalialarcon
 *
 */
public class GameSimulator {
	
	public static void main(String[] args) {
		BlackWidow blackWidow = new BlackWidow();
		blackWidow.fight();
		blackWidow.loadWeapon();
		blackWidow.setWeaponBehavior(new BowAndArrowBehaviorImpl());
		blackWidow.loadWeapon();
	}

}
