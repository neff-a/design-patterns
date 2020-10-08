/**
 * 
 */
package strategy.pattern.character;

/**
 * @author neftalialarcon
 *
 */
public abstract class Character {
	
	protected WeaponBehavior weaponBehavior;
	
	void fight() {
		System.out.println("fight");
	}
	
	void loadWeapon() {
		weaponBehavior.useWeapon();
	}
	
	public void setWeaponBehavior(final WeaponBehavior behavior) {
		this.weaponBehavior = behavior;
	}

}
