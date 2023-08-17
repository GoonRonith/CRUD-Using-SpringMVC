package Login.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Login.Dao.UserDaoImpl;

import Login.Enitites.User;

@Service
public class UserService {
	@Autowired
	private UserDaoImpl dao;

	public void InsertData(User user) {
		 dao.Insert(user);
	}
	
	public User getUserByName(String name) {
		 User user=dao.getUser(name);
		 return user;
	}
	
	public boolean checkPwd(User user,String userEnteredPwd) {
		String realPwd=user.getPassword();
		if(userEnteredPwd.equals(realPwd)) {
			return true;
		}
		return false;
		
	}
	
//	public void addPlayer(Players player) {
//		dao.addPlayer(player);
//	}
	
}
