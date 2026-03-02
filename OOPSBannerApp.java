/**
* OOPSBannerApp UC6 OOPS Banner Application (Use Case 6)
*
* This use case extends UC5 by implementing a modular approach to generate each 
* letter's pattern through dedicated methods. This enhances code reusability and 
* maintainability by separating pattern generation logic from the main display logic.
*
* @author Developer
* @version 6.0
*/

// Extend the User Story 5 to display the OOPS banner using a modular approach
//defining methods that generate the banner lines for each character (O, P, S) 
//and invoke these methods during array declaration to build and display the banner.

//Key requirements:
//1.Create separate methods to build patterns for O, P, and S using String.join().
//2.At array declaration, call these methods to populate the banner lines in order.
//3.Maintain the 7-line, 9-character width alignment for each letter.
//4.Use a loop (enhanced for loop preferred) to print each line of the banner.
//5.Keep output visually identical to UC5 while improving reusability.

    // Hint:
    // 1. Define methods get Pattern(), getPPattern(), and getSPattern()
    //that return String arrays representing the ASCII art for each letter
    // 2. In the main method, call these methods to get the patterns and store them
    //in String arrays
    // 3. Use a loop to assemble and print each line of the banner

public class OOPSBannerApp {
    // Main method to run the banner display
    public static String[] getOPattern(){
        return new String[] {
        "   ***   ",
        " **   ** ", 
        "**     **", 
        "**     **", 
        "**     **", 
        " **   ** ",
        "   ***   ", 
    };}
    public static String[] getPPattern(){
        return new String[] {
        " ******   " , 
        " **    ** " , 
        " **    ** " , 
        " ******   " , 
        " **       " , 
        " **       " , 
        " **       " 
    };}
    public static String[] getSPattern(){
        return new String[] {
        "  *****   ",
        "**        ",
        "**        ",
        "  *****   ",
        "      **  ",
        " **   **  ",
        "  *****   "
    };}
    public static void main (String[] args){
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        
        for (int i = 0; i < oPattern.length; i++){
            System.out.println(oPattern[i]+" "+oPattern[i]+" "+pPattern[i]+" "+sPattern[i]);
        }
        }
    }

