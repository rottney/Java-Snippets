import java.util.*;

/*
    Transposes a column into a row
    Removes quotation (") characters, if present
*/

public class ColumnToRow {

    public static void main(String []args) {
        // IO
        Vector<String> vect = new Vector<String>(); 
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNextLine()) {
            vect.add(scan.nextLine());
        }
        scan.close();
        
        // Logic
        for (int i = 0; i < vect.size(); i++) {
            System.out.print(vect.get(i).replace("\"", "") + ' ');
        }
    }
}
