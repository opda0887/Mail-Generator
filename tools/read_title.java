package tools;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class read_title {
  public static String main() {
    try {
      String title_path = "./tx/dynamic/title.txt";
      BufferedReader reader = new BufferedReader(new InputStreamReader(
        new FileInputStream(title_path), "UTF-8"));
      
      String line, data = "";
      while ((line = reader.readLine()) != null)
        data = data + line + "\n";

      reader.close();
      return data;

    } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }
}
