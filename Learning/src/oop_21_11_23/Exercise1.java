package oop_21_11_23;

import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
		int length = arr.length;
	
		int[] newArr = new int[length];
		
		Random rad = new Random();
		int randomNumber;

		int i = 0;
		while(i < length) {
			randomNumber = rad.nextInt(length - i);
			newArr[i] = arr[randomNumber];
			for(int j = randomNumber; j < length - 1; j++) {
				arr[j] = arr[j+1];
			}
			i++;
		}

		for(int j = 0; j < length; j++) {
			System.out.println(newArr[j]);
		}
		
	}

}
