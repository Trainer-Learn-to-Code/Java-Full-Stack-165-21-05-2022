package TESTEXCEPTION;


import java.io.*;  

public class TestThrow2 {   

    //function to check if person is eligible to vote or not   
    public static void method() throws FileNotFoundException {  

        FileReader file = new FileReader("input.txt");  
        BufferedReader fileInput = new BufferedReader(file);  

      
        //throw new FileNotFoundException("The file not found,,,,");  
      
    }  
    //main method  
    public static void main(String args[]) {  
          try {
              method();  

          }catch (Exception e) {
			// TODO: handle exception
		}
          
         
        System.out.println("rest of the code...");    
  }    
}    

