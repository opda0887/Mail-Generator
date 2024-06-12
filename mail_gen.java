import javax.swing.JFrame;
import javax.swing.JPanel;

import tools.output_meg;
import tools.read_text;
import tools.read_title;

public class mail_gen extends JPanel{

  public static void main(String[] args) {
    String title = read_title.main();
    String spliter = "-----------------\n";
    String text = read_text.main();

    output_meg.main(title, spliter ,text);
    
    System.out.println("Task finished.");
    
    // create basic pannel
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(920, 480);
    window.setVisible(true);
  }
}