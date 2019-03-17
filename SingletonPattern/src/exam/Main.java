package exam;

import exam.instance.Audio;

/**
 * Singleton pattern�� �ϳ��� instance�� ���� �� �����ϰ�
 * �̷� ���� �ϳ��� instance�� �����Ͽ� ���ҽ� ���� �ּ�ȭ ���ش�.
 * 
 * ������ �̱����� �ϳ��̱� ������ �����ϱ� �����ϳ�,
 * �̱����� public static���� �������� ��밡���ϴ�.
 * ���� ������ ����� �ּ�ȭ �ؾ��ϴ� ������ ���������� ���յ��� ���̱� �����̴�.
 * ��ȭ�� ����Ͽ� ������ ����ų �� �ִٴ� ���̴�.
 * �׷��� ������ �̱��� ���� ���յ��� ���� �ν��Ͻ� ������ ���ҽ��� ���� �Ǵ� ������ ��,
 * �̴� ���� ��� ������ ������ ����ų �� �ִ� ���ɼ��� ���δ�.
 * ���� ��ü�� ������ �߻��ϸ� �����Ǿ� �ִ� class�鿡�� ������ �־�
 * ���� ���� ���� ����� ���� �� �ִ�.
 * 
 * �׷��� ������ singleton�� �ſ� ����������, �� ����ؾ��Ѵ�.
 * 
 * @author mark
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// �Ʒ��� ���� �����Ϸ� �Ҷ� private ������ ������ �� �ν��Ͻ��� ������ �� ����.
		// Audio audio = new Audio();
		
		// Audio class ���ο��� instance�� �����ϰ� �޴´�.
		Audio audio1 = Audio.getInstance();
		// Audio class ���ο� �̹� instance�� ������ ���� ���� ������ instance�� �޴´�.
		Audio audio2 = Audio.getInstance();
		
		audio1.use();
		audio2.use();
		
		// audio1 instance�� valume���� �����ߴµ� audio2�� ����Ǵ°� Ȯ���غ���.
		// �ϳ��� instance�� ����ϱ� ������ ���� �ּҰ��� ������.
		audio1.setValume(10);
		
		audio1.use();
		audio2.use();
	}
}
