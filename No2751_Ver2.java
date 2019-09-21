package homeStudy;

import java.util.InputMismatchException;
import java.util.Scanner;

class No2751 {

	public static void bubbleSort(int[] arr) {
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
	
	public static void swap(int[]arr, int index1, int index2) {
		int temp;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	public static void heapSort(int []arr) {

		try {
			for (int i = 1; i < arr.length; i++) {
				int parentIndex = i;
				do {
					int root = (parentIndex - 1) / 2;
					if (arr[root] < arr[parentIndex]) {
						swap(arr, parentIndex, root);
					}
					parentIndex = root;
				} while (parentIndex != 0);
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();
		}
		
		
		
		for (int i = arr.length - 1; i >= 0; i--) {

			try {
			swap(arr, 0, i);
			int root = 0;
				int childIndex = 1;
				do {
					childIndex = 2 * root + 1;
					if ((childIndex < i - 1) && arr[childIndex] < arr[childIndex + 1]) {
						childIndex++;
					}
					if (childIndex < i && arr[root] < arr[childIndex]) {
						swap(arr, root, childIndex);
					}
					root = childIndex;
				} while (childIndex < i);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
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
		
		heapSort(notSortedArr);
		display(notSortedArr);
		scanf.close();
	}

}
