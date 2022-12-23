import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://google.com/images"); // URL class to access URL
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
        } catch (MalformedURLException e) { // MalformedURLException to catch error from marlformed URL
            System.out.println(e.getMessage()); // printing error
        }
    }

}
