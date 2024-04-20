

package employee.management.system;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;



/**
 *
 * @author prate
 */
public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran=new Random();
    int number=ran.nextInt(999999);
    
    JTextField tfname,tffname,tfsalary,tfphone,tfaddress,tfemailaddress,tfaadhar,tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempid;
    JButton back,add;
    
    
    AddEmployee()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Add Employee Details");
        heading.setBounds(260,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(heading);
        
        JLabel name=new JLabel("Name :");
        name.setBounds(50,120,150,30);
        name.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(name);
        
       tfname=new JTextField();
        tfname.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        tfname.setBounds(150,120,150,30);
        add(tfname);
        
         JLabel fname=new JLabel("Father's Name :");
        fname.setBounds(400,120,150,30);
        fname.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(fname);
        
         tffname=new JTextField();
        tffname.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        tffname.setBounds(560,120,150,30);
        add(tffname);
        
         JLabel dob=new JLabel("D.O.B :");
        dob.setBounds(50,200,150,30);
        dob.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(dob);


          dcdob=new JDateChooser();
          dcdob.setBounds(150,200,150,30);
          add(dcdob);
          
          
           JLabel  salary=new JLabel("  Salary :");
         salary.setBounds(400,200,150,30);
         salary.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add( salary);
        
       tfsalary=new JTextField();
        tfsalary.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        tfsalary.setBounds(560,200,150,30);
        add(tfsalary);
        
        
         JLabel address=new JLabel("Address :");
        address.setBounds(50,280,150,30);
        address.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(address);
        
        tfaddress=new JTextField();
        tfaddress.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        tfaddress.setBounds(150,280,150,30);
        add(tfaddress);
        
        
         JLabel phone=new JLabel("Phone no. :");
        phone.setBounds(400,280,150,30);
        phone.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(phone);
        
         tfphone=new JTextField();
        tfphone.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        tfphone.setBounds(560,280,150,30);
        add(tfphone);
        
          JLabel emailaddress=new JLabel("Email :");
        emailaddress.setBounds(50,360,150,30);
        emailaddress.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(emailaddress);
        
         tfemailaddress=new JTextField();
        tfemailaddress.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        tfemailaddress.setBounds(150,360,150,30);
        add(tfemailaddress);
          
        
         JLabel education=new JLabel("Highest Edu. :");
        education.setBounds(400,360,150,30);
        education.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(education);
        
        
        String course[]={"BBA","BCA","BA","B.COM","BSC","B.TECH","MBA","MCA","MA","MTECH","MSC","PHD"};
         cbeducation=new JComboBox(course);
        cbeducation.setBackground(Color.WHITE);
        //cbeducation.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        cbeducation.setBounds(560,360,150,30);
        add(cbeducation);
        
         JLabel designation=new JLabel("Designation:");
        designation.setBounds(50,440,150,30);
        designation.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(designation);
        
        tfdesignation=new JTextField();
        tfdesignation.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        tfdesignation.setBounds(170,440,150,30);
        add(tfdesignation);
        
        
        JLabel aadhar=new JLabel("Aadhar no. :");
        aadhar.setBounds(400,440,150,30);
        aadhar.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(aadhar);
        
         tfaadhar=new JTextField();
        tfaadhar.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        tfaadhar.setBounds(560,440,150,30);
        add(tfaadhar);
        
        JLabel empid=new JLabel("Emp. ID: ");
        empid.setBounds(50,500,150,30);
       empid.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(empid);
        
        lblempid=new JLabel(""+ number);
        lblempid.setBounds(170,500,150,30);
       lblempid.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(lblempid);
        
        
          add=new JButton("Add Details");
         add.setBounds(200,570,150,40);
         add.addActionListener(this);
         add.setBackground(Color.BLACK);
         add.setForeground(Color.WHITE);
         add(add);
         
         
          back=new JButton("Back");
         back.setBounds(450,570,150,40);
         back.addActionListener(this);
         back.setBackground(Color.BLACK);
         back.setForeground(Color.WHITE);
         add(back);


        
        setSize(880,670);
        setLocation(200,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==add)
        {
            
            String name=tfname.getText();
            String fname=tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary=tfsalary.getText();
            String phone=tfphone.getText();
            String address=tfaddress.getText();
            String email=tfemailaddress.getText();
            String education=(String)cbeducation.getSelectedItem();
            String designation=tfdesignation.getText();
            String aadhar=tfaadhar.getText();
            String empId=lblempid.getText();
            
            try{
                Conn conn=new Conn();
                 String query="insert into employee values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Detail added successfully");
                setVisible(false);
                new Home();
           }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            setVisible(false);
            new Home();
        }
    }
    
    public static void main(String args[])
    {
        new AddEmployee();
    }
}
