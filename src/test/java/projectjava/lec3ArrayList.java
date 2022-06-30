package projectjava;

import java.util.ArrayList;

public class lec3ArrayList {
	

public static void main(String[]args) {
	

		ArrayList<String> cars = new ArrayList<String>();
		 cars.add("Nissan");
		 cars.add("Camero");
		 cars.add("Mustang");
		 cars.add("BMW");
	//	 System.out.println(cars);
		for (String i: cars) {
//System.out.println(i);
  // cars.size();
//   System.out.println(cars.size());

//access an item
//cars.get(0);
		}
	//System.out.println(cars.get(1));	

//change an element
	//cars.set(1, "Bentley");
//System.out.println(cars.set(1, "Bentley"));

//remove()
//cars.remove(0);
//System.out.println(cars.remove(1));
 for (int i=0; i<cars.size();i++) {
	 System.out.println(cars.get(i)); 
}
}
}
