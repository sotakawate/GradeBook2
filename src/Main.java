import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to GradeBook!!!!");
		
		double grade = 1;
		double total = 0;
		double max = -1;
		double min = 101;
		double i = 0; 
		
		while(grade > 0) {
		 System.out.println("Enter your grade:");
		 grade = in.nextInt();
		 if(grade<=-1) {
		 	break;
		 }if(grade>100) {
			 System.out.println("Enter new number");
			 grade = in.nextInt();
		 }
		 total = total + grade;
		  if(grade>max) {
			 max = grade;
		  }if(grade<min) {
		 	  min = grade;
		    }grade = 1; i++;
		}
		
		double avg = total / i ;
		
		System.out.println("Total Grades Enterd:"+i);
		System.out.println("Average:"+avg);
		System.out.println("Highest:"+max);
		System.out.println("Lowest:"+min);
    
    	
    
	}

}
