package shapes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int userChoice;
		do {
			System.out.println("Do you want to 1: Make a shape");
			System.out.println("2. Change a shape");
			System.out.println("3. View a shape");
			System.out.println("4. quit");
			userChoice=in.nextInt();
			if (userChoice==1) {
				
			}
		}while (userChoice!=4);
	}

}
