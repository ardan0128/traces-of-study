package httpRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpRequest {
  public void test() throws IOException {
    URL url = new URL("https://jsonplaceholder.typicode.com/posts");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();

    connection.setRequestMethod("GET");
    connection.setRequestProperty("Conten-Type", "application/json");

    int responseCode = connection.getResponseCode();
    String responseMessage = connection.getResponseMessage();
    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    StringBuffer sb = new StringBuffer();

    while(br.readLine() != null){
      sb.append(br.readLine());
    }

    br.close();

    System.out.println(responseCode);
    System.out.println(responseMessage);
    System.out.println(sb);
  }
}
