package exam;

import java.util.Iterator;
import java.util.Map;

import exam.impl.Impl;
import exam.template.Template;

/**
 * ���ø� �޼ҵ� ������ ���ø�ȭ �� Ŭ������ �����ٰ� �θ� Ŭ������ �����޼ҵ忡�� ���ǰ� �ִ�
 * �߻�Ŭ������ �����ϰ�, ����ϴ� Ŭ�������� ���Ǿ����� �����޼ҵ常 ��������ν�
 * ������ �и��� ���� ������������ ���δ�.
 * 
 * Ư�� Templateȭ �� �θ�Ŭ������ ���� �޼ҵ带 �߻�ȭ �صα� ������ ���뼺�� ��������.
 * 
 * ������ �ǿ����� ���������Ͽ��� Template �ڵ�� ���ڴٰ� ����Ѵ�.
 * ������ extends �� ����� ���յ��� ���̱� ������ ���� �θ�Ŭ������ ������
 * ��ӹ޴� �ڽ�Ŭ�����鿡�� ������ �ش�. ���� ���յ��� ���� ������ ������ �ƴϱ� ������
 * interface�� ����ϴ� strategy pattern�� �����Ѵ�.
 * 
 * @author mark
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Template login = new Impl();
		
		Map<String, String> response = login.login("mark42", "dc5678");
		
		Iterator<String> iter = response.keySet().iterator();
		if(iter.hasNext()) {
			String key = iter.next();
			String value = response.get(key);
			System.out.println(value);
		}
	}
}
