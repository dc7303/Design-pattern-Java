package exam.character;

import exam.inerface.Weapon;

public class Character {

	Weapon weapon = null;
	
	public Character(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		
		if(weapon == null) {
			System.out.println("�Ǽ����� �����߽��ϴ�.");
		}else {
			weapon.attack();
		}
	}
}
