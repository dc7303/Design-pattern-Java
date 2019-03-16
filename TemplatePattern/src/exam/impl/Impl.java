package exam.impl;

import exam.template.Template;

/**
 * Templateȭ�� class�� ��ӹް�
 * abstract method�� �����Ѵ�.
 * 
 * @author mark
 *
 */
public class Impl extends Template {

	@Override
	protected String encPass(String userPwd) {
		
		String result = userPwd + "�� ��ȣȭ�մϴ�.";
		
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
