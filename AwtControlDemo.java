import java.awt.*;
import java.awt.event.*;

public class AwtControlDemo {

   private Frame f;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public AwtControlDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      AwtControlDemo  acd = new AwtControlDemo();
      acd.showDialogDemo();
   }

   private void prepareGUI(){
      f = new Frame();
      f.setSize(400,400);
      f.setLayout(new GridLayout(3, 1));
      f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }
      });
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      f.add(headerLabel);
      f.add(controlPanel);
      f.add(statusLabel);
      f.setVisible(true);
   }

   private void showDialogDemo(){
      headerLabel.setText("This is Frame");
      Button showAboutDialogButton = new Button("Show Dialogbox");
      showAboutDialogButton.addActionListener(new ActionListener() {
	     @Override
         public void actionPerformed(ActionEvent e) {
            AboutDialog aboutDialog = new AboutDialog(f);
            aboutDialog.setVisible(true);
         }
      });

      controlPanel.add(showAboutDialogButton);
      f.setVisible(true);
   }

   class AboutDialog extends Dialog {
      public AboutDialog(Frame parent){
         super(parent, true);
        // setBackground(Color.gray);
         setLayout(new BorderLayout());
         Panel panel = new Panel();
         panel.add(new Button("OK"));
         add("South", panel);
         setSize(200,200);

         addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               dispose();
            }
         });
      }

      public boolean action(Event evt, Object arg){
         if(arg.equals("OK")){
            dispose();
            return true;
         }
         return false;
      }

      public void paint(Graphics g){
         g.setColor(Color.white);
         g.drawString("This is DialogBox", 25,70 );

      }
   }
}
