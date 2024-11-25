public class tup {
	
	public int returnInt;
	public long numVarAss;

	public static void main (String [] args) {
    }

    tup(long numVarAss, int returnInt) {
    	this.numVarAss = numVarAss;
        this.returnInt = returnInt;
    }

    tup() {
    	this.numVarAss = -1;
    	this.returnInt = -2;
    }

	public String toString() {
		return numVarAss + ", " + returnInt;
	}

}