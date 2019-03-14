package exam.adapter;

import exam.math.Cal;

public class Adapter {
	
	private Cal cal = new Cal();
	
	/**
	 * Cal class�� �����Ǿ� �ִ� ����� ������ �Ҷ�,
	 * �˰����� �䱸���׿� �°� ����� �� �ְ� ���ִ�,
	 * �� ����� ����� ����� ���ִ� ��.
	 * 
	 * ���� ���̺귯���� ����Ҷ� ���������� ���Ǵ� ���̺귯����
	 * �α� ������ �������� �ʰ� ����͸� ���� ������ �� ������,
	 * �̷��� ���� ������� ȿ�������� �� �� �ֵ��� �����ش�.
	 * 
	 * ���� �˰����� ����Ǿ�����, ��� ��ü�� ���� ��ü�� �������� �ʰ�
	 * ����� ���ο��� ������ ������ ���� ���� ���� ȿ������ ���� �� �ִ�.
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
