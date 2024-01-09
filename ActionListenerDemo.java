import java.awt.*;  
import java.awt.event.*;  
//1st step  
public class ActionListenerDemo implements ActionListener
{ 
	 TextField tf; Button b;
      public ActionListenerDemo()
      {	Frame f=new Frame("ActionListener Example");
	tf = new TextField(); 
	//2nd step  
    	b.addActionListener(this);  
    	f.add(b);f.add(tf);  
    	f.setSize(400,400);  
    	
	tf.setBounds(50,50, 150,20);  
     	b=new Button("Click Here");  
    	b.setBounds(50,100,60,30); 
	f.setLayout(null);  
    	f.setVisible(true);
      } 


	//3rd step  
       public void actionPerformed(ActionEvent e)
       {  
            tf.setText("Welcome to Javatpoint.");  
       }  

      public static void main(String[] args) 
      {      
   	ActionListenerDemo p = new ActionListenerDemo(); 
	
      }  
	
}  