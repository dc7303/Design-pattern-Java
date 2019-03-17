package exam;

import exam.instance.Audio;

/**
 * Singleton pattern은 하나의 instance만 생성 및 제공하고
 * 이로 인해 하나의 instance를 공유하여 리소스 낭비를 최소화 해준다.
 * 
 * 하지만 싱글톤은 하나이기 때문에 관리하기 용이하나,
 * 싱글톤은 public static으로 전역에서 사용가능하다.
 * 전역 변수의 사용을 최소화 해야하는 이유는 전역변수는 결합도를 높이기 때문이다.
 * 변화에 취약하여 문제를 일으킬 수 있다는 말이다.
 * 그렇기 때문에 싱글톤 또한 결합도가 높고 인스턴스 내부의 리소스를 변경 또는 접근할 때,
 * 이는 언제 어느 곳에서 문제를 일으킬 수 있는 가능성을 높인다.
 * 또한 객체의 수정이 발생하면 연관되어 있는 class들에게 영향을 주어
 * 유지 보수 또한 힘들게 만들 수 있다.
 * 
 * 그렇기 때문에 singleton은 매우 유용하지만, 잘 사용해야한다.
 * 
 * @author mark
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// 아래와 같이 생성하려 할때 private 생성자 때문에 새 인스턴스를 생성할 수 없다.
		// Audio audio = new Audio();
		
		// Audio class 내부에서 instance를 생성하고 받는다.
		Audio audio1 = Audio.getInstance();
		// Audio class 내부에 이미 instance가 생성되 있을 때는 생성된 instance를 받는다.
		Audio audio2 = Audio.getInstance();
		
		audio1.use();
		audio2.use();
		
		// audio1 instance에 valume값을 변경했는데 audio2도 변경되는걸 확인해보자.
		// 하나의 instance만 허용하기 때문에 같은 주소값을 가진다.
		audio1.setValume(10);
		
		audio1.use();
		audio2.use();
	}
}
