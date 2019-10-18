package gliderifle.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT="> ";
	
	public void runPrompt() {		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();		
		
		int month;
		
		while(true) {
			System.out.println("월을 입력하세요:");
			System.out.print(PROMPT);
			
			month = scanner.nextInt();		
			
			if(month==-1) {
				break;
			} else {
				cal.printCalendar(month);				
			}			
		}

		System.out.println("Bye~");
		scanner.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
