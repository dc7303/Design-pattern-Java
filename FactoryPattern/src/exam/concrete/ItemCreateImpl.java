package exam.concrete;

import exam.framework.AbsItemCreate;
import exam.framework.Item;
import exam.items.AxItem;
import exam.items.GunItem;

/**
 * �ڽ� class�� �θ� class�� �߻� �޼ҵ���� �����ϰ�,
 * �̷� �޼ҵ���� �θ� class�� ���� �޼ҵ忡�� ���� �˰������� ���ȴ�.
 * 
 * @author mark
 *
 */
public class ItemCreateImpl extends AbsItemCreate {

	@Override
	protected String dbConnect(String itemInfo) {

		System.out.println("[DEBUG] dbConnet() = DB���� " + itemInfo + " ������ �����Խ��ϴ�.");
		
		return itemInfo;
	}
	
	@Override
	protected Item createItem(String dbInfo) {
		
		System.out.println("[DEBUG] createItem() = " + dbInfo + " �������� �����߽��ϴ�.");
		
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
		
		System.out.println("[DEBUG] createLog() = �α׸� �����մϴ�.");
		
	}
}
