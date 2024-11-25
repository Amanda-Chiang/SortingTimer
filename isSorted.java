public class isSorted extends Algorithm {

	public String toString() {
		return "Is Sorted";
	}

	// loop through the array and check that every value is larger than or equal to the
	// value one index before
	public tup methodToTime(int [] x)
    {
    	// variables to keep track of all variable assignments
        long assign = 0;

        for (int i = 1; i < x.length; i++) {
        	assign++;
        	// if the value with a smaller index is greater than a value with a bigger index,
        	// the array isn't sorted in ascending order, therefore return 0
        	if (x[i] < x[i-1]) {
        		tup tracker = new tup(assign,0);
        		return tracker;
        	}
        }
        // return 0 for not sorted, return 1 for is sorted
        tup tracker = new tup(assign,1);
        return tracker;
    }
}