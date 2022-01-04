package com.dsa_algos.selectionsort;

public class SelectionSort_own {

	public static void main(String[] args) {
		// declaring the array
		int[] arr = { 20, 35, -11, 21, 11, 9, 23 };
		// initially largest element is arr[0]
		int largest = 0;
		// lastUnsorted index will be the last index of the array since entire array is
		// unsorted
		int lastUnsortedIndex = arr.length - 1;
		// loop runs till lastunsortedindex is 0
		while (lastUnsortedIndex > 0) {
			// loop goes from 2nd element to the last element
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				// checks if any other larger element is present other than arr[0]
				if (arr[largest] < arr[i]) {
					largest = i;
				}
				// swap the largest element with lastunsortdindex so the last element will be
				// sorted
				if (i == lastUnsortedIndex) {
					swap(arr, i, largest);
					// lastUnsortedIndex-- because we shouldn't disturb the sorted element
					lastUnsortedIndex--;
					// largest=0 because once the element is sorted again in the unsorted part the
					// largest element is arr[0]
					largest = 0;
				}
			}

		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

}
