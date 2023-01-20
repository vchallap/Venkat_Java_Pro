package myPreparation;

public class StringDemo {

	private static String[] split;





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Actual representation of String
		String str= new String("Venkatesh Challapalli");//String is predefind calss in java
		
		System.out.println(str);
		
		//Shortcut representation of string 
		
		String strshort="Venkatesh Challapalli";
		System.out.println(strshort);
		
		//String objects are immutable(Can't modify)
		// a new String object will be created and the old object will remains same
		
		//String equals() method vs == Operator
		//equals() method is of a string class. Is used to compare two strings
	String a="Venkat";
	String b="Penakt";
	String c="Venkat";
	
	
	System.out.println(a.equals(b));
	System.out.println(a.equals(c));
	
	
	//equal() is used to compare two string literal texts
	//== operator is used to compare two objects 
	
	String aa= new String("Venkat");
	String bb= new String("Venkat");
	String cc=aa;
	
	System.out.println(aa==bb);
	System.out.println(aa==cc);
	
	System.out.println(aa.equals(bb));
	System.out.println(aa.equals(cc));
	
	System.out.println("--------------------------");
	
	//EqualsIgnoreCase() method: Is also one of the string class method.Which is used to compare two string literals but ignre the case
	
	String one="Venkat";
	String two="venkat";
	
	System.out.println(one.equals(two));
	System.out.println(one.equalsIgnoreCase(two));
	
	//length () method: is also one of the string method.whihc gives length of string literal text.
	
	System.out.println(one.length());
	
	System.out.println("----------------------------------------");
	
	//length and length(): 
	
	/*
	 *length vs length(): Length is predefind variable and it belongs to array and gives length of array
	 *length() is a predefind method of string class and it gived length of string text.
	 */
	 
	int[] alen = {10,22,33,12,24,55,12};
	String slen="Venkatesh Challapalli";
	System.out.println(alen.length);
	System.out.println(slen.length());
	
	System.out.println("----------------------------------");
	
	
	//trim() method : is one of the string method.trim the spaces of the string literal before and after text if any.
	
	String strtrim="        Venkatesh Challapalli          ";
	System.out.println(strtrim);
	System.out.println(strtrim.length());
	String strtrim1=strtrim.trim();
	System.out.println(strtrim1);
	System.out.println(strtrim1.length());
	
	System.out.println("------------------------------------------");
	
	
	//subString() method: is also one of the string method.which is used to retrieve some portion of text from the string literal
	
	String subst="Venkatesh Challapalli";
	System.out.println(subst.substring(5));
	System.out.println(subst.substring(1, 5));
	
	System.out.println("-------------------------------");
	
	
	//indexof() and lastindexof(): is used to find the the given text or character available in the string or not
	
	String sind="Java is a programing language which is easy to lean.Java is good.";

	
	
	//System.out.println(sind.indexOf("Java"));//will give only first index value
	//System.out.println(sind.indexOf("Java", 2));// will give other than first index value from index number specified.
	System.out.println(sind.lastIndexOf("Java"));
	
	System.out.println(stringFind(sind,"iss"));
	
	System.out.println("---------------------------------------------------");
	
	//Split() method: Will be used to split the text into different parts based on some space or symbols given.
	
	
	//String[] strsplit= sind.split(" ");
	String[] strsplit= sind.split("is");
	
	for (String temp:strsplit)
	{
	System.out.println(temp);
	
	}
	
	System.out.println("-----------------------------------------------");
	//concate() method: is used to concatenate two strings.	
	
	String s1="Venkatesh ";
	String s2="Challa";
	String s3="palli";
	
	System.out.println(s1.concat(s2).concat(s3));
	
	//+ operator for concatenation..
	
	System.out.println(s1+s2+s3);
	System.out.println("-----------------------------------------------------");
	
	//isEmpty(): to check whether the given string is empty or not
	
	
	String s4="";
	System.out.println(s4.isEmpty());
	System.out.println(s3.isEmpty());
	
	System.out.println("--------------------------------------");
	//startsWith(): will check whether is started with text ot not.
	
	System.out.println(s4.startsWith("Ven"));
	System.out.println(s3.startsWith(""));
	System.out.println(s1.startsWith("nk", 2));
	
	System.out.println("----------------------------------------");
	
	//endwith():checks with ending with given text or not

	System.out.println(s3.endsWith("lli"));
	System.out.println("-------------------------");
	
	
	// tocharArray(): converts to stringletral test to char
	
	char[] charArray = s1.toCharArray();
	
	for(char ch:charArray)
	{
		System.out.println(ch);
	}
	
	System.out.println("----------------------");
	
	//touppercase() and tolowercase: converts to upper case from lowecase
	
	
	String upperCase = s3.toUpperCase();
	System.out.println(upperCase);
	
	String lowerCase = upperCase.toLowerCase();
	System.out.println(lowerCase);
	
	System.out.println("--------------------------------");
	
	//toString() method: to convert other literals type to string
	
	Integer in=10;
	String sin=in.toString();
	System.out.println(sin);
	
	Boolean by=true;
	String sby = by.toString();
	System.out.println(sby);
	
	Character cha='a';
	String scha = cha.toString();
	System.out.println(scha);
	
	System.out.println("---------------------------");
	
	//valueOf() method: to convert any value to string.
	
	int iv=10;
	String sval = String.valueOf(iv);
	System.out.println(sval);
	
	char[] chr={'v','e','n','k','a','t','e','s','h'};
	String cv = String.copyValueOf(chr);
	System.out.println(cv);
	String cvv = String.valueOf(chr, 5, 3);
	System.out.println(cvv);
	
	System.out.println("----------------------------");
	
	///charAt(): it returns character in the string literal at the given index.
	
	System.out.println(s3.charAt(3));
	
	//replace(): to replace the specified character in the given string literal with provided character.
	
	String s6= "Venkatash";
	System.out.println(s6.replace('a', 'e'));
	
	
	
	
	
	}

	
	
	
	
	public static String stringFind(String str1, String str2)
	{
		if(str1.indexOf(str2)!=-1)
		{
			return "match found";
		}else
		{
			return "match not found";
		}
		
		
		
	}

}
