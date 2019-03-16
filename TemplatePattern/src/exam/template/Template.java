package exam.template;

import java.util.HashMap;
import java.util.Map;

/**
 * 자식 class에서 접근할 수 있는 protected 접근제한을 가진 abstract method를 정의한다.
 * 이렇게 정의한 추상 메소드는 상속하였을때 구현을 강제하고,
 * 이렇게 강제로 구현된 메소드들은 부모 class에서 구현된 메소드 내부에서 사용된다.
 * 
 * 즉 비슷한 메커니즘으로 이루어진 class 메소드들은 template화된 class를 상속받고,
 * 상속받은 기능을 구현 메소드를 사용하되, 내부 알고리즘들을 직접 구현하여
 * 성격에 맞게 사용할 수 있다.
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
