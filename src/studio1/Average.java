package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	System.out.print("What integer would you like averaged?");
	
	int n1 = in.nextInt();
	System.out.print("What other integer would you like averagd?");
	int n2 = in.nextInt();
	double average  = (n1 + n2) / 2.0;
	System.out.println("The average of " + n1 + " and " + n2 + " is equal to " + average);
	}

}
