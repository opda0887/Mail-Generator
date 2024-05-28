package tools;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class read_text {
  public static String main() {
    String Data = "";
    String textStart = getText("./tx/static/text_start.txt");
    String textMain = getText("./tx/dynamic/text.txt");
    String textEnd = getText("./tx/static/text_end.txt");

    Data = Data + textStart + "\n" + textMain + "\n" + textEnd;
    
    return Data;
  }

  public static String getText(String path) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(
        new FileInputStream(path), "UTF-8"));
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
