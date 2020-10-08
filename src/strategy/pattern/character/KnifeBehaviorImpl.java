/**
 * 
 */
package strategy.pattern.character;

/**
 * @author neftalialarcon
 *
 */
public class KnifeBehaviorImpl implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Load knife");
	}

}
