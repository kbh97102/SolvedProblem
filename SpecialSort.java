package level1;

//http://codingdojang.com/scode/414?answer_mode=hide 문제

import java.util.Scanner;

public class SpecialSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("배열에 들어갈 정수 갯수");
		int maxData = scan.nextInt();
		int[] intArr = new int[maxData];
		int[] minusArr = new int[maxData];
		int[] plusArr = new int[maxData];
		for(int i=0;i<maxData;i++) {
			intArr[i] = scan.nextInt();
		}
		
		int count=0;
		int minusArrIndex = 0;
		int plusArrIndex = 0;
		try {
			while(count < maxData) {
				if(intArr[count] < 0) {
					minusArr[minusArrIndex++] = intArr[count++];
				}
				else {
					plusArr[plusArrIndex++] = intArr[count++];
				}
			}
			
			for(int i=0;i<minusArrIndex;i++) {
				intArr[i] = minusArr[i];
			}
			for(int i=0;i<plusArrIndex;i++) {
				intArr[i+minusArrIndex] = plusArr[i];
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	
		for(int i=0;i<maxData;i++) {
			System.out.print(intArr[i]+" ");
		}
		
		scan.close();
	}

}
