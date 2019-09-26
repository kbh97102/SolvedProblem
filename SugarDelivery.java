package homeStudy;

import java.util.Scanner;

public class SugarDelivery {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);
		int mass; // 목표 설탕
		int div_3 = 3;
		int div_5 = 5;
		int count = 0;
		
		mass = scanf.nextInt();

		while (mass>0) {
			if(mass % div_5 == 0) {
				mass -= div_5;
				count++;
			}
			else if(mass % div_3 == 0) {
				mass -= div_3;
				count++;
			}
			else if(mass > 5) {
				mass -= div_5;
				count++;
			}
			else {
				count = -1;
				break;
			}
		}
		
		System.out.println(count);
		
		scanf.close();
	}
}
