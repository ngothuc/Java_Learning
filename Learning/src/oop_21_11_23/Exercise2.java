package oop_21_11_23;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		int n;

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		int [] arr = new int[n]; 

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		// for(int i = 0; i < n; i++) {
		// 	for(int j = i + 1; j < n; j++) {
		// 		if(arr[j] < arr[i]) {
		// 			int tmp = arr[j];
		// 			arr[j] = arr[i];
		// 			arr[i] = tmp;
		// 		}
		// 	}
		// }

		Arrays.sort(arr);

		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
