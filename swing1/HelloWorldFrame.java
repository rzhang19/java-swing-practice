import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * From tutorial online at http://www.wideskills.com/java-tutorial/java-swing-tutorial
 */

public class HelloWorldFrame extends JFrame {
   public static void main (String[] args) {
      new HelloWorldFrame();
   }
   
   HelloWorldFrame() {
      JLabel jlbHelloWorld = new JLabel("Hello World");
      add(jlbHelloWorld);
      this.setSize(150,150);
      
      setVisible(true);
   }
}