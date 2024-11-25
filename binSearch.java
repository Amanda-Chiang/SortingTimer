public class binSearch extends Algorithm {

	public String toString() {
		return "Binary Search";
	}

    // given a sorted int array, first check the median and compare the target to that median
    // depending on whether or not the median is larger or smaller than the target,
    // narrow the search window by half continuously until either the target is found or
    // the whole array has been searched
	public tup methodToTime(int[] a, int target) {
        // variables to keep track of all variable assignments
        long assign = 0;

		int start = 0;
        int end = a.length;
        int middle = (start+end) / 2;
        assign+=3;
        while (start != end) { 
            if (target == a[middle]) {
                tup tracker = new tup(assign, middle);
                return tracker;
            }
            else if (a[middle] > target) {
                end = middle;
                middle = (start+end) / 2;
                assign+=2;
            }
            else if (a[middle] < target) {
                start = middle + 1;
                middle = (start+end) / 2;
                assign+=2;
            }
        }
        tup tracker = new tup(assign,-1);
        return tracker;
	}

}