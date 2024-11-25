public class selectSort extends Algorithm {

	public String toString() {
		return "Select Sort";
	}

	public tup methodToTime(int [] x) {
		// variables to keep track of all variable assignments
        long assign = 0;

		for (int i = 0; i < x.length; i++) {
			tup minTup = findMin(x,i);
            int min = minTup.returnInt;
            int oldVal = x[i];
            tup indTup = indexOf(x,i,min);
            x[indTup.returnInt] = oldVal;
            x[i] = min;
            assign += minTup.numVarAss + indTup.numVarAss + 6;
        }

        // -2 is the returnInt because this is a sort, so there is no int needed to be returned
        tup tracker = new tup(assign,-2);
        return tracker;
	}

    public tup findMin(int [] a, int ind) {
    	long as = 0;

        int currMin = a[ind];
        as++;
        for (int i = ind+1; i < a.length; i++) {
        	as++;
            if (a[i] < currMin) {
                currMin = a[i];
                as++;
            }
        }

        tup t = new tup(as,currMin);
        return t;
    }

    public tup indexOf(int [] a, int ind, int val) {
    	long as = 0;
        for (int i = ind; i < a.length; i++) {
        	as++;
            if (a[i] == val) {
            	tup t = new tup(as,i);
            	return t;
            }
        }
        // if the value isn't in the array, returnInt is -1
        tup t = new tup(as,-1);
        return t;
    }
}