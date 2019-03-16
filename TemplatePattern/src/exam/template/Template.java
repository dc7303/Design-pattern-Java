package exam.template;

import java.util.HashMap;
import java.util.Map;

/**
 * �ڽ� class���� ������ �� �ִ� protected ���������� ���� abstract method�� �����Ѵ�.
 * �̷��� ������ �߻� �޼ҵ�� ����Ͽ����� ������ �����ϰ�,
 * �̷��� ������ ������ �޼ҵ���� �θ� class���� ������ �޼ҵ� ���ο��� ���ȴ�.
 * 
 * �� ����� ��Ŀ�������� �̷���� class �޼ҵ���� templateȭ�� class�� ��ӹް�,
 * ��ӹ��� ����� ���� �޼ҵ带 ����ϵ�, ���� �˰������ ���� �����Ͽ�
 * ���ݿ� �°� ����� �� �ִ�.
 * 
 * @author mark
 *
 */
public abstract class Template {

	abstract protected String encPass(String userPwd);
	
	abstract protected boolean checkUser(String userId, String encPwd);
	
	abstract protected String getAuthCode(String userId);
	
	public Map<String, String> login(String userId, String userPwd) {
		
		String encPwd = encPass(userPwd);
		boolean result = checkUser(userId, encPwd);
		String authCode = null;
		if(result) {
			authCode = getAuthCode(userId);
		}
		
		Map<String, String> response = new HashMap<>();
		response.put("userId", userId);
		response.put("authCode", authCode);
		
		return response;
	}
	
}
