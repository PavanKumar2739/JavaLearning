package first.controller;

import first.dao.userDao;
import first.dto.User;

public class saveUser {
	public static void main(String[] args) {
		User u=new User();
		u.setName("pavan");
		u.setMail("pavan@gmail.com");
		u.setPassword("pavan123");
		u.setAge(24);
		System.out.println(u.getId());
		userDao ud=new userDao();
		u=ud.saveUser(u);
		System.out.println(u.getId());
	}

}
