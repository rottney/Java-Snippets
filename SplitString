import java.util.*;

/*
    Splits string by specified delimiter
    Returns a list of all tokens in the original string,
    each on a new line
*/

public class SplitString{

    public static void main(String []args){
        // Config
        // NOTE:  DO NOT remove the "\\"
        // The character following the "+" sign may be changed as necessary
        String delimeter = "\\" + "|";
        
        // Input
        Scanner scan = new Scanner(System.in);
        String raw = scan.nextLine();
        scan.close();
        
        // Processing
        String[] delimited = raw.split(delimeter);
        
        // Output
        for (int i = 0; i < delimited.length; i++) {
            System.out.println(delimited[i]);
        }
    }
}
