package tools;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class output_meg {

  public static void main(String... str) {
    String content = "";
    for (String val : str)
      content = content + val + "\n";

    try {
      String filePath = "./out/output.txt";

      File file = new File(filePath);
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
        new FileOutputStream(file), "UTF-8"));
      
      writer.write(content);

      writer.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
