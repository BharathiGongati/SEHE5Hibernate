package org.jsp.Controller;

import java.util.Scanner;

import org.jsp.dao.UserDao;
import org.jsp.dto.User;

public class UserController {
static Scanner s=new Scanner(System.in);
static UserDao dao=new UserDao();
	public static void main(String[] args) {
		System.out.println("1.Register");
		System.out.println("2.Edit your Details");
		System.out.println("3.Find User by id");
		System.out.println("4.Delete user by id");
		System.out.println("5.Verify user by phone and password");
		System.out.println("6.verify user by Email and Password");
		System.out.println("verify user by id and password");
		int choice=s.nextInt();
		switch(choice) {
		case 1:{
			save();
			break;
		}
		case 2:{
			update();
			break;
		}
		case 3:{
			break;
		}
		case 4:{
			break;
		}
		
		}
		
	}
	public static void save() {
		System.out.println("Enter your name,email,gender,phone,password to register");
		String name=s.next();
		String email=s.next();
		String gender=s.next();
		long phone=s.nextLong();
		String password=s.next();
		User u=new User();
		u.setName(name);
		u.setGender(gender);
		u.setEmail(email);
		u.setPassword(password);
		u.setPhone(phone);
		u=dao.saveUser(u);
		System.out.println("your registerd with Id:"+u.getId());
	}
	public static void update() {
		System.out.println("enter your id");
		int id=s.nextInt();
		System.out.println("Enter your name,email,gender,phone,password");
		String name=s.next();
		String email=s.next();
		String gender=s.next();
		long phone=s.nextLong();
		String password=s.next();
		User u=new User();
		u.setId(id);
		u.setName(name);
		u.setGender(gender);
		u.setPhone(phone);
		u.setEmail(email);
		u.setPassword(password);
		u=dao.updateUser(u);
		System.out.println("your account is updated");
		
		
		
		
		
		
		
		
		
		
	}

}
