import java.awt.*;
public class practice {
   public static void main(String[] args) {
    Frame frame = new Frame();
    Label label = new Label("list of subjects: ");
    frame.add(label);
    label.setBounds(100, 200, 300, 50);
    Checkbox ch1 = new Checkbox("Hindi");
    ch1.setBounds(200, 300, 100, 50);
    Checkbox ch2 = new Checkbox("English");
    Checkbox ch3 = new Checkbox("Spanish");
    ch2.setBounds(200, 400, 100, 50);
    ch3.setBounds(200, 500, 100, 50);
    frame.add(ch1);
    frame.add(ch2);
    frame.add(ch3);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setSize(600, 600);


   }
    
}
