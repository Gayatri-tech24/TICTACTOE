import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner ;
public class JButtonTextChangeExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        // Create a JFrame
        JFrame frame = new JFrame("Change JButton Text");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a JButton
        JButton button = new JButton("Click Me");
        button.setBounds(100, 50, 100, 30);

        // Add ActionListener to change text dynamically
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText(name);
            }
        });

        // Add button to the frame
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
