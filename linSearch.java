public class linSearch extends Algorithm {

	public String toString()
    {
        return "Linear Search";
    }
    
    //overrides the generic method, with the specific algorithm we are doing here
    public tup methodToTime(int [] x, int target)
    {
        // variables to keep track of all variable assignments
        long assign = 0;
        
        for (int i = 0; i < x.length; i++) {
            assign++;
        	if (x[i] == target) {
                tup tracker = new tup(assign,i);
        		return tracker;
        	}
        }
        // -1 is the return for the actual method, meaning the target isn't in the array
        tup tracker = new tup(assign,-1);
        return tracker;
    }
}