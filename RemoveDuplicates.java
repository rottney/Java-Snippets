import java.util.*;

/*
    THERE IS A BUG WHERE IT DOESN'T READ THE FIRST LINE
    Also, I can probably do this in better than O(n^2) lol
*/

/*
    Removes duplicate strings from input
*/

public class RemoveDuplicates {

    public static void main(String []args) {
        // Store input
        Vector<String> input = new Vector<String>();
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            if (scan.nextLine().compareTo("") != 0) {
                input.add(scan.nextLine());
            }
        }
        scan.close();

        // Build output list
        Vector<String> output = new Vector<String>();
        output.add(input.get(0));
        
        for (int i = 1; i < input.size(); i++) {
            boolean isDup = false;
            for (int j = 0; j < output.size(); j++) {
                if (input.get(i).compareTo(output.get(j)) == 0) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                output.add(input.get(i));
            }
        }
        
        // Print output list
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
