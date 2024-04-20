/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



/**
 *
 * @author prate
 */
public class Login extends JFrame implements ActionListener  {
    
    JTextField tfuser,tfpass;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel username=new JLabel("Username");
        username.setBounds(40,20,100,30);
        add(username);
        
         tfuser=new JTextField();
        tfuser.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        tfuser.setBounds(150, 20, 150, 30);
        add(tfuser);

        JLabel password=new JLabel("Password");
        password.setBounds(40,70,100,30);
        add(password);
      
        tfpass=new JTextField();
        tfpass.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        tfpass.setBounds(150, 70, 150, 30);
        add(tfpass);
        
        JButton login=new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/icons/second.jpg"));
        Image i2= i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);
 
        setSize(600,300);
        setLocation(380,200);
        setVisible(true);
    
    
}
     public void actionPerformed(ActionEvent ae){
         try{
             String username=tfuser.getText();
             String password=tfpass.getText();
             
             Conn c=new Conn();
             
             String query= "select * from login where username = '"+username+"' and password = '"+password+"'";
             
              ResultSet rs=c.s.executeQuery(query);
              
              if(rs.next())
              {
                  setVisible(false);
                  new Home();
              }
              else{
                  JOptionPane.showMessageDialog(null,"Invalid username or password");
              }
         }catch(Exception e)
         {
             e.printStackTrace();
         }
         
         
     }
    public static void main(String args[])
    {
        new Login();
    }
    
}
