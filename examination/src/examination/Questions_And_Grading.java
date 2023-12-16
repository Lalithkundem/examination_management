package examination;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Questions_And_Grading {
	public static void question() throws Exception{
			            String sql1 = "SELECT question_id, question,option1,option2,option3,option4 FROM questions";
	            Connection con=exam_connection.getConnection();
	            Statement statement = con.createStatement();
	            ResultSet resultSet1 = statement.executeQuery(sql1);

	           
	            Scanner scanner = new Scanner(System.in);
	            System.out.println("Enter regno");
	            
	            String rs1=scanner.next();
	            while (resultSet1.next()) {
	                int questionId = resultSet1.getInt("question_id");
	                String question = resultSet1.getString("question");
	                String option1 = resultSet1.getString("option1");
	                String option2 = resultSet1.getString("option2");
	                String option3 = resultSet1.getString("option3");
	                String option4 = resultSet1.getString("option4");

	                System.out.println(question);
	                System.out.println(option1);
	                System.out.println(option2);
	                System.out.println(option3);
	                System.out.println(option4);
	                scanner.next();
	                String userAnswer = scanner.nextLine();

	                String sql2= "INSERT INTO user_answers (regno,question_id, user_answer) VALUES (?,?,?)";
	                PreparedStatement preparedStatement = con.prepareStatement(sql2);
	                preparedStatement.setString(1, rs1);
	                preparedStatement.setInt(2, questionId);
	                preparedStatement.setString(3,userAnswer);
	                preparedStatement.executeUpdate();
	            }

	            String sql3 = "SELECT question_id, correct_answer FROM questions";
	            resultSet1 = statement.executeQuery(sql3);

	            int correctCount = 0 ,questionsCount=0;
	            while (resultSet1.next()) {
	                int questionId = resultSet1.getInt("question_id");
	                String correctAnswer = resultSet1.getString("correct_answer");
	                

	                String sql4 = "SELECT regno,user_answer FROM user_answers WHERE question_id = ?";
	                PreparedStatement preparedStatement1 = con.prepareStatement(sql4);
	                preparedStatement1.setInt(1, questionId);
	                ResultSet resultSet2 = preparedStatement1.executeQuery();

	                if (resultSet2.next()) {
	                    String userAnswer = resultSet2.getString("user_answer");
	                    questionsCount++;
	                    if (userAnswer.equalsIgnoreCase(correctAnswer)) {
	                        correctCount=correctCount+1;
	                    }
	                  
	                    
	                }
	            }
	            String sql5= "SELECT regno FROM student_details ";
	    		
	    		PreparedStatement smt=con.prepareStatement(sql5);
	    		ResultSet result3=smt.executeQuery();
	    		result3.next();
	    		String rs=rs1;
	            
	    	
	            double grade = (double) correctCount / questionsCount * 100;
	            String sql6= "INSERT INTO grades (regno,grade) VALUES (?,?)";
	            PreparedStatement preparedStatement2 = con.prepareStatement(sql6);
	            preparedStatement2.setString(1, rs);
	            preparedStatement2.setDouble(2, grade);
	            preparedStatement2.executeUpdate();
	                      
	            String sql7= "SELECT regno,grade FROM grades where regno= "+rs1;
	    		PreparedStatement smt1=con.prepareStatement(sql7);
	    		ResultSet rt=smt1.executeQuery();
	    		rt.next();
	    		double db=rt.getDouble("grade");
	    		System.out.println("***********Exam Completed***********");
	    		System.out.println("Your result is:"+db);
	    		
	    		
	    		
	            
	        }
	    
}

