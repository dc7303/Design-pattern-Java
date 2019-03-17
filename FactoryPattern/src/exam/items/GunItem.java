package exam.items;

import exam.framework.Item;

public class GunItem implements Item {

	@Override
	public void use() {
		
		System.out.println("사격합니다.");
		
	}
}
