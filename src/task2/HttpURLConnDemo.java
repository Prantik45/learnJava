package task2;

import java.net.*;

public class HttpURLConnDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.shodan.io/host/2.56.9.89");
            HttpURLConnection huc = (HttpURLConnection)url.openConnection();

            System.out.println(huc.getResponseCode() +": "+ huc.getResponseMessage());

            huc.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
