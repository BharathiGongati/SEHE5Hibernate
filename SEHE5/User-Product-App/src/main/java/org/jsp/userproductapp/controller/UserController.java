package org.jsp.userproductapp.controller;

import java.util.List;
import java.util.Scanner;

import org.hibernate.service.spi.Manageable;
import org.jsp.userproductapp.dao.ProductDao;
import org.jsp.userproductapp.dao.UserDao;
import org.jsp.userproductapp.dto.Product;
import org.jsp.userproductapp.dto.User;

public class UserController {
	static Scanner s=new Scanner(System.in);
	static UserDao uDao=new UserDao();
	static ProductDao pDao=new ProductDao();
	public static void main(String[] args) {
		System.out.println("1.Register");
		System.out.println("update");
		int choice=s.nextInt();
		switch (choice) {
		case 1:{
		     save();
		     break;
		}
		case 2:{
		     addProduct();
		     break;
		}
		case 3:{
		     updateUser();
		     break;
		}
		case 4:{
			updateProdu();
		     break;
		}
		case 5:{
			deleteProdu();
		     break;
		}
		case 6:{
			 deleteUser();
		     break;
		}
		case 7:{
			fetchUser();
		     break;
		}
		case 8:{
			fetchPro();
		     break;
		}
		case 9:{
			fetchProByUserName();
		     break;
		}
		case 10:{
			fetchProByUserNameid();
		     break;
		}
		case 11:{
			fetchuserbynameemail();
			break;
		}
		



	}
		
	}
	
	public static void save() {
		System.out.println("enter your name,email.phone,and password to register");
		String name=s.next();
		String email=s.next();
		long phone=s.nextLong();
		String password=s.next();
		User u=new User();
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		u.setPhone(phone);
		uDao.saveUser(u);
		
	
		
	}
	public static void addProduct() {
		System.out.println("Enter your user id to add the product");
		int uid=s.nextInt();
		System.out.println("enter the name,brand,category,price");
		String name=s.next();
		String brand=s.next();
		String catogory=s.next();
		double price=s.nextDouble();
		Product p=new Product();
		p.setBrand(brand);
		p.setName(name);
		p.setCategory(catogory);
		p.setPrice(price);
		p=pDao.saveProduct(p,uid);
		System.out.println(p);
		if(p!=null) {
			System.out.println("product added to the cart with id:+"+p.getId());
		}
		
		
	}
	public static void   updateUser() {
		System.out.println("enter the id to update the user record");
		int id=s.nextInt();
		
		String name=s.next();
		String email=s.next();
		long phone=s.nextLong();
		String password=s.next();

		User u=new User();
		u.setId(id);
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		u.setPhone(phone);
		uDao.upadateUser(u);
		System.out.println("user record updated");
		
		
		
		
	}
	public static void updateProdu() {
		System.out.println("enter the user id to add the product");
		int uid=s.nextInt();
		System.out.println("enter the id to update");
		int id=s.nextInt();
		System.out.println("enter the brand,category,name,price to update");
		
		String brand=s.next();
		String catogory=s.next();
		String name=s.next();
		double price=s.nextDouble();
		Product p=new Product();
		p.setId(id);
		p.setBrand(brand);
		p.setCategory(catogory);
		p.setName(name);
		p.setPrice(price);
		pDao.upadateProduct(p,uid);
		System.out.println("product updated");
		
	}
	public static void deleteProdu() {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		pDao.deleteProd(id);
		
	}
	public static void deleteUser() {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		uDao.deleteUser(id);
		
	}
	public static void fetchUser() {
		Scanner sc=new Scanner(System.in);
		int id1=sc.nextInt();
		System.out.println(uDao.fetchUser(id1));
		
	}
	public static void fetchPro() {
		Scanner sc=new Scanner(System.in);
		int id2=sc.nextInt();
		System.out.println(pDao.fetchProduct(id2));
		
	}
	
	public static void fetchProByUserName() {
		String name=s.next();
		List<Product> p=pDao.fetchProductsbyusername(name);
		for(Product p1:p) {
			System.out.println(p1);
		}
		
		
		
	}
	public static void fetchProByUserNameid() {
		String name1=s.next();
		int id3=s.nextInt();
		List<Product> p2=pDao.fetchprodbyusernameid(name1, id3);
		System.out.println(p2);
		
		
	}
	public static void fetchuserbynameemail()
	{
		String email=s.next();
		String name=s.next();
		List<User> u= uDao.fetchUser(email,name);
		for(User u1:u) {
			System.out.println(u);
		}
	}

	

}
