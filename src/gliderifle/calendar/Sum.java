package gliderifle.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		
		System.out.println("Input two numbers");
		
		s1 = scanner.next();
		s2 = scanner.next();		
		a = Integer.parseInt(s1);		
		b = Integer.parseInt(s2);
		
		System.out.println(a + ", " + b);
		
		System.out.printf("Sum of two numbers is %d", (a+b));
		
		scanner.close();

	}

}
