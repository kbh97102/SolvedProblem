package b1024;

import java.util.InputMismatchException;
import java.util.Scanner;

// No13458

public class Main {
	public static void main(String[] args) {
		run();
	}
	public static void run() {
		Scanner scan = new Scanner(System.in);
		int place;
		int mainProctor;
		int subProctor;
		
		try {
			place = scan.nextInt();
			int testRoom[] = new int[place];
			for(int i=0;i<place;i++) {
				testRoom[i] = scan.nextInt();
			}
			mainProctor = scan.nextInt();
			subProctor = scan.nextInt();
			int needMainProctor = place;
			int needSubProctor=0;
			for(int i=0;i<place;i++) {
				testRoom[i]-=mainProctor;
			}
			for(int i=0;i<place;i++) {
				while(testRoom[i]>0) {
					testRoom[i] -= subProctor;
					needSubProctor++;
				}
			}
			System.out.println(needMainProctor + needSubProctor);
			
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		scan.close();
	}
}
