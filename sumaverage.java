package Assignment;

public class sumaverage {
	public static void main(String[] args) {
		int sum = 0;
		 double average = 0;
		 final int LOWERBOUND = 1;
		  double UPPERBOUND = 100;
		
	int number = LOWERBOUND;
	while(number <= UPPERBOUND) {
		sum += number;
		++number;
		   average = sum / number;
	}
			 
		 	System.out.println("The sum is " + sum);
		 	System.out.println("The average is " + average);
			
				
			
		}
		
	}

