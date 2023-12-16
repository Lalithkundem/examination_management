package examination;

import java.sql.Connection;
import java.sql.DriverManager;

public class exam_connection {
	private static String url="jdbc:mysql://localhost:3306/exam";
	private static String userName="root";
	private static String passWord="root";
	


	public  static Connection getConnection() throws Exception{
		// TODO Auto-generated method stub
		return DriverManager.getConnection(url,userName,passWord);
	}

}
