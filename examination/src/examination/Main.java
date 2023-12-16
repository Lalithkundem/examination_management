package examination;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("*********  Welcome to Examination Management System **************");
		int choice=1;
		while(choice==1) {
		System.out.println("Enter your choice: ");
		System.out.println("1. Register");
		System.out.println("2. Hall Ticket");
		System.out.println("3. Exit");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
            	System.out.println("Available Exams");
            	System.out.println("java mcqs");
            	
            	registeration reg=new registeration();
				reg.addStudent(reg);
				System.out.println("Registration successful!");
                break;
            case 2:
            	HallTicket_Generating h=new HallTicket_Generating();
				h.selectRecord();
                System.out.println("Do you want attempt exam");
                System.out.println("Enter your choice:");
                System.out.println("1. online mode");
                System.out.println("2. offline mode");
                int ch=sc.nextInt();
                if(ch==2) {
                	System.out.println("Three centers available to attempt in offline");
                	System.out.println("Enter center number:");
                	System.out.println("1. Swarnandhra ");
                	System.out.println("2. vishnu ");
                	System.out.println("3. srkr ");
                	int center=sc.nextInt();
                	switch(center) {
                	case 1:
                		System.out.println("We can go and attempt exam at Swarnandhra college ,Narsapur");
                		System.out.println(".............Thank u for Visiting...........");
                		
                		break;
                	case 2: System.out.println("We can go and attempt exam at Vishnu college ,Bhimavaram");
                	System.out.println(".............Thank u for Visiting...........");
                	break;
                	case 3: System.out.println("We can go and attempt exam at srkr college ,Bhimavaram");
                	System.out.println(".............Thank u for Visiting...........");
                	break;
                	
                	}
                	
                }
                else if(ch==1) {
                	System.out.println("Ready for Exam");
                	Questions_And_Grading.question();
                	
                }
                else {
                	System.out.println("Invallid Option");
                }
                break;
            case 3:System.exit(0);
            break;
            default:System.out.println("Invalid Option");
            break;
		
			
		}
	
		}
		}catch(Exception e) {
			System.out.println("Something went wrong");
			System.out.println("Better  to check DETAILS");
			main(args);

		}
	}
		
	
	
}	

		

	


