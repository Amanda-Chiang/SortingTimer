
public class GetMinAlgorithm extends Algorithm
{
    public String toString()
    {
        return "Get Min";
    }
    
    //overrides the generic method, with the specific algorithm we are doing here
    public tup methodToTime(int [] x)
    {
        // variables to keep track of all variable assignments
        long assign = 0;

        int min = x[0];
        assign++;
        for (int i = 0; i < x.length; i++)
        {
            assign++;
            if (x[i] < min)
            {
                min = x[i];
                assign++;
            }
        }
        
        tup tracker = new tup(assign,min);
        return tracker;
    }
}
