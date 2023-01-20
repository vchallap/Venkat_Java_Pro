package inputOutput;////input and ouput is used to process the input and produce the output based on the input.it uses the concept of stream to make I/O operation fast.

import java.io.IOException;
import java.util.Scanner;

/*
 * 3 streams :

1) System.out: standard output stream

2) System.in: standard input stream

3) System.err:

 * 
 * 
 */

public class InputOutputStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	    System.out.println ("simple message");

	    System.err.println ("error message");

	    int i=System.in.read();

	    System.out.println ((char)i);

		
		
		
	}

}
