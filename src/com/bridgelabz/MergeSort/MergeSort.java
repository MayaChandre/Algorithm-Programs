package com.bridgelabz.MergeSort;

public class MergeSort {

	private static final int high = 0;

	void merge(int arr[], int low, int mid, int high) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - low + 1;
		int n2 = high- mid;

	
		int L[] = new int[n1];
		int R[] = new int[n2];

		//Copy data to temp arrays 
		for (int i = 0; i < n1; ++i)
			L[i] = arr[low + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];

		// Merge the  arrays 

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = low;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		//  Remaining elements of Low if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Remaining elements of High[] if any 
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[low..High] using
	
	void sort(int arr[], int l, int r) {
		if (l < r) {
			
			int low = 0;
			int high = 0;
			// Find the middle point
			int mid = (low + high) / 2;

			// Sort first and second halves
			sort(arr, low, mid);
			sort(arr, mid + 1, high);

			// Merge the sorted halves
			merge(arr, low, mid, high);
		}
	}
}


