import java.awt.*;
import java.awt.event.*;

class calci2 extends Frame implements MouseListener
{
  //  int c,n;

    String s1,s2,s3,s4,s5;
    Frame f;
    Button b1,b2,b3;
    Label l1,l2,l3;
   // Panel p;
    TextField tf1,tf2,tf3;
   // GridLayout g;

    public calci2()
    {
        f = new Frame("My calculator");
       // p = new Panel();
        f.setLayout(null);

        b1 = new Button("ADD");
        b1.setBounds(10, 210, 70, 30);
        b1.addMouseListener(this);

        b2 = new Button("RESET");
        b2.setBounds(100, 210, 70, 30);
        b2.addMouseListener(this);

        tf1 = new TextField(20);
        tf1.setBounds(150, 110, 110, 20);

        l1 = new Label("NUMBER 1 :");
        l1.setBounds(10,110,110,20);

        tf2 = new TextField(20);
        tf2.setBounds(150,140,110,20);

        l2 = new Label("NUMBER 2 :");
        l2.setBounds(10,140,110,20);

        tf3 = new TextField(20);
        tf3.setBounds(150,250,110,20);

        l3 = new Label("SOLUTION :");
        l3.setBounds(10,250,110,20);
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(b1);
     //   f.add(b2);
        f.add(l3);
        f.add(tf3);

        f.setSize(300,300);
        f.setVisible(true);
        f.setBackground(Color.DARK_GRAY);
    }
    public void mouseEntered(MouseEvent me)
    {  
       Object ob = me.getSource();
       if(ob == b1){
       s1 = tf1.getText();
       s2 = tf2.getText();
	int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = a + b;

            tf3.setText(" " +c);
     }
  }

    public void mouseExited(MouseEvent me) 
    {     
       //Object ob2 = me.getSource();
       //if(ob2 ==b2) 
      // {
	//RESET LOGIC
	tf1.setText(null);
	tf2.setText(null);
	tf3.setText(null);
         }
    }
    
    
    public void mouseClicked(MouseEvent me) { }
    public void mousePressed(MouseEvent me ) { }
    public void mouseReleased(MouseEvent me) { }
      
    public static void main(String ar[])
    {
        calci2 v = new calci2();
    }
}