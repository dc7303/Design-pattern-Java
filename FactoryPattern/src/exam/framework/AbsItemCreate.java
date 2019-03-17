package exam.framework;

/**
 * Factory Method�̴�.
 * Template Method�� ���¸� ������ �ְ�,
 * �ڽ� Ŭ�������� �˰��� �޼ҵ��� ������ �����ϰ�
 * ���� �޼ҵ忡�� �̸� ����Ͽ� �����ϰ����ϴ� ��ü�� �����Ѵ�.
 * 
 * @author mark
 *
 */
public abstract class AbsItemCreate {

	/** DB���� ������ ���� ������. */
	protected abstract String dbConnect(String itemInfo);
	
	/** ������ ���� */
	protected abstract Item createItem(String dbInfo);
	
	/** �α� ���� **/
	protected abstract void createLog();
	
	public Item generateItem(String itemInfo) {
		
		String dbInfo = dbConnect(itemInfo);
		Item item = createItem(dbInfo);
		createLog();
		
		return item;
	}
}
