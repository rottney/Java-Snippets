import java.util.*;

/*
    This removes the whitespace that gets appended to blocks of text
    that are copied into & stored in SalesForce
    Functionality is not yet scalable to other applications
*/

public class RemoveWhitespaceFromSalesforce{

    public static void main(String []args){
        // IO
        Vector<String> vect = new Vector<String>(); 
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNextLine()) {
            vect.add(scan.nextLine());
        }
        scan.close();
        
        // Logic (janky af)
        for (int i = 0; i < vect.size(); i = i+2) {
            if (!vect.get(i).contains("\n")) {
                System.out.println(vect.get(i));
            }
        }
    }
}
