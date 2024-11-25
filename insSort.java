public class insSort extends Algorithm {

	public String toString()
    {
        return "Insert Sort";
    }
    
    public void methodToTime(int [] x, int start, int end) {
        // variables to keep track of all variable assignments
        //long assign = 0;

        //assign++;
        for (int i = start+1; i < end; i++) {
            int j = i;
            //assign+=2;
            // if the value we are sorting is smaller than the value an index before it,
            // swap the two values
            while (j > start && x[j] < x[j-1]) {
                // lastBig is the last sorted value that was bigger than what we are currently
                // comparing
                int lastBig = x[j-1];
                x[j-1] = x[j];
                x[j] = lastBig;
                j--;
                //assign+=4;
            }
       }
       return;
    }

    /*
    // one at a time compares the unsorted values with the sorted values (from largest to smallest)
    public tup methodToTime(int [] x) {
    	// variables to keep track of all variable assignments
        long assign = 0;

    	int endSort = 0;
    	assign++;
      	for (int i = 1; i < x.length; i++) {
       		int j = i;
       		assign+=2;
       		// if the value we are sorting is smaller than the value an index before it,
       		// swap the two values
    		while (j > 0 && x[j] < x[j-1]) {
    			// lastBig is the last sorted value that was bigger than what we are currently
    			// comparing
    			int lastBig = x[j-1];
    			x[j-1] = x[j];
    			x[j] = lastBig;
    			j--;
    			assign+=4;
    		}
       }
       // returns -2 b/c there's no int needed to return for a sort
       tup tracker = new tup(assign,-2);
       return tracker;
    }
    */
}
