package exam;

import exam.concrete.ItemCreateImpl;
import exam.framework.AbsItemCreate;
import exam.framework.Item;

/**
 * Facotry Method Pattern은 Factory Method가 Template Pattern의 구현을 알고 있는 것이다.
 * 호출하는 클래스에서 내부 알고리즘 구조를 알필요 없이
 * Faactory Method 내부에서 필요한 알고리즘 과정을 수행하고,
 * 사용하려는 객체를 반환한다.
 * 호출 클래스 내부에서는 이 객체를 사용하기만 하면된다.
 * 
 * 실용주의 디자인패턴에서는 Factory Method Pattern 또한 Template Method Pattern과 같이
 * 사용을 권장하지 않는다. 이유는 Template Method와 같이 class 간의 extends 즉, 상속하는 구조는
 * 결합도를 높이기 때문에 추후 유지보수 비용을 증가시키는 원인이 되기 때문이다.
 * Extends 구조로 되어있는 Pattern들의 대안책인 Strategy Pattern을 권장한다.
 * 
 * @author mark
 *
 */
public class Main {

	public static void main(String[] args) {
		
		AbsItemCreate create = new ItemCreateImpl();
		
		Item ax = create.generateItem("ax");
		Item gun = create.generateItem("gun");
		
		ax.use();
		gun.use();
	}
}
