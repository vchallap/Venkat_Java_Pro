package test;

public class StringFirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s1= new String ("Venkatesh");
		String s2= "Tej";
		s1=s1+" surya";
		System.out.println(s1);
		System.out.println(s2);*/
		
		String s1= "Tej";
		String s2= "Tej";
		String s3= "Tej";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2.intern());
		System.out.println(s1.compareTo(s3));
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" Java");
		sb.append(" how");
		sb.append(" are");
		sb.append(" you");
		
		System.out.println(sb);
		
		
		
	}

}
