package exam;

import exam.weapons.Ax;
import exam.weapons.Gun;

/**
 * Strategy Pattern Exam
 * 
 * �߿��ٽ�
 * 1) Interface
 *  - ������ ������ �и��Ѵ�.
 *    ������ Ʋ ����.
 *    
 * 2) Delegate
 *  - ������ �����Ѵ�.
 *    �ʿ� ����� �ٸ� ��ɿ� �����ϰ� ����Ѵ�.
 *    
 * 3) ��������
 *  - �ϳ��� Interface�� �ٸ� ����� �ϴ� ���� ��ü���� �и��Ͽ�
 *    �������� ����� ���������� ���̴� ����
 * 
 * @author mark
 *
 */
public class Main {
		
	public static void main(String[] args) {
		/** ĳ���� ����� �ٸ� ��ü�� �����Ѵ�. (Delegate) */
		exam.character.Character man = new exam.character.Character(null);
		exam.character.Character manAx = new exam.character.Character(new Ax());
		exam.character.Character manGun = new exam.character.Character(new Gun());
	
		/** interface ����ü�� ���� ����� �ٸ��� ������ ���� ����, ������ ȿ�����̴�. (��������) */
		man.attack();
		manAx.attack();
		manGun.attack();
		
	}
}
