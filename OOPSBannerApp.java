/**
* OOPSBannerApp UC5 Render OOPS as Banner using Inline Array Initialization
*
* This use case extends UC4 by defining and populating the String array in a more 
* concise way at the time of declaration using String.join() method to create each 
* line of the banner. This further enhances code readability and maintainability.
*
* @author Developer
* @version 5.0
*/

// Extend the user story 4 to further develop the OOPS Banner Application by 
// not only using String arrays to hold banner lines and printing them in a  
// loop. But also by defining and populating the array in a more concise way  
// at the time of declaration using String.join() method to create each line 
// of the banner.

    // Hint:
    // 1. Define and populate a String array with each line of the banner using
    //    String.join() method to join the parts of each line with spaces.
    // 2. Use a for-each loop to iterate therought eh array and print each line.

public class OOPSBannerApp {
    // Main method to run the banner display
    public static void main (String[] args){
        // Define String Array variable to hold the OOPS banner lines
        // Each line represents a row in the banner for the letters 0, 0, P, S
        String[] lines = {
        String.join(" " , "   ***   " , "    ***   " , " ******   " , "  *****   "),
        String.join(" " , " **   ** " , "  **   ** " , " **    ** " , "**        "),
        String.join(" " , "**     **" , " **     **" , " **    ** " , "**        "),
        String.join(" " , "**     **" , " **     **" , " ******   " , "  *****   "),
        String.join(" " , "**     **" , " **     **" , " **       " , "      **  "),
        String.join(" " , " **   ** " , "  **   ** " , " **       " , " **   **  "),
        String.join(" " , "   ***   " , "    ***   " , " **       " , "  *****   ")};
        // Use a loop to print each line of the banner to create the
        // visual effect for the message "OOPS"
        for (String line : lines){
        System.out.println(line);
        }
    }
}
