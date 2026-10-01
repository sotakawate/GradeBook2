import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to GradeBook!!!!");
		
		int grade = 1;
		int total = 0;
		int max = -1;
		int min = 101;
		int i = 0; 
		
		while(grade > 0) {
		 System.out.println("Enter your grade:");
		 grade = in.nextInt();
		 if(grade<=-1) {
		 	break;
		 }total = total + grade;
		  if(grade>max) {
			 max = grade;
		  }if(grade<min) {
		 	  min = grade;
		    }grade = 1; i++;
		}
		
		int avg = total / i ;
		
		System.out.println("Total:"+total);
		System.out.println("Average:"+avg);
		System.out.println("Highest:"+max);
		System.out.println("Lowest:"+min);
    
    	
    
	}

}
