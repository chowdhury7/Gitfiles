package projectjava;

public class Lec5accessmodifiermethods {

	//attribute of the class
	int a = 10;
	String car = "Nissan";
	
	//syntax of method 
	
	// accessmodifier returnType methodname(){}
	
	 public void facebooklogin() {
		 //body of code
	 }
	 public void facebooksignup() {
		 //body of code
	 }
	 
//private method//access only in this class
	
	 private void methodP() {
	 //body
	 	}
	 //default method//accessible in the same package
	 void methodd() {
		 //body
	 }
	 
	 public static void main(String[] args) {
	 //create object of the class
 //classname object name of the class = new classname();
		
		 Lec5accessmodifiermethods accessmodifier = new Lec5accessmodifiermethods();
	
		// accessmodifier.car
		 
		 System.out.println(accessmodifier.car);	 
	
		 accessmodifier.methodP();
	
		 //changing the value from 10 to 100
	 //accessmodifier.a=100;
	 System.out.println(accessmodifier.a);
	 }
	 	 	 }
