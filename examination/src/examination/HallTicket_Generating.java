package examination;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class HallTicket_Generating {
	public void selectRecord() throws Exception {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Roll No to Generate Hall Ticket");
	String r=sc.next();
	System.out.println("Enter Password:");
	String p=sc.next();
	
	String sql1="select pwd from student_details where regno="+r;
	Connection con=exam_connection.getConnection();
	Statement statement=con.createStatement();
	ResultSet rs=statement.executeQuery(sql1);
	rs.next();
	String pp=rs.getString("pwd");
	
		String sql="select * from student_details where regno="+r;
		Connection con1=exam_connection.getConnection();
		Statement statement1=con1.createStatement();
		ResultSet rs1=statement1.executeQuery(sql);
		String password=pp;
		
			if(rs1.next() ) {
				if(p.equals(password)) {
		    System.out.println("***********************HALL TICKET*********************");
		    System.out.println("  SWARNANDHRA COLLEGE OF ENGINEERING AND TECHNOLOGY    ");
		    System.out.println("                   EXAMINATION BRANCH              ");
			System.out.println("Name is: "+rs1.getString("name"));
			System.out.println("Roll No is: "+rs1.getString("regno"));
			System.out.println("Email is: "+rs1.getString("email"));
			
			System.out.println("Subject: Programming in java");
			System.out.println("Date: 12/12/2022");
			System.out.println("-----------------*********---------------------");
			}
				else {
					System.out.println("not found");
				}
				}
		

}
}
