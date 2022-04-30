import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{
		Students_info student[] = new Students_info[2];
		student[0] = new Students_info("Mahbubul","1234","Mahbubul Hasan","161-15-7497");
		student[1] = new Students_info("Mahbubul1","12341","Mahbubul Hasan1","161-15-74971");
		
		Registration_info registration[] = new Registration_info[student.length];
		for(int i=0; i<student.length; i++)
		{
			registration[i] = new Registration_info("Spring",2017);
		}
		
		registration[0].setCourse_Section("CSE111","A");
		registration[0].setCourse_Section("CSE112","B");
		registration[0].setCourse_Section("CSE113","C");
		registration[1].setCourse_Section("CSE121","A");
		registration[1].setCourse_Section("CSE121","B");
		registration[1].setCourse_Section("CSE121","C");
		
		for(int i=0; i<student.length; i++)
		{
			student[i].setRegistration_info(registration[i]);
		}
		
		student[0].setCGPA(3.75);
		student[1].setCGPA(3.70);
		
		int j=0;
	    Scanner input = new Scanner(System.in);
	       
	    System.out.println("Enter username");
	    String userID = input.nextLine();
	       
	    System.out.println("Enter Password");
	    String password = input.nextLine();
	       
	    do
	    {
		     if(userID.equals(student[j].loginId) && password.equals(student[j].password))
		     {
		    	 student[j].display();
		         break;
		     }
		     if(j+1 == student.length)
		     {
		    	 System.out.println("Did not match !!! Try again");
		               
		         System.out.println("Enter username");
		         userID = input.nextLine();
	
		         System.out.println("Enter Password");
		         password = input.nextLine();
		         if(userID.equals(student[j].loginId) && password.equals(student[j].password))
			     {
			         student[j].display();
			         break;
			     }
		       }
		       j++; 
	       }
	       while(j<student.length);
		} 
	}


