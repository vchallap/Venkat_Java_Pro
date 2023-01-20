package inputoutput; //input and ouput is used to process the input and produce the output based on the input.it uses the concept of stream to make I/O operation fast.
/*
 * 3 streams :

1) System.out: standard output stream

2) System.in: standard input stream

3) System.err:

 * 
 * 
 */


public class InputOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    System.out.println ("simple message");

	    System.err.println ("error message");

	    int i=System.in.read();

	    System.out.println ((char)i);

		
		
	}

}
