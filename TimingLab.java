public class TimingLab
{
    public static void main(String [] args)
    {
        int maxExp = 25;
        
        Algorithm ms = new mergeSort();
        timeAlgorithm(ms, maxExp, false);
        
        /*
        Algorithm gm = new GetMinAlgorithm();
        testAlgorithm(gm, maxExp, false);
        
        Algorithm ss = new selectSort();
        testAlgorithm(ss, maxExp, false);

        Algorithm bs = new binSearch();
        testAlgorithm(bs, maxExp, true);  
        
        Algorithm isSort = new isSorted();
        testAlgorithm(isSort, maxExp, false);
        
        Algorithm ins = new insSort();
        testAlgorithm(ins, maxExp, false);

        Algorithm lin = new linSearch();
        testAlgorithm(lin, maxExp, false);
        */

    }
    
    //prints out the times for the given algorithm up to the given exponent (2^maxExp)
    //where the input array is sorted or unsorted
    public static void timeAlgorithm(Algorithm alg, int maxExp, boolean useSortedArray)
    {
        System.out.println("-----Timing " + alg + "-----");
        // iterating through different tested k values
        for (int k = 3; k <= 90; k+=3) {
            // diff e values for when my independent variable is the array size
            //for (int e = 0; e < maxExp + 1; e++) {
            int currSize = (int) Math.pow(2,maxExp);
            long startTime;
            if (useSortedArray) {
                int [] sortedArray = makeSortedArray(currSize);
                startTime = System.currentTimeMillis();
                alg.methodToTime(sortedArray,0,currSize,k);
            }
            else {
                int [] randomArray = makeRandomArray(currSize);
                startTime = System.currentTimeMillis();
                alg.methodToTime(randomArray,0,currSize,k);
            }
            long endTime = System.currentTimeMillis();
            // System.out.println(currSize + ", " + (endTime - startTime));
            System.out.println(currSize + ", " + k + ", " + (endTime - startTime));
            //}
        }
        
    }

    /*
    // instead of timing, this measures variable assignments
    public static void testAlgorithm(Algorithm alg, int maxExp, boolean useSortedArray) {
        System.out.println("-----Testing " + alg + "-----");
        tup res = new tup();
        for (int e = 0; e < maxExp + 1; e++) {
            int currSize = (int) Math.pow(2,e);
            if (useSortedArray) {
                int [] sortedArray = makeSortedArray(currSize);
                res = alg.methodToTime(sortedArray);
            }
            else {
                int [] randomArray = makeRandomArray(currSize);
                res = alg.methodToTime(randomArray);
            }
            System.out.println(currSize + ", " + res);
        }
    }
    */
    
    //returns a random, but sorted, array of the given length
    public static int [] makeSortedArray(int length)
    {
        int [] a = new int [length];
        for (int i = 0; i < length; i++) {
            a[i] = (int) (Math.random() * 10) + (i*20);
        }
        return a;
    }
    
    //returns an array of random ints of the given length
    public static int [] makeRandomArray(int length)
    {
        int [] ret = new int[length];
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return ret;
    }

    public static void printArr(int [] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == a.length-1) {
                System.out.print(a[i]);
            }
            else {
                System.out.print(a[i] + ", ");
            }
        }
    }

}
