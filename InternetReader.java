package my_package;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class InternetReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.ajitwadalkar.com");
            URLConnection oc = url.openConnection();
            Scanner s = new Scanner(new InputStreamReader(oc.getInputStream()));
            while (s.hasNext()) {
                System.out.println(s.next());
            }
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
