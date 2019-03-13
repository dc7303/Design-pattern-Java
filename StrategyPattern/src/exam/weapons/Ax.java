package exam.weapons;

import exam.inerface.Weapon;

/**
 * interface 구현체
 * 
 * @author mark
 *
 */
public class Ax implements Weapon {
	
	@Override
	public void attack() {
		System.out.println("도끼로 공격했습니다.");
	}
	
}
