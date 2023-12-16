package examination;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class registeration {
	String name,email,password;
	int regno;
	
	
	
	registeration() throws Exception{
		System.out.println("Enter Student Details for Registration:");
		Scanner s=new Scanner(System.in);
		System.out.print("Name of Student:");
		name=s.nextLine();
		System.out.print("Roll No:");
		regno=s.nextInt();
		System.out.println("Email:");
		email=s.next();
		System.out.println("password:");
		password=s.next();

	}
	
	public void addStudent(registeration re) throws Exception{
		String query="insert into student_details(name,regno,email,pwd) values(?,?,?,?)";
		Connection con=exam_connection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, re.name);
		pst.setInt(2, re.regno);
		pst.setString(3, re.email);
		pst.setString(4, re.password);
		pst.executeUpdate();
	}
}
