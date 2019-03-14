package exam;

import exam.adapter.Adapter;

public class Main {
	
	/**
	 * Cal.java�� sum�� min �˰����� �̹� �����Ǿ� �ִ�.
	 * �̷��� ������ �ʿ��ؼ� �ش� �˰����� ����Ϸ� �Ҷ�,
	 * �䱸������ �ش� �˰���� ȣȯ�� �ȵȴ�.
	 * (Cal�� double�� ���������� �䱸������ float�̶� �����Ѵ�.)
	 * 
	 * �̶� �߰��� Adapter ��� �޼ҵ带 �����Ͽ� �̸� �ؼ��� �� �ִ�.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/** Adapter�� cal�� �˰����� ��������� �䱸 ���׿� �°� ����ϵ��� �긴�� ������ �Ѵ�. */
		Adapter adapter = new Adapter();
		
		float x = 1.3333f;
		float y = 0.691f;
		
		float sumResult = adapter.sum(x, y);
		float minResult = adapter.min(x, y);
		
		System.out.println(sumResult);
		System.out.println(minResult);
	}
}
