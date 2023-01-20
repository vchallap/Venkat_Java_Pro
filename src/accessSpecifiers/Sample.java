package accessSpecifiers;

/*It defines scope of classes and its members.
 * There are four types of access specifiers 
 * public, protected, default and private.
 * Default access specifier is default ( no access specifier )
 * public is having more scope;	
 * Descending order is

public, 
protected, 
default
private
Scopes :

These are four levels

1 ) Outside the Java application world
        2 ) From other packages ( sub class )
        3) Same package  ( sub class)
        4 )  Within the same class
Scope
	Outside the Java application world;	From other packages( sub class );	Same package( sub class)	;Within the same class
Access Specifier
			

public
	Yes	Yes	Yes	Yes

protected
	No	Yes	Yes	Yes

default
	No	N o	Yes	Yes

private
	No	N o	No	Yes

 * public is recommonded for static data members, as it is accessing by the class name.
 * to access private members, public methods are required .
 * For every private member , public setter and getter methods are required .
 * Setter method is to store data into object.
 * Getter method is to retrive data from the object.
 */



public class Sample {
	
	
	public int a;
	protected int b;
	int c;
	private int d;
	
	
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	

}
