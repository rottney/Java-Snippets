import java.util.*;

public class CountOccurrences {
    public static void main(String []args){
        // IO
        Vector<String> vect = new Vector<String>(); 
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNextLine()) {
            vect.add(scan.nextLine());
        }
        scan.close();
        
        // Logic
        String string = new String();
        String substring = "Self-Release";
        int lastIndex = 0;
        int count = 0;
        
        for (int i = 0; i < vect.size(); i++) {
            string = vect.get(i);
            lastIndex = 0;
            while(lastIndex != -1){
                lastIndex = string.indexOf(substring, lastIndex);
                if(lastIndex != -1){
                    count++;
                    lastIndex += substring.length();
                }
            }
        }
        System.out.println(count);
    }
}
