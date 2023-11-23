package fetching;

import java.util.Scanner;

public class fetching {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id ??? ");
		int id=sc.nextInt();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
