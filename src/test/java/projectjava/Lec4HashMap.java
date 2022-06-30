package projectjava;
import java.util.HashMap;
public class Lec4HashMap {
// Import the HashMap class



  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
  //  System.out.println(capitalCities);

  //  To access a value in the HashMap, use the get() method and refer to its key:

    	
    	//capitalCities.get("England");
  
  //  To remove an item, use the remove() method and refer to the key:

  	capitalCities.remove("England");
    //	System.out.println(capitalCities.remove("England"));
    capitalCities.size();
        System.out.println(capitalCities.size());
     // Print keys
  //   for (String a : capitalCities.keySet()) {
 //      System.out.println(a);
          
       // Print values
     // for (String k : capitalCities.values()) {
      //      System.out.println(k); 
         // Print keys and values
      for (String i : capitalCities.keySet()) {
             System.out.println("key: " + i + " value: " + capitalCities.get(i));
            }
          
        
     }
  
}


