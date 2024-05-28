import tools.output_meg;
import tools.read_text;
import tools.read_title;

public class mail_gen {

  public static void main(String[] args) {
    String title = read_title.main();
    String spliter = "-----------------\n";
    String text = read_text.main();

    output_meg.main(title, spliter ,text);
    
    System.out.println(title);
    System.out.println(spliter);
    System.out.println(text);
  }
}