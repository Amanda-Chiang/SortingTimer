public class mergeSort extends Algorithm { // O(n) = n*log(n) --- log(n) levels of merging, merging n values each level

	public String toString() {
		return "Merge Sort";
	}

	public void methodToTime(int [] x, int start, int end, int k) {
		// base case: array to be sorted short enough to use insertion sort
		if (end-start <= k) {
			insSort(x,start,end);
			return;
		}
		
		// original base case: sorted
		// if (end - start <= 1) {
		// 	return;
		// }
		
		// splitting the array into two
		int middle = start + (end-start)/2;
		// call MergeSort to split the array into two each time it's called
		methodToTime(x,start,middle,k);
		methodToTime(x,middle,end,k);
		// sort the two split arrays
		merge(x,start,middle,end);
		
		return;
	}
	
	// public static void mergeSort(int [] x, int start, int end, int k) {
		
	// 	if (end-start <= k) {
	// 		Algorithm ins = new insSort();
	// 		ins.methodToTime(x,start,end);
	// 		return;
	// 	}
		
	// 	// base case: sorted
	// 	if (end - start <= 1) {
	// 		return;
	// 	}
		
	// 	// splitting the array into two
	// 	int middle = start + (end-start)/2;
	// 	// call MergeSort to split the array into two each time it's called
	// 	mergeSort(x,start,middle,k);
	// 	mergeSort(x,middle,end,k);
	// 	// sort the two split arrays
	// 	merge(x,start,middle,end);
	// 	return;
	// }

	public void merge(int [] x, int start, int middle, int end) {
		int [] temp = new int[end-start];
		int s = start;
		// index of merged array
		int n = 0;
		// tracks where in the second sorted list we are currently at
		int mid = middle;
		// while the left and right sorted arrays still have values left, compare the left-most unsorted
		// value and sort into temp
		while ((s < middle) && (mid < end)) {
			if (x[s] <= x[mid]) {
				temp[n] = x[s];
				s++;
			}
			else {
				temp[n] = x[mid];
				mid++;
			}
			n++;
		}
		// once one of the arrays has been exhausted, copy all the remaining values from the other array
		while (s < middle){
			temp[n] = x[s];
			n++;
			s++;
		}
		while (mid < end) {
			temp[n] = x[mid];
			n++;
			mid++;
		}
		for (int i = 0; i < temp.length; i++) {
			x[start+i] = temp[i];
		}
	}

	// insertion sort code
	public void insSort(int [] x, int start, int end) {

        for (int i = start+1; i < end; i++) {
            int j = i;
            // if the value we are sorting is smaller than the value an index before it,
            // swap the two values
            while (j > start && x[j] < x[j-1]) {
                // lastBig is the last sorted value that was bigger than what we are currently
                // comparing
                int lastBig = x[j-1];
                x[j-1] = x[j];
                x[j] = lastBig;
                j--;
            }
       }
       return;
    }
}