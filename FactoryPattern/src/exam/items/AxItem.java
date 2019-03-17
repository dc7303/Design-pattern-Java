package exam.items;

import exam.framework.Item;

public class AxItem implements Item{

	@Override
	public void use() {
		
		System.out.println("도끼로 공격합니다.");
		
	}
}
