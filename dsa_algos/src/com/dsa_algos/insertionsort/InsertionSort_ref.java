package com.dsa_algos.insertionsort;

public class InsertionSort_ref {
	public static void main(String[] args) {

		// declaring the array
		int[] arr = { 20, 35, -11, 21, 11, 9, 23 };

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
			int newElement = arr[firstUnsortedIndex];
			int i;
			// we are checking the sorted positions arr[i-1 ] because if arr[i-1] is less
			// then newElement that is the correct position of the newElement
			for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
				arr[i] = arr[i - 1];
			}
			arr[i] = newElement;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
