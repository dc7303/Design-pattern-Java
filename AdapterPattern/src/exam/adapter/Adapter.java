package exam.adapter;

import exam.math.Cal;

public class Adapter {
	
	private Cal cal = new Cal();
	
	/**
	 * Cal class에 구현되어 있는 기능을 쓰려고 할때,
	 * 알고리즘을 요구사항에 맞게 사용할 수 있게 해주는,
	 * 즉 가운데서 어댑터 기능을 해주는 것.
	 * 
	 * 또한 라이브러리를 사용할때 범용적으로 사용되는 라이브러리에
	 * 로그 로직을 구현하지 않고도 어댑터를 통해 구현할 수 있으며,
	 * 이러한 점은 디버깅을 효율적으로 할 수 있도록 도와준다.
	 * 
	 * 또한 알고리즘이 변경되었을때, 사용 객체와 구현 객체를 수정하지 않고
	 * 어댑터 내부에서 조금의 변경을 통해 유지 보수 효율성을 높일 수 있다.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public float sum(float x, float y) {
		
		return (float) cal.sum(x, y);
	}
	
	public float min(float x, float y) {
		
		return (float) cal.min(x, y);
	}
	
}
