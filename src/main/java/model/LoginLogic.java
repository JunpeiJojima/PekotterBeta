package model;

//ログイン処理を行う
public class LoginLogic {
	public boolean execute(User user) {
		if(user.getPass().equals("1234")) {
			return true;
		}
		return false;
	}

}
