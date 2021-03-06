import java.util.*;

/*
    Currently returns Invoice number from PaidInvoice feeds
    Should omit first line of feed (header line) in STDIN
    Need to build this out to extend functionality
*/
public class InvoiceNumbers{
    // Source:  https://programming.guide/java/nth-occurrence-in-string.html 
    private static int ordinalIndexOf(String str, String substr, int n) {
        int pos = -1;
        do {
            pos = str.indexOf(substr, pos + 1);
        } while (n-- > 0 && pos != -1);
        return pos;
    }
    
    public static void main(String []args){
        // IO
        Vector<String> vect = new Vector<String>(); 
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNextLine()) {
            vect.add(scan.nextLine());
        }
        scan.close();
        
        // Logic
        int pipe1 = 0;
        int pipe2 = 0;
        
        for (int i = 0; i < vect.size(); i++) {
            pipe1 = InvoiceNumbers.ordinalIndexOf(vect.get(i), "|", 1) + 1;
            pipe2 = InvoiceNumbers.ordinalIndexOf(vect.get(i), "|", 2);
            System.out.print("'");
            System.out.print(vect.get(i).substring(pipe1, pipe2));
            System.out.print("'");
            if (i < vect.size() - 1) {
                System.out.println(",");
            }
        }
    }
}
