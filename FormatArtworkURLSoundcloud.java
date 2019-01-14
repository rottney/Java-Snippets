import java.util.*;

/*
    Input:  Copy Attribute from SoundCloud image
        using Safari inspector
    Output:  A URL you can use to download image
*/
public class FormatArtworkURLSoundcloud{
    
    public static void main(String []args){
        Character ch = '"';
        String q = ch.toString();
        Scanner scan = new Scanner(System.in);
        System.out.print(scan.nextLine()
            .replace("style="
            .concat(q)
            .concat("background-image: url(\\")
            .concat(q), "")
            .replace("\\"
            .concat(q)
            .concat("); width: 500px; height: 500px; opacity: 1;")
            .concat(q), ""));
            scan.close();
    }
}
