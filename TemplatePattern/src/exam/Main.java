package exam;

import java.util.Iterator;
import java.util.Map;

import exam.impl.Impl;
import exam.template.Template;

/**
 * 템플릿 메소드 패턴은 템플릿화 된 클래스를 가져다가 부모 클래스의 구현메소드에서 사용되고 있는
 * 추상클래스들 구현하고, 사용하는 클래스에서 사용되어지는 구현메소드만 사용함으로써
 * 구현의 분리를 통해 유지보수성을 높인다.
 * 
 * 특히 Template화 된 부모클래스는 공통 메소드를 추상화 해두기 때문에 재사용성이 높아진다.
 * 
 * 하지만 실용주의 디자인패턴에서 Template 코드는 나쁘다고 얘기한다.
 * 이유는 extends 즉 상속은 결합도를 높이기 때문에 추후 부모클래스의 수정은
 * 상속받는 자식클래스들에게 영향을 준다. 높은 결합도는 좋은 디자인 패턴이 아니기 때문에
 * interface를 사용하는 strategy pattern을 권장한다.
 * 
 * @author mark
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Template login = new Impl();
		
		Map<String, String> response = login.login("mark42", "dc5678");
		
		Iterator<String> iter = response.keySet().iterator();
		if(iter.hasNext()) {
			String key = iter.next();
			String value = response.get(key);
			System.out.println(value);
		}
	}
}
