package exam.weapons;

import exam.inerface.Weapon;

/**
 * interface 구현체
 * 
 * @author mark
 *
 */
public class Gun implements Weapon {

	@Override
	public void attack() {
		
		System.out.println("총으로 공격했습니다.");
	}
}
