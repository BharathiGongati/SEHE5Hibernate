package org.jsp.controller;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import org.jsp.dao.FoodDao;
import org.jsp.dao.UserDao;
import org.jsp.dto.FoodOrder;
import org.jsp.dto.User;

public class UserController {
	static Scanner s = new Scanner(System.in);
	static UserDao udao = new UserDao();
	static FoodDao fDao = new FoodDao();

	public static void main(String[] args) {
		System.out.println("1:saveuser");
		System.out.println("2:updateuser");
		System.out.println("3:fetchuser");
		System.out.println("4:add food");
		System.out.println("5:update food");
		System.out.println("6:fetch food");
		System.out.println("7:fetch food by phone and email");
		System.out.println("8:delete food order record");
		int id = s.nextInt();
		switch (id) {
		case 1: {
			saveuser();
			break;
		}
		case 2: {
			updateuser();
			break;
		}
		case 3: {
			fetchuser();
			break;
		}
		case 4: {
			addfood();
			break;
		}
		case 5: {
			updatefood();
			break;
		}
		case 6: {
			fetchfood();
			break;
		}
		case 7: {
			fetchfoodbyphoneemail();
			break;
		}
		case 8: {
			deletefoodorder();
			break;
		}

		}
	}

	public static void saveuser() {
		User u = new User();
		System.out.println("enter the name,gender,email,phone,password");
		String name = s.next();
		String gender = s.next();
		String email = s.next();
		long phone = s.nextLong();
		String password = s.next();

		u.setName(name);
		u.setGender(gender);
		u.setEmail(email);
		u.setPhone(phone);
		u.setPassword(password);
		udao.saveUser(u);
		System.out.println("record saved");

	}

	public static void updateuser() {

		User u = new User();
		System.out.println("enter the id,name,gender,email,phone,password");
		int id = s.nextInt();
		String name = s.next();
		String gender = s.next();
		String email = s.next();
		long phone = s.nextLong();
		String password = s.next();

		u.setId(id);
		u.setName(name);
		u.setGender(gender);
		u.setEmail(email);
		u.setPhone(phone);
		u.setPassword(password);
		udao.updateUser(u);
		System.out.println("record updated");
	}

	public static void fetchuser() {
		String email = s.next();
		String password = s.next();
		List<User> u = udao.fetchUser(email, password);
		for (User u1 : u) {
			System.out.println(u1);
		}

	}

	private static void addfood() {
		FoodOrder o = new FoodOrder();
		System.out.println("enter user id to add food");
		int id = s.nextInt();
		System.out.println("enter price,address,item_name");
		int price = s.nextInt();
		String address = s.next();
		String item_name = s.next();
		o.setPrice(price);
		o.setAddress(address);
		o.setItem_name(item_name);
		fDao.addfood(o, id);
		System.out.println("added food");

	}

	public static void updatefood() {
//		FoodOrder o=new FoodOrder();
		System.out.println("enter user id to add food");
		int id = s.nextInt();

		FoodOrder o = fDao.fetchbyid(id);
		System.out.println("enter id,price,address,item_name");

		int id1 = s.nextInt();
		int price = s.nextInt();
		String address = s.next();
		String item_name = s.next();
		o.setId(id1);
		o.setPrice(price);
		o.setAddress(address);
		o.setItem_name(item_name);
		fDao.updatefood(o, id1);
		System.out.println("update food");

	}

	public static void fetchfood() {
		int id = s.nextInt();
		FoodOrder f = fDao.fetchbyid2(id);
		System.out.println(f);
	}

	public static void fetchfoodbyphoneemail() {
		System.out.println("enter user email and password to fetch foodorder");
		String email = s.next();
		String password = s.next();
		List<FoodOrder> f = fDao.fetchemailandpassword(email, password);
		for (FoodOrder f1 : f) {
			System.out.println(f1);
		}

	}

	public static void deletefoodorder() {
		System.out.println("enter id to delete");
		int id = s.nextInt();
		fDao.delete(id);

	}

}
