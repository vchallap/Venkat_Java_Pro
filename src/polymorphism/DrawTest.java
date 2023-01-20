package polymorphism;

public class DrawTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Picture pic= new Circle();
		
		pic.draw();
		
		pic=new Reactangle();
		pic.draw();
		
		pic=new Triangle();
		pic.draw();
	}

}
