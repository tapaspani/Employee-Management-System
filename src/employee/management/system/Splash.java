/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author prate
 */
public class Splash extends JFrame implements ActionListener{
    Splash(){
        
        getContentPane().setBackground(Color.decode("#2F4F4F"));
        setLayout(null);
        
        JLabel heading=new JLabel("Empolyee Management System");
        heading.setBounds(80,40,900,60);
        heading.setFont(new Font("serif",Font.BOLD,60)); 
        heading.setForeground(Color.RED);
        add(heading);
      
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/icons/front.jpg"));
        Image i2= i1.getImage().getScaledInstance(800, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(140,80,700,400);
        add(image);
        
        JButton clickhere=new JButton("click here");
        clickhere.setBounds(430,360,120,50);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        add(clickhere);
        
        
        setSize(1000,500);
        setLocation(150,50);
        setVisible(true);
        
        while(true){
            heading.setVisible(false);
            try
            {
                Thread.sleep(500);
            }catch (Exception e){
                
            }
            
            heading.setVisible(true);
            
            try
            {
                Thread.sleep(500);
            }catch (Exception e){
                
            }
            
        }
    }
    @Override
     public void actionPerformed(ActionEvent ae){
         setVisible(false);
         new Login();
         
     }

    public static void main(String args[])
    {
        new Splash();
    }
}
