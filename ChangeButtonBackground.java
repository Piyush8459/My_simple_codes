import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ChangeButtonBackground {
  public static void main(String args[]) {
    Frame frame = new Frame("ChangeButtonBackground");
    Button button1 = new Button("A");
    button1.setBackground(Color.blue);
    frame.add(button1, BorderLayout.NORTH);
    frame.pack();
    frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}