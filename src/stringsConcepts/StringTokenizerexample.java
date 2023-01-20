package stringsConcepts;

import java.util.StringTokenizer;

public class StringTokenizerexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line = "Java Oracle C C++ Oracle Python Spark Testing";
		
	
		StringTokenizer st = new StringTokenizer(line, " ");
		while( st.hasMoreTokens() )
		{		
			
				String str = st.nextToken();
		
				System.out.println(str);
			
		}

		
		
	}

}
