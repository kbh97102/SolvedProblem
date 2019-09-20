package homeStudy;

import java.util.InputMismatchException;
import java.util.Scanner;

class No2751 {

	public static void sort(int[] arr) {
		int temp;
		try {
			for (int i = arr.length; i >= 0; i--) {
				for (int j = 1; j < i; j++) {
					if (arr[j] < arr[j - 1]) {
						temp = arr[j - 1];
						arr[j - 1] = arr[j];
						arr[j] = temp;
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 확인해라 ");
		}
	}
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);

		int input = scanf.nextInt();
		int[] notSortedArr = new int[input];

		try {
			for (int i = 0; i < input; i++) {
				notSortedArr[i] = scanf.nextInt();
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("숫자를 입력해라 인간");
		}
		sort(notSortedArr);
		display(notSortedArr);
		scanf.close();
	}

}
