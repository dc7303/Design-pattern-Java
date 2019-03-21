package exam;

import exam.prototype.Dog;

/**
 * Prototype pattern에서 Prototype은 원형이라는 뜻이다.
 * 자바에서는 c에서 처럼 복잡한 알고리즘 구현 없이
 * Cloneable interface를 제공한다.
 * Prototype할 객체를 Cloneable을 implements하여
 * 구현객체가 이를 extends하여 사용한다.
 * 
 * 아래 예제와 같이 새로운 변수에 대입하면 주소를 할당하기 때문에
 * 변경이 일어날시 동일한 주소를 가진 객체들 전부가 변화를 공유한다. 이를 얕은 복사했다 한다.
 * 
 * 반대로 깊은 복사는 Cloneable에서 제공하는 clone 메소드를 통해진행 할 수 있다.
 * 새로운 주소를 할당받기 때문에 변화에 독립적이다.
 * 
 * 현 예제에서는 알고리즘이 단순하기 때문에 새로운 객체를 만들면 되겠다 생각할 수 있지만,
 * 알고리즘이 복잡하고 거대하다면 Prototype Pattern은 코드를 단순화하는데 매우 유용할 것이다.
 * 
 * @author mark
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Dog puppy = new Dog("puppy", 2);
		
		// 얕은 복사
		Dog biggle = puppy;
		biggle.setName("biggle");
	
		
		// 깊은 복사
		Dog gold = puppy.copy();
		gold.setName("gold");
		

		System.out.println("biggle : " + puppy.getName());
		System.out.println("biggle : " + biggle.getName());
		System.out.println("biggle : " + gold.getName());
	}
}
