package exam;

import exam.weapons.Ax;
import exam.weapons.Gun;

/**
 * Strategy Pattern Exam
 * 
 * 중요핵심
 * 1) Interface
 *  - 구현과 선언을 분리한다.
 *    설계의 틀 제공.
 *    
 * 2) Delegate
 *  - 구현을 위임한다.
 *    필요 기능을 다른 기능에 위임하고 사용한다.
 *    
 * 3) 전략패턴
 *  - 하나의 Interface에 다른 기능을 하는 구현 객체들을 분리하여
 *    유지보수 기능을 전략적으로 높이는 패턴
 * 
 * @author mark
 *
 */
public class Main {
		
	public static void main(String[] args) {
		/** 캐릭터 기능은 다른 객체에 위임한다. (Delegate) */
		exam.character.Character man = new exam.character.Character(null);
		exam.character.Character manAx = new exam.character.Character(new Ax());
		exam.character.Character manGun = new exam.character.Character(new Gun());
	
		/** interface 구현체에 따라 기능이 다르기 때문에 유지 보수, 구현에 효율적이다. (전략패턴) */
		man.attack();
		manAx.attack();
		manGun.attack();
		
	}
}
