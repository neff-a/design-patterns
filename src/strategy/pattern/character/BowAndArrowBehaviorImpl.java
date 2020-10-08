/**
 * 
 */
package strategy.pattern.character;

/**
 * @author neftalialarcon
 *
 */
public class BowAndArrowBehaviorImpl implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Put one arrow on the Bow");
	}

}
