package exam.character;

import exam.inerface.Weapon;

public class Character {

	Weapon weapon = null;
	
	public Character(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		
		if(weapon == null) {
			System.out.println("맨손으로 공격했습니다.");
		}else {
			weapon.attack();
		}
	}
}
