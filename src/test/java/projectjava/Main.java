package projectjava;

public class Main {
	
	int x= 5;
	int y= 3;
	 static void myMethod() {
		System.out.println("Hello Everyone");
	}
	/*myMethod() prints a text (the action), when it is called. 
	//To call a method, write the method's name followed by two 
	//parentheses () and a semicolon;*/
	
	
	
	public static void main(String[] args) {
		
		myMethod();
			Main myObj1= new Main();
	Main myObj2= new Main();
	myObj1.x=40;
	myObj2.y=25;
	System.out.println(myObj1.x);
	System.out.println(myObj2.x);
	}

}
