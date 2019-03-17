package exam;

import exam.concrete.ItemCreateImpl;
import exam.framework.AbsItemCreate;
import exam.framework.Item;

/**
 * Facotry Method Pattern�� Factory Method�� Template Pattern�� ������ �˰� �ִ� ���̴�.
 * ȣ���ϴ� Ŭ�������� ���� �˰��� ������ ���ʿ� ����
 * Faactory Method ���ο��� �ʿ��� �˰��� ������ �����ϰ�,
 * ����Ϸ��� ��ü�� ��ȯ�Ѵ�.
 * ȣ�� Ŭ���� ���ο����� �� ��ü�� ����ϱ⸸ �ϸ�ȴ�.
 * 
 * �ǿ����� ���������Ͽ����� Factory Method Pattern ���� Template Method Pattern�� ����
 * ����� �������� �ʴ´�. ������ Template Method�� ���� class ���� extends ��, ����ϴ� ������
 * ���յ��� ���̱� ������ ���� �������� ����� ������Ű�� ������ �Ǳ� �����̴�.
 * Extends ������ �Ǿ��ִ� Pattern���� ���å�� Strategy Pattern�� �����Ѵ�.
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
