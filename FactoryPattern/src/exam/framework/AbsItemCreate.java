package exam.framework;

/**
 * Factory Method이다.
 * Template Method의 형태를 가지고 있고,
 * 자식 클래스에게 알고리즘 메소드의 구현을 강제하고
 * 구현 메소드에서 이를 사용하여 생성하고자하는 객체를 리턴한다.
 * 
 * @author mark
 *
 */
public abstract class AbsItemCreate {

	/** DB에서 아이템 정보 가져옴. */
	protected abstract String dbConnect(String itemInfo);
	
	/** 아이템 생성 */
	protected abstract Item createItem(String dbInfo);
	
	/** 로그 남김 **/
	protected abstract void createLog();
	
	public Item generateItem(String itemInfo) {
		
		String dbInfo = dbConnect(itemInfo);
		Item item = createItem(dbInfo);
		createLog();
		
		return item;
	}
}
