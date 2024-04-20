
package employee.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    JButton update,view,add,remove;
    
    Home(){
        
        setLayout(null);
        
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/icons/home.jpg"));
        Image i2= i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1120,630);
         add(image);
         
         
         JLabel heading=new JLabel("Employee Management System");
         heading.setBounds(630,20,400,40);
         heading.setFont(new Font("TAHOMA",Font.BOLD,25));
         image.add(heading);
         
         add=new JButton("Add employee");
         add.setBounds(650,80,150,40);
         add.addActionListener(this);
         image.add(add);
         
       view=new JButton("View employee");
         view.setBounds(840,80,150,40);
         view.addActionListener(this);
         image.add(view);
         
          update=new JButton("Update employee");
         update.setBounds(650,140,150,40);
         update.addActionListener(this);
         image.add(update);
         
         remove=new JButton("Remove employee");
         remove.setBounds(840,140,150,40);
         remove.addActionListener(this);
         image.add(remove);
         
         
        setSize(1120,630);
        setLocation(100,20);
        setVisible(true);
    }
    
  public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==add)
      {
          setVisible(false);
          new AddEmployee();
      }
      else if(ae.getSource()==update)
      {
          setVisible(false);
          new ViewEmployee();
      }
      else if(ae.getSource()==view)
      {
          setVisible(false);
          new ViewEmployee();
      }
      else{
          setVisible(false);
          new RemoveEmployee();
      }
      
      
  }
    public static void main(String args[])
    {
        new Home();
        
    }
    
}
