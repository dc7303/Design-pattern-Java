package exam;

import exam.adapter.Adapter;

public class Main {
	
	/**
	 * Cal.java의 sum과 min 알고리즘은 이미 구현되어 있다.
	 * 이러한 연산이 필요해서 해당 알고리즘을 사용하려 할때,
	 * 요구사항이 해당 알고리즘과 호환이 안된다.
	 * (Cal은 double을 연산하지만 요구사항이 float이라 가정한다.)
	 * 
	 * 이때 중간에 Adapter 기능 메소드를 구현하여 이를 해소할 수 있다.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/** Adapter는 cal의 알고리즘을 사용하지만 요구 사항에 맞게 사용하도록 브릿지 역할을 한다. */
		Adapter adapter = new Adapter();
		
		float x = 1.3333f;
		float y = 0.691f;
		
		float sumResult = adapter.sum(x, y);
		float minResult = adapter.min(x, y);
		
		System.out.println(sumResult);
		System.out.println(minResult);
	}
}
