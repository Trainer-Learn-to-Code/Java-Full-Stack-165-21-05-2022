package stringasg;
public class Exercise24 {
    
   public static void main(String[] args)
    {
        String str = "Replace a specified character with another character.";

        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('e', 'f');

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
