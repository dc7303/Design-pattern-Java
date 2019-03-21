package exam;

import exam.prototype.Dog;

/**
 * Prototype pattern���� Prototype�� �����̶�� ���̴�.
 * �ڹٿ����� c���� ó�� ������ �˰��� ���� ����
 * Cloneable interface�� �����Ѵ�.
 * Prototype�� ��ü�� Cloneable�� implements�Ͽ�
 * ������ü�� �̸� extends�Ͽ� ����Ѵ�.
 * 
 * �Ʒ� ������ ���� ���ο� ������ �����ϸ� �ּҸ� �Ҵ��ϱ� ������
 * ������ �Ͼ�� ������ �ּҸ� ���� ��ü�� ���ΰ� ��ȭ�� �����Ѵ�. �̸� ���� �����ߴ� �Ѵ�.
 * 
 * �ݴ�� ���� ����� Cloneable���� �����ϴ� clone �޼ҵ带 �������� �� �� �ִ�.
 * ���ο� �ּҸ� �Ҵ�ޱ� ������ ��ȭ�� �������̴�.
 * 
 * �� ���������� �˰����� �ܼ��ϱ� ������ ���ο� ��ü�� ����� �ǰڴ� ������ �� ������,
 * �˰����� �����ϰ� �Ŵ��ϴٸ� Prototype Pattern�� �ڵ带 �ܼ�ȭ�ϴµ� �ſ� ������ ���̴�.
 * 
 * @author mark
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Dog puppy = new Dog("puppy", 2);
		
		// ���� ����
		Dog biggle = puppy;
		biggle.setName("biggle");
	
		
		// ���� ����
		Dog gold = puppy.copy();
		gold.setName("gold");
		

		System.out.println("biggle : " + puppy.getName());
		System.out.println("biggle : " + biggle.getName());
		System.out.println("biggle : " + gold.getName());
	}
}
