import java.util.*;
import java.lang.Object.*;

/*
    Formats a data feed to mimic JSON for readibility
    Version 0.0.1:  assumes well-formatted input
*/

public class FormatFeed {
    public static void ProcessInput(Vector<String> vect) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            vect.add(scan.nextLine());
        }
        scan.close();
    }
    
    public static int CountOccurrences(String str, char delim) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == delim) {
                count++;
            }
        }
        return count + 1;
    }

    public static void main(String []args) {
        // Config
        char delim = '|';
        String token = "\\|";
        
        // Input
        Vector<String> vect = new Vector<String>();
        ProcessInput(vect);

        // Logic
        int numCols = CountOccurrences(vect.get(0), delim);
        int numRows = vect.size() - 1;    // don't count header as row
        String headStr = vect.get(0);
        String[] head = headStr.split(token);
        
        for (int i = 0; i < numRows; i++) {
            System.out.println("Record " + (i + 1) + ": {");
            for (int j = 0; j < numCols; j++) {
                System.out.print("\t" + head[i] + ":  ");
                System.out.println(vect.get(i + 1).split(token)[j]);
            }
            System.out.println("}\n");
        }
    }
}
