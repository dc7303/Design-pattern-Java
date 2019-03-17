package exam.concrete;

import exam.framework.AbsItemCreate;
import exam.framework.Item;
import exam.items.AxItem;
import exam.items.GunItem;

/**
 * 자식 class는 부모 class의 추상 메소드들을 구현하고,
 * 이런 메소드들은 부모 class의 구현 메소드에서 내부 알고리즘으로 사용된다.
 * 
 * @author mark
 *
 */
public class ItemCreateImpl extends AbsItemCreate {

	@Override
	protected String dbConnect(String itemInfo) {

		System.out.println("[DEBUG] dbConnet() = DB에서 " + itemInfo + " 정보를 가져왔습니다.");
		
		return itemInfo;
	}
	
	@Override
	protected Item createItem(String dbInfo) {
		
		System.out.println("[DEBUG] createItem() = " + dbInfo + " 아이템을 생성했습니다.");
		
		Item item;
		if(dbInfo == "ax") {
			item = new AxItem();
		}else if(dbInfo == "gun") {
			item = new GunItem();
		}else {
			item = null;
		}
		
		return item;
	}
	
	@Override
	protected void createLog() {
		
		System.out.println("[DEBUG] createLog() = 로그를 생성합니다.");
		
	}
}
