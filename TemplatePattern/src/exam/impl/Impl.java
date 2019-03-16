package exam.impl;

import exam.template.Template;

/**
 * Template화된 class를 상속받고
 * abstract method를 구현한다.
 * 
 * @author mark
 *
 */
public class Impl extends Template {

	@Override
	protected String encPass(String userPwd) {
		
		String result = userPwd + "를 암호화합니다.";
		
		return result;
	}
	
	@Override
	protected boolean checkUser(String userId, String encPwd) {
		
		System.out.println("[DEBUG] checkUser = " + userId + "/" + encPwd);
		
		return true;
	}
	
	@Override
	protected String getAuthCode(String userId) {
		
		String code = "auth code = " + userId + "@&#(*!^)$^!$$^)$!";
		
		return code;
	}
}
