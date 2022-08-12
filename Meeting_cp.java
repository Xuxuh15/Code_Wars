import java.util.ArrayList;
import java.util.Collections; 
public class Meeting {
  
  public static int index = 0;
  
public static String getFirstName(String str, int index) {
  //function that transverses the list of names and retrieves the first name
  //@params the string list and current index
    
    String firstName = "";
    //variable that stores the first name
      
     
     while(str.charAt(index)!= ':') {
       //continue retrieving characters and concatenating to the firstName variable until we ecounter
       //the ':' character
       
       firstName += String.valueOf(str.charAt(index)); 
       index++; //increment the global counter
     }
    
    return firstName; 
  }
  
public static String getLastName(String str, int index) {
    
    String lastName = "";
      //function that transverses a string list and retrieves the last name
  //@params string list and current index
     
     while(str.charAt(index)!= ';' ) {
       //continue retrieving characters and concatenating to the lastName variable until we encounter
       //the ';' character
       
       lastName += String.valueOf(str.charAt(index)); 
       if(index == str.length()-1) {  //if we are at the end of the string, don't increment the counter
         //prevents index out of bounds error
         break; 
       }
       else {
         index++;  //increment the global counter
       }
        
     }
    
    return lastName; 
  }
  
  
    
    public static String meeting(String str) {
        // your code
     ArrayList<String> names = new ArrayList<>();  //stores the first and last name of each person
    
    String firstName = "";
    String lastName = "";
    String fullName = "";
    
    while(index < str.length()-1) {   //while the incrementer is less than the length of the string, execute the following steps
      if(str.charAt(index) == ';') {  //move index to beginning of first name unless at the beginning of the string
        index++; 
      }
      firstName = getFirstName(str,index);
      index += firstName.length() + 1;  //move the index to the next name in the list
      lastName = getLastName(str,index);
      index += lastName.length();  //move the index to the end of the last name
      
      fullName = "(" + lastName.toUpperCase() + ", " + firstName.toUpperCase() + ")"; //concatenate first name and last name
      
      names.add(fullName);  //add full name to the array list
    
      
    }
    index = 0; //reset the global counter
    Collections.sort(names); //sort the names in ascending order
    String sortedList = String.join("", names); //convert array list into a string to be returned by the function
    return sortedList;
    
    }
    
    
}